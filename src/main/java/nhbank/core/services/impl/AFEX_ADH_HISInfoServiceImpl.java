package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_ADH_HISInfo;
import nhbank.core.repositories.AFEX_ADH_HISInfoRepository;
import nhbank.core.services.AFEX_ADH_HISInfoService;
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
public class AFEX_ADH_HISInfoServiceImpl implements AFEX_ADH_HISInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_ADH_HISInfoRepository afex_adh_hisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_ADH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\AFEX_ADH_HIS.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\AFEX_ADH_HIS.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_ADH_HISInfo obj = new AFEX_ADH_HISInfo();
                obj.setAdvNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setBaseSeq(new BigDecimal(lineArray[2]));
                obj.setAmendSeq(new BigDecimal(lineArray[3]));
                obj.setEdiSeq(new BigDecimal(lineArray[4]));
                obj.setSts(lineArray[5]);
                obj.setTrGb(lineArray[6]);
                obj.setTrCd(lineArray[7]);
                obj.setTrBr(lineArray[8]);
                obj.setBrNo(lineArray[9]);
                obj.setAmdCnt(new BigDecimal(lineArray[10]));
                obj.setCixNo(lineArray[11]);
                obj.setBuseoNo(lineArray[12]);
                obj.setIbgmMd(lineArray[13]);
                obj.setIbIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setAcIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                obj.setGisIl((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                obj.setCanIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                obj.setEdiFnm(lineArray[18]);
                obj.setEdiIl((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                obj.setOpenCcy(lineArray[20]);
                obj.setOpenAmt(new BigDecimal(lineArray[21]));
                obj.setBrCharge(new BigDecimal(lineArray[22]));
                obj.setChargeAmt(new BigDecimal(lineArray[23]));
                obj.setChargeGb(lineArray[24]);
                obj.setMngNo(lineArray[25]);
                obj.setOpNo(lineArray[26]);
                obj.setIbTime(lineArray[27]);
                obj.setReIssue(lineArray[28]);
                obj.setYdSeq(new BigDecimal(lineArray[29]));
                obj.setYdGuja(lineArray[30]);
                obj.setSdRefNo(lineArray[31]);
                obj.setSdHisNo(new BigDecimal(lineArray[32]));
                obj.setAdvMakeIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                obj.setRegEmpNo(lineArray[34]);
                obj.setRegDt((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                obj.setRegTm(lineArray[36]);
                obj.setUpdEmpNo(lineArray[37]);
                obj.setUpdDt((lineArray[38].equals("")) ? null : formatter.parse(lineArray[38]));
                obj.setUpdTm(lineArray[39]);
                if (isExist(obj.getAdvNo(), obj.getHisNo())) {
                    afex_adh_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_ADH_HISInfo> objList) {
        afex_adh_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String advNo, BigDecimal hisNo) {
        return afex_adh_hisInfoRepository.existsByAdvNoAndHisNo(advNo, hisNo);
    }
}
