package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ADST_DPB_DROKInfo;
import nhbank.core.repositories.ADST_DPB_DROKInfoRepository;
import nhbank.core.services.ADST_DPB_DROKInfoService;
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
public class ADST_DPB_DROKInfoServiceImpl implements ADST_DPB_DROKInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_DPB_DROKInfoRepository adst_dpb_drokInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_DPB_DROK");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_DPB_DROKInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ADST_DPB_DROK.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_DROK.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_DPB_DROKInfo obj = new ADST_DPB_DROKInfo();
                    obj.setAcctNo(lineArray[0]);
                    obj.setIbIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                    obj.setDrTrxNo(new BigDecimal(lineArray[2]));
                    obj.setProcessCd(lineArray[3]);
                    obj.setSts(lineArray[4]);
                    obj.setMechGb(lineArray[5]);
                    obj.setRelsIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setDrOpNo(lineArray[7]);
                    obj.setDrMngNo(lineArray[8]);
                    obj.setRelsOpNo(lineArray[9]);
                    obj.setRelsMngNo(lineArray[10]);
                    obj.setDrBr(lineArray[11]);
                    obj.setRelsBr(lineArray[12]);
                    obj.setDrTime(lineArray[13]);
                    obj.setRelsTime(lineArray[14]);
                    obj.setBaseIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                    obj.setBfNo(new BigDecimal(lineArray[16]));
                    obj.setAfNo(new BigDecimal(lineArray[17]));
                    obj.setBfRt(new BigDecimal(lineArray[18]));
                    obj.setAfRt(new BigDecimal(lineArray[19]));
                    obj.setBfDate((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setAfDate((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                    obj.setBfString(lineArray[22]);
                    obj.setAfString(lineArray[23]);
                    obj.setNum1(new BigDecimal(lineArray[24]));
                    obj.setNum2(new BigDecimal(lineArray[25]));
                    obj.setNum3(new BigDecimal(lineArray[26]));
                    obj.setRemark(lineArray[27]);
                    obj.setDrHisNo(new BigDecimal(lineArray[28]));
                    obj.setRelsHisNo(new BigDecimal(lineArray[29]));
                    obj.setLstIbIl((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                    obj.setLstTime(lineArray[31]);
                    obj.setSelfMngIl((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                    obj.setRegEmpNo(lineArray[33]);
                    obj.setRegDt((lineArray[34].equals("")) ? null : formatter.parse(lineArray[34]));
                    obj.setRegTm(lineArray[35]);
                    obj.setUpdEmpNo(lineArray[36]);
                    obj.setUpdDt((lineArray[37].equals("")) ? null : formatter.parse(lineArray[37]));
                    obj.setUpdTm(lineArray[38]);
                    if (isExist(obj.getAcctNo(), obj.getIbIl(), obj.getDrTrxNo())) {
                        adst_dpb_drokInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_DROKInfo> objList) {
        adst_dpb_drokInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, Date ibIl, BigDecimal drTrxNo) {
        return adst_dpb_drokInfoRepository.existsByAcctNoAndIbIlAndDrTrxNo(acctNo, ibIl, drTrxNo);
    }
}
