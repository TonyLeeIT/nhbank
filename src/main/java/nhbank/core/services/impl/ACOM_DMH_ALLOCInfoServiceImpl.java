package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_DMH_ALLOCInfo;
import nhbank.core.repositories.ACOM_DMH_ALLOCInfoRepository;
import nhbank.core.services.ACOM_DMH_ALLOCInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nhbank.core.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ACOM_DMH_ALLOCInfoServiceImpl implements ACOM_DMH_ALLOCInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_DMH_ALLOCInfoRepository acom_dmh_allocInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_DMH_ALLOC");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_DMH_ALLOCInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_DMH_ALLOC.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_DMH_ALLOC.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_DMH_ALLOCInfo obj = new ACOM_DMH_ALLOCInfo();
                    obj.setDamboNo(lineArray[0]);
                    obj.setCixNo(lineArray[1]);
                    obj.setSngNo(lineArray[2]);
                    obj.setSeqNo(new BigDecimal(lineArray[3]));
                    obj.setSts(lineArray[4]);
                    obj.setAllocRatio(new BigDecimal(lineArray[5]));
                    obj.setAllocAmt(new BigDecimal(lineArray[6]));
                    obj.setMngBr(lineArray[7]);
                    obj.setLstHisNo(new BigDecimal(lineArray[8]));
                    obj.setLstAcIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                    obj.setRegEmpNo(lineArray[10]);
                    obj.setRegDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setRegTm(lineArray[12]);
                    obj.setUpdEmpNo(lineArray[13]);
                    obj.setUpdDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setUpdTm(lineArray[15]);
                    if (isExist(obj.getDamboNo(), obj.getCixNo(), obj.getSngNo(), obj.getSeqNo())) {
                        acom_dmh_allocInfoRepository.save(obj);
                    } else {
                        objList.add(obj);
                    }
                }
                br.close();
                if (!objList.isEmpty())
                    insertAll(objList);
                checkUpdate.setStatus("Done");
                checkUpdateRepository.save(checkUpdate);
                FileUtils.moveFile(dataPath, uploadPath, file.getName());
                FileUtils.deleteFile(file);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            checkUpdate.setStatus("File format error");
            checkUpdateRepository.save(checkUpdate);
            assert br != null;
            br.close();
        }
    }

    @Override
    public void insertAll(List<ACOM_DMH_ALLOCInfo> objList) {
        acom_dmh_allocInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String damboNo, String cixNo, String sngNo, BigDecimal seqNo) {
        return acom_dmh_allocInfoRepository.existsByDamboNoAndCixNoAndSngNoAndSeqNo(damboNo, cixNo, sngNo, seqNo);
    }
}
