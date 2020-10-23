package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_XPB_RENEDTInfo;
import nhbank.core.repositories.AFEX_XPB_RENEDTInfoRepository;
import nhbank.core.services.AFEX_XPB_RENEDTInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_XPB_RENEDTInfoServiceImpl implements AFEX_XPB_RENEDTInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_XPB_RENEDTInfoRepository afex_xpb_renedtInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_XPB_RENEDTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_XPB_RENEDT.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPB_RENEDT.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_XPB_RENEDTInfo obj = new AFEX_XPB_RENEDTInfo();
                obj.setMngIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                obj.setRefNo(lineArray[1]);
                obj.setSts(lineArray[2]);
                obj.setCcy(lineArray[3]);
                obj.setAmt(new BigDecimal(lineArray[4]));
                obj.setBamt(new BigDecimal(lineArray[5]));
                obj.setPreCaIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setReneIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setReneJum(lineArray[8]);
                obj.setNcuCcy(lineArray[9]);
                obj.setNcuAmt(new BigDecimal(lineArray[10]));
                obj.setCaIl((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                obj.setCaAmt(new BigDecimal(lineArray[12]));
                obj.setRegEmpNo(lineArray[13]);
                obj.setRegDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setRegTm(lineArray[15]);
                obj.setUpdEmpNo(lineArray[16]);
                obj.setUpdDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                obj.setUpdTm(lineArray[18]);
                if (isExist(obj.getMngIl(), obj.getRefNo())) {
                    afex_xpb_renedtInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPB_RENEDTInfo> objList) {
        afex_xpb_renedtInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date mngIl, String refNo) {
        return afex_xpb_renedtInfoRepository.existsByMngIlAndRefNo(mngIl, refNo);
    }
}
