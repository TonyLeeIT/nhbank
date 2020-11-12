package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ADST_DPB_CERTInfo;
import nhbank.core.repositories.ADST_DPB_CERTInfoRepository;
import nhbank.core.services.ADST_DPB_CERTInfoService;
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
public class ADST_DPB_CERTInfoServiceImpl implements ADST_DPB_CERTInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_DPB_CERTInfoRepository adst_dpb_certInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_DPB_CERT");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_DPB_CERTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ADST_DPB_CERT.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_CERT.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_DPB_CERTInfo obj = new ADST_DPB_CERTInfo();
                    obj.setAcctNo(lineArray[0]);
                    obj.setIbIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                    obj.setTxTrxNo(new BigDecimal(lineArray[2]));
                    obj.setSts(lineArray[3]);
                    obj.setPrtKind(lineArray[4]);
                    obj.setDrOpno(lineArray[5]);
                    obj.setDrTime(lineArray[6]);
                    obj.setRemark(lineArray[7]);
                    obj.setRegEmpNo(lineArray[8]);
                    obj.setRegDt((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                    obj.setRegTm(lineArray[10]);
                    obj.setUpdEmpNo(lineArray[11]);
                    obj.setUpdDt((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                    obj.setUpdTm(lineArray[13]);
                    if (isExist(obj.getAcctNo(), obj.getIbIl())) {
                        adst_dpb_certInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_CERTInfo> objList) {
        adst_dpb_certInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, Date ibIl) {
        return adst_dpb_certInfoRepository.existsByAcctNoAndIbIl(acctNo, ibIl);
    }
}
