package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_XPH_SHIP_RESENDInfo;
import nhbank.core.repositories.AFEX_XPH_SHIP_RESENDInfoRepository;
import nhbank.core.services.AFEX_XPH_SHIP_RESENDInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFEX_XPH_SHIP_RESENDInfoServiceImpl implements AFEX_XPH_SHIP_RESENDInfoService {
    @Autowired
    AFEX_XPH_SHIP_RESENDInfoRepository afex_xph_ship_resendInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_XPH_SHIP_RESENDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_XPH_SHIP_RESENDInfo obj = new AFEX_XPH_SHIP_RESENDInfo();
                obj.setRefNo(lineArray[0]);
                obj.setBhSeq(new BigDecimal(lineArray[1]));
                obj.setSeq(new BigDecimal(lineArray[2]));
                obj.setRegEmpNo(lineArray[3]);
                obj.setRegDt((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setRegTm(lineArray[5]);
                obj.setUpdEmpNo(lineArray[6]);
                obj.setUpdDt((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setUpdTm(lineArray[8]);
                if (isExist(obj.getRefNo(), obj.getBhSeq(), obj.getSeq())) {
                    afex_xph_ship_resendInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_SHIP_RESENDInfo> objList) {
        afex_xph_ship_resendInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal bhSeq, BigDecimal seq) {
        return afex_xph_ship_resendInfoRepository.existsByRefNoAndBhSeqAndSeq(refNo, bhSeq, seq);
    }
}
