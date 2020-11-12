package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_FAB_ITMInfo;
import nhbank.core.repositories.ACOM_FAB_ITMInfoRepository;
import nhbank.core.services.ACOM_FAB_ITMInfoService;
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
public class ACOM_FAB_ITMInfoServiceImpl implements ACOM_FAB_ITMInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_FAB_ITMInfoRepository acom_fab_itmInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_FAB_ITM");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_FAB_ITMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_FAB_ITM.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_FAB_ITM.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_FAB_ITMInfo obj = new ACOM_FAB_ITMInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setAcIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                    obj.setGisIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setLstIbIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setDrGb(lineArray[5]);
                    obj.setItmCd(lineArray[6]);
                    obj.setBeItm(lineArray[7]);
                    obj.setAfItm(lineArray[8]);
                    obj.setBeItm1(new BigDecimal(lineArray[9]));
                    obj.setAfItm1(new BigDecimal(lineArray[10]));
                    obj.setRegEmpNo(lineArray[11]);
                    obj.setRegDt((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                    obj.setRegTm(lineArray[13]);
                    obj.setUpdEmpNo(lineArray[14]);
                    obj.setUpdDt((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                    obj.setUpdTm(lineArray[16]);
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        acom_fab_itmInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_FAB_ITMInfo> objList) {
        acom_fab_itmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return acom_fab_itmInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
