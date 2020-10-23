package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_LMT_SILInfo;
import nhbank.core.repositories.ACOM_LMT_SILInfoRepository;
import nhbank.core.services.ACOM_LMT_SILInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ACOM_LMT_SILInfoServiceImpl implements ACOM_LMT_SILInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_LMT_SILInfoRepository acom_lmt_silInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_LMT_SILInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ACOM_LMT_SIL.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ACOM_LMT_SIL.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_LMT_SILInfo obj = new ACOM_LMT_SILInfo();
                obj.setSngNo(lineArray[0]);
                obj.setActCd(lineArray[1]);
                obj.setSilCcy(lineArray[2]);
                obj.setFstIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setLstIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setLstIbil((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setSilAmt(new BigDecimal(lineArray[6]));
                obj.setDjgAmt(new BigDecimal(lineArray[7]));
                obj.setGurBamt(new BigDecimal(lineArray[8]));
                obj.setGurFamt(new BigDecimal(lineArray[9]));
                obj.setRegEmpNo(lineArray[10]);
                obj.setRegDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                obj.setRegTm(lineArray[12]);
                obj.setUpdEmpNo(lineArray[13]);
                obj.setUpdDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setUpdTm(lineArray[15]);
                if (isExist(obj.getSngNo(), obj.getActCd(), obj.getSilCcy())) {
                    acom_lmt_silInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_LMT_SILInfo> objList) {
        acom_lmt_silInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String sngNo, String actCd, String silCcy) {
        return acom_lmt_silInfoRepository.existsBySngNoAndActCdAndSilCcy(sngNo, actCd, silCcy);
    }
}
