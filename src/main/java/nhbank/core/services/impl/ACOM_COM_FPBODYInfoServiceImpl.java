package nhbank.core.services.impl;

import nhbank.core.domain.ACOM_COM_FPBODYInfo;
import nhbank.core.repositories.ACOM_COM_FPBODYInfoRepository;
import nhbank.core.services.ACOM_COM_FPBODYInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ACOM_COM_FPBODYInfoServiceImpl implements ACOM_COM_FPBODYInfoService {
    @Autowired
    ACOM_COM_FPBODYInfoRepository acom_com_fpbodyInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_COM_FPBODYInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_COM_FPBODYInfo obj = new ACOM_COM_FPBODYInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setPrtKind(lineArray[2]);
                obj.setLineSeq(new BigDecimal(lineArray[3]));
                obj.setLineTxt(lineArray[4]);
                obj.setRegEmpNo(lineArray[5]);
                obj.setRegDt((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setRegTm(lineArray[7]);
                obj.setUpdEmpNo(lineArray[8]);
                obj.setUpdDt((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setUpdTm(lineArray[10]);
                if (isExist(obj.getRefNo(), obj.getHisNo(), obj.getPrtKind(), obj.getLineSeq())) {
                    acom_com_fpbodyInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COM_FPBODYInfo> objList) {
        acom_com_fpbodyInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo, String prtKind, BigDecimal lineSeq) {
        return acom_com_fpbodyInfoRepository.existsByRefNoAndHisNoAndPrtKindAndLineSeq(refNo, hisNo, prtKind, lineSeq);
    }
}
