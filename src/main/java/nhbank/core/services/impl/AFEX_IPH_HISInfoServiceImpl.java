package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_IPH_HISInfo;
import nhbank.core.repositories.AFEX_IPH_HISInfoRepository;
import nhbank.core.services.AFEX_IPH_HISInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_IPH_HISInfoServiceImpl implements AFEX_IPH_HISInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_IPH_HISInfoRepository afex_iph_hisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_IPH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_IPH_HIS.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPH_HIS.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_IPH_HISInfo obj = new AFEX_IPH_HISInfo();
                obj.setRefNo(lineArray[0]);
                obj.setSeqNo(new BigDecimal(lineArray[1]));
                obj.setHisNo(new BigDecimal(lineArray[2]));
                obj.setSts(lineArray[3]);
                obj.setTrGb(lineArray[4]);
                obj.setGwamCd(lineArray[5]);
                obj.setTrCd(lineArray[6]);
                obj.setDocId1(lineArray[7]);
                obj.setDocId2(lineArray[8]);
                obj.setDocId3(lineArray[9]);
                obj.setDocId4(lineArray[10]);
                obj.setAmdSeq(new BigDecimal(lineArray[11]));
                obj.setIbIl((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                obj.setCanIl((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setSdHisNo(new BigDecimal(lineArray[14]));
                obj.setTrBr(lineArray[15]);
                obj.setIbTime(lineArray[16]);
                obj.setOpNo(lineArray[17]);
                obj.setMngNo(lineArray[18]);
                obj.setRegEmpNo(lineArray[19]);
                obj.setRegDt((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                obj.setRegTm(lineArray[21]);
                obj.setUpdEmpNo(lineArray[22]);
                obj.setUpdDt((lineArray[23].equals("")) ? null : formatter.parse(lineArray[23]));
                obj.setUpdTm(lineArray[24]);
                if (isExist(obj.getRefNo(), obj.getSeqNo())) {
                    afex_iph_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPH_HISInfo> objList) {
        afex_iph_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seqNo) {
        return afex_iph_hisInfoRepository.existsByRefNoAndSeqNo(refNo, seqNo);
    }
}
