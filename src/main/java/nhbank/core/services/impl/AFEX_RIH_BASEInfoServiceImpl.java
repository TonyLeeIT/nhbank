package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_RIH_BASEInfo;
import nhbank.core.repositories.AFEX_RIH_BASEInfoRepository;
import nhbank.core.services.AFEX_RIH_BASEInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_RIH_BASEInfoServiceImpl implements AFEX_RIH_BASEInfoService {
    @Autowired
    AFEX_RIH_BASEInfoRepository afex_rih_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_RIH_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_RIH_BASEInfo obj = new AFEX_RIH_BASEInfo();
                obj.setRcvIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                obj.setSeqNo(new BigDecimal(lineArray[1]));
                obj.setRtCd(lineArray[2]);
                obj.setMoneyCd(lineArray[3]);
                obj.setRcvGb(lineArray[4]);
                obj.setMakeIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setRefNo(lineArray[6]);
                obj.setRcvBr(lineArray[7]);
                obj.setCixNo(lineArray[8]);
                obj.setBkGb(lineArray[9]);
                obj.setMngInfo(lineArray[10]);
                obj.setUpmuGb(lineArray[11]);
                obj.setAcIl((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                obj.setGisIl((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setLstIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setLstIbIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                obj.setIbjiMd(lineArray[16]);
                obj.setAcIl2((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                obj.setGisIl2((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                obj.setJunGb(lineArray[19]);
                obj.setOperId(lineArray[20]);
                obj.setMngrId(lineArray[21]);
                obj.setCcy(lineArray[22]);
                obj.setFamt(new BigDecimal(lineArray[23]));
                obj.setOrgFamt(new BigDecimal(lineArray[24]));
                obj.setDdNo(lineArray[25]);
                obj.setTheirRefNo(lineArray[26]);
                obj.setSdCtry(lineArray[27]);
                obj.setJucheCd(lineArray[28]);
                obj.setGeojuGb(lineArray[29]);
                obj.setSayuCd(lineArray[30]);
                obj.setJukyo(lineArray[31]);
                obj.setJunNo(lineArray[32]);
                obj.setChGb(lineArray[33]);
                obj.setChAmt(new BigDecimal(lineArray[34]));
                obj.setMjGb(lineArray[35]);
                obj.setRcvNation(lineArray[36]);
                obj.setRcvIdNo(lineArray[37]);
                obj.setRcvIdNoGb(lineArray[38]);
                obj.setRcvBuseoNo(lineArray[39]);
                obj.setRcvPostNo(lineArray[40]);
                obj.setSjGb(lineArray[41]);
                obj.setVipCode(lineArray[42]);
                obj.setOwnerNo(lineArray[43]);
                obj.setPbrmNo(lineArray[44]);
                obj.setJungjiIl((lineArray[45].equals("")) ? null : formatter.parse(lineArray[45]));
                obj.setSagoIl((lineArray[46].equals("")) ? null : formatter.parse(lineArray[46]));
                obj.setNegoCertiIl((lineArray[47].equals("")) ? null : formatter.parse(lineArray[47]));
                obj.setMileage(new BigDecimal(lineArray[48]));
                obj.setYdGuja(lineArray[49]);
                obj.setFeeCnt(new BigDecimal(lineArray[50]));
                obj.setFeeMsg(lineArray[51]);
                obj.setInmsgGb(lineArray[52]);
                obj.setInMsg(lineArray[53]);
                obj.setStateMsg(lineArray[54]);
                obj.setMndGb(lineArray[55]);
                obj.setCreditCur(lineArray[56]);
                obj.setCreditAmt(new BigDecimal(lineArray[57]));
                obj.setCreditIl((lineArray[58].equals("")) ? null : formatter.parse(lineArray[58]));
                obj.setApplNm(lineArray[59]);
                obj.setApplAddr1(lineArray[60]);
                obj.setApplAddr2(lineArray[61]);
                obj.setApplAddr3(lineArray[62]);
                obj.setApliAcno(lineArray[63]);
                obj.setJgDepoCd(lineArray[64]);
                obj.setJgDepoNm(lineArray[65]);
                obj.setJgBkcd(lineArray[66]);
                obj.setJgBkAbano(lineArray[67]);
                obj.setJgBknm(lineArray[68]);
                obj.setJgBkAddr1(lineArray[69]);
                obj.setJgBkAddr2(lineArray[70]);
                obj.setJgBkAddr3(lineArray[71]);
                obj.setRcvNm(lineArray[72]);
                obj.setRcvAddr1(lineArray[73]);
                obj.setRcvAddr2(lineArray[74]);
                obj.setRcvAddr3(lineArray[75]);
                obj.setRcvTelNo(lineArray[76]);
                obj.setRcvAcctNo(lineArray[77]);
                obj.setDepoCode(lineArray[78]);
                obj.setDepoName1(lineArray[79]);
                obj.setSbankBkcd(lineArray[80]);
                obj.setSbankBknm(lineArray[81]);
                obj.setSbankAddr1(lineArray[82]);
                obj.setSbankAddr2(lineArray[83]);
                obj.setSbankAddr3(lineArray[84]);
                obj.setCbankBkcd(lineArray[85]);
                obj.setCbankBknm(lineArray[86]);
                obj.setCbankAddr1(lineArray[87]);
                obj.setCbankAddr2(lineArray[88]);
                obj.setCbankAddr3(lineArray[89]);
                obj.setValueDate((lineArray[90].equals("")) ? null : formatter.parse(lineArray[90]));
                obj.setFeeCur(lineArray[91]);
                obj.setFeeAmt(new BigDecimal(lineArray[92]));
                obj.setInfo70Name1(lineArray[93]);
                obj.setInfo70Name2(lineArray[94]);
                obj.setInfo70Name3(lineArray[95]);
                obj.setInfo70Name4(lineArray[96]);
                obj.setInfoName1(lineArray[97]);
                obj.setInfoName2(lineArray[98]);
                obj.setInfoName3(lineArray[99]);
                obj.setInfoName4(lineArray[100]);
                obj.setInfoName5(lineArray[101]);
                obj.setInfoName6(lineArray[102]);
                obj.setImad(lineArray[103]);
                obj.setPreImad(lineArray[104]);
                obj.setOutmsgGb(lineArray[105]);
                obj.setOutmsgAutoYn(lineArray[106]);
                obj.setOutMsg(lineArray[107]);
                obj.setMoneyMsg(lineArray[108]);
                obj.setOutmakeIl((lineArray[109].equals("")) ? null : formatter.parse(lineArray[109]));
                obj.setOutAmt(new BigDecimal(lineArray[110]));
                obj.setOutComm(new BigDecimal(lineArray[111]));
                obj.setOutFee(new BigDecimal(lineArray[112]));
                obj.setMttypeCode(lineArray[113]);
                obj.setErrNo(lineArray[114]);
                obj.setErrMsg(lineArray[115]);
                obj.setRefundGb(lineArray[116]);
                obj.setRefundRefNo(lineArray[117]);
                obj.setRefundTheirRef(lineArray[118]);
                obj.setRefundRemark(lineArray[119]);
                obj.setIntBkcd(lineArray[120]);
                obj.setIntBknm(lineArray[121]);
                obj.setIntBkAddr1(lineArray[122]);
                obj.setIntBkAddr2(lineArray[123]);
                obj.setIntBkAddr3(lineArray[124]);
                obj.setIntBkAcct(lineArray[125]);
                obj.setJgBkAcct(lineArray[126]);
                obj.setMsgType(lineArray[127]);
                obj.setRelatedRef(lineArray[128]);
                obj.setBoseGb(lineArray[129]);
                obj.setExportSetlGb(lineArray[130]);
                obj.setTradeGb(lineArray[131]);
                obj.setInstructCcy(lineArray[132]);
                obj.setInstructAmt(new BigDecimal(lineArray[133]));
                obj.setExRate(new BigDecimal(lineArray[134]));
                obj.setBopSeqNo(lineArray[135]);
                obj.setBopTrxCode(lineArray[136]);
                obj.setBopTrxRemark(lineArray[137]);
                obj.setSubDpNo(lineArray[138]);
                obj.setCvtCcy(lineArray[139]);
                obj.setCvtAmt(new BigDecimal(lineArray[140]));
                obj.setCvtExrate(new BigDecimal(lineArray[141]));
                obj.setCableChgCcy(lineArray[142]);
                obj.setCableChgAmt(new BigDecimal(lineArray[143]));
                obj.setHoldRemark1(lineArray[144]);
                obj.setHoldRemark2(lineArray[145]);
                obj.setHoldRemark3(lineArray[146]);
                obj.setHoldRemark4(lineArray[147]);
                obj.setHoldRemark5(lineArray[148]);
                obj.setHoldRemark6(lineArray[149]);
                obj.setHoldRemark7(lineArray[150]);
                obj.setHoldRemark8(lineArray[151]);
                obj.setMngBr(lineArray[152]);
                obj.setSts(lineArray[153]);
                obj.setRegEmpNo(lineArray[154]);
                obj.setRegDt((lineArray[155].equals("")) ? null : formatter.parse(lineArray[155]));
                obj.setRegTm(lineArray[156]);
                obj.setUpdEmpNo(lineArray[157]);
                obj.setUpdDt((lineArray[158].equals("")) ? null : formatter.parse(lineArray[158]));
                obj.setUpdTm(lineArray[159]);
                obj.setVcbFeeGb(lineArray[160]);
                obj.setVcbFeeCcy(lineArray[161]);
                obj.setVcbFeeAmt(new BigDecimal(lineArray[162]));
                if (isExist(obj.getRcvIl(), obj.getSeqNo())) {
                    afex_rih_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RIH_BASEInfo> objList) {
        afex_rih_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date rcvIl, BigDecimal seqNo) {
        return afex_rih_baseInfoRepository.existsByRcvIlAndSeqNo(rcvIl, seqNo);
    }
}
