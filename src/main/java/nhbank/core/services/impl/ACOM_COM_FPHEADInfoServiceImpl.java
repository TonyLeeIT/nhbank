package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_COM_FPHEADInfo;
import nhbank.core.repositories.ACOM_COM_FPHEADInfoRepository;
import nhbank.core.services.ACOM_COM_FPHEADInfoService;
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
public class ACOM_COM_FPHEADInfoServiceImpl implements ACOM_COM_FPHEADInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_COM_FPHEADInfoRepository acom_com_fpheadInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_COM_FPHEADInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\ACOM_COM_FPHEAD.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\ACOM_COM_FPHEAD.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_COM_FPHEADInfo obj = new ACOM_COM_FPHEADInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setPrtKind(lineArray[2]);
                obj.setUpmuCd(lineArray[3]);
                obj.setTrCd(lineArray[4]);
                obj.setTxDate((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setCixNo(lineArray[6]);
                obj.setTitleTxt(lineArray[7]);
                obj.setHeadTxt(lineArray[8]);
                obj.setTellNo(lineArray[9]);
                obj.setTellNm(lineArray[10]);
                obj.setOpNo(lineArray[11]);
                obj.setOpNm(lineArray[12]);
                obj.setRegEmpNo(lineArray[13]);
                obj.setRegDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setRegTm(lineArray[15]);
                obj.setUpdEmpNo(lineArray[16]);
                obj.setUpdDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                obj.setUpdTm(lineArray[18]);
                if (isExist(obj.getRefNo(), obj.getHisNo(), obj.getPrtKind())) {
                    acom_com_fpheadInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COM_FPHEADInfo> objList) {
        acom_com_fpheadInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo, String prtKind) {
        return acom_com_fpheadInfoRepository.existsByRefNoAndHisNoAndPrtKind(refNo, hisNo, prtKind);
    }
}
