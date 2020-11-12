package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_CIX_LOCALInfo;
import nhbank.core.repositories.ACOM_CIX_LOCALInfoRepository;
import nhbank.core.services.ACOM_CIX_LOCALInfoService;
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
public class ACOM_CIX_LOCALInfoServiceImpl implements ACOM_CIX_LOCALInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_CIX_LOCALInfoRepository acom_cix_localInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_CIX_LOCAL");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_CIX_LOCALInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_CIX_LOCAL.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_CIX_LOCAL.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_CIX_LOCALInfo obj = new ACOM_CIX_LOCALInfo();
                    obj.setCixNo(lineArray[0]);
                    obj.setItemNm(lineArray[1]);
                    obj.setItemCtt(lineArray[2]);
                    obj.setRegDvCd(lineArray[3]);
                    obj.setRegEmpNo(lineArray[4]);
                    obj.setRegDt((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setRegTm(lineArray[6]);
                    obj.setUpdEmpNo(lineArray[7]);
                    obj.setUpdDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setUpdTm(lineArray[9]);
                    if (isExist(obj.getCixNo(), obj.getItemNm())) {
                        acom_cix_localInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_CIX_LOCALInfo> objList) {
        acom_cix_localInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cixNo, String itemNm) {
        return acom_cix_localInfoRepository.existsByCixNoAndItemNm(cixNo, itemNm);
    }
}
