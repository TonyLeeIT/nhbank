package nhbank.core.services.impl;

import nhbank.core.domain.ADST_DPB_HEJIInfo;
import nhbank.core.repositories.ADST_DPB_HEJIInfoRepository;
import nhbank.core.services.ADST_DPB_HEJIInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ADST_DPB_HEJIInfoServiceImpl implements ADST_DPB_HEJIInfoService {
    @Autowired
    ADST_DPB_HEJIInfoRepository adst_dpb_hejiInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_DPB_HEJIInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_DPB_HEJIInfo obj = new ADST_DPB_HEJIInfo();
                obj.setAcctNo(lineArray[0]);
                obj.setIbIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                obj.setTrxNo(new BigDecimal(lineArray[2]));
                obj.setTrCd(lineArray[3]);
                obj.setBfCixNo(lineArray[4]);
                obj.setDepCnt(new BigDecimal(lineArray[5]));
                obj.setSts(lineArray[6]);
                obj.setMechGb(lineArray[7]);
                obj.setOpNo(lineArray[8]);
                obj.setIbTime(lineArray[9]);
                obj.setClsIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                obj.setGisIl((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                obj.setCanIl((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                obj.setTaxRt(new BigDecimal(lineArray[13]));
                obj.setDptRt(new BigDecimal(lineArray[14]));
                obj.setClsBamt(new BigDecimal(lineArray[15]));
                obj.setClsAamt(new BigDecimal(lineArray[16]));
                obj.setBfIntBamt(new BigDecimal(lineArray[17]));
                obj.setBfIntAamt(new BigDecimal(lineArray[18]));
                obj.setAfIntBamt(new BigDecimal(lineArray[19]));
                obj.setAfIntAamt(new BigDecimal(lineArray[20]));
                obj.setTax1Amt(new BigDecimal(lineArray[21]));
                obj.setTax2Amt(new BigDecimal(lineArray[22]));
                obj.setTax3Amt(new BigDecimal(lineArray[23]));
                obj.setTax4Amt(new BigDecimal(lineArray[24]));
                obj.setRtnIntBamt(new BigDecimal(lineArray[25]));
                obj.setRtnIntAamt(new BigDecimal(lineArray[26]));
                obj.setRtnTax1Amt(new BigDecimal(lineArray[27]));
                obj.setRtnTax2Amt(new BigDecimal(lineArray[28]));
                obj.setRtnTax3Amt(new BigDecimal(lineArray[29]));
                obj.setRtnTax4Amt(new BigDecimal(lineArray[30]));
                obj.setTotPayBamt(new BigDecimal(lineArray[31]));
                obj.setTotPayAamt(new BigDecimal(lineArray[32]));
                obj.setHisNo(new BigDecimal(lineArray[33]));
                obj.setClsFee(new BigDecimal(lineArray[34]));
                obj.setPnltAmt(new BigDecimal(lineArray[35]));
                obj.setRegEmpNo(lineArray[36]);
                obj.setRegDt((lineArray[37].equals("")) ? null : formatter.parse(lineArray[37]));
                obj.setRegTm(lineArray[38]);
                obj.setUpdEmpNo(lineArray[39]);
                obj.setUpdDt((lineArray[40].equals("")) ? null : formatter.parse(lineArray[40]));
                obj.setUpdTm(lineArray[41]);
                if (isExist(obj.getAcctNo(), obj.getIbIl(), obj.getTrxNo())) {
                    adst_dpb_hejiInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_HEJIInfo> objList) {
        adst_dpb_hejiInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, Date ibIl, BigDecimal trxNo) {
        return adst_dpb_hejiInfoRepository.existsByAcctNoAndIbIlAndTrxNo(acctNo, ibIl, trxNo);
    }
}
