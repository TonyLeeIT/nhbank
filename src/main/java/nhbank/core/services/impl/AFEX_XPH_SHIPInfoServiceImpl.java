package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_XPH_SHIPInfo;
import nhbank.core.repositories.AFEX_XPH_SHIPInfoRepository;
import nhbank.core.services.AFEX_XPH_SHIPInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFEX_XPH_SHIPInfoServiceImpl implements AFEX_XPH_SHIPInfoService {
    @Autowired
    AFEX_XPH_SHIPInfoRepository afex_xph_shipInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_XPH_SHIPInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_XPH_SHIPInfo obj = new AFEX_XPH_SHIPInfo();
                obj.setRefNo(lineArray[0]);
                obj.setSeq(new BigDecimal(lineArray[1]));
                obj.setRegEmpNo(lineArray[2]);
                obj.setRegDt((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setRegTm(lineArray[4]);
                obj.setUpdEmpNo(lineArray[5]);
                obj.setUpdDt((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setUpdTm(lineArray[7]);
                if (isExist(obj.getRefNo(), obj.getSeq())) {
                    afex_xph_shipInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_SHIPInfo> objList) {
        afex_xph_shipInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq) {
        return afex_xph_shipInfoRepository.existsByRefNoAndSeq(refNo, seq);
    }
}
