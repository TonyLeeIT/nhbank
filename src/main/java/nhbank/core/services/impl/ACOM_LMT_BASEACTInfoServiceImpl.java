package nhbank.core.services.impl;

import nhbank.core.domain.ACOM_LMT_BASEACTInfo;
import nhbank.core.repositories.ACOM_LMT_BASEACTInfoRepository;
import nhbank.core.services.ACOM_LMT_BASEACTInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ACOM_LMT_BASEACTInfoServiceImpl implements ACOM_LMT_BASEACTInfoService {
    @Autowired
    ACOM_LMT_BASEACTInfoRepository acom_lmt_baseactInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_LMT_BASEACTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_LMT_BASEACTInfo obj = new ACOM_LMT_BASEACTInfo();
                obj.setSngNo(lineArray[0]);
                obj.setActCd(lineArray[1]);
                obj.setMngBr(lineArray[2]);
                obj.setCixNo(lineArray[3]);
                obj.setFstIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setLstIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setCanIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setSngSts(lineArray[7]);
                obj.setSngInfo(lineArray[8]);
                obj.setActAmt(new BigDecimal(lineArray[9]));
                obj.setActRtgb(lineArray[10]);
                obj.setActRate(new BigDecimal(lineArray[11]));
                obj.setActSprd(new BigDecimal(lineArray[12]));
                obj.setActRtjo(lineArray[13]);
                obj.setSilCnt(new BigDecimal(lineArray[14]));
                obj.setSilJanamt(new BigDecimal(lineArray[15]));
                obj.setSilAccum(new BigDecimal(lineArray[16]));
                obj.setSilWoijan(new BigDecimal(lineArray[17]));
                obj.setSilDjgjan(new BigDecimal(lineArray[18]));
                obj.setSilLstil((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                obj.setBojBcnt(new BigDecimal(lineArray[20]));
                obj.setBojBjan(new BigDecimal(lineArray[21]));
                obj.setBojFcnt(new BigDecimal(lineArray[22]));
                obj.setBojFjan(new BigDecimal(lineArray[23]));
                obj.setWoiYongdo(new BigDecimal(lineArray[24]));
                obj.setWoiSunhu(lineArray[25]);
                obj.setWoiInttrm(new BigDecimal(lineArray[26]));
                obj.setWoiGaetrm(new BigDecimal(lineArray[27]));
                obj.setWoiSutgb(lineArray[28]);
                obj.setSngAplseq(new BigDecimal(lineArray[29]));
                obj.setSngAuth(lineArray[30]);
                obj.setLstIbil((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                obj.setSngBrno(lineArray[32]);
                obj.setBojMjAmt(new BigDecimal(lineArray[33]));
                obj.setRateGb(lineArray[34]);
                obj.setRateJugi(lineArray[35]);
                obj.setSpread(new BigDecimal(lineArray[36]));
                obj.setYoncheRate(new BigDecimal(lineArray[37]));
                obj.setGraceDay(new BigDecimal(lineArray[38]));
                obj.setDayCntBasis(lineArray[39]);
                obj.setBusiDayRule(lineArray[40]);
                obj.setPenalRate(new BigDecimal(lineArray[41]));
                obj.setRegEmpNo(lineArray[42]);
                obj.setRegDt((lineArray[43].equals("")) ? null : formatter.parse(lineArray[43]));
                obj.setRegTm(lineArray[44]);
                obj.setUpdEmpNo(lineArray[45]);
                obj.setUpdDt((lineArray[46].equals("")) ? null : formatter.parse(lineArray[46]));
                obj.setUpdTm(lineArray[47]);
                if (isExist(obj.getSngNo(), obj.getActCd())) {
                    acom_lmt_baseactInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_LMT_BASEACTInfo> objList) {
        acom_lmt_baseactInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String sngNo, String actCd) {
        return acom_lmt_baseactInfoRepository.existsBySngNoAndActCd(sngNo, actCd);
    }
}
