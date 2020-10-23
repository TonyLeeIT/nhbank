package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_COM_ALLOWInfo;
import nhbank.core.repositories.ACOM_COM_ALLOWInfoRepository;
import nhbank.core.services.ACOM_COM_ALLOWInfoService;
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
public class ACOM_COM_ALLOWInfoServiceImpl implements ACOM_COM_ALLOWInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_COM_ALLOWInfoRepository acom_com_allowInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_COM_ALLOWInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ACOM_COM_ALLOW.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ACOM_COM_ALLOW.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_COM_ALLOWInfo obj = new ACOM_COM_ALLOWInfo();
                obj.setRefNo(lineArray[0]);
                obj.setTrxRefNo(lineArray[1]);
                obj.setMngBr(lineArray[2]);
                obj.setCixNo(lineArray[3]);
                obj.setGwamCd(lineArray[4]);
                obj.setCurc(lineArray[5]);
                obj.setAssetAmt(new BigDecimal(lineArray[6]));
                obj.setExhgAmt(new BigDecimal(lineArray[7]));
                obj.setAllowAmt(new BigDecimal(lineArray[8]));
                obj.setCollectAmt(new BigDecimal(lineArray[9]));
                obj.setCollectCd(lineArray[10]);
                obj.setSts(lineArray[11]);
                obj.setRegEmpNo(lineArray[12]);
                obj.setRegDt((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setRegTm(lineArray[14]);
                obj.setUpdEmpNo(lineArray[15]);
                obj.setUpdDt((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                obj.setUpdTm(lineArray[17]);
                if (isExist(obj.getRefNo())) {
                    acom_com_allowInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COM_ALLOWInfo> objList) {
        acom_com_allowInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return acom_com_allowInfoRepository.existsByRefNo(refNo);
    }
}
