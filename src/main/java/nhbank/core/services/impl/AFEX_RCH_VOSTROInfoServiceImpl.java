package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_RCH_VOSTROInfo;
import nhbank.core.repositories.AFEX_RCH_VOSTROInfoRepository;
import nhbank.core.services.AFEX_RCH_VOSTROInfoService;
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
public class AFEX_RCH_VOSTROInfoServiceImpl implements AFEX_RCH_VOSTROInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_RCH_VOSTROInfoRepository afex_rch_vostroInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_RCH_VOSTRO");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_RCH_VOSTROInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_RCH_VOSTRO.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RCH_VOSTRO.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_RCH_VOSTROInfo obj = new AFEX_RCH_VOSTROInfo();
                    obj.setIbIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                    obj.setSeqNo(new BigDecimal(lineArray[1]));
                    obj.setHisNo(new BigDecimal(lineArray[2]));
                    obj.setCdAmt(new BigDecimal(lineArray[3]));
                    obj.setAcIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setOpNo(lineArray[5]);
                    obj.setValIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setRegEmpNo(lineArray[7]);
                    obj.setRegDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setRegTm(lineArray[9]);
                    obj.setUpdEmpNo(lineArray[10]);
                    obj.setUpdDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setUpdTm(lineArray[12]);
                    if (isExist(obj.getIbIl(), obj.getSeqNo(), obj.getHisNo(), obj.getCdAmt())) {
                        afex_rch_vostroInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RCH_VOSTROInfo> objList) {
        afex_rch_vostroInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date ibIl, BigDecimal seqNo, BigDecimal hisNo, BigDecimal cdAmt) {
        return afex_rch_vostroInfoRepository.existsByIbIlAndSeqNoAndHisNoAndCdAmt(ibIl, seqNo, hisNo, cdAmt);
    }
}
