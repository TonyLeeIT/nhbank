package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_XPB_LGMInfo;
import nhbank.core.repositories.AFEX_XPB_LGMInfoRepository;
import nhbank.core.services.AFEX_XPB_LGMInfoService;
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
public class AFEX_XPB_LGMInfoServiceImpl implements AFEX_XPB_LGMInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_XPB_LGMInfoRepository afex_xpb_lgmInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_XPB_LGMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_XPB_LGM.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPB_LGM.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_XPB_LGMInfo obj = new AFEX_XPB_LGMInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setTrBr(lineArray[3]);
                obj.setAcIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setGisIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setLstIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setHajaCd(lineArray[7]);
                obj.setHajaMngInfo(lineArray[8]);
                obj.setMjGb(lineArray[9]);
                obj.setTrTime(lineArray[10]);
                obj.setOpNo(new BigDecimal(lineArray[11]));
                obj.setHajaSayu(lineArray[12]);
                obj.setRegEmpNo(lineArray[13]);
                obj.setRegDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setRegTm(lineArray[15]);
                obj.setUpdEmpNo(lineArray[16]);
                obj.setUpdDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                obj.setUpdTm(lineArray[18]);
                if (isExist(obj.getRefNo(), obj.getHisNo())) {
                    afex_xpb_lgmInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPB_LGMInfo> objList) {
        afex_xpb_lgmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_xpb_lgmInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
