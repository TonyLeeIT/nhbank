package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_XPH_SHIP_RESENDInfo;
import nhbank.core.repositories.AFEX_XPH_SHIP_RESENDInfoRepository;
import nhbank.core.services.AFEX_XPH_SHIP_RESENDInfoService;
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
public class AFEX_XPH_SHIP_RESENDInfoServiceImpl implements AFEX_XPH_SHIP_RESENDInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPH_SHIP_RESENDInfoRepository afex_xph_ship_resendInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPH_SHIP_RESEND");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPH_SHIP_RESENDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_XPH_SHIP_RESEND.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPH_SHIP_RESEND.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPH_SHIP_RESENDInfo obj = new AFEX_XPH_SHIP_RESENDInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setBhSeq(new BigDecimal(lineArray[1]));
                    obj.setSeq(new BigDecimal(lineArray[2]));
                    obj.setRegEmpNo(lineArray[3]);
                    obj.setRegDt((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setRegTm(lineArray[5]);
                    obj.setUpdEmpNo(lineArray[6]);
                    obj.setUpdDt((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setUpdTm(lineArray[8]);
                    if (isExist(obj.getRefNo(), obj.getBhSeq(), obj.getSeq())) {
                        afex_xph_ship_resendInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_SHIP_RESENDInfo> objList) {
        afex_xph_ship_resendInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal bhSeq, BigDecimal seq) {
        return afex_xph_ship_resendInfoRepository.existsByRefNoAndBhSeqAndSeq(refNo, bhSeq, seq);
    }
}
