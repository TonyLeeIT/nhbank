package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFIF_FEH_HISInfo;
import nhbank.core.repositories.AFIF_FEH_HISInfoRepository;
import nhbank.core.services.AFIF_FEH_HISInfoService;
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
public class AFIF_FEH_HISInfoServiceImpl implements AFIF_FEH_HISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFIF_FEH_HISInfoRepository afif_feh_hisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFIF_FEH_HIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFIF_FEH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFIF_FEH_HIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFIF_FEH_HIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFIF_FEH_HISInfo obj = new AFIF_FEH_HISInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setTrGb(lineArray[3]);
                    obj.setTrCd(lineArray[4]);
                    obj.setIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setAcIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setGisIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setCanIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setSdHisNo(new BigDecimal(lineArray[9]));
                    obj.setNearBuyCcy(lineArray[10]);
                    obj.setNearBuyFamt(new BigDecimal(lineArray[11]));
                    obj.setNearBuyBamt(new BigDecimal(lineArray[12]));
                    obj.setNearBuyJan(new BigDecimal(lineArray[13]));
                    obj.setNearBuyBjan(new BigDecimal(lineArray[14]));
                    obj.setNearSellCcy(lineArray[15]);
                    obj.setNearSellFamt(new BigDecimal(lineArray[16]));
                    obj.setNearSellBamt(new BigDecimal(lineArray[17]));
                    obj.setNearSellJan(new BigDecimal(lineArray[18]));
                    obj.setNearSellBjan(new BigDecimal(lineArray[19]));
                    obj.setNearSndDocNo(lineArray[20]);
                    obj.setFarBuyCcy(lineArray[21]);
                    obj.setFarBuyFamt(new BigDecimal(lineArray[22]));
                    obj.setFarBuyBamt(new BigDecimal(lineArray[23]));
                    obj.setFarBuyJan(new BigDecimal(lineArray[24]));
                    obj.setFarBuyBjan(new BigDecimal(lineArray[25]));
                    obj.setFarSellCcy(lineArray[26]);
                    obj.setFarSellFamt(new BigDecimal(lineArray[27]));
                    obj.setFarSellBamt(new BigDecimal(lineArray[28]));
                    obj.setFarSellJan(new BigDecimal(lineArray[29]));
                    obj.setFarSellBjan(new BigDecimal(lineArray[30]));
                    obj.setFarSndDocNo(lineArray[31]);
                    obj.setTrBr(lineArray[32]);
                    obj.setSdBr(lineArray[33]);
                    obj.setTrTime(lineArray[34]);
                    obj.setUserId(lineArray[35]);
                    obj.setManagerId(lineArray[36]);
                    obj.setIbjiMd(lineArray[37]);
                    obj.setCdSngNo(lineArray[38]);
                    obj.setCdSilSeq(new BigDecimal(lineArray[39]));
                    obj.setFtpSngNo(lineArray[40]);
                    obj.setFtpSilSeq(new BigDecimal(lineArray[41]));
                    obj.setJunNo(lineArray[42]);
                    obj.setYukNo(lineArray[43]);
                    obj.setLstIbIl((lineArray[44].equals("")) ? null : formatter.parse(lineArray[44]));
                    obj.setFrontSndGb(lineArray[45]);
                    obj.setPreSts(lineArray[46]);
                    obj.setBeHdSngno(lineArray[47]);
                    obj.setRegEmpNo(lineArray[48]);
                    obj.setRegDt((lineArray[49].equals("")) ? null : formatter.parse(lineArray[49]));
                    obj.setRegTm(lineArray[50]);
                    obj.setUpdEmpNo(lineArray[51]);
                    obj.setUpdDt((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
                    obj.setUpdTm(lineArray[53]);
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        afif_feh_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFIF_FEH_HISInfo> objList) {
        afif_feh_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afif_feh_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
