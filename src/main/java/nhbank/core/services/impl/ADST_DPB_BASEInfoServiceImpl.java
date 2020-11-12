package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ADST_DPB_BASEInfo;
import nhbank.core.repositories.ADST_DPB_BASEInfoRepository;
import nhbank.core.services.ADST_DPB_BASEInfoService;
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
public class ADST_DPB_BASEInfoServiceImpl implements ADST_DPB_BASEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_DPB_BASEInfoRepository adst_dpb_baseInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_DPB_BASE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_DPB_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ADST_DPB_BASE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_BASE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_DPB_BASEInfo obj = new ADST_DPB_BASEInfo();
                    obj.setAcctNo(lineArray[0]);
                    obj.setBaseCcy(lineArray[1]);
                    obj.setAcctCcy(lineArray[2]);
                    obj.setDptBbsCd(lineArray[3]);
                    obj.setDptBsCd(lineArray[4]);
                    obj.setDptPlCd(lineArray[5]);
                    obj.setIntPayGb(lineArray[6]);
                    obj.setDptTypeGb(lineArray[7]);
                    obj.setIntTermGb(new BigDecimal(lineArray[8]));
                    obj.setIntCalGb(lineArray[9]);
                    obj.setIntCalMethCd(lineArray[10]);
                    obj.setDaysCalcMethCd(lineArray[11]);
                    obj.setOpnIl((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                    obj.setJagumIl((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                    obj.setDptIntCalIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setJanCertiIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                    obj.setIsIl((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                    obj.setYsdIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setCcNgIl((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setDptManIl((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setRollOverIl((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setPwd(lineArray[21]);
                    obj.setEmpPayAcctPwd(lineArray[22]);
                    obj.setBsJan(new BigDecimal(lineArray[23]));
                    obj.setCurJan(new BigDecimal(lineArray[24]));
                    obj.setCollatAmt(new BigDecimal(lineArray[25]));
                    obj.setOpenAmt(new BigDecimal(lineArray[26]));
                    obj.setClsAmt(new BigDecimal(lineArray[27]));
                    obj.setStopAmt(new BigDecimal(lineArray[28]));
                    obj.setLmtBlkAmt(new BigDecimal(lineArray[29]));
                    obj.setMTerm(new BigDecimal(lineArray[30]));
                    obj.setDTerm(new BigDecimal(lineArray[31]));
                    obj.setIntPayCnt(new BigDecimal(lineArray[32]));
                    obj.setDptBasicRt(new BigDecimal(lineArray[33]));
                    obj.setDptNegoRt(new BigDecimal(lineArray[34]));
                    obj.setTaxCd(lineArray[35]);
                    obj.setTaxRt(new BigDecimal(lineArray[36]));
                    obj.setFtpRtGb(lineArray[37]);
                    obj.setFtpRt(new BigDecimal(lineArray[38]));
                    obj.setLstTrxNo(new BigDecimal(lineArray[39]));
                    obj.setLstDrTrxNo(new BigDecimal(lineArray[40]));
                    obj.setClsCnt(new BigDecimal(lineArray[41]));
                    obj.setLonBbsCd(lineArray[42]);
                    obj.setLonBsCd(lineArray[43]);
                    obj.setLonPlCd(lineArray[44]);
                    obj.setFstJan(new BigDecimal(lineArray[45]));
                    obj.setMaxJan(new BigDecimal(lineArray[46]));
                    obj.setLonSngAmt(new BigDecimal(lineArray[47]));
                    obj.setColLonInt(new BigDecimal(lineArray[48]));
                    obj.setLonPrcpYcInt(new BigDecimal(lineArray[49]));
                    obj.setLonIntYcInt(new BigDecimal(lineArray[50]));
                    obj.setLonYdCd(lineArray[51]);
                    obj.setLonRtCd(lineArray[52]);
                    obj.setLonRt(new BigDecimal(lineArray[53]));
                    obj.setPrcpOverDueIntRt(new BigDecimal(lineArray[54]));
                    obj.setIntOverDueIntRt(new BigDecimal(lineArray[55]));
                    obj.setLonIntCalIl((lineArray[56].equals("")) ? null : formatter.parse(lineArray[56]));
                    obj.setLonIntRcvIl((lineArray[57].equals("")) ? null : formatter.parse(lineArray[57]));
                    obj.setLonManIl((lineArray[58].equals("")) ? null : formatter.parse(lineArray[58]));
                    obj.setLonTermIl((lineArray[59].equals("")) ? null : formatter.parse(lineArray[59]));
                    obj.setLonFstYcIl((lineArray[60].equals("")) ? null : formatter.parse(lineArray[60]));
                    obj.setLstIbIl((lineArray[61].equals("")) ? null : formatter.parse(lineArray[61]));
                    obj.setLstTime(lineArray[62]);
                    obj.setSelfMngIl((lineArray[63].equals("")) ? null : formatter.parse(lineArray[63]));
                    obj.setOpenExptAmt(new BigDecimal(lineArray[64]));
                    obj.setDueAmt(new BigDecimal(lineArray[65]));
                    obj.setDepCnt(new BigDecimal(lineArray[66]));
                    obj.setPrepayDay(new BigDecimal(lineArray[67]));
                    obj.setNoticeIl((lineArray[68].equals("")) ? null : formatter.parse(lineArray[68]));
                    obj.setAcctType(lineArray[69]);
                    obj.setReserved1(lineArray[70]);
                    obj.setIntRtDv(lineArray[71]);
                    obj.setBfTmInt(new BigDecimal(lineArray[72]));
                    obj.setBfTmTax(new BigDecimal(lineArray[73]));
                    obj.setAmt1(new BigDecimal(lineArray[74]));
                    obj.setAmt2(new BigDecimal(lineArray[75]));
                    obj.setAmt3(new BigDecimal(lineArray[76]));
                    obj.setAmt4(new BigDecimal(lineArray[77]));
                    obj.setAmt5(new BigDecimal(lineArray[78]));
                    obj.setAmt6(new BigDecimal(lineArray[79]));
                    obj.setAmt7(new BigDecimal(lineArray[80]));
                    obj.setAmt8(new BigDecimal(lineArray[81]));
                    obj.setAmt9(new BigDecimal(lineArray[82]));
                    obj.setAmt10(new BigDecimal(lineArray[83]));
                    obj.setCd1(lineArray[84]);
                    obj.setCd2(lineArray[85]);
                    obj.setCd3(lineArray[86]);
                    obj.setCd4(lineArray[87]);
                    obj.setCd5(lineArray[88]);
                    obj.setCd6(lineArray[89]);
                    obj.setCd7(lineArray[90]);
                    obj.setCd8(lineArray[91]);
                    obj.setCd9(lineArray[92]);
                    obj.setCd10(lineArray[93]);
                    obj.setRt1(new BigDecimal(lineArray[94]));
                    obj.setRt2(new BigDecimal(lineArray[95]));
                    obj.setRt3(new BigDecimal(lineArray[96]));
                    obj.setRt4(new BigDecimal(lineArray[97]));
                    obj.setRt5(new BigDecimal(lineArray[98]));
                    obj.setDt1((lineArray[99].equals("")) ? null : formatter.parse(lineArray[99]));
                    obj.setDt2((lineArray[100].equals("")) ? null : formatter.parse(lineArray[100]));
                    obj.setDt3((lineArray[101].equals("")) ? null : formatter.parse(lineArray[101]));
                    obj.setDt4((lineArray[102].equals("")) ? null : formatter.parse(lineArray[102]));
                    obj.setDt5((lineArray[103].equals("")) ? null : formatter.parse(lineArray[103]));
                    obj.setRegEmpNo(lineArray[104]);
                    obj.setRegDt((lineArray[105].equals("")) ? null : formatter.parse(lineArray[105]));
                    obj.setRegTm(lineArray[106]);
                    obj.setUpdEmpNo(lineArray[107]);
                    obj.setUpdDt((lineArray[108].equals("")) ? null : formatter.parse(lineArray[108]));
                    obj.setUpdTm(lineArray[109]);
                    obj.setRandSalt(lineArray[110]);
                    if (isExist(obj.getAcctNo())) {
                        adst_dpb_baseInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_BASEInfo> objList) {
        adst_dpb_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo) {
        return adst_dpb_baseInfoRepository.existsByAcctNo(acctNo);
    }
}
