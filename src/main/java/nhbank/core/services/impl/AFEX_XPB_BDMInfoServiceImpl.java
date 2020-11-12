package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_XPB_BDMInfo;
import nhbank.core.repositories.AFEX_XPB_BDMInfoRepository;
import nhbank.core.services.AFEX_XPB_BDMInfoService;
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
public class AFEX_XPB_BDMInfoServiceImpl implements AFEX_XPB_BDMInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPB_BDMInfoRepository afex_xpb_bdmInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPB_BDM");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPB_BDMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_XPB_BDM.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPB_BDM.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPB_BDMInfo obj = new AFEX_XPB_BDMInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setLstIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setCcy(lineArray[6]);
                    obj.setAmt(new BigDecimal(lineArray[7]));
                    obj.setBudoCd(lineArray[8]);
                    obj.setShSeq(new BigDecimal(lineArray[9]));
                    obj.setShSumAmt(new BigDecimal(lineArray[10]));
                    obj.setBmGb(lineArray[11]);
                    obj.setMiSeq(new BigDecimal(lineArray[12]));
                    obj.setMiTrBamt(new BigDecimal(lineArray[13]));
                    obj.setMiShBamt(new BigDecimal(lineArray[14]));
                    obj.setNcuCcy(lineArray[15]);
                    obj.setNcuAmt(new BigDecimal(lineArray[16]));
                    obj.setNcuShSumAmt(new BigDecimal(lineArray[17]));
                    obj.setRegEmpNo(lineArray[18]);
                    obj.setRegDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setRegTm(lineArray[20]);
                    obj.setUpdEmpNo(lineArray[21]);
                    obj.setUpdDt((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                    obj.setUpdTm(lineArray[23]);
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        afex_xpb_bdmInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPB_BDMInfo> objList) {
        afex_xpb_bdmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_xpb_bdmInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
