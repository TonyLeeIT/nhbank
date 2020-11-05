package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_LMT_BOJInfo;
import nhbank.core.repositories.ACOM_LMT_BOJInfoRepository;
import nhbank.core.services.ACOM_LMT_BOJInfoService;
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
public class ACOM_LMT_BOJInfoServiceImpl implements ACOM_LMT_BOJInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_LMT_BOJInfoRepository acom_lmt_bojInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_LMT_BOJ");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_LMT_BOJInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_LMT_BOJ.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_LMT_BOJ.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_LMT_BOJInfo obj = new ACOM_LMT_BOJInfo();
                    obj.setSngNo(lineArray[0]);
                    obj.setSeq(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setIbIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setAcIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setGisIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setCanIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setTrGwam(lineArray[7]);
                    obj.setTrGeor(lineArray[8]);
                    obj.setCcy(lineArray[9]);
                    obj.setAmt(new BigDecimal(lineArray[10]));
                    obj.setIbjiGb(lineArray[11]);
                    obj.setCcyGb(lineArray[12]);
                    obj.setBojGb(lineArray[13]);
                    obj.setIbTime(lineArray[14]);
                    obj.setTrBr(lineArray[15]);
                    obj.setOpNo(lineArray[16]);
                    obj.setMngNo(lineArray[17]);
                    obj.setIbjiMd(lineArray[18]);
                    obj.setGeojuGb(lineArray[19]);
                    obj.setYdGuja(lineArray[20]);
                    obj.setDamboNo(lineArray[21]);
                    obj.setCdSngNo(lineArray[22]);
                    obj.setCdSilSeq(new BigDecimal(lineArray[23]));
                    obj.setRelRefNo(lineArray[24]);
                    obj.setRegEmpNo(lineArray[25]);
                    obj.setRegDt((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                    obj.setRegTm(lineArray[27]);
                    obj.setUpdEmpNo(lineArray[28]);
                    obj.setUpdDt((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                    obj.setUpdTm(lineArray[30]);
                    obj.setApplHrt(new BigDecimal(lineArray[31]));
                    obj.setPayCcy(lineArray[32]);
                    obj.setPayAmt(new BigDecimal(lineArray[33]));
                    obj.setCanHisNo(new BigDecimal(lineArray[34]));
                    obj.setRelHisNo(new BigDecimal(lineArray[35]));
                    obj.setCptySeq(new BigDecimal(lineArray[36]));
                    obj.setLinkRefNo(lineArray[37]);
                    obj.setRemark(lineArray[38]);
                    if (isExist(obj.getSngNo(), obj.getSeq())) {
                        acom_lmt_bojInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_LMT_BOJInfo> objList) {
        acom_lmt_bojInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String sngNo, BigDecimal seq) {
        return acom_lmt_bojInfoRepository.existsBySngNoAndSeq(sngNo, seq);
    }
}
