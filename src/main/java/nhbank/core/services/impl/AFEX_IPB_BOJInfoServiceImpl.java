package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_IPB_BOJInfo;
import nhbank.core.repositories.AFEX_IPB_BOJInfoRepository;
import nhbank.core.services.AFEX_IPB_BOJInfoService;
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
public class AFEX_IPB_BOJInfoServiceImpl implements AFEX_IPB_BOJInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_IPB_BOJInfoRepository afex_ipb_bojInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_IPB_BOJ");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_IPB_BOJInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_IPB_BOJ.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPB_BOJ.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_IPB_BOJInfo obj = new AFEX_IPB_BOJInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setSeq(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setLstIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setCcy(lineArray[6]);
                    obj.setAmt(new BigDecimal(lineArray[7]));
                    obj.setHisNo(new BigDecimal(lineArray[8]));
                    obj.setIbjiGb(lineArray[9]);
                    obj.setBojGb(lineArray[10]);
                    obj.setBeLgcomDsAmt(new BigDecimal(lineArray[11]));
                    obj.setLgmSeq(new BigDecimal(lineArray[12]));
                    obj.setLgmSseq(new BigDecimal(lineArray[13]));
                    obj.setBldSeq(new BigDecimal(lineArray[14]));
                    obj.setNcuCcy(lineArray[15]);
                    obj.setNcuAmt(new BigDecimal(lineArray[16]));
                    obj.setNcuBeLgcomDsAmt(new BigDecimal(lineArray[17]));
                    obj.setChdAmt(new BigDecimal(lineArray[18]));
                    obj.setJunhwanGb(lineArray[19]);
                    obj.setBeJunhwanWamt(new BigDecimal(lineArray[20]));
                    obj.setRegEmpNo(lineArray[21]);
                    obj.setRegDt((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                    obj.setRegTm(lineArray[23]);
                    obj.setUpdEmpNo(lineArray[24]);
                    obj.setUpdDt((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                    obj.setUpdTm(lineArray[26]);
                    if (isExist(obj.getRefNo(), obj.getSeq())) {
                        afex_ipb_bojInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPB_BOJInfo> objList) {
        afex_ipb_bojInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq) {
        return afex_ipb_bojInfoRepository.existsByRefNoAndSeq(refNo, seq);
    }
}
