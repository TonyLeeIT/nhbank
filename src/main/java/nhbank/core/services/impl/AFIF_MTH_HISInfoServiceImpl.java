package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFIF_MTH_HISInfo;
import nhbank.core.repositories.AFIF_MTH_HISInfoRepository;
import nhbank.core.services.AFIF_MTH_HISInfoService;
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
public class AFIF_MTH_HISInfoServiceImpl implements AFIF_MTH_HISInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFIF_MTH_HISInfoRepository afif_mth_hisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFIF_MTH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\AFIF_MTH_HIS.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\AFIF_MTH_HIS.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFIF_MTH_HISInfo obj = new AFIF_MTH_HISInfo();
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
                obj.setTrCcy(lineArray[10]);
                obj.setTrFamt(new BigDecimal(lineArray[11]));
                obj.setTrBamt(new BigDecimal(lineArray[12]));
                obj.setAfJan(new BigDecimal(lineArray[13]));
                obj.setSndDocNo(lineArray[14]);
                obj.setTrBr(lineArray[15]);
                obj.setSdBr(lineArray[16]);
                obj.setTrTime(lineArray[17]);
                obj.setUserId(lineArray[18]);
                obj.setManagerId(lineArray[19]);
                obj.setIbjiMd(lineArray[20]);
                obj.setCdSngNo(lineArray[21]);
                obj.setCdSilSeq(new BigDecimal(lineArray[22]));
                obj.setFtpSngNo(lineArray[23]);
                obj.setFtpSilSeq(new BigDecimal(lineArray[24]));
                obj.setLstIbIl((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                obj.setFrontSndGb(lineArray[26]);
                obj.setRegEmpNo(lineArray[27]);
                obj.setRegDt((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                obj.setRegTm(lineArray[29]);
                obj.setUpdEmpNo(lineArray[30]);
                obj.setUpdDt((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                obj.setUpdTm(lineArray[32]);
                if (isExist(obj.getRefNo(), obj.getHisNo())) {
                    afif_mth_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFIF_MTH_HISInfo> objList) {
        afif_mth_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afif_mth_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
