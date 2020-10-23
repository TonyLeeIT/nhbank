package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_ADH_AMENDInfo;
import nhbank.core.repositories.AFEX_ADH_AMENDInfoRepository;
import nhbank.core.services.AFEX_ADH_AMENDInfoService;
import nhbank.core.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AFEX_ADH_AMENDInfoServiceImpl implements AFEX_ADH_AMENDInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_ADH_AMENDInfoRepository afex_adh_amendInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_ADH_AMENDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_ADH_AMEND.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_ADH_AMEND.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_ADH_AMENDInfo obj = new AFEX_ADH_AMENDInfo();
                obj.setMakeIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                obj.setSeqNo(new BigDecimal(lineArray[1]));
                obj.setLstHisNo(new BigDecimal(lineArray[2]));
                obj.setAdvNo(lineArray[3]);
                obj.setSendGb(lineArray[4]);
                obj.setLcNo(lineArray[5]);
                obj.setOpenIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setAmdCnt(new BigDecimal(lineArray[7]));
                obj.setOpenBkcd(lineArray[8]);
                obj.setOpenBknm1(lineArray[9]);
                obj.setOpenBknm2(lineArray[10]);
                obj.setOpenBknm3(lineArray[11]);
                obj.setBeneCd(lineArray[12]);
                obj.setBeneNm1(lineArray[13]);
                obj.setBeneNm2(lineArray[14]);
                obj.setBeneNm3(lineArray[15]);
                obj.setAmdGb(lineArray[16]);
                obj.setGyobuGb(lineArray[17]);
                obj.setGyobuIl((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                obj.setAmtGb(lineArray[19]);
                obj.setAmdCcy(lineArray[20]);
                obj.setAmdAmt(new BigDecimal(lineArray[21]));
                obj.setAfCcy(lineArray[22]);
                obj.setAfAmt(new BigDecimal(lineArray[23]));
                obj.setExpIl((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                obj.setShipIl((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                obj.setAuthGb(lineArray[26]);
                obj.setEdiChuri(lineArray[27]);
                obj.setEdiSend(lineArray[28]);
                obj.setFaxAdv(lineArray[29]);
                obj.setFaxSend(lineArray[30]);
                obj.setTail(lineArray[31]);
                obj.setNorUrg(lineArray[32]);
                obj.setSwiftMrn(lineArray[33]);
                obj.setMngNo(lineArray[34]);
                obj.setOpNo(lineArray[35]);
                obj.setTotSeq(new BigDecimal(lineArray[36]));
                obj.setLstIl((lineArray[37].equals("")) ? null : formatter.parse(lineArray[37]));
                obj.setMt707Fnm(lineArray[38]);
                obj.setRelay(lineArray[39]);
                obj.setLstTime(lineArray[40]);
                obj.setTxKey(lineArray[41]);
                obj.setMsgType(lineArray[42]);
                obj.setEdiId(lineArray[43]);
                obj.setCondSts(lineArray[44]);
                obj.setEdiSuin(lineArray[45]);
                obj.setBokSend(lineArray[46]);
                obj.setTongPrint(lineArray[47]);
                obj.setBrNo(lineArray[48]);
                obj.setBrNm(lineArray[49]);
                obj.setBrCharge(new BigDecimal(lineArray[50]));
                obj.setChargeAmt(new BigDecimal(lineArray[51]));
                obj.setChargeGb(lineArray[52]);
                obj.setCixNo(lineArray[53]);
                obj.setBuseoNo(lineArray[54]);
                obj.setIbgmMd(lineArray[55]);
                obj.setChargeMd(lineArray[56]);
                obj.setChargeIl((lineArray[57].equals("")) ? null : formatter.parse(lineArray[57]));
                obj.setMt707Fnm1(lineArray[58]);
                obj.setPrtCnt(new BigDecimal(lineArray[59]));
                obj.setReIssue(lineArray[60]);
                obj.setMt707Fnm2(lineArray[61]);
                obj.setMt707Fnm3(lineArray[62]);
                obj.setMt707Fnm4(lineArray[63]);
                obj.setMt707Cnt(new BigDecimal(lineArray[64]));
                obj.setMt730Send(lineArray[65]);
                obj.setMt730DocId(lineArray[66]);
                obj.setFirstIl((lineArray[67].equals("")) ? null : formatter.parse(lineArray[67]));
                obj.setMt710Send(lineArray[68]);
                obj.setMt710DocId(lineArray[69]);
                obj.setChargeCcy(lineArray[70]);
                obj.setOurCustGb(lineArray[71]);
                obj.setBeneNm4(lineArray[72]);
                obj.setMt707DocId(lineArray[73]);
                obj.setRegEmpNo(lineArray[74]);
                obj.setRegDt((lineArray[75].equals("")) ? null : formatter.parse(lineArray[75]));
                obj.setRegTm(lineArray[76]);
                obj.setUpdEmpNo(lineArray[77]);
                obj.setUpdDt((lineArray[78].equals("")) ? null : formatter.parse(lineArray[78]));
                obj.setUpdTm(lineArray[79]);
                obj.setApplNm1(lineArray[80]);
                obj.setApplNm2(lineArray[81]);
                obj.setApplNm3(lineArray[82]);
                obj.setApplNm4(lineArray[83]);
                obj.setDrawBkcd(lineArray[84]);
                obj.setDrawBknm1(lineArray[85]);
                obj.setDrawBknm2(lineArray[86]);
                obj.setDrawBknm3(lineArray[87]);
                obj.setReimBkcd(lineArray[88]);
                obj.setReimBknm1(lineArray[89]);
                obj.setReimBknm2(lineArray[90]);
                obj.setReimBknm3(lineArray[91]);
                obj.setAdvThruGb(lineArray[92]);
                obj.setThruBkcd(lineArray[93]);
                obj.setThruBknm1(lineArray[94]);
                obj.setThruBknm2(lineArray[95]);
                obj.setThruBknm3(lineArray[96]);
                obj.setConfirmGb(lineArray[97]);
                obj.setCnfrFrIl((lineArray[98].equals("")) ? null : formatter.parse(lineArray[98]));
                obj.setCnfrToIl((lineArray[99].equals("")) ? null : formatter.parse(lineArray[99]));
                obj.setCnfrRt(new BigDecimal(lineArray[100]));
                obj.setCnfmBic(lineArray[101]);
                obj.setCnfmNm1(lineArray[102]);
                obj.setCnfmNm2(lineArray[103]);
                obj.setCnfmNm3(lineArray[104]);
                obj.setMt708Fnm1(lineArray[105]);
                obj.setMt708Fnm2(lineArray[106]);
                obj.setMt708Fnm3(lineArray[107]);
                obj.setMt708Fnm4(lineArray[108]);
                obj.setMt708Cnt(new BigDecimal(lineArray[109]));
                if (isExist(obj.getMakeIl(), obj.getSeqNo())) {
                    afex_adh_amendInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_ADH_AMENDInfo> objList) {
        afex_adh_amendInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date makeIl, BigDecimal seqNo) {
        return afex_adh_amendInfoRepository.existsByMakeIlAndSeqNo(makeIl, seqNo);
    }
}
