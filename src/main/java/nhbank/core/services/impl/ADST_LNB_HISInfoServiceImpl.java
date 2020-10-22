package nhbank.core.services.impl;

import nhbank.core.domain.ADST_LNB_HISInfo;
import nhbank.core.repositories.ADST_LNB_HISInfoRepository;
import nhbank.core.services.ADST_LNB_HISInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ADST_LNB_HISInfoServiceImpl implements ADST_LNB_HISInfoService {
    @Autowired
    ADST_LNB_HISInfoRepository adst_lnb_hisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_LNB_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_LNB_HISInfo obj = new ADST_LNB_HISInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setTrGb(lineArray[3]);
                obj.setTrCd(lineArray[4]);
                obj.setCixNo(lineArray[5]);
                obj.setIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setAcIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setGisIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setCanIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setSdHisNo(new BigDecimal(lineArray[10]));
                obj.setTrCcy(lineArray[11]);
                obj.setTrFamt(new BigDecimal(lineArray[12]));
                obj.setTrBamt(new BigDecimal(lineArray[13]));
                obj.setAfJan(new BigDecimal(lineArray[14]));
                obj.setFeeMd(lineArray[15]);
                obj.setSndDocNo(lineArray[16]);
                obj.setTrBr(lineArray[17]);
                obj.setSdBr(lineArray[18]);
                obj.setTrTime(lineArray[19]);
                obj.setUserId(lineArray[20]);
                obj.setManagerId(lineArray[21]);
                obj.setIbjiMd(lineArray[22]);
                obj.setYdGuja(lineArray[23]);
                obj.setCdSngNo(lineArray[24]);
                obj.setCdSilSeq(new BigDecimal(lineArray[25]));
                obj.setFtpSngNo(lineArray[26]);
                obj.setFtpSilSeq(new BigDecimal(lineArray[27]));
                obj.setLstIbIl((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                obj.setBfLrepayIl((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                obj.setBfNrepayIl((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                obj.setBfLisuIl((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                obj.setBfLiibIl((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                obj.setBfNisuIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                obj.setBfNrollIl((lineArray[34].equals("")) ? null : formatter.parse(lineArray[34]));
                obj.setBfPycIl((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                obj.setBfIycIl((lineArray[36].equals("")) ? null : formatter.parse(lineArray[36]));
                obj.setBfRepaySeq(new BigDecimal(lineArray[37]));
                obj.setBfIntSeq(new BigDecimal(lineArray[38]));
                obj.setBfMsbSeq(new BigDecimal(lineArray[39]));
                obj.setBfLstRt(new BigDecimal(lineArray[40]));
                obj.setBfMisuAmt(new BigDecimal(lineArray[41]));
                obj.setShJagumGb(lineArray[42]);
                obj.setRegEmpNo(lineArray[43]);
                obj.setRegDt((lineArray[44].equals("")) ? null : formatter.parse(lineArray[44]));
                obj.setRegTm(lineArray[45]);
                obj.setUpdEmpNo(lineArray[46]);
                obj.setUpdDt((lineArray[47].equals("")) ? null : formatter.parse(lineArray[47]));
                obj.setUpdTm(lineArray[48]);
                if (isExist(obj.getRefNo(), obj.getHisNo())) {
                    adst_lnb_hisInfoRepository.save(obj);
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
    public void insertAll(List<ADST_LNB_HISInfo> objList) {
        adst_lnb_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return adst_lnb_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
