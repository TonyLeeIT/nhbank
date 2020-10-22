package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ADST_DPB_YEDEInfo;
import nhbank.core.repositories.ADST_DPB_YEDEInfoRepository;
import nhbank.core.services.ADST_DPB_YEDEInfoService;
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
public class ADST_DPB_YEDEInfoServiceImpl implements ADST_DPB_YEDEInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ADST_DPB_YEDEInfoRepository adst_dpb_yedeInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_DPB_YEDEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\ADST_DPB_YEDE.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\ADST_DPB_YEDE.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_DPB_YEDEInfo obj = new ADST_DPB_YEDEInfo();
                obj.setAcctNo(lineArray[0]);
                obj.setModeGb(lineArray[1]);
                obj.setGejungIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                obj.setBsDptJan(new BigDecimal(lineArray[3]));
                obj.setBsLonJan(new BigDecimal(lineArray[4]));
                obj.setBsJan(new BigDecimal(lineArray[5]));
                obj.setDptCIamt(new BigDecimal(lineArray[6]));
                obj.setDptDIamt(new BigDecimal(lineArray[7]));
                obj.setDptNIamt(new BigDecimal(lineArray[8]));
                obj.setDptCJamt(new BigDecimal(lineArray[9]));
                obj.setDptDJamt(new BigDecimal(lineArray[10]));
                obj.setDptNJamt(new BigDecimal(lineArray[11]));
                obj.setLonCIamt(new BigDecimal(lineArray[12]));
                obj.setLonDIamt(new BigDecimal(lineArray[13]));
                obj.setLonNIamt(new BigDecimal(lineArray[14]));
                obj.setLonCJamt(new BigDecimal(lineArray[15]));
                obj.setLonDJamt(new BigDecimal(lineArray[16]));
                obj.setLonNJamt(new BigDecimal(lineArray[17]));
                obj.setJbrCk1Amt(new BigDecimal(lineArray[18]));
                obj.setJbrCk2Amt(new BigDecimal(lineArray[19]));
                obj.setJbrCk4Amt(new BigDecimal(lineArray[20]));
                obj.setTbrCk1Amt(new BigDecimal(lineArray[21]));
                obj.setTbrCk2Amt(new BigDecimal(lineArray[22]));
                obj.setTbrCk4Amt(new BigDecimal(lineArray[23]));
                obj.setRegEmpNo(lineArray[24]);
                obj.setRegDt((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                obj.setRegTm(lineArray[26]);
                obj.setUpdEmpNo(lineArray[27]);
                obj.setUpdDt((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                obj.setUpdTm(lineArray[29]);
                if (isExist(obj.getAcctNo(), obj.getModeGb())) {
                    adst_dpb_yedeInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_YEDEInfo> objList) {
        adst_dpb_yedeInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, String modeGb) {
        return adst_dpb_yedeInfoRepository.existsByAcctNoAndModeGb(acctNo, modeGb);
    }
}
