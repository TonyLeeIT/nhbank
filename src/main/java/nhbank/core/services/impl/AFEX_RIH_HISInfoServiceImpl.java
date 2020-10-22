package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_RIH_HISInfo;
import nhbank.core.repositories.AFEX_RIH_HISInfoRepository;
import nhbank.core.services.AFEX_RIH_HISInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_RIH_HISInfoServiceImpl implements AFEX_RIH_HISInfoService {
    @Autowired
    AFEX_RIH_HISInfoRepository afex_rih_hisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_RIH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_RIH_HISInfo obj = new AFEX_RIH_HISInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setTrGb(lineArray[3]);
                obj.setTrCd(lineArray[4]);
                obj.setCixNo(lineArray[5]);
                obj.setIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setAcIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setGisIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setCanIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setSdHisNo(new BigDecimal(lineArray[10]));
                obj.setTrCcy(lineArray[11]);
                obj.setTrFamt(new BigDecimal(lineArray[12]));
                obj.setTrBamt(new BigDecimal(lineArray[13]));
                obj.setAfJan(new BigDecimal(lineArray[14]));
                obj.setFeeMd(lineArray[15]);
                obj.setTrBr(lineArray[16]);
                obj.setSdBr(lineArray[17]);
                obj.setIbTime(lineArray[18]);
                obj.setOpNo(lineArray[19]);
                obj.setMngNo(lineArray[20]);
                obj.setIbjiMd(lineArray[21]);
                obj.setYdSeq(new BigDecimal(lineArray[22]));
                obj.setYdGuja(lineArray[23]);
                obj.setBokSeq(new BigDecimal(lineArray[24]));
                obj.setCdSngNo(lineArray[25]);
                obj.setCdSilSeq(new BigDecimal(lineArray[26]));
                obj.setRegEmpNo(lineArray[27]);
                obj.setRegDt((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                obj.setRegTm(lineArray[29]);
                obj.setUpdEmpNo(lineArray[30]);
                obj.setUpdDt((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                obj.setUpdTm(lineArray[32]);
                if (isExist(obj.getRefNo(), obj.getHisNo())) {
                    afex_rih_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RIH_HISInfo> objList) {
        afex_rih_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_rih_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
