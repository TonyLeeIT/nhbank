package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ADST_DPB_INTMInfo;
import nhbank.core.repositories.ADST_DPB_INTMInfoRepository;
import nhbank.core.services.ADST_DPB_INTMInfoService;
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
public class ADST_DPB_INTMInfoServiceImpl implements ADST_DPB_INTMInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_DPB_INTMInfoRepository adst_dpb_intmInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_DPB_INTM");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_DPB_INTMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ADST_DPB_INTM.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_INTM.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_DPB_INTMInfo obj = new ADST_DPB_INTMInfo();
                    obj.setAcctNo(lineArray[0]);
                    obj.setIbIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                    obj.setGisIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                    obj.setIntSeq(new BigDecimal(lineArray[3]));
                    obj.setSts(lineArray[4]);
                    obj.setTrCd(lineArray[5]);
                    obj.setCurJan(new BigDecimal(lineArray[6]));
                    obj.setDsAmt(new BigDecimal(lineArray[7]));
                    obj.setDsDays(new BigDecimal(lineArray[8]));
                    obj.setIntRt(new BigDecimal(lineArray[9]));
                    obj.setIntAmt(new BigDecimal(lineArray[10]));
                    obj.setTaxRt(new BigDecimal(lineArray[11]));
                    obj.setTaxAmt(new BigDecimal(lineArray[12]));
                    obj.setFromDt((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                    obj.setToDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setHisNo(new BigDecimal(lineArray[15]));
                    obj.setCanIl((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                    obj.setCanOpNo(lineArray[17]);
                    obj.setRegEmpNo(lineArray[18]);
                    obj.setRegDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setRegTm(lineArray[20]);
                    obj.setUpdEmpNo(lineArray[21]);
                    obj.setUpdDt((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                    obj.setUpdTm(lineArray[23]);
                    if (isExist(obj.getAcctNo(), obj.getIbIl(), obj.getGisIl(), obj.getIntSeq())) {
                        adst_dpb_intmInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_INTMInfo> objList) {
        adst_dpb_intmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, Date ibIl, Date gisIl, BigDecimal intSeq) {
        return adst_dpb_intmInfoRepository.existsByAcctNoAndIbIlAndGisIlAndIntSeq(acctNo, ibIl, gisIl, intSeq);
    }
}
