package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.ACOM_DMH_BASEInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.ACOM_DMH_BASEInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.ACOM_DMH_BASEInfoService;
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
public class ACOM_DMH_BASEInfoServiceImpl implements ACOM_DMH_BASEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_DMH_BASEInfoRepository acom_dmh_baseInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_DMH_BASE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_DMH_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\ACOM_DMH_BASE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_DMH_BASE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_DMH_BASEInfo obj = new ACOM_DMH_BASEInfo();
                    obj.setCixNo(lineArray[0]);
                    obj.setDamboNo(lineArray[1]);
                    obj.setSts(lineArray[2]);
                    obj.setSystemGb(lineArray[3]);
                    obj.setSeqNo(new BigDecimal(lineArray[4]));
                    obj.setDamboCd(lineArray[5]);
                    obj.setDamboType(lineArray[6]);
                    obj.setDamboExpDate((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setCcy(lineArray[8]);
                    obj.setFamt(new BigDecimal(lineArray[9]));
                    obj.setObankFixAmt(new BigDecimal(lineArray[10]));
                    obj.setFirstFixAmt(new BigDecimal(lineArray[11]));
                    obj.setDamboAddr(lineArray[12]);
                    obj.setDamboCity(lineArray[13]);
                    obj.setAppLandValue(new BigDecimal(lineArray[14]));
                    obj.setOfferGb(lineArray[15]);
                    obj.setGrtIdNo(lineArray[16]);
                    obj.setGrtPortion(new BigDecimal(lineArray[17]));
                    obj.setAcctNo(lineArray[18]);
                    obj.setIssueNm(lineArray[19]);
                    obj.setDamboCntGb(lineArray[20]);
                    obj.setDamboGurYn(lineArray[21]);
                    obj.setAppraiserType(lineArray[22]);
                    obj.setAppAppraiser(lineArray[23]);
                    obj.setFstAppValue(new BigDecimal(lineArray[24]));
                    obj.setFstAppDate((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                    obj.setReAppDate((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                    obj.setReAppValue(new BigDecimal(lineArray[27]));
                    obj.setJudicialScrivener(lineArray[28]);
                    obj.setFixSts(lineArray[29]);
                    obj.setCertType(lineArray[30]);
                    obj.setCertSts(lineArray[31]);
                    obj.setCertNo(lineArray[32]);
                    obj.setInsurCode(lineArray[33]);
                    obj.setInsurPolicyNo(lineArray[34]);
                    obj.setInsurCompany(lineArray[35]);
                    obj.setInsurExpDate((lineArray[36].equals("")) ? null : formatter.parse(lineArray[36]));
                    obj.setInsurAmt(new BigDecimal(lineArray[37]));
                    obj.setInsurRemark(lineArray[38]);
                    obj.setToMortgage(lineArray[39]);
                    obj.setCollOwnerName(lineArray[40]);
                    obj.setInsurObjAddr(lineArray[41]);
                    obj.setAllocRatio(new BigDecimal(lineArray[42]));
                    obj.setAllocAmt(new BigDecimal(lineArray[43]));
                    obj.setMngBr(lineArray[44]);
                    obj.setLstHisNo(new BigDecimal(lineArray[45]));
                    obj.setAcIl((lineArray[46].equals("")) ? null : formatter.parse(lineArray[46]));
                    obj.setLstAcIl((lineArray[47].equals("")) ? null : formatter.parse(lineArray[47]));
                    obj.setOpNo(lineArray[48]);
                    obj.setDepositCd(lineArray[49]);
                    obj.setStCoGb(lineArray[50]);
                    obj.setStCoName(lineArray[51]);
                    obj.setFilingDate((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
                    obj.setFilingNum(lineArray[53]);
                    obj.setExpireDate((lineArray[54].equals("")) ? null : formatter.parse(lineArray[54]));
                    obj.setPriority(new BigDecimal(lineArray[55]));
                    obj.setStsExpDate((lineArray[56].equals("")) ? null : formatter.parse(lineArray[56]));
                    obj.setAppGap(new BigDecimal(lineArray[57]));
                    obj.setFamtInt(new BigDecimal(lineArray[58]));
                    obj.setFirstFixAmtInt(new BigDecimal(lineArray[59]));
                    obj.setFstAppValueInt(new BigDecimal(lineArray[60]));
                    obj.setFstAppDateInt((lineArray[61].equals("")) ? null : formatter.parse(lineArray[61]));
                    obj.setFamtExt(new BigDecimal(lineArray[62]));
                    obj.setFirstFixAmtExt(new BigDecimal(lineArray[63]));
                    obj.setFstAppValueExt(new BigDecimal(lineArray[64]));
                    obj.setFstAppDateExt((lineArray[65].equals("")) ? null : formatter.parse(lineArray[65]));
                    obj.setRegEmpNo(lineArray[66]);
                    obj.setRegDt((lineArray[67].equals("")) ? null : formatter.parse(lineArray[67]));
                    obj.setRegTm(lineArray[68]);
                    obj.setUpdEmpNo(lineArray[69]);
                    obj.setUpdDt((lineArray[70].equals("")) ? null : formatter.parse(lineArray[70]));
                    obj.setUpdTm(lineArray[71]);
                    if (isExist(obj.getCixNo(), obj.getDamboNo(), obj.getSts())) {
                        acom_dmh_baseInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_DMH_BASEInfo> objList) {
        acom_dmh_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cixNo, String damboNo, String sts) {
        return acom_dmh_baseInfoRepository.existsByCixNoAndDamboNoAndSts(cixNo, damboNo, sts);
    }
}
