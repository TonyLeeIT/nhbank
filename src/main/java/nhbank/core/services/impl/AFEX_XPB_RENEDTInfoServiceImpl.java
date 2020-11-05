package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_XPB_RENEDTInfo;
import nhbank.core.repositories.AFEX_XPB_RENEDTInfoRepository;
import nhbank.core.services.AFEX_XPB_RENEDTInfoService;
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
public class AFEX_XPB_RENEDTInfoServiceImpl implements AFEX_XPB_RENEDTInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPB_RENEDTInfoRepository afex_xpb_renedtInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPB_RENEDT");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPB_RENEDTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_XPB_RENEDT.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPB_RENEDT.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPB_RENEDTInfo obj = new AFEX_XPB_RENEDTInfo();
                    obj.setMngIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                    obj.setRefNo(lineArray[1]);
                    obj.setSts(lineArray[2]);
                    obj.setCcy(lineArray[3]);
                    obj.setAmt(new BigDecimal(lineArray[4]));
                    obj.setBamt(new BigDecimal(lineArray[5]));
                    obj.setPreCaIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setReneIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setReneJum(lineArray[8]);
                    obj.setNcuCcy(lineArray[9]);
                    obj.setNcuAmt(new BigDecimal(lineArray[10]));
                    obj.setCaIl((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setCaAmt(new BigDecimal(lineArray[12]));
                    obj.setRegEmpNo(lineArray[13]);
                    obj.setRegDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setRegTm(lineArray[15]);
                    obj.setUpdEmpNo(lineArray[16]);
                    obj.setUpdDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setUpdTm(lineArray[18]);
                    if (isExist(obj.getMngIl(), obj.getRefNo())) {
                        afex_xpb_renedtInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPB_RENEDTInfo> objList) {
        afex_xpb_renedtInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date mngIl, String refNo) {
        return afex_xpb_renedtInfoRepository.existsByMngIlAndRefNo(mngIl, refNo);
    }
}
