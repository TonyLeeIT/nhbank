package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_ROH_BASEInfo;
import nhbank.core.repositories.AFEX_ROH_BASEInfoRepository;
import nhbank.core.services.AFEX_ROH_BASEInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nhbank.core.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_ROH_BASEInfoServiceImpl implements AFEX_ROH_BASEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_ROH_BASEInfoRepository afex_roh_baseInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_ROH_BASE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_ROH_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_ROH_BASE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_ROH_BASE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_ROH_BASEInfo obj = new AFEX_ROH_BASEInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setCixNo(lineArray[1]);
                    obj.setBkGb(lineArray[2]);
                    obj.setMngInfo(lineArray[3]);
                    obj.setUpmuGb(lineArray[4]);
                    obj.setAcIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setGisIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setLstIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setLstIbIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setIbjiMd(lineArray[9]);
                    obj.setSetIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setSetGisIl((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setRtCd(lineArray[12]);
                    obj.setTsCd(lineArray[13]);
                    obj.setCcy(lineArray[14]);
                    obj.setFamt(new BigDecimal(lineArray[15]));
                    obj.setDdType(lineArray[16]);
                    obj.setDdNo(lineArray[17]);
                    obj.setSdCtry(lineArray[18]);
                    obj.setJucheCd(lineArray[19]);
                    obj.setGeojuGb(lineArray[20]);
                    obj.setSayuCd(lineArray[21]);
                    obj.setJunGb(lineArray[22]);
                    obj.setJunNo1(lineArray[23]);
                    obj.setApplIdNo(lineArray[24]);
                    obj.setApplIdNoGb(lineArray[25]);
                    obj.setApplNation(lineArray[26]);
                    obj.setApplPostNo(lineArray[27]);
                    obj.setVipCd(lineArray[28]);
                    obj.setSjGb(lineArray[29]);
                    obj.setRcvIdNo(lineArray[30]);
                    obj.setRcvIdNoGb(lineArray[31]);
                    obj.setSetBkcd(lineArray[32]);
                    obj.setSetBknm(lineArray[33]);
                    obj.setRemitDepo(lineArray[34]);
                    obj.setYdaeIl((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                    obj.setJijungCd(lineArray[36]);
                    obj.setIdNo(lineArray[37]);
                    obj.setIdNoGb(lineArray[38]);
                    obj.setJigbNo(lineArray[39]);
                    obj.setJigbSeq(new BigDecimal(lineArray[40]));
                    obj.setChAmt(new BigDecimal(lineArray[41]));
                    obj.setChGb(lineArray[42]);
                    obj.setJunNo2(lineArray[43]);
                    obj.setMjGb(lineArray[44]);
                    obj.setCdSngNo(lineArray[45]);
                    obj.setCdSilSeq(new BigDecimal(lineArray[46]));
                    obj.setOpNo(lineArray[47]);
                    obj.setOwnerNo(lineArray[48]);
                    obj.setPbrmNo(lineArray[49]);
                    obj.setSdTrIl((lineArray[50].equals("")) ? null : formatter.parse(lineArray[50]));
                    obj.setJiOkNo(lineArray[51]);
                    obj.setMileage(new BigDecimal(lineArray[52]));
                    obj.setPhIdNo(lineArray[53]);
                    obj.setPhSeqNo(new BigDecimal(lineArray[54]));
                    obj.setYdGuja(lineArray[55]);
                    obj.setCanGb(lineArray[56]);
                    obj.setDebitVdate((lineArray[57].equals("")) ? null : formatter.parse(lineArray[57]));
                    obj.setDebitCur(lineArray[58]);
                    obj.setDebitAmt(new BigDecimal(lineArray[59]));
                    obj.setStateMsg(lineArray[60]);
                    obj.setEmailNm(lineArray[61]);
                    obj.setMakeIl((lineArray[62].equals("")) ? null : formatter.parse(lineArray[62]));
                    obj.setMttypeCode(lineArray[63]);
                    obj.setOutMsg(lineArray[64]);
                    obj.setMoneyMsg(lineArray[65]);
                    obj.setValueDate((lineArray[66].equals("")) ? null : formatter.parse(lineArray[66]));
                    obj.setRcvBic(lineArray[67]);
                    obj.setRcvName1(lineArray[68]);
                    obj.setRcvName2(lineArray[69]);
                    obj.setRcvName3(lineArray[70]);
                    obj.setApplNm1(lineArray[71]);
                    obj.setApplNm2(lineArray[72]);
                    obj.setApplAddr1(lineArray[73]);
                    obj.setApplAddr2(lineArray[74]);
                    obj.setApplAddr3(lineArray[75]);
                    obj.setRcvNm1(lineArray[76]);
                    obj.setRcvNm2(lineArray[77]);
                    obj.setRcvAddr1(lineArray[78]);
                    obj.setRcvAddr2(lineArray[79]);
                    obj.setRcvAddr3(lineArray[80]);
                    obj.setRcvAcctNo(lineArray[81]);
                    obj.setRcvBkcd(lineArray[82]);
                    obj.setRcvBkAcno(lineArray[83]);
                    obj.setRcvBknm1(lineArray[84]);
                    obj.setRcvBknm2(lineArray[85]);
                    obj.setRcvBkAddr1(lineArray[86]);
                    obj.setRcvBkAddr2(lineArray[87]);
                    obj.setRcvBkAddr3(lineArray[88]);
                    obj.setInterBic(lineArray[89]);
                    obj.setInterName1(lineArray[90]);
                    obj.setInterName2(lineArray[91]);
                    obj.setInterName3(lineArray[92]);
                    obj.setInfoName1(lineArray[93]);
                    obj.setInfoName2(lineArray[94]);
                    obj.setInfoName3(lineArray[95]);
                    obj.setInfoName4(lineArray[96]);
                    obj.setInfo72Name1(lineArray[97]);
                    obj.setInfo72Name2(lineArray[98]);
                    obj.setInfo72Name3(lineArray[99]);
                    obj.setInfo72Name4(lineArray[100]);
                    obj.setInfo72Name5(lineArray[101]);
                    obj.setInfo72Name6(lineArray[102]);
                    obj.setCableChg(new BigDecimal(lineArray[103]));
                    obj.setLiftChg(new BigDecimal(lineArray[104]));
                    obj.setCashChg(new BigDecimal(lineArray[105]));
                    obj.setExchChg(new BigDecimal(lineArray[106]));
                    obj.setPayComm(new BigDecimal(lineArray[107]));
                    obj.setBoseGb(lineArray[108]);
                    obj.setPaidOption(lineArray[109]);
                    obj.setInstructCcy(lineArray[110]);
                    obj.setInstructAmt(new BigDecimal(lineArray[111]));
                    obj.setExRate(new BigDecimal(lineArray[112]));
                    obj.setBopSeqNo(lineArray[113]);
                    obj.setBopTrxCode(lineArray[114]);
                    obj.setBopTrxRemark(lineArray[115]);
                    obj.setTradeGb(lineArray[116]);
                    obj.setSubDpNo(lineArray[117]);
                    obj.setCvtCcy(lineArray[118]);
                    obj.setCvtAmt(new BigDecimal(lineArray[119]));
                    obj.setCvtExrate(new BigDecimal(lineArray[120]));
                    obj.setFxCcy(lineArray[121]);
                    obj.setFxAmt(new BigDecimal(lineArray[122]));
                    obj.setFxExrate(new BigDecimal(lineArray[123]));
                    obj.setRegEmpNo(lineArray[124]);
                    obj.setRegDt((lineArray[125].equals("")) ? null : formatter.parse(lineArray[125]));
                    obj.setRegTm(lineArray[126]);
                    obj.setUpdEmpNo(lineArray[127]);
                    obj.setUpdDt((lineArray[128].equals("")) ? null : formatter.parse(lineArray[128]));
                    obj.setUpdTm(lineArray[129]);
                    if (isExist(obj.getRefNo())) {
                        afex_roh_baseInfoRepository.save(obj);
                    } else {
                        objList.add(obj);
                    }
                }
                br.close();
                if (!objList.isEmpty())
                    insertAll(objList);
                checkUpdate.setStatus("Done");
                checkUpdateRepository.save(checkUpdate);
                FileUtils.moveFile(dataPath, uploadPath, file.getName());
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
    public void insertAll(List<AFEX_ROH_BASEInfo> objList) {
        afex_roh_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afex_roh_baseInfoRepository.existsByRefNo(refNo);
    }
}
