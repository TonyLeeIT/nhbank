package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_RCH_TRANInfo;
import nhbank.core.repositories.AFEX_RCH_TRANInfoRepository;
import nhbank.core.services.AFEX_RCH_TRANInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_RCH_TRANInfoServiceImpl implements AFEX_RCH_TRANInfoService {
    @Autowired
    AFEX_RCH_TRANInfoRepository afex_rch_tranInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_RCH_TRANInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_RCH_TRANInfo obj = new AFEX_RCH_TRANInfo();
                obj.setCd(lineArray[0]);
                obj.setCcy(lineArray[1]);
                obj.setMtGb(lineArray[2]);
                obj.setTrIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setTrSeq(new BigDecimal(lineArray[4]));
                obj.setValIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setDrcrGb(lineArray[6]);
                obj.setDrcrAmt(new BigDecimal(lineArray[7]));
                obj.setOurRef(lineArray[8]);
                obj.setTheirRef(lineArray[9]);
                obj.setIbIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                obj.setIbTime(lineArray[11]);
                obj.setDocId(lineArray[12]);
                obj.setOtherRef(lineArray[13]);
                obj.setRegEmpNo(lineArray[14]);
                obj.setRegDt((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                obj.setRegTm(lineArray[16]);
                obj.setUpdEmpNo(lineArray[17]);
                obj.setUpdDt((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                obj.setUpdTm(lineArray[19]);
                if (isExist(obj.getCd(), obj.getCcy(), obj.getMtGb(), obj.getTrIl(), obj.getTrSeq())) {
                    afex_rch_tranInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RCH_TRANInfo> objList) {
        afex_rch_tranInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cd, String ccy, String mtGb, Date trIl, BigDecimal trSeq) {
        return afex_rch_tranInfoRepository.existsByCdAndCcyAndMtGbAndTrIlAndTrSeq(cd, ccy, mtGb, trIl, trSeq);
    }
}
