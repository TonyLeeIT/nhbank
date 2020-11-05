package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_DMH_ALLOCHISInfo;
import nhbank.core.repositories.ACOM_DMH_ALLOCHISInfoRepository;
import nhbank.core.services.ACOM_DMH_ALLOCHISInfoService;
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
public class ACOM_DMH_ALLOCHISInfoServiceImpl implements ACOM_DMH_ALLOCHISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_DMH_ALLOCHISInfoRepository acom_dmh_allochisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_DMH_ALLOCHIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_DMH_ALLOCHISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_DMH_ALLOCHIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_DMH_ALLOCHIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_DMH_ALLOCHISInfo obj = new ACOM_DMH_ALLOCHISInfo();
                    obj.setDamboNo(lineArray[0]);
                    obj.setCixNo(lineArray[1]);
                    obj.setSngNo(lineArray[2]);
                    obj.setSeqNo(new BigDecimal(lineArray[3]));
                    obj.setHisNo(new BigDecimal(lineArray[4]));
                    obj.setSts(lineArray[5]);
                    obj.setAllocRatio(new BigDecimal(lineArray[6]));
                    obj.setAllocAmt(new BigDecimal(lineArray[7]));
                    obj.setIbIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setAcIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                    obj.setGisIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setTrBr(lineArray[11]);
                    obj.setSdBr(lineArray[12]);
                    obj.setTrTime(lineArray[13]);
                    obj.setOpNo(lineArray[14]);
                    obj.setMngNo(lineArray[15]);
                    obj.setRegEmpNo(lineArray[16]);
                    obj.setRegDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setRegTm(lineArray[18]);
                    obj.setUpdEmpNo(lineArray[19]);
                    obj.setUpdDt((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setUpdTm(lineArray[21]);
                    if (isExist(obj.getDamboNo(), obj.getCixNo(), obj.getSngNo(), obj.getSeqNo(), obj.getHisNo())) {
                        acom_dmh_allochisInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_DMH_ALLOCHISInfo> objList) {
        acom_dmh_allochisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String damboNo, String cixNo, String sngNo, BigDecimal seqNo, BigDecimal hisNo) {
        return acom_dmh_allochisInfoRepository.existsByDamboNoAndCixNoAndSngNoAndSeqNoAndHisNo(damboNo, cixNo, sngNo, seqNo, hisNo);
    }
}
