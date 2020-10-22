package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_LMT_CLMITInfo;
import nhbank.core.repositories.ACOM_LMT_CLMITInfoRepository;
import nhbank.core.services.ACOM_LMT_CLMITInfoService;
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
public class ACOM_LMT_CLMITInfoServiceImpl implements ACOM_LMT_CLMITInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_LMT_CLMITInfoRepository acom_lmt_clmitInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_LMT_CLMITInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\ACOM_LMT_CLMIT.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\ACOM_LMT_CLMIT.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_LMT_CLMITInfo obj = new ACOM_LMT_CLMITInfo();
                obj.setLaInspRcno(lineArray[0]);
                obj.setChgSqno(new BigDecimal(lineArray[1]));
                obj.setLaInspRcSqno(new BigDecimal(lineArray[2]));
                obj.setLaInspRcC(lineArray[3]);
                obj.setFxAcno(lineArray[4]);
                obj.setRepCusno(new BigDecimal(lineArray[5]));
                obj.setCusno(new BigDecimal(lineArray[6]));
                obj.setBrc(lineArray[7]);
                obj.setEstCurc(lineArray[8]);
                obj.setLaPmiAm(new BigDecimal(lineArray[9]));
                obj.setLmtDueDt((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                obj.setLaPrdMtcn(new BigDecimal(lineArray[11]));
                obj.setPnpLaMggKdc(lineArray[12]);
                obj.setBndPsvC(lineArray[13]);
                obj.setLaItrDsc(lineArray[14]);
                obj.setAcusAplItr(new BigDecimal(lineArray[15]));
                obj.setWrsC(lineArray[16]);
                obj.setRgmnEno(lineArray[17]);
                obj.setIvtmnEno(lineArray[18]);
                obj.setScid(lineArray[19]);
                obj.setTrXcrt(new BigDecimal(lineArray[20]));
                obj.setXcrtSc(new BigDecimal(lineArray[21]));
                obj.setDbtAcpC(lineArray[22]);
                obj.setBfLaInspRcno(lineArray[23]);
                obj.setChbfCusno(new BigDecimal(lineArray[24]));
                obj.setTrDt((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                obj.setFxTrSqno(new BigDecimal(lineArray[26]));
                obj.setRmkCntn(lineArray[27]);
                obj.setFxStsc(lineArray[28]);
                obj.setLschgDtm((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                obj.setLsCmeno(lineArray[30]);
                obj.setRegEmpNo(lineArray[31]);
                obj.setRegDt((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                obj.setRegTm(lineArray[33]);
                obj.setUpdEmpNo(lineArray[34]);
                obj.setUpdDt((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                obj.setUpdTm(lineArray[36]);
                if (isExist(obj.getLaInspRcno(), obj.getChgSqno())) {
                    acom_lmt_clmitInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_LMT_CLMITInfo> objList) {
        acom_lmt_clmitInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String laInspRcno, BigDecimal chgSqno) {
        return acom_lmt_clmitInfoRepository.existsByLaInspRcnoAndChgSqno(laInspRcno, chgSqno);
    }
}
