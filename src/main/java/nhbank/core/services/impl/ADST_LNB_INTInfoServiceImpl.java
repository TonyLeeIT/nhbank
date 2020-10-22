package nhbank.core.services.impl;

import nhbank.core.domain.ADST_LNB_INTInfo;
import nhbank.core.repositories.ADST_LNB_INTInfoRepository;
import nhbank.core.services.ADST_LNB_INTInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ADST_LNB_INTInfoServiceImpl implements ADST_LNB_INTInfoService {
    @Autowired
    ADST_LNB_INTInfoRepository adst_lnb_intInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_LNB_INTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_LNB_INTInfo obj = new ADST_LNB_INTInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setSeqNo(new BigDecimal(lineArray[2]));
                obj.setSts(lineArray[3]);
                obj.setAdjSeq(new BigDecimal(lineArray[4]));
                obj.setSchSeq(new BigDecimal(lineArray[5]));
                obj.setSchSubNo(new BigDecimal(lineArray[6]));
                obj.setIntRcvIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setCcy(lineArray[8]);
                obj.setIntAmt(new BigDecimal(lineArray[9]));
                obj.setIntDsAmt(new BigDecimal(lineArray[10]));
                obj.setUsdCvtAmt(new BigDecimal(lineArray[11]));
                obj.setBbsCvtAmt(new BigDecimal(lineArray[12]));
                obj.setTrCd(lineArray[13]);
                obj.setIntGb(lineArray[14]);
                obj.setTrGb(lineArray[15]);
                obj.setMisuGb(lineArray[16]);
                obj.setRollGb(lineArray[17]);
                obj.setIndexRt(new BigDecimal(lineArray[18]));
                obj.setSpreadGb(lineArray[19]);
                obj.setSpreadRt(new BigDecimal(lineArray[20]));
                obj.setIntORt(new BigDecimal(lineArray[21]));
                obj.setIntSRt(new BigDecimal(lineArray[22]));
                obj.setIntFromIl((lineArray[23].equals("")) ? null : formatter.parse(lineArray[23]));
                obj.setIntToIl((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                obj.setIntDays(new BigDecimal(lineArray[25]));
                obj.setBizSeq(new BigDecimal(lineArray[26]));
                obj.setBizSubseq(new BigDecimal(lineArray[27]));
                obj.setBfJsLisuIl((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                obj.setBfPtLisuIl((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                obj.setBfYcLisuIl((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                obj.setFstIbIl((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                obj.setLstDealIl((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                obj.setLstIbIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                obj.setRegEmpNo(lineArray[34]);
                obj.setRegDt((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                obj.setRegTm(lineArray[36]);
                obj.setUpdEmpNo(lineArray[37]);
                obj.setUpdDt((lineArray[38].equals("")) ? null : formatter.parse(lineArray[38]));
                obj.setUpdTm(lineArray[39]);
                if (isExist(obj.getRefNo(), obj.getHisNo(), obj.getSeqNo())) {
                    adst_lnb_intInfoRepository.save(obj);
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
    public void insertAll(List<ADST_LNB_INTInfo> objList) {
        adst_lnb_intInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo, BigDecimal seqNo) {
        return adst_lnb_intInfoRepository.existsByRefNoAndHisNoAndSeqNo(refNo, hisNo, seqNo);
    }
}
