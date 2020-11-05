package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_RCH_BALInfo;
import nhbank.core.repositories.AFEX_RCH_BALInfoRepository;
import nhbank.core.services.AFEX_RCH_BALInfoService;
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
public class AFEX_RCH_BALInfoServiceImpl implements AFEX_RCH_BALInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_RCH_BALInfoRepository afex_rch_balInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_RCH_BAL");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_RCH_BALInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_RCH_BAL.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RCH_BAL.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_RCH_BALInfo obj = new AFEX_RCH_BALInfo();
                    obj.setCd(lineArray[0]);
                    obj.setCcy(lineArray[1]);
                    obj.setTrIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                    obj.setShwOpbs(new BigDecimal(lineArray[3]));
                    obj.setShwClbs(new BigDecimal(lineArray[4]));
                    obj.setShwConfirmYn(lineArray[5]);
                    obj.setActOpbs(new BigDecimal(lineArray[6]));
                    obj.setActClbs(new BigDecimal(lineArray[7]));
                    obj.setActConfirmYn(lineArray[8]);
                    obj.setOperId(lineArray[9]);
                    obj.setLastIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setSts(lineArray[11]);
                    obj.setDocId(lineArray[12]);
                    obj.setRegEmpNo(lineArray[13]);
                    obj.setRegDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setRegTm(lineArray[15]);
                    obj.setUpdEmpNo(lineArray[16]);
                    obj.setUpdDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setUpdTm(lineArray[18]);
                    if (isExist(obj.getCd(), obj.getCcy(), obj.getTrIl())) {
                        afex_rch_balInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RCH_BALInfo> objList) {
        afex_rch_balInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cd, String ccy, Date trIl) {
        return afex_rch_balInfoRepository.existsByCdAndCcyAndTrIl(cd, ccy, trIl);
    }
}
