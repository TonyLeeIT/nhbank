package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_BFH_HISInfo;
import nhbank.core.repositories.AFEX_BFH_HISInfoRepository;
import nhbank.core.services.AFEX_BFH_HISInfoService;
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
public class AFEX_BFH_HISInfoServiceImpl implements AFEX_BFH_HISInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_BFH_HISInfoRepository afex_bfh_hisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_BFH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_BFH_HIS.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_BFH_HIS.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_BFH_HISInfo obj = new AFEX_BFH_HISInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setTrGb(lineArray[3]);
                obj.setTrCd(lineArray[4]);
                obj.setIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setAcIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setCanIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setBeforeAmt(new BigDecimal(lineArray[8]));
                obj.setAfterAmt(new BigDecimal(lineArray[9]));
                obj.setOpNo(lineArray[10]);
                obj.setCixNo(lineArray[11]);
                obj.setSdHisNo(new BigDecimal(lineArray[12]));
                obj.setGisIl((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setMngBr(lineArray[14]);
                obj.setBfRecvRefNo(lineArray[15]);
                obj.setBfChAmt(new BigDecimal(lineArray[16]));
                obj.setBfRecvBkcd(lineArray[17]);
                obj.setBfRecvDepo(lineArray[18]);
                obj.setBfBaseSts(lineArray[19]);
                obj.setRegEmpNo(lineArray[20]);
                obj.setRegDt((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                obj.setRegTm(lineArray[22]);
                obj.setUpdEmpNo(lineArray[23]);
                obj.setUpdDt((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                obj.setUpdTm(lineArray[25]);
                if (isExist(obj.getRefNo(), obj.getHisNo())) {
                    afex_bfh_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_BFH_HISInfo> objList) {
        afex_bfh_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_bfh_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
