package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_XPH_TRAInfo;
import nhbank.core.repositories.AFEX_XPH_TRAInfoRepository;
import nhbank.core.services.AFEX_XPH_TRAInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFEX_XPH_TRAInfoServiceImpl implements AFEX_XPH_TRAInfoService {
    @Autowired
    AFEX_XPH_TRAInfoRepository afex_xph_traInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_XPH_TRAInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_XPH_TRAInfo obj = new AFEX_XPH_TRAInfo();
                obj.setRefNo(lineArray[0]);
                obj.setTraGb(lineArray[1]);
                obj.setHisNo(new BigDecimal(lineArray[2]));
                obj.setSeqNo(new BigDecimal(lineArray[3]));
                obj.setSts(lineArray[4]);
                obj.setAcIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setGisIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setCcy(lineArray[7]);
                obj.setAmt(new BigDecimal(lineArray[8]));
                obj.setInOutGb(lineArray[9]);
                obj.setMtGubun(lineArray[10]);
                obj.setTlxNo(lineArray[11]);
                obj.setFileName(lineArray[12]);
                obj.setThruBank(lineArray[13]);
                obj.setNcuCcy(lineArray[14]);
                obj.setNcuAmt(new BigDecimal(lineArray[15]));
                obj.setRegEmpNo(lineArray[16]);
                obj.setRegDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                obj.setRegTm(lineArray[18]);
                obj.setUpdEmpNo(lineArray[19]);
                obj.setUpdDt((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                obj.setUpdTm(lineArray[21]);
                if (isExist(obj.getRefNo(), obj.getTraGb(), obj.getHisNo(), obj.getSeqNo())) {
                    afex_xph_traInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_TRAInfo> objList) {
        afex_xph_traInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, String traGb, BigDecimal hisNo, BigDecimal seqNo) {
        return afex_xph_traInfoRepository.existsByRefNoAndTraGbAndHisNoAndSeqNo(refNo, traGb, hisNo, seqNo);
    }
}
