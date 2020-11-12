package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_EPB_HISInfo;
import nhbank.core.repositories.ACOM_EPB_HISInfoRepository;
import nhbank.core.services.ACOM_EPB_HISInfoService;
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
public class ACOM_EPB_HISInfoServiceImpl implements ACOM_EPB_HISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_EPB_HISInfoRepository acom_epb_hisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_EPB_HIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_EPB_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_EPB_HIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_EPB_HIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_EPB_HISInfo obj = new ACOM_EPB_HISInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setTrGb(lineArray[3]);
                    obj.setTrCd(lineArray[4]);
                    obj.setDnGb(lineArray[5]);
                    obj.setIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setAcIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setGisIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setCanIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                    obj.setSdHisNo(new BigDecimal(lineArray[10]));
                    obj.setTrCcy(lineArray[11]);
                    obj.setTrFamt(new BigDecimal(lineArray[12]));
                    obj.setTrBamt(new BigDecimal(lineArray[13]));
                    obj.setAfJan(new BigDecimal(lineArray[14]));
                    obj.setTrBr(lineArray[15]);
                    obj.setSdBr(lineArray[16]);
                    obj.setAutoYn(lineArray[17]);
                    obj.setCptyNm(lineArray[18]);
                    obj.setRemark(lineArray[19]);
                    obj.setSdBusiCd(lineArray[20]);
                    obj.setSdRefNo(lineArray[21]);
                    obj.setSdHis(new BigDecimal(lineArray[22]));
                    obj.setIbTime(lineArray[23]);
                    obj.setOpNo(lineArray[24]);
                    obj.setMngNo(lineArray[25]);
                    obj.setCdSngNo(lineArray[26]);
                    obj.setCdSilSeq(new BigDecimal(lineArray[27]));
                    obj.setTrTax(new BigDecimal(lineArray[28]));
                    obj.setAssignAmt(new BigDecimal(lineArray[29]));
                    obj.setRegEmpNo(lineArray[30]);
                    obj.setRegDt((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                    obj.setRegTm(lineArray[32]);
                    obj.setUpdEmpNo(lineArray[33]);
                    obj.setUpdDt((lineArray[34].equals("")) ? null : formatter.parse(lineArray[34]));
                    obj.setUpdTm(lineArray[35]);
                    obj.setLinkRefNo(lineArray[36]);
                    obj.setLinkType(lineArray[37]);
                    obj.setPayRefNo(lineArray[38]);
                    obj.setTaxCode(lineArray[39]);
                    obj.setTaxRate(new BigDecimal(lineArray[40]));
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        acom_epb_hisInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_EPB_HISInfo> objList) {
        acom_epb_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return acom_epb_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
