package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ADST_DPB_INRTInfo;
import nhbank.core.repositories.ADST_DPB_INRTInfoRepository;
import nhbank.core.services.ADST_DPB_INRTInfoService;
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
public class ADST_DPB_INRTInfoServiceImpl implements ADST_DPB_INRTInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ADST_DPB_INRTInfoRepository adst_dpb_inrtInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_DPB_INRTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ADST_DPB_INRT.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_INRT.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_DPB_INRTInfo obj = new ADST_DPB_INRTInfo();
                obj.setAcctNo(lineArray[0]);
                obj.setSts(lineArray[1]);
                obj.setHisNo(new BigDecimal(lineArray[2]));
                obj.setFromIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setToIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setFamt(new BigDecimal(lineArray[5]));
                obj.setIntRt(new BigDecimal(lineArray[6]));
                obj.setRegEmpNo(lineArray[7]);
                obj.setRegDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setRegTm(lineArray[9]);
                obj.setUpdEmpNo(lineArray[10]);
                obj.setUpdDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                obj.setUpdTm(lineArray[12]);
                if (isExist()) {
                    adst_dpb_inrtInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_INRTInfo> objList) {
        adst_dpb_inrtInfoRepository.saveAll(objList);
    }

    //    @Override
    public boolean isExist() {
//        return adst_dpb_inrtInfoRepository.existsBy();
        return false;
    }
}
