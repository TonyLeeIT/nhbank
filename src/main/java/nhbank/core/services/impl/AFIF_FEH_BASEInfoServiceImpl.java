package nhbank.core.services.impl;

import nhbank.core.domain.AFIF_FEH_BASEInfo;
import nhbank.core.repositories.AFIF_FEH_BASEInfoRepository;
import nhbank.core.services.AFIF_FEH_BASEInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFIF_FEH_BASEInfoServiceImpl implements AFIF_FEH_BASEInfoService {
    @Autowired
    AFIF_FEH_BASEInfoRepository afif_feh_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFIF_FEH_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFIF_FEH_BASEInfo obj = new AFIF_FEH_BASEInfo();
                obj.setRefNo(lineArray[0]);
                obj.setComId(lineArray[1]);
                obj.setComNm(lineArray[2]);
                obj.setCounterpartyId(lineArray[3]);
                obj.setCounterpartyNm(lineArray[4]);
                obj.setDealType(lineArray[5]);
                obj.setDealIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setBaseCcy(lineArray[7]);
                obj.setCptyCcy(lineArray[8]);
                obj.setNearValueIlGb(lineArray[9]);
                obj.setNearValueIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                obj.setNearExHrt(new BigDecimal(lineArray[11]));
                obj.setNearBuyCcy(lineArray[12]);
                obj.setNearBuyAmt(new BigDecimal(lineArray[13]));
                obj.setNearSellCcy(lineArray[14]);
                obj.setNearSellAmt(new BigDecimal(lineArray[15]));
                obj.setNearInputGb(lineArray[16]);
                obj.setNearUsdCvtAmt(new BigDecimal(lineArray[17]));
                obj.setNearCustUsdAmt(new BigDecimal(lineArray[18]));
                obj.setNearBaseCvtAmt(new BigDecimal(lineArray[19]));
                obj.setNearBrHrt(new BigDecimal(lineArray[20]));
                obj.setNearKrusDealer(lineArray[21]);
                obj.setNearKrusHrt(new BigDecimal(lineArray[22]));
                obj.setNearOurRcvDepoCd(lineArray[23]);
                obj.setNearOurRcvDepoNm(lineArray[24]);
                obj.setNearOurPayDepoCd(lineArray[25]);
                obj.setNearOurPayDepoNm(lineArray[26]);
                obj.setNearThrRcvDepoBic(lineArray[27]);
                obj.setNearThrRcvDepoNm(lineArray[28]);
                obj.setNearConfirmYn(lineArray[29]);
                obj.setNearConfirmIl((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                obj.setNearPoYn(lineArray[31]);
                obj.setNearPoIl((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                obj.setNearPoSeq(new BigDecimal(lineArray[33]));
                obj.setFarValueIlGb(lineArray[34]);
                obj.setFarValueIl((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                obj.setFarExHrt(new BigDecimal(lineArray[36]));
                obj.setFarBuyCcy(lineArray[37]);
                obj.setFarBuyAmt(new BigDecimal(lineArray[38]));
                obj.setFarSellCcy(lineArray[39]);
                obj.setFarSellAmt(new BigDecimal(lineArray[40]));
                obj.setFarInputGb(lineArray[41]);
                obj.setFarUsdCvtAmt(new BigDecimal(lineArray[42]));
                obj.setFarCustUsdAmt(new BigDecimal(lineArray[43]));
                obj.setFarBaseCvtAmt(new BigDecimal(lineArray[44]));
                obj.setFarBrHrt(new BigDecimal(lineArray[45]));
                obj.setFarKrusDealer(lineArray[46]);
                obj.setFarKrusHrt(new BigDecimal(lineArray[47]));
                obj.setFarOurRcvDepoCd(lineArray[48]);
                obj.setFarOurRcvDepoNm(lineArray[49]);
                obj.setFarOurPayDepoCd(lineArray[50]);
                obj.setFarOurPayDepoNm(lineArray[51]);
                obj.setFarThrRcvDepoBic(lineArray[52]);
                obj.setFarThrRcvDepoNm(lineArray[53]);
                obj.setFarConfirmYn(lineArray[54]);
                obj.setFarConfirmIl((lineArray[55].equals("")) ? null : formatter.parse(lineArray[55]));
                obj.setFarPoYn(lineArray[56]);
                obj.setFarPoIl((lineArray[57].equals("")) ? null : formatter.parse(lineArray[57]));
                obj.setFarPoSeq(new BigDecimal(lineArray[58]));
                obj.setOnoffGb(lineArray[59]);
                obj.setInoutGb(lineArray[60]);
                obj.setDealMatchType(lineArray[61]);
                obj.setSwapHrt(new BigDecimal(lineArray[62]));
                obj.setDealGb(lineArray[63]);
                obj.setInterCustType(lineArray[64]);
                obj.setBrNo(lineArray[65]);
                obj.setSbrNo(lineArray[66]);
                obj.setOutofRiskGb(lineArray[67]);
                obj.setLinkedRefNo(lineArray[68]);
                obj.setRateFixIl((lineArray[69].equals("")) ? null : formatter.parse(lineArray[69]));
                obj.setFixExHrt(new BigDecimal(lineArray[70]));
                obj.setSetlCcy(lineArray[71]);
                obj.setSetlAmtGb(lineArray[72]);
                obj.setSetlAmt(new BigDecimal(lineArray[73]));
                obj.setSetlIl((lineArray[74].equals("")) ? null : formatter.parse(lineArray[74]));
                obj.setNearSngNo(lineArray[75]);
                obj.setFarSngNo(lineArray[76]);
                obj.setSystemGb(lineArray[77]);
                obj.setBankCd(lineArray[78]);
                obj.setChangeBrSts(lineArray[79]);
                obj.setInterfaceGb(lineArray[80]);
                obj.setNearBbsYn(lineArray[81]);
                obj.setFarBbsYn(lineArray[82]);
                obj.setFwdEbsYn(lineArray[83]);
                obj.setFstIbIl((lineArray[84].equals("")) ? null : formatter.parse(lineArray[84]));
                obj.setLstDealIl((lineArray[85].equals("")) ? null : formatter.parse(lineArray[85]));
                obj.setLstIbIl((lineArray[86].equals("")) ? null : formatter.parse(lineArray[86]));
                obj.setHisNo(new BigDecimal(lineArray[87]));
                obj.setDealerId(lineArray[88]);
                obj.setUserId(lineArray[89]);
                obj.setKondorId(lineArray[90]);
                obj.setLinkedDeal(lineArray[91]);
                obj.setNearSpotHrt(new BigDecimal(lineArray[92]));
                obj.setFarSpotHrt(new BigDecimal(lineArray[93]));
                obj.setNearBuyBoj(new BigDecimal(lineArray[94]));
                obj.setNearSellBoj(new BigDecimal(lineArray[95]));
                obj.setFarBuyBoj(new BigDecimal(lineArray[96]));
                obj.setFarSellBoj(new BigDecimal(lineArray[97]));
                obj.setHdSngNo(lineArray[98]);
                obj.setBeHdSngno(lineArray[99]);
                obj.setRemark(lineArray[100]);
                obj.setPvpYn(lineArray[101]);
                obj.setBiCustSts(lineArray[102]);
                obj.setBiNonBankCd(lineArray[103]);
                obj.setBiBankCd(lineArray[104]);
                obj.setBiDealPps(lineArray[105]);
                obj.setBiBusinessActType(lineArray[106]);
                obj.setBiCntyCd(lineArray[107]);
                obj.setBiCcy(lineArray[108]);
                obj.setBrokerId(lineArray[109]);
                obj.setBrokerFeeCcy(lineArray[110]);
                obj.setBrokerFeeAmt(new BigDecimal(lineArray[111]));
                obj.setRegEmpNo(lineArray[112]);
                obj.setRegDt((lineArray[113].equals("")) ? null : formatter.parse(lineArray[113]));
                obj.setRegTm(lineArray[114]);
                obj.setUpdEmpNo(lineArray[115]);
                obj.setUpdDt((lineArray[116].equals("")) ? null : formatter.parse(lineArray[116]));
                obj.setUpdTm(lineArray[117]);
                if (isExist(obj.getRefNo())) {
                    afif_feh_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFIF_FEH_BASEInfo> objList) {
        afif_feh_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afif_feh_baseInfoRepository.existsByRefNo(refNo);
    }
}
