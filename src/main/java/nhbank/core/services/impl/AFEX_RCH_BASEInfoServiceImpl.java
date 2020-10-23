package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_RCH_BASEInfo;
import nhbank.core.repositories.AFEX_RCH_BASEInfoRepository;
import nhbank.core.services.AFEX_RCH_BASEInfoService;
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
public class AFEX_RCH_BASEInfoServiceImpl implements AFEX_RCH_BASEInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_RCH_BASEInfoRepository afex_rch_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_RCH_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_RCH_BASE.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RCH_BASE.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_RCH_BASEInfo obj = new AFEX_RCH_BASEInfo();
                obj.setCd(lineArray[0]);
                obj.setBkcd(lineArray[1]);
                obj.setCcy(lineArray[2]);
                obj.setAttenNo(lineArray[3]);
                obj.setBknm(lineArray[4]);
                obj.setDepoType(lineArray[5]);
                obj.setDepoIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setDepo56a(lineArray[7]);
                obj.setDepo57a(lineArray[8]);
                obj.setCtryCd(lineArray[9]);
                obj.setDepoEtc1(lineArray[10]);
                obj.setDepoEtc2(lineArray[11]);
                obj.setDepoEtc3(lineArray[12]);
                obj.setReconYn(lineArray[13]);
                obj.setMakeIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setChngIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                obj.setOpNo(lineArray[16]);
                obj.setMngrNo(lineArray[17]);
                obj.setSts(lineArray[18]);
                obj.setAfCd(lineArray[19]);
                obj.setMngBr(lineArray[20]);
                obj.setCbsCd(lineArray[21]);
                obj.setDbsCd(lineArray[22]);
                obj.setVostroYn(lineArray[23]);
                obj.setMk950Seq(new BigDecimal(lineArray[24]));
                obj.setRegEmpNo(lineArray[25]);
                obj.setRegDt((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                obj.setRegTm(lineArray[27]);
                obj.setUpdEmpNo(lineArray[28]);
                obj.setUpdDt((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                obj.setUpdTm(lineArray[30]);
                if (isExist(obj.getCd(), obj.getBkcd())) {
                    afex_rch_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RCH_BASEInfo> objList) {
        afex_rch_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cd, String bkcd) {
        return afex_rch_baseInfoRepository.existsByCdAndBkcd(cd, bkcd);
    }
}
