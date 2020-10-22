package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_EPB_RPTInfo;
import nhbank.core.repositories.ACOM_EPB_RPTInfoRepository;
import nhbank.core.services.ACOM_EPB_RPTInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ACOM_EPB_RPTInfoServiceImpl implements ACOM_EPB_RPTInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_EPB_RPTInfoRepository acom_epb_rptInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_EPB_RPTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\ACOM_EPB_RPT.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\ACOM_EPB_RPT.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_EPB_RPTInfo obj = new ACOM_EPB_RPTInfo();
                obj.setRefNo(lineArray[0]);
                obj.setAcrNo(lineArray[1]);
                obj.setHisNo(new BigDecimal(lineArray[2]));
                obj.setMngBr(lineArray[3]);
                obj.setTrCcy(lineArray[4]);
                obj.setBgDrAmt(new BigDecimal(lineArray[5]));
                obj.setBgCrAmt(new BigDecimal(lineArray[6]));
                obj.setPlDrAmt(new BigDecimal(lineArray[7]));
                obj.setPlCrAmt(new BigDecimal(lineArray[8]));
                obj.setBusiCd(lineArray[9]);
                obj.setBusiGrpCd(lineArray[10]);
                obj.setPlCd(lineArray[11]);
                obj.setMngYr(lineArray[12]);
                obj.setAcrFmDt((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setAcrToDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setAcrAmt(new BigDecimal(lineArray[15]));
                obj.setTrBamt(new BigDecimal(lineArray[16]));
                obj.setBizSeq(new BigDecimal(lineArray[17]));
                obj.setBizSubSeq(new BigDecimal(lineArray[18]));
                obj.setTrDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                obj.setTrGb(lineArray[20]);
                obj.setTrCd(lineArray[21]);
                obj.setAcrSts(lineArray[22]);
                obj.setDnGb(lineArray[23]);
                obj.setRemark(lineArray[24]);
                obj.setRegEmpNo(lineArray[25]);
                obj.setRegDt((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                obj.setRegTm(lineArray[27]);
                obj.setUpdEmpNo(lineArray[28]);
                obj.setUpdDt((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                obj.setUpdTm(lineArray[30]);
                if (isExist()) {
                    acom_epb_rptInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_EPB_RPTInfo> objList) {
        acom_epb_rptInfoRepository.saveAll(objList);
    }

    //@Override
    public boolean isExist() {
//        return acom_epb_rptInfoRepository.existsBy();
        return false;
    }
}
