package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_IPB_DJBInfo;
import nhbank.core.repositories.AFEX_IPB_DJBInfoRepository;
import nhbank.core.services.AFEX_IPB_DJBInfoService;
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
public class AFEX_IPB_DJBInfoServiceImpl implements AFEX_IPB_DJBInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_IPB_DJBInfoRepository afex_ipb_djbInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_IPB_DJB");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_IPB_DJBInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_IPB_DJB.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPB_DJB.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_IPB_DJBInfo obj = new AFEX_IPB_DJBInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setSeq(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setLstIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setCcy(lineArray[6]);
                    obj.setBamt(new BigDecimal(lineArray[7]));
                    obj.setHisNo(new BigDecimal(lineArray[8]));
                    obj.setDjbGb(lineArray[9]);
                    obj.setJan(new BigDecimal(lineArray[10]));
                    obj.setLisuIl((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setDjhGun(new BigDecimal(lineArray[12]));
                    obj.setExpGun(new BigDecimal(lineArray[13]));
                    obj.setShGun(new BigDecimal(lineArray[14]));
                    obj.setKrSeq(new BigDecimal(lineArray[15]));
                    obj.setBlkSseq(new BigDecimal(lineArray[16]));
                    obj.setLstHoiIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setRegEmpNo(lineArray[18]);
                    obj.setRegDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setRegTm(lineArray[20]);
                    obj.setUpdEmpNo(lineArray[21]);
                    obj.setUpdDt((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                    obj.setUpdTm(lineArray[23]);
                    if (isExist(obj.getRefNo(), obj.getSeq())) {
                        afex_ipb_djbInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPB_DJBInfo> objList) {
        afex_ipb_djbInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq) {
        return afex_ipb_djbInfoRepository.existsByRefNoAndSeq(refNo, seq);
    }
}
