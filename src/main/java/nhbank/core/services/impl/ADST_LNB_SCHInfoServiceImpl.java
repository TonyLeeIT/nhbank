package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ADST_LNB_SCHInfo;
import nhbank.core.repositories.ADST_LNB_SCHInfoRepository;
import nhbank.core.services.ADST_LNB_SCHInfoService;
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
public class ADST_LNB_SCHInfoServiceImpl implements ADST_LNB_SCHInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_LNB_SCHInfoRepository adst_lnb_schInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_LNB_SCH");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_LNB_SCHInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ADST_LNB_SCH.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_LNB_SCH.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_LNB_SCHInfo obj = new ADST_LNB_SCHInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setSchGb(lineArray[1]);
                    obj.setAdjSeq(new BigDecimal(lineArray[2]));
                    obj.setSchSeq(new BigDecimal(lineArray[3]));
                    obj.setSts(lineArray[4]);
                    obj.setProcessGb(lineArray[5]);
                    obj.setMakeIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setPlanIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setCcy(lineArray[8]);
                    obj.setPlanAmt(new BigDecimal(lineArray[9]));
                    obj.setFstPayIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setPayAmt(new BigDecimal(lineArray[11]));
                    obj.setUsdCvtAmt(new BigDecimal(lineArray[12]));
                    obj.setBbsCvtAmt(new BigDecimal(lineArray[13]));
                    obj.setDsAmt(new BigDecimal(lineArray[14]));
                    obj.setIndexRt(new BigDecimal(lineArray[15]));
                    obj.setSpreadGb(lineArray[16]);
                    obj.setSpreadRt(new BigDecimal(lineArray[17]));
                    obj.setTotalRt(new BigDecimal(lineArray[18]));
                    obj.setFromIl((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setToIl((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setDsTerm(new BigDecimal(lineArray[21]));
                    obj.setMisuIntAmt(new BigDecimal(lineArray[22]));
                    obj.setJsAmt(new BigDecimal(lineArray[23]));
                    obj.setJsRcvAmt(new BigDecimal(lineArray[24]));
                    obj.setJsDsAmt(new BigDecimal(lineArray[25]));
                    obj.setJsFrIl((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                    obj.setJsToIl((lineArray[27].equals("")) ? null : formatter.parse(lineArray[27]));
                    obj.setJsDsTerm(new BigDecimal(lineArray[28]));
                    obj.setJsLisuIl((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                    obj.setPtAmt(new BigDecimal(lineArray[30]));
                    obj.setPtRcvAmt(new BigDecimal(lineArray[31]));
                    obj.setPtDsAmt(new BigDecimal(lineArray[32]));
                    obj.setPtFrIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                    obj.setPtToIl((lineArray[34].equals("")) ? null : formatter.parse(lineArray[34]));
                    obj.setPtDsTerm(new BigDecimal(lineArray[35]));
                    obj.setPtLisuIl((lineArray[36].equals("")) ? null : formatter.parse(lineArray[36]));
                    obj.setPtRt(new BigDecimal(lineArray[37]));
                    obj.setYcAmt(new BigDecimal(lineArray[38]));
                    obj.setYcRcvAmt(new BigDecimal(lineArray[39]));
                    obj.setYcDsAmt(new BigDecimal(lineArray[40]));
                    obj.setYcFrIl((lineArray[41].equals("")) ? null : formatter.parse(lineArray[41]));
                    obj.setYcToIl((lineArray[42].equals("")) ? null : formatter.parse(lineArray[42]));
                    obj.setYcDsTerm(new BigDecimal(lineArray[43]));
                    obj.setYcLisuIl((lineArray[44].equals("")) ? null : formatter.parse(lineArray[44]));
                    obj.setYcRt(new BigDecimal(lineArray[45]));
                    obj.setMakeHisNo(new BigDecimal(lineArray[46]));
                    obj.setLstSubNo(new BigDecimal(lineArray[47]));
                    obj.setLstAcIl((lineArray[48].equals("")) ? null : formatter.parse(lineArray[48]));
                    obj.setLstIbIl((lineArray[49].equals("")) ? null : formatter.parse(lineArray[49]));
                    obj.setFixGb(lineArray[50]);
                    obj.setFixAmt(new BigDecimal(lineArray[51]));
                    obj.setPvRt(new BigDecimal(lineArray[52]));
                    obj.setPvAmt(new BigDecimal(lineArray[53]));
                    obj.setSeqNo(new BigDecimal(lineArray[54]));
                    obj.setRateFixIl((lineArray[55].equals("")) ? null : formatter.parse(lineArray[55]));
                    obj.setRegEmpNo(lineArray[56]);
                    obj.setRegDt((lineArray[57].equals("")) ? null : formatter.parse(lineArray[57]));
                    obj.setRegTm(lineArray[58]);
                    obj.setUpdEmpNo(lineArray[59]);
                    obj.setUpdDt((lineArray[60].equals("")) ? null : formatter.parse(lineArray[60]));
                    obj.setUpdTm(lineArray[61]);
                    if (isExist(obj.getRefNo(), obj.getSchGb(), obj.getAdjSeq(), obj.getSchSeq())) {
                        adst_lnb_schInfoRepository.save(obj);
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
    public void insertAll(List<ADST_LNB_SCHInfo> objList) {
        adst_lnb_schInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, String schGb, BigDecimal adjSeq, BigDecimal schSeq) {
        return adst_lnb_schInfoRepository.existsByRefNoAndSchGbAndAdjSeqAndSchSeq(refNo, schGb, adjSeq, schSeq);
    }
}
