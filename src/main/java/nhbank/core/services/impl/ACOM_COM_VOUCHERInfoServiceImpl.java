package nhbank.core.services.impl;

import nhbank.core.domain.ACOM_COM_VOUCHERInfo;
import nhbank.core.repositories.ACOM_COM_VOUCHERInfoRepository;
import nhbank.core.services.ACOM_COM_VOUCHERInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ACOM_COM_VOUCHERInfoServiceImpl implements ACOM_COM_VOUCHERInfoService {
    @Autowired
    ACOM_COM_VOUCHERInfoRepository acom_com_voucherInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_COM_VOUCHERInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_COM_VOUCHERInfo obj = new ACOM_COM_VOUCHERInfo();
                obj.setAcIl(lineArray[0]);
                obj.setAcBr(lineArray[1]);
                obj.setRefNo(lineArray[2]);
                obj.setHisNo(new BigDecimal(lineArray[3]));
                obj.setOtherRefNo(lineArray[4]);
                obj.setUpmuCd(lineArray[5]);
                obj.setTrCd(lineArray[6]);
                obj.setTrxName(lineArray[7]);
                obj.setTrxDt(lineArray[8]);
                obj.setCixNo(lineArray[9]);
                obj.setCixName(lineArray[10]);
                obj.setTellNo(lineArray[11]);
                obj.setBenef(lineArray[12]);
                obj.setRemark(lineArray[13]);
                obj.setFreeText1(lineArray[14]);
                obj.setFreeText2(lineArray[15]);
                obj.setFreeText3(lineArray[16]);
                obj.setFreeText4(lineArray[17]);
                obj.setFreeText5(lineArray[18]);
                obj.setFreeText6(lineArray[19]);
                obj.setFreeText7(lineArray[20]);
                obj.setFreeText8(lineArray[21]);
                obj.setPrtGb(lineArray[22]);
                obj.setOpNo(lineArray[23]);
                obj.setOpName(lineArray[24]);
                obj.setVoucherNo(new BigDecimal(lineArray[25]));
                obj.setPrtSeq(new BigDecimal(lineArray[26]));
                obj.setRegEmpNo(lineArray[27]);
                obj.setRegDt((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                obj.setRegTm(lineArray[29]);
                obj.setUpdEmpNo(lineArray[30]);
                obj.setUpdDt((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                obj.setUpdTm(lineArray[32]);
                if (isExist(obj.getAcIl(), obj.getAcBr())) {
                    acom_com_voucherInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COM_VOUCHERInfo> objList) {
        acom_com_voucherInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acIl, String acBr) {
        return acom_com_voucherInfoRepository.existsByAcIlAndAcBr(acIl, acBr);
    }
}
