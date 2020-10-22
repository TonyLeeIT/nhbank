package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_IPB_BLDInfo;
import nhbank.core.repositories.AFEX_IPB_BLDInfoRepository;
import nhbank.core.services.AFEX_IPB_BLDInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFEX_IPB_BLDInfoServiceImpl implements AFEX_IPB_BLDInfoService {
    @Autowired
    AFEX_IPB_BLDInfoRepository afex_ipb_bldInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_IPB_BLDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_IPB_BLDInfo obj = new AFEX_IPB_BLDInfo();
                obj.setRefNo(lineArray[0]);
                obj.setSeq(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setLstIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setCcy(lineArray[6]);
                obj.setAmt(new BigDecimal(lineArray[7]));
                obj.setHisNo(new BigDecimal(lineArray[8]));
                obj.setJubGb(lineArray[9]);
                obj.setChuGb(lineArray[10]);
                obj.setMiJan(new BigDecimal(lineArray[11]));
                obj.setLgbBjan(new BigDecimal(lineArray[12]));
                obj.setLgbFjan(new BigDecimal(lineArray[13]));
                obj.setCorGb(lineArray[14]);
                obj.setBlGb(lineArray[15]);
                obj.setNegoBknm(lineArray[16]);
                obj.setSetBkcd(lineArray[17]);
                obj.setHajaGb(lineArray[18]);
                obj.setBlNo(lineArray[19]);
                obj.setNegoIl((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                obj.setBlYjubIl((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                obj.setBlkSseq(new BigDecimal(lineArray[22]));
                obj.setManGb(lineArray[23]);
                obj.setTcLisuIl((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                obj.setCccIjaGb(lineArray[25]);
                obj.setBudoGb(lineArray[26]);
                obj.setYukNo(lineArray[27]);
                obj.setDepoSeq(new BigDecimal(lineArray[28]));
                obj.setInsGamGb(lineArray[29]);
                obj.setInsIl((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                obj.setInsAmt(new BigDecimal(lineArray[31]));
                obj.setInsJan(new BigDecimal(lineArray[32]));
                obj.setShipIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                obj.setTheirRef(lineArray[34]);
                obj.setPoGb(lineArray[35]);
                obj.setApplIn(lineArray[36]);
                obj.setRcvIn(lineArray[37]);
                obj.setRcvAcctNo(lineArray[38]);
                obj.setTransGb(lineArray[39]);
                obj.setNcuCcy(lineArray[40]);
                obj.setNcuAmt(new BigDecimal(lineArray[41]));
                obj.setNcuMiJan(new BigDecimal(lineArray[42]));
                obj.setNcuLgbFjan(new BigDecimal(lineArray[43]));
                obj.setNcuInsAmt(new BigDecimal(lineArray[44]));
                obj.setNcuInsJan(new BigDecimal(lineArray[45]));
                obj.setIjaAmt(new BigDecimal(lineArray[46]));
                obj.setYjInsIl(lineArray[47]);
                obj.setYjManIl(lineArray[48]);
                obj.setRemark1(lineArray[49]);
                obj.setRemark2(lineArray[50]);
                obj.setRemark3(lineArray[51]);
                obj.setRemark4(lineArray[52]);
                obj.setRemark5(lineArray[53]);
                obj.setRemark6(lineArray[54]);
                obj.setRemark7(lineArray[55]);
                obj.setRemark8(lineArray[56]);
                obj.setRemark9(lineArray[57]);
                obj.setRemark10(lineArray[58]);
                obj.setRemark11(lineArray[59]);
                obj.setRemark12(lineArray[60]);
                obj.setRemark13(lineArray[61]);
                obj.setRemark14(lineArray[62]);
                obj.setRemark15(lineArray[63]);
                obj.setRegEmpNo(lineArray[64]);
                obj.setRegDt((lineArray[65].equals("")) ? null : formatter.parse(lineArray[65]));
                obj.setRegTm(lineArray[66]);
                obj.setUpdEmpNo(lineArray[67]);
                obj.setUpdDt((lineArray[68].equals("")) ? null : formatter.parse(lineArray[68]));
                obj.setUpdTm(lineArray[69]);
                if (isExist(obj.getRefNo(), obj.getSeq())) {
                    afex_ipb_bldInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPB_BLDInfo> objList) {
        afex_ipb_bldInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq) {
        return afex_ipb_bldInfoRepository.existsByRefNoAndSeq(refNo, seq);
    }
}
