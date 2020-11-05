package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_ADH_HISInfo;
import nhbank.core.repositories.AFEX_ADH_HISInfoRepository;
import nhbank.core.services.AFEX_ADH_HISInfoService;
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
public class AFEX_ADH_HISInfoServiceImpl implements AFEX_ADH_HISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_ADH_HISInfoRepository afex_adh_hisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_ADH_HIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_ADH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_ADH_HIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_ADH_HIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_ADH_HISInfo obj = new AFEX_ADH_HISInfo();
                    obj.setAdvNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setBaseSeq(new BigDecimal(lineArray[2]));
                    obj.setAmendSeq(new BigDecimal(lineArray[3]));
                    obj.setEdiSeq(new BigDecimal(lineArray[4]));
                    obj.setSts(lineArray[5]);
                    obj.setTrGb(lineArray[6]);
                    obj.setTrCd(lineArray[7]);
                    obj.setTrBr(lineArray[8]);
                    obj.setBrNo(lineArray[9]);
                    obj.setAmdCnt(new BigDecimal(lineArray[10]));
                    obj.setCixNo(lineArray[11]);
                    obj.setBuseoNo(lineArray[12]);
                    obj.setIbgmMd(lineArray[13]);
                    obj.setIbIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setAcIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                    obj.setGisIl((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                    obj.setCanIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setEdiFnm(lineArray[18]);
                    obj.setEdiIl((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setOpenCcy(lineArray[20]);
                    obj.setOpenAmt(new BigDecimal(lineArray[21]));
                    obj.setBrCharge(new BigDecimal(lineArray[22]));
                    obj.setChargeAmt(new BigDecimal(lineArray[23]));
                    obj.setChargeGb(lineArray[24]);
                    obj.setMngNo(lineArray[25]);
                    obj.setOpNo(lineArray[26]);
                    obj.setIbTime(lineArray[27]);
                    obj.setReIssue(lineArray[28]);
                    obj.setYdSeq(new BigDecimal(lineArray[29]));
                    obj.setYdGuja(lineArray[30]);
                    obj.setSdRefNo(lineArray[31]);
                    obj.setSdHisNo(new BigDecimal(lineArray[32]));
                    obj.setAdvMakeIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                    obj.setRegEmpNo(lineArray[34]);
                    obj.setRegDt((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                    obj.setRegTm(lineArray[36]);
                    obj.setUpdEmpNo(lineArray[37]);
                    obj.setUpdDt((lineArray[38].equals("")) ? null : formatter.parse(lineArray[38]));
                    obj.setUpdTm(lineArray[39]);
                    if (isExist(obj.getAdvNo(), obj.getHisNo())) {
                        afex_adh_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_ADH_HISInfo> objList) {
        afex_adh_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String advNo, BigDecimal hisNo) {
        return afex_adh_hisInfoRepository.existsByAdvNoAndHisNo(advNo, hisNo);
    }
}
