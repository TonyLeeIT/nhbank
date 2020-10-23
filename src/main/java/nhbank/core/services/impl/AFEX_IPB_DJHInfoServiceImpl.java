package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_IPB_DJHInfo;
import nhbank.core.repositories.AFEX_IPB_DJHInfoRepository;
import nhbank.core.services.AFEX_IPB_DJHInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_IPB_DJHInfoServiceImpl implements AFEX_IPB_DJHInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_IPB_DJHInfoRepository afex_ipb_djhInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_IPB_DJHInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_IPB_DJH.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPB_DJH.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_IPB_DJHInfo obj = new AFEX_IPB_DJHInfo();
                obj.setRefNo(lineArray[0]);
                obj.setSeq(new BigDecimal(lineArray[1]));
                obj.setSseq(new BigDecimal(lineArray[2]));
                obj.setSts(lineArray[3]);
                obj.setAcIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setGisIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setLstIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setCcy(lineArray[7]);
                obj.setBamt(new BigDecimal(lineArray[8]));
                obj.setIjaBamt(new BigDecimal(lineArray[9]));
                obj.setHisNo(new BigDecimal(lineArray[10]));
                obj.setHoiGb(lineArray[11]);
                obj.setDsAmt(new BigDecimal(lineArray[12]));
                obj.setIjaFrt(new BigDecimal(lineArray[13]));
                obj.setIjaDsTerm(new BigDecimal(lineArray[14]));
                obj.setIjaFrIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                obj.setIjaToIl((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                obj.setBeLstHoiIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                obj.setRegEmpNo(lineArray[18]);
                obj.setRegDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                obj.setRegTm(lineArray[20]);
                obj.setUpdEmpNo(lineArray[21]);
                obj.setUpdDt((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                obj.setUpdTm(lineArray[23]);
                if (isExist(obj.getRefNo(), obj.getSeq(), obj.getSseq())) {
                    afex_ipb_djhInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPB_DJHInfo> objList) {
        afex_ipb_djhInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq, BigDecimal sseq) {
        return afex_ipb_djhInfoRepository.existsByRefNoAndSeqAndSseq(refNo, seq, sseq);
    }
}
