package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_LMT_BASEHDInfo;
import nhbank.core.repositories.ACOM_LMT_BASEHDInfoRepository;
import nhbank.core.services.ACOM_LMT_BASEHDInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ACOM_LMT_BASEHDInfoServiceImpl implements ACOM_LMT_BASEHDInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_LMT_BASEHDInfoRepository acom_lmt_basehdInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_LMT_BASEHDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ACOM_LMT_BASEHD.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ACOM_LMT_BASEHD.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_LMT_BASEHDInfo obj = new ACOM_LMT_BASEHDInfo();
                obj.setSngNo(lineArray[0]);
                obj.setMngBr(lineArray[1]);
                obj.setCixNo(lineArray[2]);
                obj.setFstIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setLstIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setCanIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setSngSts(lineArray[6]);
                obj.setSngInfo(lineArray[7]);
                obj.setSisSngno(lineArray[8]);
                obj.setPogwlGb(lineArray[9]);
                obj.setRevolGb(lineArray[10]);
                obj.setGihanGb(lineArray[11]);
                obj.setExpMm(new BigDecimal(lineArray[12]));
                obj.setExpIl((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setSngIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setSngCcy(lineArray[15]);
                obj.setSngAmt(new BigDecimal(lineArray[16]));
                obj.setSngAbtrt(new BigDecimal(lineArray[17]));
                obj.setSngAbtamt(new BigDecimal(lineArray[18]));
                obj.setTotSilCnt(new BigDecimal(lineArray[19]));
                obj.setTotSilJanamt(new BigDecimal(lineArray[20]));
                obj.setTotSilAccum(new BigDecimal(lineArray[21]));
                obj.setTotSilDjgjan(new BigDecimal(lineArray[22]));
                obj.setTotSilLstil((lineArray[23].equals("")) ? null : formatter.parse(lineArray[23]));
                obj.setTotBojBcnt(new BigDecimal(lineArray[24]));
                obj.setTotBojBjan(new BigDecimal(lineArray[25]));
                obj.setTotBojFcnt(new BigDecimal(lineArray[26]));
                obj.setTotBojFjan(new BigDecimal(lineArray[27]));
                obj.setWoiYongdo(new BigDecimal(lineArray[28]));
                obj.setWoiSunhu(lineArray[29]);
                obj.setWoiInttrm(new BigDecimal(lineArray[30]));
                obj.setWoiGaetrm(new BigDecimal(lineArray[31]));
                obj.setWoiSutgb(lineArray[32]);
                obj.setSngCond(lineArray[33]);
                obj.setIsSngno(lineArray[34]);
                obj.setIsCixno(lineArray[35]);
                obj.setIsBrno(lineArray[36]);
                obj.setIsIl((lineArray[37].equals("")) ? null : formatter.parse(lineArray[37]));
                obj.setIkSngno(lineArray[38]);
                obj.setIkCixno(lineArray[39]);
                obj.setIkBrno(lineArray[40]);
                obj.setIkIl((lineArray[41].equals("")) ? null : formatter.parse(lineArray[41]));
                obj.setSngAplseq(new BigDecimal(lineArray[42]));
                obj.setSngAuth(lineArray[43]);
                obj.setLstIbil((lineArray[44].equals("")) ? null : formatter.parse(lineArray[44]));
                obj.setSngBrno(lineArray[45]);
                obj.setSngClerk(lineArray[46]);
                obj.setSngAstmgr(lineArray[47]);
                obj.setSngLonmgr(lineArray[48]);
                obj.setSngChajang(lineArray[49]);
                obj.setSngJumjang(lineArray[50]);
                obj.setBojMjAmt(new BigDecimal(lineArray[51]));
                obj.setRateGb(lineArray[52]);
                obj.setRateJugi(lineArray[53]);
                obj.setSpread(new BigDecimal(lineArray[54]));
                obj.setYoncheRate(new BigDecimal(lineArray[55]));
                obj.setGraceDay(new BigDecimal(lineArray[56]));
                obj.setDayCntBasis(lineArray[57]);
                obj.setBusiDayRule(lineArray[58]);
                obj.setPenalRate(new BigDecimal(lineArray[59]));
                obj.setAgreeNo(lineArray[60]);
                obj.setCondSts(lineArray[61]);
                obj.setRegEmpNo(lineArray[62]);
                obj.setRegDt((lineArray[63].equals("")) ? null : formatter.parse(lineArray[63]));
                obj.setRegTm(lineArray[64]);
                obj.setUpdEmpNo(lineArray[65]);
                obj.setUpdDt((lineArray[66].equals("")) ? null : formatter.parse(lineArray[66]));
                obj.setUpdTm(lineArray[67]);
                if (isExist(obj.getSngNo())) {
                    acom_lmt_basehdInfoRepository.save(obj);
                } else {
                    objList.add(obj);
                }
            }
            br.close();
            if (!objList.isEmpty())
                insertAll(objList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertAll(List<ACOM_LMT_BASEHDInfo> objList) {
        acom_lmt_basehdInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String sngNo) {
        return acom_lmt_basehdInfoRepository.existsBySngNo(sngNo);
    }
}
