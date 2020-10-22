package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_ADH_BASEInfo;
import nhbank.core.repositories.AFEX_ADH_BASEInfoRepository;
import nhbank.core.services.AFEX_ADH_BASEInfoService;
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
public class AFEX_ADH_BASEInfoServiceImpl implements AFEX_ADH_BASEInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_ADH_BASEInfoRepository afex_adh_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_ADH_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\AFEX_ADH_BASE.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\AFEX_ADH_BASE.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_ADH_BASEInfo obj = new AFEX_ADH_BASEInfo();
                obj.setMakeIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                obj.setSeqNo(new BigDecimal(lineArray[1]));
                obj.setAdvNo(lineArray[2]);
                obj.setSendGb(lineArray[3]);
                obj.setMsgGb(lineArray[4]);
                obj.setLcNo(lineArray[5]);
                obj.setOpenIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setOpenBkcd(lineArray[7]);
                obj.setOpenBknm1(lineArray[8]);
                obj.setOpenBknm2(lineArray[9]);
                obj.setOpenBknm3(lineArray[10]);
                obj.setCtryCd(lineArray[11]);
                obj.setCtryNm(lineArray[12]);
                obj.setBeneCd(lineArray[13]);
                obj.setBeneNm1(lineArray[14]);
                obj.setBeneNm2(lineArray[15]);
                obj.setBeneNm3(lineArray[16]);
                obj.setOpenCcy(lineArray[17]);
                obj.setOpenAmt(new BigDecimal(lineArray[18]));
                obj.setBalAmt(new BigDecimal(lineArray[19]));
                obj.setExpIl((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                obj.setShipIl((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                obj.setSightGb(lineArray[22]);
                obj.setHsCd(lineArray[23]);
                obj.setHsNm(lineArray[24]);
                obj.setAuthGb(lineArray[25]);
                obj.setApplNm1(lineArray[26]);
                obj.setApplNm2(lineArray[27]);
                obj.setApplNm3(lineArray[28]);
                obj.setTrailer(lineArray[29]);
                obj.setMsgType(lineArray[30]);
                obj.setNorUrg(lineArray[31]);
                obj.setSwiftMrn(lineArray[32]);
                obj.setTranInput(lineArray[33]);
                obj.setTotSeq(new BigDecimal(lineArray[34]));
                obj.setMngNo(lineArray[35]);
                obj.setOpNo(lineArray[36]);
                obj.setLstIl((lineArray[37].equals("")) ? null : formatter.parse(lineArray[37]));
                obj.setMt700Fnm(lineArray[38]);
                obj.setMt701Cnt(new BigDecimal(lineArray[39]));
                obj.setMt701Fnm1(lineArray[40]);
                obj.setMt701Fnm2(lineArray[41]);
                obj.setMt701Fnm3(lineArray[42]);
                obj.setMt701Fnm4(lineArray[43]);
                obj.setAmdCnt(new BigDecimal(lineArray[44]));
                obj.setGyobuGb(lineArray[45]);
                obj.setGyobuIl((lineArray[46].equals("")) ? null : formatter.parse(lineArray[46]));
                obj.setEdiGb(lineArray[47]);
                obj.setRelay(lineArray[48]);
                obj.setLstTime(lineArray[49]);
                obj.setLocalCd(lineArray[50]);
                obj.setFaxGb(lineArray[51]);
                obj.setTxKey(lineArray[52]);
                obj.setFaxNo(lineArray[53]);
                obj.setFirstGb(lineArray[54]);
                obj.setBrCharge(new BigDecimal(lineArray[55]));
                obj.setChargeAmt(new BigDecimal(lineArray[56]));
                obj.setChargeGb(lineArray[57]);
                obj.setEdiId(lineArray[58]);
                obj.setCondSts(lineArray[59]);
                obj.setBrNo(lineArray[60]);
                obj.setBrNm(lineArray[61]);
                obj.setMt730Send(lineArray[62]);
                obj.setEdiChuri(lineArray[63]);
                obj.setEdiSend(lineArray[64]);
                obj.setEdiSuin(lineArray[65]);
                obj.setBokSend(lineArray[66]);
                obj.setPriceCond(lineArray[67]);
                obj.setUsanceDay(lineArray[68]);
                obj.setHsReal(lineArray[69]);
                obj.setTongPrint(lineArray[70]);
                obj.setCixNo(lineArray[71]);
                obj.setBuseoNo(lineArray[72]);
                obj.setIbgmMd(lineArray[73]);
                obj.setChargeMd(lineArray[74]);
                obj.setChargeIl((lineArray[75].equals("")) ? null : formatter.parse(lineArray[75]));
                obj.setPrtCnt(new BigDecimal(lineArray[76]));
                obj.setReIssue(lineArray[77]);
                obj.setConfirmGb(lineArray[78]);
                obj.setTranIl((lineArray[79].equals("")) ? null : formatter.parse(lineArray[79]));
                obj.setFirstIl((lineArray[80].equals("")) ? null : formatter.parse(lineArray[80]));
                obj.setMt730DocId(lineArray[81]);
                obj.setMt710Send(lineArray[82]);
                obj.setMt710DocId(lineArray[83]);
                obj.setChargeCcy(lineArray[84]);
                obj.setDrawBkcd(lineArray[85]);
                obj.setDrawBknm1(lineArray[86]);
                obj.setDrawBknm2(lineArray[87]);
                obj.setDrawBknm3(lineArray[88]);
                obj.setReimBkcd(lineArray[89]);
                obj.setReimBknm1(lineArray[90]);
                obj.setReimBknm2(lineArray[91]);
                obj.setReimBknm3(lineArray[92]);
                obj.setThruBkcd(lineArray[93]);
                obj.setThruBknm1(lineArray[94]);
                obj.setThruBknm2(lineArray[95]);
                obj.setThruBknm3(lineArray[96]);
                obj.setOurCustGb(lineArray[97]);
                obj.setAdvThruGb(lineArray[98]);
                obj.setBeneNm4(lineArray[99]);
                obj.setApplNm4(lineArray[100]);
                obj.setTolMore(new BigDecimal(lineArray[101]));
                obj.setTolLess(new BigDecimal(lineArray[102]));
                obj.setSkbdnYn(lineArray[103]);
                obj.setRegEmpNo(lineArray[104]);
                obj.setRegDt((lineArray[105].equals("")) ? null : formatter.parse(lineArray[105]));
                obj.setRegTm(lineArray[106]);
                obj.setUpdEmpNo(lineArray[107]);
                obj.setUpdDt((lineArray[108].equals("")) ? null : formatter.parse(lineArray[108]));
                obj.setUpdTm(lineArray[109]);
                obj.setCnfrFrIl((lineArray[110].equals("")) ? null : formatter.parse(lineArray[110]));
                obj.setCnfrToIl((lineArray[111].equals("")) ? null : formatter.parse(lineArray[111]));
                obj.setCnfrRt(new BigDecimal(lineArray[112]));
                obj.setLstExpIl((lineArray[113].equals("")) ? null : formatter.parse(lineArray[113]));
                obj.setCnfmBic(lineArray[114]);
                obj.setCnfmNm1(lineArray[115]);
                obj.setCnfmNm2(lineArray[116]);
                obj.setCnfmNm3(lineArray[117]);
                if (isExist(obj.getMakeIl(), obj.getSeqNo())) {
                    afex_adh_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_ADH_BASEInfo> objList) {
        afex_adh_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date makeIl, BigDecimal seqNo) {
        return afex_adh_baseInfoRepository.existsByMakeIlAndSeqNo(makeIl, seqNo);
    }
}
