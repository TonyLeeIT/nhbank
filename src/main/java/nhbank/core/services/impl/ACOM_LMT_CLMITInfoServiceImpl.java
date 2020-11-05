package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_LMT_CLMITInfo;
import nhbank.core.repositories.ACOM_LMT_CLMITInfoRepository;
import nhbank.core.services.ACOM_LMT_CLMITInfoService;
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
public class ACOM_LMT_CLMITInfoServiceImpl implements ACOM_LMT_CLMITInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_LMT_CLMITInfoRepository acom_lmt_clmitInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_LMT_CLMIT");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_LMT_CLMITInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_LMT_CLMIT.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_LMT_CLMIT.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_LMT_CLMITInfo obj = new ACOM_LMT_CLMITInfo();
                    obj.setLaInspRcno(lineArray[0]);
                    obj.setChgSqno(new BigDecimal(lineArray[1]));
                    obj.setLaInspRcSqno(new BigDecimal(lineArray[2]));
                    obj.setLaInspRcC(lineArray[3]);
                    obj.setFxAcno(lineArray[4]);
                    obj.setRepCusno(new BigDecimal(lineArray[5]));
                    obj.setCusno(new BigDecimal(lineArray[6]));
                    obj.setBrc(lineArray[7]);
                    obj.setEstCurc(lineArray[8]);
                    obj.setLaPmiAm(new BigDecimal(lineArray[9]));
                    obj.setLmtDueDt((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setLaPrdMtcn(new BigDecimal(lineArray[11]));
                    obj.setPnpLaMggKdc(lineArray[12]);
                    obj.setBndPsvC(lineArray[13]);
                    obj.setLaItrDsc(lineArray[14]);
                    obj.setAcusAplItr(new BigDecimal(lineArray[15]));
                    obj.setWrsC(lineArray[16]);
                    obj.setRgmnEno(lineArray[17]);
                    obj.setIvtmnEno(lineArray[18]);
                    obj.setScid(lineArray[19]);
                    obj.setTrXcrt(new BigDecimal(lineArray[20]));
                    obj.setXcrtSc(new BigDecimal(lineArray[21]));
                    obj.setDbtAcpC(lineArray[22]);
                    obj.setBfLaInspRcno(lineArray[23]);
                    obj.setChbfCusno(new BigDecimal(lineArray[24]));
                    obj.setTrDt((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                    obj.setFxTrSqno(new BigDecimal(lineArray[26]));
                    obj.setRmkCntn(lineArray[27]);
                    obj.setFxStsc(lineArray[28]);
                    obj.setLschgDtm((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                    obj.setLsCmeno(lineArray[30]);
                    obj.setRegEmpNo(lineArray[31]);
                    obj.setRegDt((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                    obj.setRegTm(lineArray[33]);
                    obj.setUpdEmpNo(lineArray[34]);
                    obj.setUpdDt((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                    obj.setUpdTm(lineArray[36]);
                    if (isExist(obj.getLaInspRcno(), obj.getChgSqno())) {
                        acom_lmt_clmitInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_LMT_CLMITInfo> objList) {
        acom_lmt_clmitInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String laInspRcno, BigDecimal chgSqno) {
        return acom_lmt_clmitInfoRepository.existsByLaInspRcnoAndChgSqno(laInspRcno, chgSqno);
    }
}
