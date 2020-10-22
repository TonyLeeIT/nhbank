package nhbank.core.services.impl;

import nhbank.core.domain.ACOM_COM_ACTCDInfo;
import nhbank.core.repositories.ACOM_COM_ACTCDInfoRepository;
import nhbank.core.services.ACOM_COM_ACTCDInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ACOM_COM_ACTCDInfoServiceImpl implements ACOM_COM_ACTCDInfoService {
    @Autowired
    ACOM_COM_ACTCDInfoRepository acom_com_actcdInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_COM_ACTCDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_COM_ACTCDInfo obj = new ACOM_COM_ACTCDInfo();
                obj.setBrNo(lineArray[0]);
                obj.setBsplGb(lineArray[1]);
                obj.setAcCd(lineArray[2]);
                obj.setFbGb(lineArray[3]);
                obj.setBokCd(lineArray[4]);
                obj.setHnm(lineArray[5]);
                obj.setHsnm(lineArray[6]);
                obj.setEnm(lineArray[7]);
                obj.setEsnm(lineArray[8]);
                obj.setLnm(lineArray[9]);
                obj.setLsnm(lineArray[10]);
                obj.setOldCd1(lineArray[11]);
                obj.setOldCd2(lineArray[12]);
                obj.setOldCd3(lineArray[13]);
                obj.setBcd(lineArray[14]);
                obj.setTrGb(lineArray[15]);
                obj.setSysGb(lineArray[16]);
                obj.setBokGb(lineArray[17]);
                obj.setFssCd(lineArray[18]);
                obj.setFssNm(lineArray[19]);
                obj.setCd1(lineArray[20]);
                obj.setCd2(lineArray[21]);
                obj.setCd3(lineArray[22]);
                obj.setCd4(lineArray[23]);
                obj.setCd5(lineArray[24]);
                obj.setAcKd(lineArray[25]);
                obj.setBldrcrGb(lineArray[26]);
                obj.setMnblGb(lineArray[27]);
                obj.setIbfGb(lineArray[28]);
                obj.setRefctlGb(lineArray[29]);
                obj.setSusGb(lineArray[30]);
                obj.setContraGb(lineArray[31]);
                obj.setContraAc(lineArray[32]);
                obj.setAccrAc(lineArray[33]);
                obj.setAmrtAc(lineArray[34]);
                obj.setAcSort1(new BigDecimal(lineArray[35]));
                obj.setAcSort2(new BigDecimal(lineArray[36]));
                obj.setRegEmpNo(lineArray[37]);
                obj.setRegDt((lineArray[38].equals("")) ? null : formatter.parse(lineArray[38]));
                obj.setRegTm(lineArray[39]);
                obj.setUpdEmpNo(lineArray[40]);
                obj.setUpdDt((lineArray[41].equals("")) ? null : formatter.parse(lineArray[41]));
                obj.setUpdTm(lineArray[42]);
                if (isExist(obj.getBrNo(), obj.getBsplGb(), obj.getAcCd())) {
                    acom_com_actcdInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COM_ACTCDInfo> objList) {
        acom_com_actcdInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String brNo, String bsplGb, String acCd) {
        return acom_com_actcdInfoRepository.existsByBrNoAndBsplGbAndAcCd(brNo, bsplGb, acCd);
    }
}
