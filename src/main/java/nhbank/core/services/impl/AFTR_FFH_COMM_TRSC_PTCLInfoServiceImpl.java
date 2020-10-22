package nhbank.core.services.impl;

import nhbank.core.domain.AFTR_FFH_COMM_TRSC_PTCLInfo;
import nhbank.core.repositories.AFTR_FFH_COMM_TRSC_PTCLInfoRepository;
import nhbank.core.services.AFTR_FFH_COMM_TRSC_PTCLInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFTR_FFH_COMM_TRSC_PTCLInfoServiceImpl implements AFTR_FFH_COMM_TRSC_PTCLInfoService {
    @Autowired
    AFTR_FFH_COMM_TRSC_PTCLInfoRepository aftr_ffh_comm_trsc_ptclInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFTR_FFH_COMM_TRSC_PTCLInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFTR_FFH_COMM_TRSC_PTCLInfo obj = new AFTR_FFH_COMM_TRSC_PTCLInfo();
                obj.setTrscBrNo(lineArray[0]);
                obj.setTrscDt((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                obj.setCommTrscSeqNo(new BigDecimal(lineArray[2]));
                obj.setCommTrscDtlsSeqNo(new BigDecimal(lineArray[3]));
                obj.setSysRegDt((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setSysUpdDt((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setCommTrscStCd(lineArray[6]);
                obj.setCommCd(lineArray[7]);
                obj.setCommStrDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setCommFctyCd(lineArray[9]);
                obj.setCommSubFctyCd(lineArray[10]);
                obj.setAfProcRnwYn(lineArray[11]);
                obj.setCommBizDvCd(lineArray[12]);
                obj.setCustNo(lineArray[13]);
                obj.setAcnmNo(lineArray[14]);
                obj.setAcctNo(lineArray[15]);
                obj.setAcctSeqNo(new BigDecimal(lineArray[16]));
                obj.setApvNo(lineArray[17]);
                obj.setAcnmNoDvCd(lineArray[18]);
                obj.setActgDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                obj.setActgBrNo(lineArray[20]);
                obj.setPrdCd(lineArray[21]);
                obj.setFundNo(lineArray[22]);
                obj.setFundTrscTypCd(lineArray[23]);
                obj.setRcvPaymDvCd(lineArray[24]);
                obj.setProcEmpNo(lineArray[25]);
                obj.setFstTrmsSysCd(lineArray[26]);
                obj.setGlobId(lineArray[27]);
                obj.setChnlTypCd(lineArray[28]);
                obj.setSvcGrpCd(lineArray[29]);
                obj.setRecvSvcCd(lineArray[30]);
                obj.setTrscScrnNo(lineArray[31]);
                obj.setPgmId(lineArray[32]);
                obj.setDatDelCycCd(lineArray[33]);
                obj.setCanPossYn(lineArray[34]);
                obj.setTrscBrfcCd(lineArray[35]);
                obj.setTrscTmnlNo(lineArray[36]);
                obj.setPlAtitCd(lineArray[37]);
                obj.setBsAtitCd(lineArray[38]);
                obj.setCommPrimMethCd(lineArray[39]);
                obj.setCommPrimRsnCd(lineArray[40]);
                obj.setCommLevyDvCd(lineArray[41]);
                obj.setSapvCommApcSeqNo(new BigDecimal(lineArray[42]));
                obj.setSapvCommApcDtlsNo(new BigDecimal(lineArray[43]));
                obj.setTrscAmtCurCd(lineArray[44]);
                obj.setTgtAmt(new BigDecimal(lineArray[45]));
                obj.setTgtNcnt(new BigDecimal(lineArray[46]));
                obj.setCommCurCd(lineArray[47]);
                obj.setNormComm(new BigDecimal(lineArray[48]));
                obj.setApclComm(new BigDecimal(lineArray[49]));
                obj.setFexCommVlu(new BigDecimal(lineArray[50]));
                obj.setPrimComm(new BigDecimal(lineArray[51]));
                obj.setCustPintDctdAmt(new BigDecimal(lineArray[52]));
                obj.setCustMlgeDctdAmt(new BigDecimal(lineArray[53]));
                obj.setCommCrrcNcnt(new BigDecimal(lineArray[54]));
                obj.setCommCrrcAmt(new BigDecimal(lineArray[55]));
                obj.setNormCommRt(new BigDecimal(lineArray[56]));
                obj.setApclCommRt(new BigDecimal(lineArray[57]));
                obj.setApclExhgRt(new BigDecimal(lineArray[58]));
                obj.setRduCommRt(new BigDecimal(lineArray[59]));
                obj.setCashAmt(new BigDecimal(lineArray[60]));
                obj.setSbstAmt(new BigDecimal(lineArray[61]));
                obj.setOthbrAmt(new BigDecimal(lineArray[62]));
                obj.setOthbrBilCd(lineArray[63]);
                obj.setFexRefnNo(lineArray[64]);
                obj.setGearAcctBnkCd(lineArray[65]);
                obj.setGearAcctNo(lineArray[66]);
                obj.setGearAcctSeqNo(new BigDecimal(lineArray[67]));
                obj.setDtlsClasNo(new BigDecimal(lineArray[68]));
                obj.setTrmStrDt((lineArray[69].equals("")) ? null : formatter.parse(lineArray[69]));
                obj.setTrmEndDt((lineArray[70].equals("")) ? null : formatter.parse(lineArray[70]));
                obj.setNlvydPtclRegDt((lineArray[71].equals("")) ? null : formatter.parse(lineArray[71]));
                obj.setNlvydPtclRegNo(new BigDecimal(lineArray[72]));
                obj.setCommBizKey(lineArray[73]);
                obj.setCanOgnTrscDt((lineArray[74].equals("")) ? null : formatter.parse(lineArray[74]));
                obj.setCanOgnTrscSeqNo(new BigDecimal(lineArray[75]));
                obj.setOgnTrscDtlsSeqNo(new BigDecimal(lineArray[76]));
                obj.setOgnTrscBrNo(lineArray[77]);
                obj.setCommCustNm(lineArray[78]);
                obj.setCommRmrk(lineArray[79]);
                obj.setLstTrscDt((lineArray[80].equals("")) ? null : formatter.parse(lineArray[80]));
                obj.setCommExmMgntYnStrnCd(lineArray[81]);
                obj.setRsevDat(lineArray[82]);
                obj.setTrtComm(new BigDecimal(lineArray[83]));
                obj.setRduTcnt(new BigDecimal(lineArray[84]));
                obj.setRduStrDt((lineArray[85].equals("")) ? null : formatter.parse(lineArray[85]));
                obj.setRduPossTotlTcnt(new BigDecimal(lineArray[86]));
                obj.setRduEndDt((lineArray[87].equals("")) ? null : formatter.parse(lineArray[87]));
                obj.setAgntAcnmNo(lineArray[88]);
                obj.setAgntNm(lineArray[89]);
                obj.setUnonCd(lineArray[90]);
                obj.setOurCustYn(lineArray[91]);
                obj.setIbUid(lineArray[92]);
                obj.setTrmMltp(new BigDecimal(lineArray[93]));
                obj.setApclIrrt(new BigDecimal(lineArray[94]));
                obj.setUsdAmt(new BigDecimal(lineArray[95]));
                obj.setWdrwAmt(new BigDecimal(lineArray[96]));
                obj.setPfmcBrNo(lineArray[97]);
                obj.setVrtlAcctNo(lineArray[98]);
                obj.setCommVolnPrimRsnCtt(lineArray[99]);
                obj.setRegEmpNo(lineArray[100]);
                obj.setRegDt((lineArray[101].equals("")) ? null : formatter.parse(lineArray[101]));
                obj.setRegTm(lineArray[102]);
                obj.setUpdEmpNo(lineArray[103]);
                obj.setUpdDt((lineArray[104].equals("")) ? null : formatter.parse(lineArray[104]));
                obj.setUpdTm(lineArray[105]);
                if (isExist(obj.getTrscBrNo(), obj.getTrscDt(), obj.getCommTrscSeqNo(), obj.getCommTrscDtlsSeqNo())) {
                    aftr_ffh_comm_trsc_ptclInfoRepository.save(obj);
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
    public void insertAll(List<AFTR_FFH_COMM_TRSC_PTCLInfo> objList) {
        aftr_ffh_comm_trsc_ptclInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String trscBrNo, Date trscDt, BigDecimal commTrscSeqNo, BigDecimal commTrscDtlsSeqNo) {
        return aftr_ffh_comm_trsc_ptclInfoRepository.existsByTrscBrNoAndTrscDtAndCommTrscSeqNoAndCommTrscDtlsSeqNo(trscBrNo, trscDt, commTrscSeqNo, commTrscDtlsSeqNo);
    }
}
