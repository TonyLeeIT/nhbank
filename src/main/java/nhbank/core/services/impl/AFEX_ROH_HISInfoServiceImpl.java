package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_ROH_HISInfo;
import nhbank.core.repositories.AFEX_ROH_HISInfoRepository;
import nhbank.core.services.AFEX_ROH_HISInfoService;
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
public class AFEX_ROH_HISInfoServiceImpl implements AFEX_ROH_HISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_ROH_HISInfoRepository afex_roh_hisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_ROH_HIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_ROH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_ROH_HIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_ROH_HIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_ROH_HISInfo obj = new AFEX_ROH_HISInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setTrGb(lineArray[3]);
                    obj.setTrCd(lineArray[4]);
                    obj.setCixNo(lineArray[5]);
                    obj.setIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setAcIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setGisIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setCanIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                    obj.setSdHisNo(new BigDecimal(lineArray[10]));
                    obj.setTrCcy(lineArray[11]);
                    obj.setTrFamt(new BigDecimal(lineArray[12]));
                    obj.setTrBamt(new BigDecimal(lineArray[13]));
                    obj.setAfJan(new BigDecimal(lineArray[14]));
                    obj.setFeeMd(lineArray[15]);
                    obj.setTrBr(lineArray[16]);
                    obj.setSdBr(lineArray[17]);
                    obj.setIbTime(lineArray[18]);
                    obj.setOpNo(lineArray[19]);
                    obj.setMngNo(lineArray[20]);
                    obj.setIbjiMd(lineArray[21]);
                    obj.setYdSeq(new BigDecimal(lineArray[22]));
                    obj.setYdGuja(lineArray[23]);
                    obj.setCdSngNo(lineArray[24]);
                    obj.setCdSilSeq(new BigDecimal(lineArray[25]));
                    obj.setRegEmpNo(lineArray[26]);
                    obj.setRegDt((lineArray[27].equals("")) ? null : formatter.parse(lineArray[27]));
                    obj.setRegTm(lineArray[28]);
                    obj.setUpdEmpNo(lineArray[29]);
                    obj.setUpdDt((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                    obj.setUpdTm(lineArray[31]);
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        afex_roh_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_ROH_HISInfo> objList) {
        afex_roh_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_roh_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
