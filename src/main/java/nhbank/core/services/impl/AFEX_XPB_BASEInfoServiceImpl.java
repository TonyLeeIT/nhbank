package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.AFEX_XPB_BASEInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.AFEX_XPB_BASEInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.AFEX_XPB_BASEInfoService;
import nhbank.core.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFEX_XPB_BASEInfoServiceImpl implements AFEX_XPB_BASEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPB_BASEInfoRepository afex_xpb_baseInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPB_BASE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPB_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\AFEX_XPB_BASE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPB_BASE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPB_BASEInfo obj = new AFEX_XPB_BASEInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setIkisSts(lineArray[1]);
                    obj.setBkGb(lineArray[2]);
                    obj.setCixNo(lineArray[3]);
                    obj.setComNo(lineArray[4]);
                    obj.setBuseoNo(lineArray[5]);
                    obj.setMngInfo(lineArray[6]);
                    obj.setXpJan(new BigDecimal(lineArray[7]));
                    obj.setBudoJan(new BigDecimal(lineArray[8]));
                    obj.setMisuBjan(new BigDecimal(lineArray[9]));
                    obj.setMisuJan(new BigDecimal(lineArray[10]));
                    obj.setLessSumAmt(new BigDecimal(lineArray[11]));
                    obj.setOverSumAmt(new BigDecimal(lineArray[12]));
                    obj.setCsSumAmt(new BigDecimal(lineArray[13]));
                    obj.setJiSeq(new BigDecimal(lineArray[14]));
                    obj.setSetSeq(new BigDecimal(lineArray[15]));
                    obj.setBudoSeq(new BigDecimal(lineArray[16]));
                    obj.setNegoIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setGisIl((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setLstIl((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setLstIbIl((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setNegoCcy(lineArray[21]);
                    obj.setNegoAmt(new BigDecimal(lineArray[22]));
                    obj.setXpGb(lineArray[23]);
                    obj.setNegoGb(lineArray[24]);
                    obj.setBonjiGb(lineArray[25]);
                    obj.setTenorGb(lineArray[26]);
                    obj.setOaGb(lineArray[27]);
                    obj.setHjIlCd(lineArray[28]);
                    obj.setManGijIl((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                    obj.setHajaMngInfo(lineArray[30]);
                    obj.setHalGb(lineArray[31]);
                    obj.setComRt(new BigDecimal(lineArray[32]));
                    obj.setComAmt(new BigDecimal(lineArray[33]));
                    obj.setIntRt(new BigDecimal(lineArray[34]));
                    obj.setIntAmt(new BigDecimal(lineArray[35]));
                    obj.setHijaTerm(new BigDecimal(lineArray[36]));
                    obj.setUsanceTerm(new BigDecimal(lineArray[37]));
                    obj.setHsCd(lineArray[38]);
                    obj.setSpNm(lineArray[39]);
                    obj.setXpType(lineArray[40]);
                    obj.setSdCtry(lineArray[41]);
                    obj.setPriceCd(lineArray[42]);
                    obj.setOpenBkcd(lineArray[43]);
                    obj.setSetBkcd(lineArray[44]);
                    obj.setDepoBkcd(lineArray[45]);
                    obj.setReneBkcd(lineArray[46]);
                    obj.setJasaAmt(new BigDecimal(lineArray[47]));
                    obj.setTasaAmt(new BigDecimal(lineArray[48]));
                    obj.setTrefNo(lineArray[49]);
                    obj.setOpenBknm(lineArray[50]);
                    obj.setReDepoGb(lineArray[51]);
                    obj.setIpNm(lineArray[52]);
                    obj.setShipIl((lineArray[53].equals("")) ? null : formatter.parse(lineArray[53]));
                    obj.setInvoiceNo(lineArray[54]);
                    obj.setSingoNo(lineArray[55]);
                    obj.setReneReqGb(lineArray[56]);
                    obj.setReneGb(lineArray[57]);
                    obj.setReneAcIl((lineArray[58].equals("")) ? null : formatter.parse(lineArray[58]));
                    obj.setReneGisIl((lineArray[59].equals("")) ? null : formatter.parse(lineArray[59]));
                    obj.setReneOrefNo(lineArray[60]);
                    obj.setReneTerm(new BigDecimal(lineArray[61]));
                    obj.setR2Frt(new BigDecimal(lineArray[62]));
                    obj.setR2Fee(new BigDecimal(lineArray[63]));
                    obj.setR2IjaAmt(new BigDecimal(lineArray[64]));
                    obj.setCaCcy(lineArray[65]);
                    obj.setCaAmt(new BigDecimal(lineArray[66]));
                    obj.setInsuAmt(new BigDecimal(lineArray[67]));
                    obj.setJiAmt(new BigDecimal(lineArray[68]));
                    obj.setSetAmt(new BigDecimal(lineArray[69]));
                    obj.setHmanIl((lineArray[70].equals("")) ? null : formatter.parse(lineArray[70]));
                    obj.setYmanIl((lineArray[71].equals("")) ? null : formatter.parse(lineArray[71]));
                    obj.setYdcIl((lineArray[72].equals("")) ? null : formatter.parse(lineArray[72]));
                    obj.setBudoIl((lineArray[73].equals("")) ? null : formatter.parse(lineArray[73]));
                    obj.setBudoAmt(new BigDecimal(lineArray[74]));
                    obj.setBudoSamt(new BigDecimal(lineArray[75]));
                    obj.setMisuIl((lineArray[76].equals("")) ? null : formatter.parse(lineArray[76]));
                    obj.setObcrGb(lineArray[77]);
                    obj.setBudoLisuIl((lineArray[78].equals("")) ? null : formatter.parse(lineArray[78]));
                    obj.setLstCaIl((lineArray[79].equals("")) ? null : formatter.parse(lineArray[79]));
                    obj.setMoJubIl((lineArray[80].equals("")) ? null : formatter.parse(lineArray[80]));
                    obj.setMoBalIl((lineArray[81].equals("")) ? null : formatter.parse(lineArray[81]));
                    obj.setBalGb(lineArray[82]);
                    obj.setMiGun(new BigDecimal(lineArray[83]));
                    obj.setMiplGun(new BigDecimal(lineArray[84]));
                    obj.setHdSngNo(lineArray[85]);
                    obj.setIjaLisuIl((lineArray[86].equals("")) ? null : formatter.parse(lineArray[86]));
                    obj.setLstIjaHrt(new BigDecimal(lineArray[87]));
                    obj.setLstIjaHRt(new BigDecimal(lineArray[88]));
                    obj.setGaWijaGb(lineArray[89]);
                    obj.setIjaMjGb1(lineArray[90]);
                    obj.setIjaMjGb2(lineArray[91]);
                    obj.setIjaHcGb(lineArray[92]);
                    obj.setBdIjaGb(lineArray[93]);
                    obj.setFtpRtGb(lineArray[94]);
                    obj.setFtpRt(new BigDecimal(lineArray[95]));
                    obj.setIkisHisNo(new BigDecimal(lineArray[96]));
                    obj.setIkisIjAmt(new BigDecimal(lineArray[97]));
                    obj.setOpNo(lineArray[98]);
                    obj.setOwnerNo(lineArray[99]);
                    obj.setPbrmNo(lineArray[100]);
                    obj.setTurnIl((lineArray[101].equals("")) ? null : formatter.parse(lineArray[101]));
                    obj.setAaTraCnt(new BigDecimal(lineArray[102]));
                    obj.setCaTraCnt(new BigDecimal(lineArray[103]));
                    obj.setDlTraCnt(new BigDecimal(lineArray[104]));
                    obj.setCoverGb(lineArray[105]);
                    obj.setLstIsuIl((lineArray[106].equals("")) ? null : formatter.parse(lineArray[106]));
                    obj.setBdDelayIl((lineArray[107].equals("")) ? null : formatter.parse(lineArray[107]));
                    obj.setGyom(lineArray[108]);
                    obj.setReimGb(lineArray[109]);
                    obj.setReimBkcd(lineArray[110]);
                    obj.setChgNegoYn(lineArray[111]);
                    obj.setMngInfo2(lineArray[112]);
                    obj.setComId(lineArray[113]);
                    obj.setTsLcYn(lineArray[114]);
                    obj.setTsAdvNo(lineArray[115]);
                    obj.setTsSeqNo(new BigDecimal(lineArray[116]));
                    obj.setTsNegoAmt(new BigDecimal(lineArray[117]));
                    obj.setRaRefNo(lineArray[118]);
                    obj.setRaClmCnt(new BigDecimal(lineArray[119]));
                    obj.setIbfGb(lineArray[120]);
                    obj.setWhanRcvGb(lineArray[121]);
                    obj.setRptAmt1(new BigDecimal(lineArray[122]));
                    obj.setRptAmt2(new BigDecimal(lineArray[123]));
                    obj.setRptAmt3(new BigDecimal(lineArray[124]));
                    obj.setRptAmt4(new BigDecimal(lineArray[125]));
                    obj.setRptAmt5(new BigDecimal(lineArray[126]));
                    obj.setRptAcct1(lineArray[127]);
                    obj.setBoseGb(lineArray[128]);
                    obj.setPayableAmt(new BigDecimal(lineArray[129]));
                    obj.setActpayRefNo1(lineArray[130]);
                    obj.setSuspayRefNo1(lineArray[131]);
                    obj.setSuspayRefNo2(lineArray[132]);
                    obj.setRegEmpNo(lineArray[133]);
                    obj.setRegDt((lineArray[134].equals("")) ? null : formatter.parse(lineArray[134]));
                    obj.setRegTm(lineArray[135]);
                    obj.setUpdEmpNo(lineArray[136]);
                    obj.setUpdDt((lineArray[137].equals("")) ? null : formatter.parse(lineArray[137]));
                    obj.setUpdTm(lineArray[138]);
                    if (isExist(obj.getRefNo())) {
                        afex_xpb_baseInfoRepository.save(obj);
                    } else {
                        objList.add(obj);
                    }
                }
                br.close();
                if (!objList.isEmpty())
                    insertAll(objList);
                checkUpdate.setStatus("Done");
                checkUpdateRepository.save(checkUpdate);
                FileUtils.deleteFile(file);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            checkUpdate.setStatus("File format error");
            checkUpdateRepository.save(checkUpdate);
            assert br != null;
            br.close();
        }
    }

    @Override
    public void insertAll(List<AFEX_XPB_BASEInfo> objList) {
        afex_xpb_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afex_xpb_baseInfoRepository.existsByRefNo(refNo);
    }
}
