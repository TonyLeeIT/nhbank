package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ADST_DPB_CERTInfo;
import nhbank.core.repositories.ADST_DPB_CERTInfoRepository;
import nhbank.core.services.ADST_DPB_CERTInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ADST_DPB_CERTInfoServiceImpl implements ADST_DPB_CERTInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ADST_DPB_CERTInfoRepository adst_dpb_certInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_DPB_CERTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ADST_DPB_CERT.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_CERT.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_DPB_CERTInfo obj = new ADST_DPB_CERTInfo();
                obj.setAcctNo(lineArray[0]);
                obj.setIbIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                obj.setTxTrxNo(new BigDecimal(lineArray[2]));
                obj.setSts(lineArray[3]);
                obj.setPrtKind(lineArray[4]);
                obj.setDrOpno(lineArray[5]);
                obj.setDrTime(lineArray[6]);
                obj.setRemark(lineArray[7]);
                obj.setRegEmpNo(lineArray[8]);
                obj.setRegDt((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setRegTm(lineArray[10]);
                obj.setUpdEmpNo(lineArray[11]);
                obj.setUpdDt((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                obj.setUpdTm(lineArray[13]);
                if (isExist(obj.getAcctNo(), obj.getIbIl())) {
                    adst_dpb_certInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_CERTInfo> objList) {
        adst_dpb_certInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, Date ibIl) {
        return adst_dpb_certInfoRepository.existsByAcctNoAndIbIl(acctNo, ibIl);
    }
}
