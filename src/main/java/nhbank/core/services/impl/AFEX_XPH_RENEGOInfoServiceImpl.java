package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_XPH_RENEGOInfo;
import nhbank.core.repositories.AFEX_XPH_RENEGOInfoRepository;
import nhbank.core.services.AFEX_XPH_RENEGOInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_XPH_RENEGOInfoServiceImpl implements AFEX_XPH_RENEGOInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_XPH_RENEGOInfoRepository afex_xph_renegoInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_XPH_RENEGOInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_XPH_RENEGO.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPH_RENEGO.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_XPH_RENEGOInfo obj = new AFEX_XPH_RENEGOInfo();
                obj.setRefNo(lineArray[0]);
                obj.setSts(lineArray[1]);
                obj.setTrIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                obj.setReneGb(lineArray[3]);
                obj.setNegoCcy(lineArray[4]);
                obj.setNegoAmt(new BigDecimal(lineArray[5]));
                obj.setNegoIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setReimBkcd(lineArray[7]);
                obj.setReimBknm(lineArray[8]);
                obj.setCollBkcd(lineArray[9]);
                obj.setCollBknm(lineArray[10]);
                obj.setExprIl((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                obj.setExprCcy(lineArray[12]);
                obj.setExprAmt(new BigDecimal(lineArray[13]));
                obj.setHijaAmt(new BigDecimal(lineArray[14]));
                obj.setDcAmt(new BigDecimal(lineArray[15]));
                obj.setCable(new BigDecimal(lineArray[16]));
                obj.setCollAmt(new BigDecimal(lineArray[17]));
                obj.setCcGb(lineArray[18]);
                obj.setCcIl((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                obj.setCcRtCd(lineArray[20]);
                obj.setM202Nm(lineArray[21]);
                obj.setM999Nm(lineArray[22]);
                obj.setNcuNegoCcy(lineArray[23]);
                obj.setNcuNegoAmt(new BigDecimal(lineArray[24]));
                obj.setYukNo(lineArray[25]);
                obj.setRegEmpNo(lineArray[26]);
                obj.setRegDt((lineArray[27].equals("")) ? null : formatter.parse(lineArray[27]));
                obj.setRegTm(lineArray[28]);
                obj.setUpdEmpNo(lineArray[29]);
                obj.setUpdDt((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                obj.setUpdTm(lineArray[31]);
                if (isExist(obj.getRefNo())) {
                    afex_xph_renegoInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_RENEGOInfo> objList) {
        afex_xph_renegoInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afex_xph_renegoInfoRepository.existsByRefNo(refNo);
    }
}
