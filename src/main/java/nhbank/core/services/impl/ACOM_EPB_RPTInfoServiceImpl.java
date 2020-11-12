package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_EPB_RPTInfo;
import nhbank.core.repositories.ACOM_EPB_RPTInfoRepository;
import nhbank.core.services.ACOM_EPB_RPTInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nhbank.core.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ACOM_EPB_RPTInfoServiceImpl implements ACOM_EPB_RPTInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_EPB_RPTInfoRepository acom_epb_rptInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_EPB_RPT");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_EPB_RPTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_EPB_RPT.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_EPB_RPT.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_EPB_RPTInfo obj = new ACOM_EPB_RPTInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setAcrNo(lineArray[1]);
                    obj.setHisNo(new BigDecimal(lineArray[2]));
                    obj.setMngBr(lineArray[3]);
                    obj.setTrCcy(lineArray[4]);
                    obj.setBgDrAmt(new BigDecimal(lineArray[5]));
                    obj.setBgCrAmt(new BigDecimal(lineArray[6]));
                    obj.setPlDrAmt(new BigDecimal(lineArray[7]));
                    obj.setPlCrAmt(new BigDecimal(lineArray[8]));
                    obj.setBusiCd(lineArray[9]);
                    obj.setBusiGrpCd(lineArray[10]);
                    obj.setPlCd(lineArray[11]);
                    obj.setMngYr(lineArray[12]);
                    obj.setAcrFmDt((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                    obj.setAcrToDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setAcrAmt(new BigDecimal(lineArray[15]));
                    obj.setTrBamt(new BigDecimal(lineArray[16]));
                    obj.setBizSeq(new BigDecimal(lineArray[17]));
                    obj.setBizSubSeq(new BigDecimal(lineArray[18]));
                    obj.setTrDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setTrGb(lineArray[20]);
                    obj.setTrCd(lineArray[21]);
                    obj.setAcrSts(lineArray[22]);
                    obj.setDnGb(lineArray[23]);
                    obj.setRemark(lineArray[24]);
                    obj.setRegEmpNo(lineArray[25]);
                    obj.setRegDt((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                    obj.setRegTm(lineArray[27]);
                    obj.setUpdEmpNo(lineArray[28]);
                    obj.setUpdDt((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                    obj.setUpdTm(lineArray[30]);
                    acom_epb_rptInfoRepository.save(obj);
                }
                br.close();
                checkUpdate.setStatus("Done");
                checkUpdateRepository.save(checkUpdate);
                FileUtils.moveFile(dataPath, uploadPath, file.getName());
                FileUtils.deleteFile(file);
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
            checkUpdate.setStatus("File format error");
            checkUpdateRepository.save(checkUpdate);
            br.close();
        }catch (IOException ex){
            ex.printStackTrace();
            checkUpdate.setStatus("System error");
            checkUpdateRepository.save(checkUpdate);
            assert br != null;
            br.close();
        }
    }

    @Override
    public void insertAll(List<ACOM_EPB_RPTInfo> objList) {
        acom_epb_rptInfoRepository.saveAll(objList);
    }

}
