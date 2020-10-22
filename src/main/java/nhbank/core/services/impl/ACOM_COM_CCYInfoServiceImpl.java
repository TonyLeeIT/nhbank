package nhbank.core.services.impl;

import nhbank.core.domain.ACOM_COM_CCYInfo;
import nhbank.core.repositories.ACOM_COM_CCYInfoRepository;
import nhbank.core.services.ACOM_COM_CCYInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ACOM_COM_CCYInfoServiceImpl implements ACOM_COM_CCYInfoService {
    @Autowired
    ACOM_COM_CCYInfoRepository acom_com_ccyInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_COM_CCYInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_COM_CCYInfo obj = new ACOM_COM_CCYInfo();
                obj.setCd(lineArray[0]);
                obj.setBokCd(lineArray[1]);
                obj.setNm(lineArray[2]);
                obj.setUnit(new BigDecimal(lineArray[3]));
                obj.setDigit(new BigDecimal(lineArray[4]));
                obj.setCtryCd(lineArray[5]);
                obj.setGosiGb(lineArray[6]);
                obj.setSeqNo(new BigDecimal(lineArray[7]));
                obj.setYearGb(new BigDecimal(lineArray[8]));
                obj.setMakeIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setRegEmpNo(lineArray[10]);
                obj.setRegDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                obj.setRegTm(lineArray[12]);
                obj.setUpdEmpNo(lineArray[13]);
                obj.setUpdDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setUpdTm(lineArray[15]);
                if (isExist(obj.getCd())) {
                    acom_com_ccyInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COM_CCYInfo> objList) {
        acom_com_ccyInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cd) {
        return acom_com_ccyInfoRepository.existsByCd(cd);
    }
}
