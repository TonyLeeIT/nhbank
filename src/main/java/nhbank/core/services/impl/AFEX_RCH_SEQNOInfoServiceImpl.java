package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_RCH_SEQNOInfo;
import nhbank.core.repositories.AFEX_RCH_SEQNOInfoRepository;
import nhbank.core.services.AFEX_RCH_SEQNOInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_RCH_SEQNOInfoServiceImpl implements AFEX_RCH_SEQNOInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_RCH_SEQNOInfoRepository afex_rch_seqnoInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_RCH_SEQNOInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_RCH_SEQNO.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RCH_SEQNO.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_RCH_SEQNOInfo obj = new AFEX_RCH_SEQNOInfo();
                obj.setTrIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                obj.setSaGb(lineArray[1]);
                obj.setCd(lineArray[2]);
                obj.setCcy(lineArray[3]);
                obj.setSeqno(new BigDecimal(lineArray[4]));
                obj.setRegEmpNo(lineArray[5]);
                obj.setRegDt((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setRegTm(lineArray[7]);
                obj.setUpdEmpNo(lineArray[8]);
                obj.setUpdDt((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setUpdTm(lineArray[10]);
                if (isExist(obj.getTrIl(), obj.getSaGb(), obj.getCd(), obj.getCcy())) {
                    afex_rch_seqnoInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RCH_SEQNOInfo> objList) {
        afex_rch_seqnoInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date trIl, String saGb, String cd, String ccy) {
        return afex_rch_seqnoInfoRepository.existsByTrIlAndSaGbAndCdAndCcy(trIl, saGb, cd, ccy);
    }
}
