package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_CIX_LOCALInfo;
import nhbank.core.repositories.ACOM_CIX_LOCALInfoRepository;
import nhbank.core.services.ACOM_CIX_LOCALInfoService;
import nhbank.core.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ACOM_CIX_LOCALInfoServiceImpl implements ACOM_CIX_LOCALInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_CIX_LOCALInfoRepository acom_cix_localInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_CIX_LOCALInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ACOM_CIX_LOCAL.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ACOM_CIX_LOCAL.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_CIX_LOCALInfo obj = new ACOM_CIX_LOCALInfo();
                obj.setCixNo(lineArray[0]);
                obj.setItemNm(lineArray[1]);
                obj.setItemCtt(lineArray[2]);
                obj.setRegDvCd(lineArray[3]);
                obj.setRegEmpNo(lineArray[4]);
                obj.setRegDt((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setRegTm(lineArray[6]);
                obj.setUpdEmpNo(lineArray[7]);
                obj.setUpdDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setUpdTm(lineArray[9]);
                if (isExist(obj.getCixNo(), obj.getItemNm())) {
                    acom_cix_localInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_CIX_LOCALInfo> objList) {
        acom_cix_localInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cixNo, String itemNm) {
        return acom_cix_localInfoRepository.existsByCixNoAndItemNm(cixNo, itemNm);
    }
}
