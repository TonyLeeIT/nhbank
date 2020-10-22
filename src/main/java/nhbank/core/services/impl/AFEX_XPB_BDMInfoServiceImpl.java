package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_XPB_BDMInfo;
import nhbank.core.repositories.AFEX_XPB_BDMInfoRepository;
import nhbank.core.services.AFEX_XPB_BDMInfoService;
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
public class AFEX_XPB_BDMInfoServiceImpl implements AFEX_XPB_BDMInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_XPB_BDMInfoRepository afex_xpb_bdmInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_XPB_BDMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\AFEX_XPB_BDM.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\AFEX_XPB_BDM.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_XPB_BDMInfo obj = new AFEX_XPB_BDMInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setLstIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setCcy(lineArray[6]);
                obj.setAmt(new BigDecimal(lineArray[7]));
                obj.setBudoCd(lineArray[8]);
                obj.setShSeq(new BigDecimal(lineArray[9]));
                obj.setShSumAmt(new BigDecimal(lineArray[10]));
                obj.setBmGb(lineArray[11]);
                obj.setMiSeq(new BigDecimal(lineArray[12]));
                obj.setMiTrBamt(new BigDecimal(lineArray[13]));
                obj.setMiShBamt(new BigDecimal(lineArray[14]));
                obj.setNcuCcy(lineArray[15]);
                obj.setNcuAmt(new BigDecimal(lineArray[16]));
                obj.setNcuShSumAmt(new BigDecimal(lineArray[17]));
                obj.setRegEmpNo(lineArray[18]);
                obj.setRegDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                obj.setRegTm(lineArray[20]);
                obj.setUpdEmpNo(lineArray[21]);
                obj.setUpdDt((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                obj.setUpdTm(lineArray[23]);
                if (isExist(obj.getRefNo(), obj.getHisNo())) {
                    afex_xpb_bdmInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPB_BDMInfo> objList) {
        afex_xpb_bdmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_xpb_bdmInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
