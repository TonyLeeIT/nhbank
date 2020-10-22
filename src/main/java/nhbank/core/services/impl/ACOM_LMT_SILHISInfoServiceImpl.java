package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_LMT_SILHISInfo;
import nhbank.core.repositories.ACOM_LMT_SILHISInfoRepository;
import nhbank.core.services.ACOM_LMT_SILHISInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ACOM_LMT_SILHISInfoServiceImpl implements ACOM_LMT_SILHISInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_LMT_SILHISInfoRepository acom_lmt_silhisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_LMT_SILHISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\ACOM_LMT_SILHIS.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\ACOM_LMT_SILHIS.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_LMT_SILHISInfo obj = new ACOM_LMT_SILHISInfo();
                obj.setSngNo(lineArray[0]);
                obj.setActCd(lineArray[1]);
                obj.setSilCcy(lineArray[2]);
                obj.setHisNo(new BigDecimal(lineArray[3]));
                obj.setSts(lineArray[4]);
                obj.setTrCd(lineArray[5]);
                obj.setIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setAcIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setGisIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setRefNo(lineArray[9]);
                obj.setSilGb(lineArray[10]);
                obj.setUpmuCd(lineArray[11]);
                obj.setGeorCd(lineArray[12]);
                obj.setSilAmt(new BigDecimal(lineArray[13]));
                obj.setSilPmgb(lineArray[14]);
                obj.setSilJan(new BigDecimal(lineArray[15]));
                obj.setDjgAmt(new BigDecimal(lineArray[16]));
                obj.setDjgPmgb(lineArray[17]);
                obj.setDjgJan(new BigDecimal(lineArray[18]));
                obj.setGurBamt(new BigDecimal(lineArray[19]));
                obj.setGurBpmgb(lineArray[20]);
                obj.setGurBjan(new BigDecimal(lineArray[21]));
                obj.setGurFamt(new BigDecimal(lineArray[22]));
                obj.setGurFpmgb(lineArray[23]);
                obj.setGurFjan(new BigDecimal(lineArray[24]));
                obj.setTrBr(lineArray[25]);
                obj.setSdBr(lineArray[26]);
                obj.setTrTime(lineArray[27]);
                obj.setOpNo(lineArray[28]);
                obj.setMngNo(lineArray[29]);
                obj.setTrscSeqNo(new BigDecimal(lineArray[30]));
                obj.setTrxFamt(new BigDecimal(lineArray[31]));
                obj.setTrxBamt(new BigDecimal(lineArray[32]));
                obj.setRegEmpNo(lineArray[33]);
                obj.setRegDt((lineArray[34].equals("")) ? null : formatter.parse(lineArray[34]));
                obj.setRegTm(lineArray[35]);
                obj.setUpdEmpNo(lineArray[36]);
                obj.setUpdDt((lineArray[37].equals("")) ? null : formatter.parse(lineArray[37]));
                obj.setUpdTm(lineArray[38]);
                if (isExist(obj.getSngNo(), obj.getActCd(), obj.getSilCcy(), obj.getHisNo())) {
                    acom_lmt_silhisInfoRepository.save(obj);
                } else {
                    objList.add(obj);
                }
            }
            if (!objList.isEmpty())
                insertAll(objList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertAll(List<ACOM_LMT_SILHISInfo> objList) {
        acom_lmt_silhisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String sngNo, String actCd, String silCcy, BigDecimal hisNo) {
        return acom_lmt_silhisInfoRepository.existsBySngNoAndActCdAndSilCcyAndHisNo(sngNo, actCd, silCcy, hisNo);
    }
}
