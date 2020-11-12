package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_COM_CCYInfo;
import nhbank.core.repositories.ACOM_COM_CCYInfoRepository;
import nhbank.core.services.ACOM_COM_CCYInfoService;
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
public class ACOM_COM_CCYInfoServiceImpl implements ACOM_COM_CCYInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_COM_CCYInfoRepository acom_com_ccyInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_COM_CCY");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_COM_CCYInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_COM_CCY.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_COM_CCY.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_COM_CCYInfo obj = new ACOM_COM_CCYInfo();
                    obj.setCd(lineArray[0]);
                    obj.setBokCd(lineArray[1]);
                    obj.setNm(lineArray[2]);
                    obj.setUnit(new BigDecimal(lineArray[3]));
                    obj.setDigit(new BigDecimal(lineArray[4]));
                    obj.setCtryCd(lineArray[5]);
                    obj.setGosiGb(lineArray[6]);
                    obj.setSeqNo(new BigDecimal(lineArray[7]));
                    obj.setYearGb(new BigDecimal(lineArray[8]));
                    obj.setMakeIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                    obj.setRegEmpNo(lineArray[10]);
                    obj.setRegDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setRegTm(lineArray[12]);
                    obj.setUpdEmpNo(lineArray[13]);
                    obj.setUpdDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setUpdTm(lineArray[15]);
                    if (isExist(obj.getCd())) {
                        acom_com_ccyInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COM_CCYInfo> objList) {
        acom_com_ccyInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cd) {
        return acom_com_ccyInfoRepository.existsByCd(cd);
    }
}
