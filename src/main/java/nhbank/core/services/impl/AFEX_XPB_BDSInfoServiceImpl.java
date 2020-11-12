package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_XPB_BDSInfo;
import nhbank.core.repositories.AFEX_XPB_BDSInfoRepository;
import nhbank.core.services.AFEX_XPB_BDSInfoService;
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
public class AFEX_XPB_BDSInfoServiceImpl implements AFEX_XPB_BDSInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPB_BDSInfoRepository afex_xpb_bdsInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPB_BDS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPB_BDSInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_XPB_BDS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPB_BDS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPB_BDSInfo obj = new AFEX_XPB_BDSInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setBudoSeq(new BigDecimal(lineArray[2]));
                    obj.setSts(lineArray[3]);
                    obj.setAcIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setGisIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setLstIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setCcy(lineArray[7]);
                    obj.setAmt(new BigDecimal(lineArray[8]));
                    obj.setHdcAmt(new BigDecimal(lineArray[9]));
                    obj.setBamt(new BigDecimal(lineArray[10]));
                    obj.setBdcAmt(new BigDecimal(lineArray[11]));
                    obj.setBdIja(new BigDecimal(lineArray[12]));
                    obj.setHcHija(new BigDecimal(lineArray[13]));
                    obj.setHJiGb(lineArray[14]);
                    obj.setCaSumAmt(new BigDecimal(lineArray[15]));
                    obj.setSonikGb(lineArray[16]);
                    obj.setSonikAmt(new BigDecimal(lineArray[17]));
                    obj.setNcuCcy(lineArray[18]);
                    obj.setNcuAmt(new BigDecimal(lineArray[19]));
                    obj.setNcuHdcAmt(new BigDecimal(lineArray[20]));
                    obj.setNcuCaSumAmt(new BigDecimal(lineArray[21]));
                    obj.setRegEmpNo(lineArray[22]);
                    obj.setRegDt((lineArray[23].equals("")) ? null : formatter.parse(lineArray[23]));
                    obj.setRegTm(lineArray[24]);
                    obj.setUpdEmpNo(lineArray[25]);
                    obj.setUpdDt((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                    obj.setUpdTm(lineArray[27]);
                    if (isExist(obj.getRefNo(), obj.getHisNo(), obj.getBudoSeq())) {
                        afex_xpb_bdsInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPB_BDSInfo> objList) {
        afex_xpb_bdsInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo, BigDecimal budoSeq) {
        return afex_xpb_bdsInfoRepository.existsByRefNoAndHisNoAndBudoSeq(refNo, hisNo, budoSeq);
    }
}
