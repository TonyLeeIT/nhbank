package nhbank.core.services.impl;

import nhbank.core.domain.AACT_TRX_BSInfo;
import nhbank.core.repositories.AACT_TRX_BSInfoRepository;
import nhbank.core.services.AACT_TRX_BSInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AACT_TRX_BSInfoServiceImpl implements AACT_TRX_BSInfoService {
    @Autowired
    AACT_TRX_BSInfoRepository aact_trx_bsInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AACT_TRX_BSInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AACT_TRX_BSInfo obj = new AACT_TRX_BSInfo();
                obj.setRefNo(lineArray[0]);
                obj.setHisNo(new BigDecimal(lineArray[1]));
                obj.setSegSeq(new BigDecimal(lineArray[2]));
                obj.setRefNo2(lineArray[3]);
                obj.setOrgGb(lineArray[4]);
                obj.setIlgeGb(lineArray[5]);
                obj.setYdGb(lineArray[6]);
                obj.setPstGb(lineArray[7]);
                obj.setIbfGb(lineArray[8]);
                obj.setPosGb(lineArray[9]);
                obj.setActIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                obj.setActBr(lineArray[11]);
                obj.setBsCcy(lineArray[12]);
                obj.setFbsCd(lineArray[13]);
                obj.setBbsCd(lineArray[14]);
                obj.setMbsBspl(lineArray[15]);
                obj.setMbsCd(lineArray[16]);
                obj.setIbjiCd(lineArray[17]);
                obj.setSlipGb(lineArray[18]);
                obj.setJukiGb(lineArray[19]);
                obj.setFamt(new BigDecimal(lineArray[20]));
                obj.setBamt(new BigDecimal(lineArray[21]));
                obj.setApplHrt(new BigDecimal(lineArray[22]));
                obj.setBasicHrt(new BigDecimal(lineArray[23]));
                obj.setBookHrt(new BigDecimal(lineArray[24]));
                obj.setDemiHrt(new BigDecimal(lineArray[25]));
                obj.setGosiHrt(new BigDecimal(lineArray[26]));
                obj.setFtpRt(new BigDecimal(lineArray[27]));
                obj.setCdSngNo(lineArray[28]);
                obj.setYdDsfg(lineArray[29]);
                obj.setYdRefno(lineArray[30]);
                obj.setYdHisno(new BigDecimal(lineArray[31]));
                obj.setDocId(lineArray[32]);
                obj.setRemark(lineArray[33]);
                obj.setMsgType(lineArray[34]);
                obj.setDpNo(lineArray[35]);
                obj.setDepoCd(lineArray[36]);
                obj.setValueIl((lineArray[37].equals("")) ? null : formatter.parse(lineArray[37]));
                obj.setSngNo(lineArray[38]);
                obj.setAbaNo(lineArray[39]);
                obj.setCheckNo(lineArray[40]);
                obj.setTheirRefno(lineArray[41]);
                obj.setIfrsDvCd(lineArray[42]);
                obj.setDtlsBalDvCd(lineArray[43]);
                obj.setBalAmt(new BigDecimal(lineArray[44]));
                obj.setIdNo(lineArray[45]);
                obj.setCixNo(lineArray[46]);
                obj.setRegEmpNo(lineArray[47]);
                obj.setRegDt((lineArray[48].equals("")) ? null : formatter.parse(lineArray[48]));
                obj.setRegTm(lineArray[49]);
                obj.setUpdEmpNo(lineArray[50]);
                obj.setUpdDt((lineArray[51].equals("")) ? null : formatter.parse(lineArray[51]));
                obj.setUpdTm(lineArray[52]);
                if (isExist(obj.getRefNo(), obj.getHisNo(), obj.getSegSeq())) {
                    aact_trx_bsInfoRepository.save(obj);
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
    public void insertAll(List<AACT_TRX_BSInfo> objList) {
        aact_trx_bsInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo, BigDecimal segSeq) {
        return aact_trx_bsInfoRepository.existsByRefNoAndHisNoAndSegSeq(refNo, hisNo, segSeq);
    }
}
