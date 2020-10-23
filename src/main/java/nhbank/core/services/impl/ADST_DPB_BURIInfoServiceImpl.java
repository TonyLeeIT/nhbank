package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ADST_DPB_BURIInfo;
import nhbank.core.repositories.ADST_DPB_BURIInfoRepository;
import nhbank.core.services.ADST_DPB_BURIInfoService;
import nhbank.core.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ADST_DPB_BURIInfoServiceImpl implements ADST_DPB_BURIInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ADST_DPB_BURIInfoRepository adst_dpb_buriInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_DPB_BURIInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ADST_DPB_BURI.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_BURI.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_DPB_BURIInfo obj = new ADST_DPB_BURIInfo();
                obj.setAcctNo(lineArray[0]);
                obj.setBuriIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                obj.setBuriJan(new BigDecimal(lineArray[2]));
                obj.setFstJan(new BigDecimal(lineArray[3]));
                obj.setMaxJan(new BigDecimal(lineArray[4]));
                obj.setTermIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setLonSngAmt(new BigDecimal(lineArray[6]));
                obj.setLonOvrAmt(new BigDecimal(lineArray[7]));
                obj.setLonRtCd(lineArray[8]);
                obj.setLonRt(new BigDecimal(lineArray[9]));
                obj.setPrcpOverDueIntRt(new BigDecimal(lineArray[10]));
                obj.setIntOverDueIntRt(new BigDecimal(lineArray[11]));
                obj.setColLonInt(new BigDecimal(lineArray[12]));
                obj.setLonPrcpYcInt(new BigDecimal(lineArray[13]));
                obj.setLonIntYcInt(new BigDecimal(lineArray[14]));
                obj.setLonYdCd(lineArray[15]);
                obj.setRegEmpNo(lineArray[16]);
                obj.setRegDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                obj.setRegTm(lineArray[18]);
                obj.setUpdEmpNo(lineArray[19]);
                obj.setUpdDt((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                obj.setUpdTm(lineArray[21]);
                if (isExist(obj.getAcctNo(), obj.getBuriIl())) {
                    adst_dpb_buriInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_BURIInfo> objList) {
        adst_dpb_buriInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, Date buriIl) {
        return adst_dpb_buriInfoRepository.existsByAcctNoAndBuriIl(acctNo, buriIl);
    }
}
