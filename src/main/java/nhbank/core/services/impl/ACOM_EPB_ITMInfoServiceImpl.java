package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_EPB_ITMInfo;
import nhbank.core.repositories.ACOM_EPB_ITMInfoRepository;
import nhbank.core.services.ACOM_EPB_ITMInfoService;
import nhbank.core.util.DateUtils;
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
public class ACOM_EPB_ITMInfoServiceImpl implements ACOM_EPB_ITMInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_EPB_ITMInfoRepository acom_epb_itmInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_EPB_ITMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ACOM_EPB_ITM.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ACOM_EPB_ITM.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_EPB_ITMInfo obj = new ACOM_EPB_ITMInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setAcIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                obj.setGisIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setLstIbIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setDrGb(lineArray[5]);
                obj.setItmCd(lineArray[6]);
                obj.setBeItm(lineArray[7]);
                obj.setAfItm(lineArray[8]);
                obj.setBeItm1(new BigDecimal(lineArray[9]));
                obj.setAfItm1(new BigDecimal(lineArray[10]));
                obj.setRegEmpNo(lineArray[11]);
                obj.setRegDt((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                obj.setRegTm(lineArray[13]);
                obj.setUpdEmpNo(lineArray[14]);
                obj.setUpdDt((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                obj.setUpdTm(lineArray[16]);
                if (isExist(obj.getRefNo(), obj.getHisNo())) {
                    acom_epb_itmInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_EPB_ITMInfo> objList) {
        acom_epb_itmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return acom_epb_itmInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
