package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_RTB_BASEInfo;
import nhbank.core.repositories.AFEX_RTB_BASEInfoRepository;
import nhbank.core.services.AFEX_RTB_BASEInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFEX_RTB_BASEInfoServiceImpl implements AFEX_RTB_BASEInfoService {
    @Autowired
    AFEX_RTB_BASEInfoRepository afex_rtb_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_RTB_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_RTB_BASEInfo obj = new AFEX_RTB_BASEInfo();
                obj.setRefNo(lineArray[0]);
                obj.setCixNo(lineArray[1]);
                obj.setCixNm(lineArray[2]);
                obj.setBuyCcy(lineArray[3]);
                obj.setBuyFamt(new BigDecimal(lineArray[4]));
                obj.setSelCcy(lineArray[5]);
                obj.setSelFamt(new BigDecimal(lineArray[6]));
                obj.setExHrt(new BigDecimal(lineArray[7]));
                obj.setRateAmtGb(lineArray[8]);
                obj.setFrtGb(lineArray[9]);
                obj.setFrtRt(new BigDecimal(lineArray[10]));
                obj.setFrtAmt(new BigDecimal(lineArray[11]));
                obj.setAcIl((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                obj.setLstIbIl((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setIdNo(lineArray[14]);
                obj.setNationCd(lineArray[15]);
                obj.setRemark(lineArray[16]);
                obj.setRegEmpNo(lineArray[17]);
                obj.setRegDt((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                obj.setRegTm(lineArray[19]);
                obj.setUpdEmpNo(lineArray[20]);
                obj.setUpdDt((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                obj.setUpdTm(lineArray[22]);
                obj.setSayuCd(lineArray[23]);
                if (isExist(obj.getRefNo())) {
                    afex_rtb_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RTB_BASEInfo> objList) {
        afex_rtb_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afex_rtb_baseInfoRepository.existsByRefNo(refNo);
    }
}
