package nhbank.core.services.impl;

import nhbank.core.domain.AACT_TRX_BASEInfo;
import nhbank.core.repositories.AACT_TRX_BASEInfoRepository;
import nhbank.core.services.AACT_TRX_BASEInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AACT_TRX_BASEInfoServiceImpl implements AACT_TRX_BASEInfoService {
    @Autowired
    AACT_TRX_BASEInfoRepository aact_trx_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AACT_TRX_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AACT_TRX_BASEInfo obj = new AACT_TRX_BASEInfo();
                obj.setTrxIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                obj.setTrxBr(lineArray[1]);
                obj.setTrxSeq(new BigDecimal(lineArray[2]));
                obj.setRefNo(lineArray[3]);
                obj.setHisNo(new BigDecimal(lineArray[4]));
                obj.setIbfGb(lineArray[5]);
                obj.setIdNo(lineArray[6]);
                obj.setCixNo(lineArray[7]);
                obj.setBuseoNo(lineArray[8]);
                obj.setUpmuCd(lineArray[9]);
                obj.setGeorCd(lineArray[10]);
                obj.setDpydGb(lineArray[11]);
                obj.setSts(lineArray[12]);
                obj.setCanHisno(new BigDecimal(lineArray[13]));
                obj.setActMach(lineArray[14]);
                obj.setActDtyp(lineArray[15]);
                obj.setActDseq(lineArray[16]);
                obj.setActTell(lineArray[17]);
                obj.setActSjum(lineArray[18]);
                obj.setActCjum(lineArray[19]);
                obj.setActMode(lineArray[20]);
                obj.setCcyCnt(new BigDecimal(lineArray[21]));
                obj.setActBsplGb(lineArray[22]);
                obj.setActCd(lineArray[23]);
                obj.setActCcy(lineArray[24]);
                obj.setActAmt(new BigDecimal(lineArray[25]));
                obj.setUsdAmt(new BigDecimal(lineArray[26]));
                obj.setFdcAmt(new BigDecimal(lineArray[27]));
                obj.setFdcHdamt(new BigDecimal(lineArray[28]));
                obj.setApplHrt(new BigDecimal(lineArray[29]));
                obj.setBasicHrt(new BigDecimal(lineArray[30]));
                obj.setBookHrt(new BigDecimal(lineArray[31]));
                obj.setDemiHrt(new BigDecimal(lineArray[32]));
                obj.setGosiHrt(new BigDecimal(lineArray[33]));
                obj.setIbjiMd(lineArray[34]);
                obj.setJakiAmt(new BigDecimal(lineArray[35]));
                obj.setEtc1Amt(new BigDecimal(lineArray[36]));
                obj.setEtc2Amt(new BigDecimal(lineArray[37]));
                obj.setEtc3Amt(new BigDecimal(lineArray[38]));
                obj.setAcIl((lineArray[39].equals("")) ? null : formatter.parse(lineArray[39]));
                obj.setIbIl((lineArray[40].equals("")) ? null : formatter.parse(lineArray[40]));
                obj.setIbTime(lineArray[41]);
                obj.setGisIl((lineArray[42].equals("")) ? null : formatter.parse(lineArray[42]));
                obj.setCanIl((lineArray[43].equals("")) ? null : formatter.parse(lineArray[43]));
                obj.setIlgeGb(lineArray[44]);
                obj.setOpNo(lineArray[45]);
                obj.setMgrNo(lineArray[46]);
                obj.setRmNo(lineArray[47]);
                obj.setBsCnt(new BigDecimal(lineArray[48]));
                obj.setPlCnt(new BigDecimal(lineArray[49]));
                obj.setCdsngNo(lineArray[50]);
                obj.setVipGb(lineArray[51]);
                obj.setTheirRefno(lineArray[52]);
                obj.setPlAddYn(lineArray[53]);
                obj.setVoucherNo(new BigDecimal(lineArray[54]));
                obj.setPosKind(lineArray[55]);
                obj.setGlobId(lineArray[56]);
                obj.setIfrsDvCd(lineArray[57]);
                obj.setActEvntCdCtt(lineArray[58]);
                obj.setActAplyDvCd(lineArray[59]);
                obj.setActOvrdAplyCd(lineArray[60]);
                obj.setRegEmpNo(lineArray[61]);
                obj.setRegDt((lineArray[62].equals("")) ? null : formatter.parse(lineArray[62]));
                obj.setRegTm(lineArray[63]);
                obj.setUpdEmpNo(lineArray[64]);
                obj.setUpdDt((lineArray[65].equals("")) ? null : formatter.parse(lineArray[65]));
                obj.setUpdTm(lineArray[66]);
                if (isExist(obj.getTrxIl(), obj.getTrxBr())) {
                    aact_trx_baseInfoRepository.save(obj);
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
    public void insertAll(List<AACT_TRX_BASEInfo> objList) {
        aact_trx_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date trxIl, String trxBr) {
        return aact_trx_baseInfoRepository.existsByTrxIlAndTrxBr(trxIl, trxBr);
    }
}
