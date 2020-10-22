package nhbank.core.services.impl;

import nhbank.core.domain.ADST_LNB_AGRInfo;
import nhbank.core.repositories.ADST_LNB_AGRInfoRepository;
import nhbank.core.services.ADST_LNB_AGRInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ADST_LNB_AGRInfoServiceImpl implements ADST_LNB_AGRInfoService {
    @Autowired
    ADST_LNB_AGRInfoRepository adst_lnb_agrInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_LNB_AGRInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_LNB_AGRInfo obj = new ADST_LNB_AGRInfo();
                obj.setRefNo(lineArray[0]);
                obj.setIkisSts(lineArray[1]);
                obj.setBkGb(lineArray[2]);
                obj.setCixNo(lineArray[3]);
                obj.setBuseoNo(lineArray[4]);
                obj.setComId(lineArray[5]);
                obj.setComNm(lineArray[6]);
                obj.setContractIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setValueIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setTotExpIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setLonCcy(lineArray[10]);
                obj.setContractAmt(new BigDecimal(lineArray[11]));
                obj.setLonJan(new BigDecimal(lineArray[12]));
                obj.setRepayGb(lineArray[13]);
                obj.setRepayTerm(new BigDecimal(lineArray[14]));
                obj.setRepayGap(new BigDecimal(lineArray[15]));
                obj.setRepayGapGb(lineArray[16]);
                obj.setGraceDays(new BigDecimal(lineArray[17]));
                obj.setRepayCnt(new BigDecimal(lineArray[18]));
                obj.setDrawdownSeq(new BigDecimal(lineArray[19]));
                obj.setRateCcy(lineArray[20]);
                obj.setFixFltGb(lineArray[21]);
                obj.setIndexRt(new BigDecimal(lineArray[22]));
                obj.setSpreadGb(lineArray[23]);
                obj.setSpreadRt(new BigDecimal(lineArray[24]));
                obj.setRollGap(new BigDecimal(lineArray[25]));
                obj.setRollGapGb(lineArray[26]);
                obj.setLateChgRt(new BigDecimal(lineArray[27]));
                obj.setPastDueRt(new BigDecimal(lineArray[28]));
                obj.setAdvArrGb(lineArray[29]);
                obj.setSingleBothType(lineArray[30]);
                obj.setAccrType(lineArray[31]);
                obj.setBsnsDayRule(lineArray[32]);
                obj.setIntGap(new BigDecimal(lineArray[33]));
                obj.setIntGapGb(lineArray[34]);
                obj.setIntAdjYn(lineArray[35]);
                obj.setYield(lineArray[36]);
                obj.setHdSngNo(lineArray[37]);
                obj.setCommitfeeYn(lineArray[38]);
                obj.setFeeRt(new BigDecimal(lineArray[39]));
                obj.setPayDepoCcy(lineArray[40]);
                obj.setPayDepoBic(lineArray[41]);
                obj.setRcvDepoCcy(lineArray[42]);
                obj.setRcvDepoBic(lineArray[43]);
                obj.setEvidNo(lineArray[44]);
                obj.setEvidCcy(lineArray[45]);
                obj.setEvidAmt(new BigDecimal(lineArray[46]));
                obj.setUsdCvtAmt(new BigDecimal(lineArray[47]));
                obj.setBbsCvtAmt(new BigDecimal(lineArray[48]));
                obj.setLossAmt(new BigDecimal(lineArray[49]));
                obj.setRestructuringYn(lineArray[50]);
                obj.setLoanClass(lineArray[51]);
                obj.setFstIbIl((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
                obj.setLstDealIl((lineArray[53].equals("")) ? null : formatter.parse(lineArray[53]));
                obj.setLstIbIl((lineArray[54].equals("")) ? null : formatter.parse(lineArray[54]));
                obj.setOpNo(lineArray[55]);
                obj.setOwnerNo(lineArray[56]);
                obj.setRmpbNo(lineArray[57]);
                obj.setIbfGb(lineArray[58]);
                obj.setBlNo(lineArray[59]);
                obj.setLgOpenIl((lineArray[60].equals("")) ? null : formatter.parse(lineArray[60]));
                obj.setBlockAmt(new BigDecimal(lineArray[61]));
                obj.setSubstsCd(lineArray[62]);
                obj.setRegEmpNo(lineArray[63]);
                obj.setRegDt((lineArray[64].equals("")) ? null : formatter.parse(lineArray[64]));
                obj.setRegTm(lineArray[65]);
                obj.setUpdEmpNo(lineArray[66]);
                obj.setUpdDt((lineArray[67].equals("")) ? null : formatter.parse(lineArray[67]));
                obj.setUpdTm(lineArray[68]);
                if (isExist(obj.getRefNo())) {
                    adst_lnb_agrInfoRepository.save(obj);
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
    public void insertAll(List<ADST_LNB_AGRInfo> objList) {
        adst_lnb_agrInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return adst_lnb_agrInfoRepository.existsByRefNo(refNo);
    }
}
