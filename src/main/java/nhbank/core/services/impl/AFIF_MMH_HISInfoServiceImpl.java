package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFIF_MMH_HISInfo;
import nhbank.core.repositories.AFIF_MMH_HISInfoRepository;
import nhbank.core.services.AFIF_MMH_HISInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFIF_MMH_HISInfoServiceImpl implements AFIF_MMH_HISInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFIF_MMH_HISInfoRepository afif_mmh_hisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFIF_MMH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFIF_MMH_HIS.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFIF_MMH_HIS.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFIF_MMH_HISInfo obj = new AFIF_MMH_HISInfo();
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
                obj.setTrCcy(lineArray[10]);
                obj.setTrFamt(new BigDecimal(lineArray[11]));
                obj.setTrBamt(new BigDecimal(lineArray[12]));
                obj.setAfJan(new BigDecimal(lineArray[13]));
                obj.setSndDocNo(lineArray[14]);
                obj.setTrBr(lineArray[15]);
                obj.setSdBr(lineArray[16]);
                obj.setTrTime(lineArray[17]);
                obj.setUserId(lineArray[18]);
                obj.setManagerId(lineArray[19]);
                obj.setIbjiMd(lineArray[20]);
                obj.setCdSngNo(lineArray[21]);
                obj.setCdSilSeq(new BigDecimal(lineArray[22]));
                obj.setFtpSngNo(lineArray[23]);
                obj.setFtpSilSeq(new BigDecimal(lineArray[24]));
                obj.setLstIbIl((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                obj.setFrontSndGb(lineArray[26]);
                obj.setPreSts(lineArray[27]);
                obj.setRegEmpNo(lineArray[28]);
                obj.setRegDt((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                obj.setRegTm(lineArray[30]);
                obj.setUpdEmpNo(lineArray[31]);
                obj.setUpdDt((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                obj.setUpdTm(lineArray[33]);
                if (isExist(obj.getRefNo(), obj.getHisNo())) {
                    afif_mmh_hisInfoRepository.save(obj);
                } else {
                    objList.add(obj);
                }
            }
            br.close();
            if (!objList.isEmpty())
                insertAll(objList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertAll(List<AFIF_MMH_HISInfo> objList) {
        afif_mmh_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afif_mmh_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
