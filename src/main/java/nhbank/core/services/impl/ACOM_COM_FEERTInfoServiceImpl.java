package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_COM_FEERTInfo;
import nhbank.core.repositories.ACOM_COM_FEERTInfoRepository;
import nhbank.core.services.ACOM_COM_FEERTInfoService;
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
public class ACOM_COM_FEERTInfoServiceImpl implements ACOM_COM_FEERTInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_COM_FEERTInfoRepository acom_com_feertInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_COM_FEERT");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_COM_FEERTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_COM_FEERT.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_COM_FEERT.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_COM_FEERTInfo obj = new ACOM_COM_FEERTInfo();
                    obj.setLcd(lineArray[0]);
                    obj.setMcd(lineArray[1]);
                    obj.setScd(lineArray[2]);
                    obj.setMngBr(lineArray[3]);
                    obj.setApplyIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setFrt(new BigDecimal(lineArray[5]));
                    obj.setMaxFee(new BigDecimal(lineArray[6]));
                    obj.setMinFee(new BigDecimal(lineArray[7]));
                    obj.setEtcFrt(new BigDecimal(lineArray[8]));
                    obj.setCdNm(lineArray[9]);
                    obj.setMakeIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setPlCd(lineArray[11]);
                    obj.setRegEmpNo(lineArray[12]);
                    obj.setRegDt((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                    obj.setRegTm(lineArray[14]);
                    obj.setUpdEmpNo(lineArray[15]);
                    obj.setUpdDt((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                    obj.setUpdTm(lineArray[17]);
                    if (isExist(obj.getLcd(), obj.getMcd(), obj.getScd(), obj.getMngBr(), obj.getApplyIl())) {
                        acom_com_feertInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COM_FEERTInfo> objList) {
        acom_com_feertInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String lcd, String mcd, String scd, String mngBr, Date applyIl) {
        return acom_com_feertInfoRepository.existsByLcdAndMcdAndScdAndMngBrAndApplyIl(lcd, mcd, scd, mngBr, applyIl);
    }
}
