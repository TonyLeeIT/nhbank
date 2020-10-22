package nhbank.core.services.impl;

import nhbank.core.domain.ACOM_COM_FEERTInfo;
import nhbank.core.repositories.ACOM_COM_FEERTInfoRepository;
import nhbank.core.services.ACOM_COM_FEERTInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ACOM_COM_FEERTInfoServiceImpl implements ACOM_COM_FEERTInfoService {
    @Autowired
    ACOM_COM_FEERTInfoRepository acom_com_feertInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_COM_FEERTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_COM_FEERTInfo obj = new ACOM_COM_FEERTInfo();
                obj.setLcd(lineArray[0]);
                obj.setMcd(lineArray[1]);
                obj.setScd(lineArray[2]);
                obj.setMngBr(lineArray[3]);
                obj.setApplyIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setFrt(new BigDecimal(lineArray[5]));
                obj.setMaxFee(new BigDecimal(lineArray[6]));
                obj.setMinFee(new BigDecimal(lineArray[7]));
                obj.setEtcFrt(new BigDecimal(lineArray[8]));
                obj.setCdNm(lineArray[9]);
                obj.setMakeIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                obj.setPlCd(lineArray[11]);
                obj.setRegEmpNo(lineArray[12]);
                obj.setRegDt((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setRegTm(lineArray[14]);
                obj.setUpdEmpNo(lineArray[15]);
                obj.setUpdDt((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                obj.setUpdTm(lineArray[17]);
                if (isExist(obj.getLcd(), obj.getMcd(), obj.getScd(), obj.getMngBr(), obj.getApplyIl())) {
                    acom_com_feertInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COM_FEERTInfo> objList) {
        acom_com_feertInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String lcd, String mcd, String scd, String mngBr, Date applyIl) {
        return acom_com_feertInfoRepository.existsByLcdAndMcdAndScdAndMngBrAndApplyIl(lcd, mcd, scd, mngBr, applyIl);
    }
}
