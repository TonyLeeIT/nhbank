package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_LMT_ITMInfo;
import nhbank.core.repositories.ACOM_LMT_ITMInfoRepository;
import nhbank.core.services.ACOM_LMT_ITMInfoService;
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
public class ACOM_LMT_ITMInfoServiceImpl implements ACOM_LMT_ITMInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_LMT_ITMInfoRepository acom_lmt_itmInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_LMT_ITMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ACOM_LMT_ITM.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ACOM_LMT_ITM.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_LMT_ITMInfo obj = new ACOM_LMT_ITMInfo();
                obj.setSngNo(lineArray[0]);
                obj.setSeq(new BigDecimal(lineArray[1]));
                obj.setTrGb(lineArray[2]);
                obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setLstIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setItmCd(lineArray[6]);
                obj.setBeAitm01(lineArray[7]);
                obj.setBeAitm02(lineArray[8]);
                obj.setBeAitm03(lineArray[9]);
                obj.setBeAitm04(lineArray[10]);
                obj.setBeAitm05(lineArray[11]);
                obj.setBeAitm06(lineArray[12]);
                obj.setBeAitm07(lineArray[13]);
                obj.setBeAitm08(lineArray[14]);
                obj.setBeAitm09(lineArray[15]);
                obj.setBeAitm10(lineArray[16]);
                obj.setAfAitm01(lineArray[17]);
                obj.setAfAitm02(lineArray[18]);
                obj.setAfAitm03(lineArray[19]);
                obj.setAfAitm04(lineArray[20]);
                obj.setAfAitm05(lineArray[21]);
                obj.setAfAitm06(lineArray[22]);
                obj.setAfAitm07(lineArray[23]);
                obj.setAfAitm08(lineArray[24]);
                obj.setAfAitm09(lineArray[25]);
                obj.setAfAitm10(lineArray[26]);
                obj.setBeNitm(new BigDecimal(lineArray[27]));
                obj.setAfNitm(new BigDecimal(lineArray[28]));
                obj.setRegEmpNo(lineArray[29]);
                obj.setRegDt((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                obj.setRegTm(lineArray[31]);
                obj.setUpdEmpNo(lineArray[32]);
                obj.setUpdDt((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                obj.setUpdTm(lineArray[34]);
                if (isExist(obj.getSngNo(), obj.getSeq())) {
                    acom_lmt_itmInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_LMT_ITMInfo> objList) {
        acom_lmt_itmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String sngNo, BigDecimal seq) {
        return acom_lmt_itmInfoRepository.existsBySngNoAndSeq(sngNo, seq);
    }
}
