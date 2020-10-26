package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_RCH_PENDInfo;
import nhbank.core.repositories.AFEX_RCH_PENDInfoRepository;
import nhbank.core.services.AFEX_RCH_PENDInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_RCH_PENDInfoServiceImpl implements AFEX_RCH_PENDInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_RCH_PENDInfoRepository afex_rch_pendInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_RCH_PENDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_RCH_PEND.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RCH_PEND.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_RCH_PENDInfo obj = new AFEX_RCH_PENDInfo();
                obj.setCd(lineArray[0]);
                obj.setCcy(lineArray[1]);
                obj.setSaGb(lineArray[2]);
                obj.setTrIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setTrSeq(new BigDecimal(lineArray[4]));
                obj.setValIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setOurRef(lineArray[6]);
                obj.setDrcrGb(lineArray[7]);
                obj.setDrcrAmt(new BigDecimal(lineArray[8]));
                obj.setTheirRef(lineArray[9]);
                obj.setUpmuCd(lineArray[10]);
                obj.setInidCd(lineArray[11]);
                obj.setOrigAmt(new BigDecimal(lineArray[12]));
                obj.setBunhalSeq(new BigDecimal(lineArray[13]));
                obj.setIbIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setIbTime(lineArray[15]);
                obj.setOperId(lineArray[16]);
                obj.setCancelYn(lineArray[17]);
                obj.setOrigRef(lineArray[18]);
                obj.setConfirmYn(lineArray[19]);
                obj.setNrefCnt(lineArray[20]);
                obj.setDocId(lineArray[21]);
                obj.setOtherRef(lineArray[22]);
                obj.setRefHisNo(new BigDecimal(lineArray[23]));
                obj.setRegEmpNo(lineArray[24]);
                obj.setRegDt((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                obj.setRegTm(lineArray[26]);
                obj.setUpdEmpNo(lineArray[27]);
                obj.setUpdDt((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                obj.setUpdTm(lineArray[29]);
                if (isExist(obj.getCd(), obj.getCcy(), obj.getSaGb(), obj.getTrIl(), obj.getTrSeq(), obj.getValIl())) {
                    afex_rch_pendInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RCH_PENDInfo> objList) {
        afex_rch_pendInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cd, String ccy, String saGb, Date trIl, BigDecimal trSeq, Date valIl) {
        return afex_rch_pendInfoRepository.existsByCdAndCcyAndSaGbAndTrIlAndTrSeqAndValIl(cd, ccy, saGb, trIl, trSeq, valIl);
    }
}
