package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_IPB_BOJInfo;
import nhbank.core.repositories.AFEX_IPB_BOJInfoRepository;
import nhbank.core.services.AFEX_IPB_BOJInfoService;
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
public class AFEX_IPB_BOJInfoServiceImpl implements AFEX_IPB_BOJInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_IPB_BOJInfoRepository afex_ipb_bojInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_IPB_BOJInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\AFEX_IPB_BOJ.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\AFEX_IPB_BOJ.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_IPB_BOJInfo obj = new AFEX_IPB_BOJInfo();
                obj.setRefNo(lineArray[0]);
                obj.setSeq(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setLstIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setCcy(lineArray[6]);
                obj.setAmt(new BigDecimal(lineArray[7]));
                obj.setHisNo(new BigDecimal(lineArray[8]));
                obj.setIbjiGb(lineArray[9]);
                obj.setBojGb(lineArray[10]);
                obj.setBeLgcomDsAmt(new BigDecimal(lineArray[11]));
                obj.setLgmSeq(new BigDecimal(lineArray[12]));
                obj.setLgmSseq(new BigDecimal(lineArray[13]));
                obj.setBldSeq(new BigDecimal(lineArray[14]));
                obj.setNcuCcy(lineArray[15]);
                obj.setNcuAmt(new BigDecimal(lineArray[16]));
                obj.setNcuBeLgcomDsAmt(new BigDecimal(lineArray[17]));
                obj.setChdAmt(new BigDecimal(lineArray[18]));
                obj.setJunhwanGb(lineArray[19]);
                obj.setBeJunhwanWamt(new BigDecimal(lineArray[20]));
                obj.setRegEmpNo(lineArray[21]);
                obj.setRegDt((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                obj.setRegTm(lineArray[23]);
                obj.setUpdEmpNo(lineArray[24]);
                obj.setUpdDt((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                obj.setUpdTm(lineArray[26]);
                if (isExist(obj.getRefNo(), obj.getSeq())) {
                    afex_ipb_bojInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPB_BOJInfo> objList) {
        afex_ipb_bojInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq) {
        return afex_ipb_bojInfoRepository.existsByRefNoAndSeq(refNo, seq);
    }
}
