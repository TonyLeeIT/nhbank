package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFIF_FEH_HISInfo;
import nhbank.core.repositories.AFIF_FEH_HISInfoRepository;
import nhbank.core.services.AFIF_FEH_HISInfoService;
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
public class AFIF_FEH_HISInfoServiceImpl implements AFIF_FEH_HISInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFIF_FEH_HISInfoRepository afif_feh_hisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFIF_FEH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\AFIF_FEH_HIS.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\AFIF_FEH_HIS.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFIF_FEH_HISInfo obj = new AFIF_FEH_HISInfo();
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
                obj.setNearBuyCcy(lineArray[10]);
                obj.setNearBuyFamt(new BigDecimal(lineArray[11]));
                obj.setNearBuyBamt(new BigDecimal(lineArray[12]));
                obj.setNearBuyJan(new BigDecimal(lineArray[13]));
                obj.setNearBuyBjan(new BigDecimal(lineArray[14]));
                obj.setNearSellCcy(lineArray[15]);
                obj.setNearSellFamt(new BigDecimal(lineArray[16]));
                obj.setNearSellBamt(new BigDecimal(lineArray[17]));
                obj.setNearSellJan(new BigDecimal(lineArray[18]));
                obj.setNearSellBjan(new BigDecimal(lineArray[19]));
                obj.setNearSndDocNo(lineArray[20]);
                obj.setFarBuyCcy(lineArray[21]);
                obj.setFarBuyFamt(new BigDecimal(lineArray[22]));
                obj.setFarBuyBamt(new BigDecimal(lineArray[23]));
                obj.setFarBuyJan(new BigDecimal(lineArray[24]));
                obj.setFarBuyBjan(new BigDecimal(lineArray[25]));
                obj.setFarSellCcy(lineArray[26]);
                obj.setFarSellFamt(new BigDecimal(lineArray[27]));
                obj.setFarSellBamt(new BigDecimal(lineArray[28]));
                obj.setFarSellJan(new BigDecimal(lineArray[29]));
                obj.setFarSellBjan(new BigDecimal(lineArray[30]));
                obj.setFarSndDocNo(lineArray[31]);
                obj.setTrBr(lineArray[32]);
                obj.setSdBr(lineArray[33]);
                obj.setTrTime(lineArray[34]);
                obj.setUserId(lineArray[35]);
                obj.setManagerId(lineArray[36]);
                obj.setIbjiMd(lineArray[37]);
                obj.setCdSngNo(lineArray[38]);
                obj.setCdSilSeq(new BigDecimal(lineArray[39]));
                obj.setFtpSngNo(lineArray[40]);
                obj.setFtpSilSeq(new BigDecimal(lineArray[41]));
                obj.setJunNo(lineArray[42]);
                obj.setYukNo(lineArray[43]);
                obj.setLstIbIl((lineArray[44].equals("")) ? null : formatter.parse(lineArray[44]));
                obj.setFrontSndGb(lineArray[45]);
                obj.setPreSts(lineArray[46]);
                obj.setBeHdSngno(lineArray[47]);
                obj.setRegEmpNo(lineArray[48]);
                obj.setRegDt((lineArray[49].equals("")) ? null : formatter.parse(lineArray[49]));
                obj.setRegTm(lineArray[50]);
                obj.setUpdEmpNo(lineArray[51]);
                obj.setUpdDt((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
                obj.setUpdTm(lineArray[53]);
                if (isExist(obj.getRefNo(), obj.getHisNo())) {
                    afif_feh_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFIF_FEH_HISInfo> objList) {
        afif_feh_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afif_feh_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
