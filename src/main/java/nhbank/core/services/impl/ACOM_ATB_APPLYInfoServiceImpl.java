package nhbank.core.services.impl;

import nhbank.core.domain.ACOM_ATB_APPLYInfo;
import nhbank.core.repositories.ACOM_ATB_APPLYInfoRepository;
import nhbank.core.services.ACOM_ATB_APPLYInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ACOM_ATB_APPLYInfoServiceImpl implements ACOM_ATB_APPLYInfoService {
    @Autowired
    ACOM_ATB_APPLYInfoRepository acom_atb_applyInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_ATB_APPLYInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_ATB_APPLYInfo obj = new ACOM_ATB_APPLYInfo();
                obj.setApplyNo(lineArray[0]);
                obj.setTrxDt((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setCixNo(lineArray[3]);
                obj.setBrNo(lineArray[4]);
                obj.setFileNm(lineArray[5]);
                obj.setFileUrl(lineArray[6]);
                obj.setTotCnt(new BigDecimal(lineArray[7]));
                obj.setSusCnt(new BigDecimal(lineArray[8]));
                obj.setFailCnt(new BigDecimal(lineArray[9]));
                obj.setRegEmpNo(lineArray[10]);
                obj.setRegDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                obj.setRegTm(lineArray[12]);
                obj.setUpdEmpNo(lineArray[13]);
                obj.setUpdDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setUpdTm(lineArray[15]);
                if (isExist(obj.getApplyNo())) {
                    acom_atb_applyInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_ATB_APPLYInfo> objList) {
        acom_atb_applyInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String applyNo) {
        return acom_atb_applyInfoRepository.existsByApplyNo(applyNo);
    }
}
