package nhbank.core.services.impl;

import nhbank.core.domain.ADST_DPB_INFOInfo;
import nhbank.core.repositories.ADST_DPB_INFOInfoRepository;
import nhbank.core.services.ADST_DPB_INFOInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ADST_DPB_INFOInfoServiceImpl implements ADST_DPB_INFOInfoService {
    @Autowired
    ADST_DPB_INFOInfoRepository adst_dpb_infoInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_DPB_INFOInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_DPB_INFOInfo obj = new ADST_DPB_INFOInfo();
                obj.setAcctNo(lineArray[0]);
                obj.setOpnSayuCd(lineArray[1]);
                obj.setOpnSrcCd(lineArray[2]);
                obj.setClsSayuCd(lineArray[3]);
                obj.setOpnGb(lineArray[4]);
                obj.setClsGb(lineArray[5]);
                obj.setDormantYn(lineArray[6]);
                obj.setBlYn(lineArray[7]);
                obj.setEmpPayAcctYn(lineArray[8]);
                obj.setLonIntCalGb(lineArray[9]);
                obj.setRollOverCd(lineArray[10]);
                obj.setRoBaseDtCd(lineArray[11]);
                obj.setAdminFeeExmpYn(lineArray[12]);
                obj.setClsFeeExmpYn(lineArray[13]);
                obj.setClsIntPayYn(lineArray[14]);
                obj.setSdAcctNo(lineArray[15]);
                obj.setPbookGb(lineArray[16]);
                obj.setPbookCd(lineArray[17]);
                obj.setPbookLine(new BigDecimal(lineArray[18]));
                obj.setPbookSeq(new BigDecimal(lineArray[19]));
                obj.setPwdErrCnt(new BigDecimal(lineArray[20]));
                obj.setOpNo(lineArray[21]);
                obj.setOwnerNo(lineArray[22]);
                obj.setPbrmNo(lineArray[23]);
                obj.setPbookLossGb(lineArray[24]);
                obj.setStopWithGb(lineArray[25]);
                obj.setStopWith2Gb(lineArray[26]);
                obj.setStopDepGb(lineArray[27]);
                obj.setColtGb(lineArray[28]);
                obj.setWarnLttrCd(lineArray[29]);
                obj.setWarnCkNo(lineArray[30]);
                obj.setLstWarnCkNo(lineArray[31]);
                obj.setWarnRegDt((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                obj.setLstWarnRegDt((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                obj.setIkIng(lineArray[34]);
                obj.setPbookUseGb(lineArray[35]);
                obj.setLonAcctGb(lineArray[36]);
                obj.setHoijun(lineArray[37]);
                obj.setIntMoveGb(lineArray[38]);
                obj.setClsMoveGb(lineArray[39]);
                obj.setDptNegoRtGb(lineArray[40]);
                obj.setFixFltGb(lineArray[41]);
                obj.setVostroGb(lineArray[42]);
                obj.setJointRelCd(lineArray[43]);
                obj.setJointCixNo(lineArray[44]);
                obj.setAcctRemark(lineArray[45]);
                obj.setLstIbIl((lineArray[46].equals("")) ? null : formatter.parse(lineArray[46]));
                obj.setLstTime(lineArray[47]);
                obj.setSelfMngIl((lineArray[48].equals("")) ? null : formatter.parse(lineArray[48]));
                obj.setIbfGb(lineArray[49]);
                obj.setLmtMaxAmt(new BigDecimal(lineArray[50]));
                obj.setPbookNo(lineArray[51]);
                obj.setEbUseGb(lineArray[52]);
                obj.setNetClsPossYn(lineArray[53]);
                obj.setNetPayPossYn(lineArray[54]);
                obj.setBankDvCd(lineArray[55]);
                obj.setTrfPsbkReprtYn(lineArray[56]);
                obj.setSignFileNm(lineArray[57]);
                obj.setBiPrdCd(lineArray[58]);
                obj.setBiMsrmCtgr(lineArray[59]);
                obj.setBiAcctPrpt(lineArray[60]);
                obj.setPrcpWithMethCd(lineArray[61]);
                obj.setIntWithMethCd(lineArray[62]);
                obj.setPrcpAcctNo(lineArray[63]);
                obj.setIntAcctNo(lineArray[64]);
                obj.setPrcpTmplCd(new BigDecimal(lineArray[65]));
                obj.setIntTmplCd(new BigDecimal(lineArray[66]));
                obj.setCertNo(lineArray[67]);
                obj.setSendAddrDv(lineArray[68]);
                obj.setComBit(lineArray[69]);
                obj.setAmt1(new BigDecimal(lineArray[70]));
                obj.setAmt2(new BigDecimal(lineArray[71]));
                obj.setAmt3(new BigDecimal(lineArray[72]));
                obj.setAmt4(new BigDecimal(lineArray[73]));
                obj.setAmt5(new BigDecimal(lineArray[74]));
                obj.setAmt6(new BigDecimal(lineArray[75]));
                obj.setAmt7(new BigDecimal(lineArray[76]));
                obj.setAmt8(new BigDecimal(lineArray[77]));
                obj.setAmt9(new BigDecimal(lineArray[78]));
                obj.setAmt10(new BigDecimal(lineArray[79]));
                obj.setCd1(lineArray[80]);
                obj.setCd2(lineArray[81]);
                obj.setCd3(lineArray[82]);
                obj.setCd4(lineArray[83]);
                obj.setCd5(lineArray[84]);
                obj.setCd6(lineArray[85]);
                obj.setCd7(lineArray[86]);
                obj.setCd8(lineArray[87]);
                obj.setCd9(lineArray[88]);
                obj.setCd10(lineArray[89]);
                obj.setRt1(new BigDecimal(lineArray[90]));
                obj.setRt2(new BigDecimal(lineArray[91]));
                obj.setRt3(new BigDecimal(lineArray[92]));
                obj.setRt4(new BigDecimal(lineArray[93]));
                obj.setRt5(new BigDecimal(lineArray[94]));
                obj.setDt1((lineArray[95].equals("")) ? null : formatter.parse(lineArray[95]));
                obj.setDt2((lineArray[96].equals("")) ? null : formatter.parse(lineArray[96]));
                obj.setDt3((lineArray[97].equals("")) ? null : formatter.parse(lineArray[97]));
                obj.setDt4((lineArray[98].equals("")) ? null : formatter.parse(lineArray[98]));
                obj.setDt5((lineArray[99].equals("")) ? null : formatter.parse(lineArray[99]));
                obj.setRegEmpNo(lineArray[100]);
                obj.setRegDt((lineArray[101].equals("")) ? null : formatter.parse(lineArray[101]));
                obj.setRegTm(lineArray[102]);
                obj.setUpdEmpNo(lineArray[103]);
                obj.setUpdDt((lineArray[104].equals("")) ? null : formatter.parse(lineArray[104]));
                obj.setUpdTm(lineArray[105]);
                obj.setPwdLossGb(lineArray[106]);
                if (isExist(obj.getAcctNo())) {
                    adst_dpb_infoInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_INFOInfo> objList) {
        adst_dpb_infoInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo) {
        return adst_dpb_infoInfoRepository.existsByAcctNo(acctNo);
    }
}
