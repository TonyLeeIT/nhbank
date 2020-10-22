package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_RCH_VOSTROInfo;
import nhbank.core.repositories.AFEX_RCH_VOSTROInfoRepository;
import nhbank.core.services.AFEX_RCH_VOSTROInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_RCH_VOSTROInfoServiceImpl implements AFEX_RCH_VOSTROInfoService {
    @Autowired
    AFEX_RCH_VOSTROInfoRepository afex_rch_vostroInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_RCH_VOSTROInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_RCH_VOSTROInfo obj = new AFEX_RCH_VOSTROInfo();
                obj.setIbIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                obj.setSeqNo(new BigDecimal(lineArray[1]));
                obj.setHisNo(new BigDecimal(lineArray[2]));
                obj.setCdAmt(new BigDecimal(lineArray[3]));
                obj.setAcIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setOpNo(lineArray[5]);
                obj.setValIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setRegEmpNo(lineArray[7]);
                obj.setRegDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setRegTm(lineArray[9]);
                obj.setUpdEmpNo(lineArray[10]);
                obj.setUpdDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                obj.setUpdTm(lineArray[12]);
                if (isExist(obj.getIbIl(), obj.getSeqNo(), obj.getHisNo(), obj.getCdAmt())) {
                    afex_rch_vostroInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RCH_VOSTROInfo> objList) {
        afex_rch_vostroInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date ibIl, BigDecimal seqNo, BigDecimal hisNo, BigDecimal cdAmt) {
        return afex_rch_vostroInfoRepository.existsByIbIlAndSeqNoAndHisNoAndCdAmt(ibIl, seqNo, hisNo, cdAmt);
    }
}
