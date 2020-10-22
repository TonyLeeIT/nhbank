package nhbank.core.services.impl;

import nhbank.core.domain.AFIF_MTH_BASEInfo;
import nhbank.core.repositories.AFIF_MTH_BASEInfoRepository;
import nhbank.core.services.AFIF_MTH_BASEInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFIF_MTH_BASEInfoServiceImpl implements AFIF_MTH_BASEInfoService {
    @Autowired
    AFIF_MTH_BASEInfoRepository afif_mth_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFIF_MTH_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFIF_MTH_BASEInfo obj = new AFIF_MTH_BASEInfo();
                obj.setRefNo(lineArray[0]);
                obj.setDealIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                obj.setDealType(lineArray[2]);
                obj.setValueYn(lineArray[3]);
                obj.setValueIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setCcy(lineArray[5]);
                obj.setAmt(new BigDecimal(lineArray[6]));
                obj.setFromDepoCd(lineArray[7]);
                obj.setFromDepoNm(lineArray[8]);
                obj.setToCcy(lineArray[9]);
                obj.setToDepoCd(lineArray[10]);
                obj.setToDepoNm(lineArray[11]);
                obj.setPoYn(lineArray[12]);
                obj.setPoIl((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setPoSeq(new BigDecimal(lineArray[14]));
                obj.setTag21(lineArray[15]);
                obj.setTag53B(lineArray[16]);
                obj.setTag56ABic(lineArray[17]);
                obj.setTag56ANm(lineArray[18]);
                obj.setTag56DBicName1(lineArray[19]);
                obj.setTag56DBicName2(lineArray[20]);
                obj.setTag56DBicName3(lineArray[21]);
                obj.setTag56DBicName4(lineArray[22]);
                obj.setTag57Bic(lineArray[23]);
                obj.setTag57Nm(lineArray[24]);
                obj.setTag58Bic(lineArray[25]);
                obj.setTag58Nm(lineArray[26]);
                obj.setTag72Info1(lineArray[27]);
                obj.setTag72Info2(lineArray[28]);
                obj.setTag72Info3(lineArray[29]);
                obj.setFstIbIl((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                obj.setLstDealIl((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                obj.setLstIbIl((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                obj.setUserId(lineArray[33]);
                obj.setFrontId(lineArray[34]);
                obj.setRegEmpNo(lineArray[35]);
                obj.setRegDt((lineArray[36].equals("")) ? null : formatter.parse(lineArray[36]));
                obj.setRegTm(lineArray[37]);
                obj.setUpdEmpNo(lineArray[38]);
                obj.setUpdDt((lineArray[39].equals("")) ? null : formatter.parse(lineArray[39]));
                obj.setUpdTm(lineArray[40]);
                if (isExist(obj.getRefNo())) {
                    afif_mth_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFIF_MTH_BASEInfo> objList) {
        afif_mth_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afif_mth_baseInfoRepository.existsByRefNo(refNo);
    }
}
