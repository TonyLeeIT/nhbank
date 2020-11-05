package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_LMT_SILHISInfo;
import nhbank.core.repositories.ACOM_LMT_SILHISInfoRepository;
import nhbank.core.services.ACOM_LMT_SILHISInfoService;
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
public class ACOM_LMT_SILHISInfoServiceImpl implements ACOM_LMT_SILHISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_LMT_SILHISInfoRepository acom_lmt_silhisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_LMT_SILHIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_LMT_SILHISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_LMT_SILHIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_LMT_SILHIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_LMT_SILHISInfo obj = new ACOM_LMT_SILHISInfo();
                    obj.setSngNo(lineArray[0]);
                    obj.setActCd(lineArray[1]);
                    obj.setSilCcy(lineArray[2]);
                    obj.setHisNo(new BigDecimal(lineArray[3]));
                    obj.setSts(lineArray[4]);
                    obj.setTrCd(lineArray[5]);
                    obj.setIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setAcIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setGisIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setRefNo(lineArray[9]);
                    obj.setSilGb(lineArray[10]);
                    obj.setUpmuCd(lineArray[11]);
                    obj.setGeorCd(lineArray[12]);
                    obj.setSilAmt(new BigDecimal(lineArray[13]));
                    obj.setSilPmgb(lineArray[14]);
                    obj.setSilJan(new BigDecimal(lineArray[15]));
                    obj.setDjgAmt(new BigDecimal(lineArray[16]));
                    obj.setDjgPmgb(lineArray[17]);
                    obj.setDjgJan(new BigDecimal(lineArray[18]));
                    obj.setGurBamt(new BigDecimal(lineArray[19]));
                    obj.setGurBpmgb(lineArray[20]);
                    obj.setGurBjan(new BigDecimal(lineArray[21]));
                    obj.setGurFamt(new BigDecimal(lineArray[22]));
                    obj.setGurFpmgb(lineArray[23]);
                    obj.setGurFjan(new BigDecimal(lineArray[24]));
                    obj.setTrBr(lineArray[25]);
                    obj.setSdBr(lineArray[26]);
                    obj.setTrTime(lineArray[27]);
                    obj.setOpNo(lineArray[28]);
                    obj.setMngNo(lineArray[29]);
                    obj.setTrscSeqNo(new BigDecimal(lineArray[30]));
                    obj.setTrxFamt(new BigDecimal(lineArray[31]));
                    obj.setTrxBamt(new BigDecimal(lineArray[32]));
                    obj.setRegEmpNo(lineArray[33]);
                    obj.setRegDt((lineArray[34].equals("")) ? null : formatter.parse(lineArray[34]));
                    obj.setRegTm(lineArray[35]);
                    obj.setUpdEmpNo(lineArray[36]);
                    obj.setUpdDt((lineArray[37].equals("")) ? null : formatter.parse(lineArray[37]));
                    obj.setUpdTm(lineArray[38]);
                    if (isExist(obj.getSngNo(), obj.getActCd(), obj.getSilCcy(), obj.getHisNo())) {
                        acom_lmt_silhisInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_LMT_SILHISInfo> objList) {
        acom_lmt_silhisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String sngNo, String actCd, String silCcy, BigDecimal hisNo) {
        return acom_lmt_silhisInfoRepository.existsBySngNoAndActCdAndSilCcyAndHisNo(sngNo, actCd, silCcy, hisNo);
    }
}
