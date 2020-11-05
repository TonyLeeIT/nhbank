package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ADST_DPB_GYULInfo;
import nhbank.core.repositories.ADST_DPB_GYULInfoRepository;
import nhbank.core.services.ADST_DPB_GYULInfoService;
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
public class ADST_DPB_GYULInfoServiceImpl implements ADST_DPB_GYULInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_DPB_GYULInfoRepository adst_dpb_gyulInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_DPB_GYUL");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_DPB_GYULInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ADST_DPB_GYUL.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_GYUL.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_DPB_GYULInfo obj = new ADST_DPB_GYULInfo();
                    obj.setIbIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                    obj.setYede(lineArray[1]);
                    obj.setAcctNo(lineArray[2]);
                    obj.setSts(lineArray[3]);
                    obj.setJsInt(new BigDecimal(lineArray[4]));
                    obj.setPrcpYcInt(new BigDecimal(lineArray[5]));
                    obj.setIntYcInt(new BigDecimal(lineArray[6]));
                    obj.setMmAvgAmt(new BigDecimal(lineArray[7]));
                    obj.setIntTax1(new BigDecimal(lineArray[8]));
                    obj.setIntTax2(new BigDecimal(lineArray[9]));
                    obj.setHisNo(new BigDecimal(lineArray[10]));
                    obj.setErrPgm(lineArray[11]);
                    obj.setErrMsg(lineArray[12]);
                    obj.setErrNo(lineArray[13]);
                    obj.setLstIbIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setLstTime(lineArray[15]);
                    obj.setRegEmpNo(lineArray[16]);
                    obj.setRegDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setRegTm(lineArray[18]);
                    obj.setUpdEmpNo(lineArray[19]);
                    obj.setUpdDt((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setUpdTm(lineArray[21]);
                    if (isExist(obj.getIbIl(), obj.getYede(), obj.getAcctNo())) {
                        adst_dpb_gyulInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_GYULInfo> objList) {
        adst_dpb_gyulInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date ibIl, String yede, String acctNo) {
        return adst_dpb_gyulInfoRepository.existsByIbIlAndYedeAndAcctNo(ibIl, yede, acctNo);
    }
}
