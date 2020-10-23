package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ADST_LNB_BASEInfo;
import nhbank.core.repositories.ADST_LNB_BASEInfoRepository;
import nhbank.core.services.ADST_LNB_BASEInfoService;
import nhbank.core.util.DateUtils;
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
public class ADST_LNB_BASEInfoServiceImpl implements ADST_LNB_BASEInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ADST_LNB_BASEInfoRepository adst_lnb_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_LNB_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ADST_LNB_BASE.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ADST_LNB_BASE.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_LNB_BASEInfo obj = new ADST_LNB_BASEInfo();
                obj.setRefNo(lineArray[0]);
                obj.setIkisSts(lineArray[1]);
                obj.setBkGb(lineArray[2]);
                obj.setCixNo(lineArray[3]);
                obj.setBuseoNo(lineArray[4]);
                obj.setComId(lineArray[5]);
                obj.setComNm(lineArray[6]);
                obj.setOpenIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setTotExpIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setRealExpIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setFstExpIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                obj.setLonCcy(lineArray[11]);
                obj.setFstLonAmt(new BigDecimal(lineArray[12]));
                obj.setLonJan(new BigDecimal(lineArray[13]));
                obj.setRepayGb(lineArray[14]);
                obj.setSchGb(lineArray[15]);
                obj.setTermGb(lineArray[16]);
                obj.setAccrualGb(lineArray[17]);
                obj.setActGb(lineArray[18]);
                obj.setGuchTerm(new BigDecimal(lineArray[19]));
                obj.setRepayTerm(new BigDecimal(lineArray[20]));
                obj.setRepayGap(new BigDecimal(lineArray[21]));
                obj.setRepayGapGb(lineArray[22]);
                obj.setGraceDays(new BigDecimal(lineArray[23]));
                obj.setRepayCnt(new BigDecimal(lineArray[24]));
                obj.setFstRepayIl((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                obj.setLstRepayIl((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                obj.setNxRepayIl((lineArray[27].equals("")) ? null : formatter.parse(lineArray[27]));
                obj.setLstIsuIl((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                obj.setLstIibIl((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                obj.setNxIsuIl((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                obj.setNxRollIl((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                obj.setLstBillIl((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                obj.setNxBillIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                obj.setLstRt(new BigDecimal(lineArray[34]));
                obj.setMisuAmt(new BigDecimal(lineArray[35]));
                obj.setMisuSeq(new BigDecimal(lineArray[36]));
                obj.setMkjAmt(new BigDecimal(lineArray[37]));
                obj.setMkjSeq(new BigDecimal(lineArray[38]));
                obj.setRepayAdjSeq(new BigDecimal(lineArray[39]));
                obj.setRepayNxSeq(new BigDecimal(lineArray[40]));
                obj.setIntAdjSeq(new BigDecimal(lineArray[41]));
                obj.setIntNxSeq(new BigDecimal(lineArray[42]));
                obj.setPrnYcGb(lineArray[43]);
                obj.setPrnYcIl((lineArray[44].equals("")) ? null : formatter.parse(lineArray[44]));
                obj.setIntYcGb(lineArray[45]);
                obj.setIntYcIl((lineArray[46].equals("")) ? null : formatter.parse(lineArray[46]));
                obj.setYcGun(new BigDecimal(lineArray[47]));
                obj.setTimesPastDueCnt(new BigDecimal(lineArray[48]));
                obj.setRegPayAmt(new BigDecimal(lineArray[49]));
                obj.setNonEqGb(lineArray[50]);
                obj.setNonEqAmt(new BigDecimal(lineArray[51]));
                obj.setRateCcy(lineArray[52]);
                obj.setFixFltGb(lineArray[53]);
                obj.setSpreadGb(lineArray[54]);
                obj.setSpreadRt(new BigDecimal(lineArray[55]));
                obj.setRateChgYn(lineArray[56]);
                obj.setRollGap(new BigDecimal(lineArray[57]));
                obj.setRollGapGb(lineArray[58]);
                obj.setLateChgYn(lineArray[59]);
                obj.setLateChgRt(new BigDecimal(lineArray[60]));
                obj.setPastDueRt(new BigDecimal(lineArray[61]));
                obj.setAccrualRt(new BigDecimal(lineArray[62]));
                obj.setCapRtYn(lineArray[63]);
                obj.setCapRtLife(new BigDecimal(lineArray[64]));
                obj.setCapRtPrd(new BigDecimal(lineArray[65]));
                obj.setFloorRtYn(lineArray[66]);
                obj.setFloorRtLife(new BigDecimal(lineArray[67]));
                obj.setFloorRtPrd(new BigDecimal(lineArray[68]));
                obj.setAdvArrGb(lineArray[69]);
                obj.setSingleBothType(lineArray[70]);
                obj.setAccrType(lineArray[71]);
                obj.setBsnsDayRule(lineArray[72]);
                obj.setIntGap(new BigDecimal(lineArray[73]));
                obj.setIntGapGb(lineArray[74]);
                obj.setIntAdjYn(lineArray[75]);
                obj.setAllInYield(new BigDecimal(lineArray[76]));
                obj.setHdSngNo(lineArray[77]);
                obj.setFeeYn(lineArray[78]);
                obj.setAppliFee(new BigDecimal(lineArray[79]));
                obj.setOrigiFee(new BigDecimal(lineArray[80]));
                obj.setRenewFee(new BigDecimal(lineArray[81]));
                obj.setBrokaFee(new BigDecimal(lineArray[82]));
                obj.setOtherFee(new BigDecimal(lineArray[83]));
                obj.setSndDocNo(lineArray[84]);
                obj.setThrRcvDepoCcy(lineArray[85]);
                obj.setThrRcvDepoBic(lineArray[86]);
                obj.setEvidNo(lineArray[87]);
                obj.setEvidCcy(lineArray[88]);
                obj.setEvidAmt(new BigDecimal(lineArray[89]));
                obj.setUsdCvtAmt(new BigDecimal(lineArray[90]));
                obj.setBbsCvtAmt(new BigDecimal(lineArray[91]));
                obj.setAutoDebitYn(lineArray[92]);
                obj.setLossAmt(new BigDecimal(lineArray[93]));
                obj.setRestructuringYn(lineArray[94]);
                obj.setFstIbIl((lineArray[95].equals("")) ? null : formatter.parse(lineArray[95]));
                obj.setLstDealIl((lineArray[96].equals("")) ? null : formatter.parse(lineArray[96]));
                obj.setLstIbIl((lineArray[97].equals("")) ? null : formatter.parse(lineArray[97]));
                obj.setOpNo(lineArray[98]);
                obj.setOwnerNo(lineArray[99]);
                obj.setRmpbNo(lineArray[100]);
                obj.setIbfGb(lineArray[101]);
                obj.setBlNo(lineArray[102]);
                obj.setLgOpenIl((lineArray[103].equals("")) ? null : formatter.parse(lineArray[103]));
                obj.setNxtRt(new BigDecimal(lineArray[104]));
                obj.setNxtSchYn(lineArray[105]);
                obj.setNewSchYn(lineArray[106]);
                obj.setMsgLstIsuIl((lineArray[107].equals("")) ? null : formatter.parse(lineArray[107]));
                obj.setAgrRefNo(lineArray[108]);
                obj.setAgrSeqNo(new BigDecimal(lineArray[109]));
                obj.setLongShortType(lineArray[110]);
                obj.setFlatSliding(lineArray[111]);
                obj.setRegEmpNo(lineArray[112]);
                obj.setRegDt((lineArray[113].equals("")) ? null : formatter.parse(lineArray[113]));
                obj.setRegTm(lineArray[114]);
                obj.setUpdEmpNo(lineArray[115]);
                obj.setUpdDt((lineArray[116].equals("")) ? null : formatter.parse(lineArray[116]));
                obj.setUpdTm(lineArray[117]);
                obj.setPartialYn(lineArray[118]);
                obj.setPartialExpiDt((lineArray[119].equals("")) ? null : formatter.parse(lineArray[119]));
                obj.setPartialAmt(new BigDecimal(lineArray[120]));
                obj.setPartialJan(new BigDecimal(lineArray[121]));
                obj.setLnPrpsCd(lineArray[122]);
                if (isExist(obj.getRefNo())) {
                    adst_lnb_baseInfoRepository.save(obj);
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
    public void insertAll(List<ADST_LNB_BASEInfo> objList) {
        adst_lnb_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return adst_lnb_baseInfoRepository.existsByRefNo(refNo);
    }
}
