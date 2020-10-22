package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_RTB_HISInfo;
import nhbank.core.repositories.AFEX_RTB_HISInfoRepository;
import nhbank.core.services.AFEX_RTB_HISInfoService;
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
public class AFEX_RTB_HISInfoServiceImpl implements AFEX_RTB_HISInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_RTB_HISInfoRepository afex_rtb_hisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_RTB_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\AFEX_RTB_HIS.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\AFEX_RTB_HIS.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_RTB_HISInfo obj = new AFEX_RTB_HISInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setTrGb(lineArray[3]);
                obj.setTrCd(lineArray[4]);
                obj.setIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setAcIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setGisIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setCanIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setSdHisNo(new BigDecimal(lineArray[9]));
                obj.setBuyCcy(lineArray[10]);
                obj.setBuyFamt(new BigDecimal(lineArray[11]));
                obj.setSelCcy(lineArray[12]);
                obj.setSelFamt(new BigDecimal(lineArray[13]));
                obj.setExHrt(new BigDecimal(lineArray[14]));
                obj.setTrBr(lineArray[15]);
                obj.setTrTime(lineArray[16]);
                obj.setUserId(lineArray[17]);
                obj.setLstIbIl((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                obj.setPreSts(lineArray[19]);
                obj.setRegEmpNo(lineArray[20]);
                obj.setRegDt((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                obj.setRegTm(lineArray[22]);
                obj.setUpdEmpNo(lineArray[23]);
                obj.setUpdDt((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                obj.setUpdTm(lineArray[25]);
                if (isExist(obj.getRefNo(), obj.getHisNo())) {
                    afex_rtb_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RTB_HISInfo> objList) {
        afex_rtb_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_rtb_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
