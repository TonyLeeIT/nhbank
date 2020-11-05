package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_XPH_SHIPInfo;
import nhbank.core.repositories.AFEX_XPH_SHIPInfoRepository;
import nhbank.core.services.AFEX_XPH_SHIPInfoService;
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
public class AFEX_XPH_SHIPInfoServiceImpl implements AFEX_XPH_SHIPInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPH_SHIPInfoRepository afex_xph_shipInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPH_SHIP");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPH_SHIPInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_XPH_SHIP.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPH_SHIP.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPH_SHIPInfo obj = new AFEX_XPH_SHIPInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setSeq(new BigDecimal(lineArray[1]));
                    obj.setRegEmpNo(lineArray[2]);
                    obj.setRegDt((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setRegTm(lineArray[4]);
                    obj.setUpdEmpNo(lineArray[5]);
                    obj.setUpdDt((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setUpdTm(lineArray[7]);
                    if (isExist(obj.getRefNo(), obj.getSeq())) {
                        afex_xph_shipInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_SHIPInfo> objList) {
        afex_xph_shipInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq) {
        return afex_xph_shipInfoRepository.existsByRefNoAndSeq(refNo, seq);
    }
}
