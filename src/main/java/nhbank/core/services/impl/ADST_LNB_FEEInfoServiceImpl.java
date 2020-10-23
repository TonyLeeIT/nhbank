package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ADST_LNB_FEEInfo;
import nhbank.core.repositories.ADST_LNB_FEEInfoRepository;
import nhbank.core.services.ADST_LNB_FEEInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ADST_LNB_FEEInfoServiceImpl implements ADST_LNB_FEEInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ADST_LNB_FEEInfoRepository adst_lnb_feeInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_LNB_FEEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ADST_LNB_FEE.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ADST_LNB_FEE.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_LNB_FEEInfo obj = new ADST_LNB_FEEInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setSeqNo(new BigDecimal(lineArray[2]));
                obj.setSts(lineArray[3]);
                obj.setFeeGb(lineArray[4]);
                obj.setCcy(lineArray[5]);
                obj.setFeeAmt(new BigDecimal(lineArray[6]));
                obj.setRateAmtGb(lineArray[7]);
                obj.setFeeDsAmt(new BigDecimal(lineArray[8]));
                obj.setFeeDsBamt(new BigDecimal(lineArray[9]));
                obj.setFeeORt(new BigDecimal(lineArray[10]));
                obj.setFeeSRt(new BigDecimal(lineArray[11]));
                obj.setFeeFrIl((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                obj.setFeeToIl((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setFeeDays(new BigDecimal(lineArray[14]));
                obj.setAdjSeq(new BigDecimal(lineArray[15]));
                obj.setSchSeq(new BigDecimal(lineArray[16]));
                obj.setSchSubNo(new BigDecimal(lineArray[17]));
                obj.setBizNo(new BigDecimal(lineArray[18]));
                obj.setFeeRcvIl((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                obj.setFstIbIl((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                obj.setLstAcIl((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                obj.setLstIbIl((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                obj.setRegEmpNo(lineArray[23]);
                obj.setRegDt((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                obj.setRegTm(lineArray[25]);
                obj.setUpdEmpNo(lineArray[26]);
                obj.setUpdDt((lineArray[27].equals("")) ? null : formatter.parse(lineArray[27]));
                obj.setUpdTm(lineArray[28]);
                if (isExist(obj.getRefNo(), obj.getHisNo(), obj.getSeqNo())) {
                    adst_lnb_feeInfoRepository.save(obj);
                } else {
                    objList.add(obj);
                }
            }
            br.close();
            if (!objList.isEmpty())
                insertAll(objList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertAll(List<ADST_LNB_FEEInfo> objList) {
        adst_lnb_feeInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo, BigDecimal seqNo) {
        return adst_lnb_feeInfoRepository.existsByRefNoAndHisNoAndSeqNo(refNo, hisNo, seqNo);
    }
}
