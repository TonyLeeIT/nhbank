package nhbank.core.services.impl;

import nhbank.core.domain.ACOM_DMH_ALLOCInfo;
import nhbank.core.repositories.ACOM_DMH_ALLOCInfoRepository;
import nhbank.core.services.ACOM_DMH_ALLOCInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ACOM_DMH_ALLOCInfoServiceImpl implements ACOM_DMH_ALLOCInfoService {
    @Autowired
    ACOM_DMH_ALLOCInfoRepository acom_dmh_allocInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_DMH_ALLOCInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_DMH_ALLOCInfo obj = new ACOM_DMH_ALLOCInfo();
                obj.setDamboNo(lineArray[0]);
                obj.setCixNo(lineArray[1]);
                obj.setSngNo(lineArray[2]);
                obj.setSeqNo(new BigDecimal(lineArray[3]));
                obj.setSts(lineArray[4]);
                obj.setAllocRatio(new BigDecimal(lineArray[5]));
                obj.setAllocAmt(new BigDecimal(lineArray[6]));
                obj.setMngBr(lineArray[7]);
                obj.setLstHisNo(new BigDecimal(lineArray[8]));
                obj.setLstAcIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setRegEmpNo(lineArray[10]);
                obj.setRegDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                obj.setRegTm(lineArray[12]);
                obj.setUpdEmpNo(lineArray[13]);
                obj.setUpdDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setUpdTm(lineArray[15]);
                if (isExist(obj.getDamboNo(), obj.getCixNo(), obj.getSngNo(), obj.getSeqNo())) {
                    acom_dmh_allocInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_DMH_ALLOCInfo> objList) {
        acom_dmh_allocInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String damboNo, String cixNo, String sngNo, BigDecimal seqNo) {
        return acom_dmh_allocInfoRepository.existsByDamboNoAndCixNoAndSngNoAndSeqNo(damboNo, cixNo, sngNo, seqNo);
    }
}
