package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_DMH_HISInfo;
import nhbank.core.repositories.ACOM_DMH_HISInfoRepository;
import nhbank.core.services.ACOM_DMH_HISInfoService;
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
public class ACOM_DMH_HISInfoServiceImpl implements ACOM_DMH_HISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_DMH_HISInfoRepository acom_dmh_hisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_DMH_HIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_DMH_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_DMH_HIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_DMH_HIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_DMH_HISInfo obj = new ACOM_DMH_HISInfo();
                    obj.setCixNo(lineArray[0]);
                    obj.setDamboNo(lineArray[1]);
                    obj.setHisNo(new BigDecimal(lineArray[2]));
                    obj.setSts(lineArray[3]);
                    obj.setTrGb(lineArray[4]);
                    obj.setTrCd(lineArray[5]);
                    obj.setMngBr(lineArray[6]);
                    obj.setOpNo(lineArray[7]);
                    obj.setIbIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setAcIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                    obj.setCanIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setDamboCd(lineArray[11]);
                    obj.setDamboType(lineArray[12]);
                    obj.setDamboExpDate((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                    obj.setCcy(lineArray[14]);
                    obj.setFamt(new BigDecimal(lineArray[15]));
                    obj.setObankFixAmt(new BigDecimal(lineArray[16]));
                    obj.setFirstFixAmt(new BigDecimal(lineArray[17]));
                    obj.setDamboAddr(lineArray[18]);
                    obj.setDamboCity(lineArray[19]);
                    obj.setAppLandValue(new BigDecimal(lineArray[20]));
                    obj.setOfferGb(lineArray[21]);
                    obj.setGrtIdNo(lineArray[22]);
                    obj.setGrtPortion(new BigDecimal(lineArray[23]));
                    obj.setAcctNo(lineArray[24]);
                    obj.setIssueNm(lineArray[25]);
                    obj.setDamboCntGb(lineArray[26]);
                    obj.setDamboGurYn(lineArray[27]);
                    obj.setAppraiserType(lineArray[28]);
                    obj.setAppAppraiser(lineArray[29]);
                    obj.setFstAppValue(new BigDecimal(lineArray[30]));
                    obj.setFstAppDate((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                    obj.setReAppDate((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                    obj.setReAppValue(new BigDecimal(lineArray[33]));
                    obj.setJudicialScrivener(lineArray[34]);
                    obj.setFixSts(lineArray[35]);
                    obj.setCertType(lineArray[36]);
                    obj.setCertSts(lineArray[37]);
                    obj.setCertNo(lineArray[38]);
                    obj.setInsurCode(lineArray[39]);
                    obj.setInsurPolicyNo(lineArray[40]);
                    obj.setInsurCompany(lineArray[41]);
                    obj.setInsurExpDate((lineArray[42].equals("")) ? null : formatter.parse(lineArray[42]));
                    obj.setInsurAmt(new BigDecimal(lineArray[43]));
                    obj.setInsurRemark(lineArray[44]);
                    obj.setToMortgage(lineArray[45]);
                    obj.setCollOwnerName(lineArray[46]);
                    obj.setInsurObjAddr(lineArray[47]);
                    obj.setAllocRatio(new BigDecimal(lineArray[48]));
                    obj.setAllocAmt(new BigDecimal(lineArray[49]));
                    obj.setDepositCd(lineArray[50]);
                    obj.setStCoGb(lineArray[51]);
                    obj.setStCoName(lineArray[52]);
                    obj.setFilingDate((lineArray[53].equals("")) ? null : formatter.parse(lineArray[53]));
                    obj.setFilingNum(lineArray[54]);
                    obj.setExpireDate((lineArray[55].equals("")) ? null : formatter.parse(lineArray[55]));
                    obj.setPriority(new BigDecimal(lineArray[56]));
                    obj.setStsExpDate((lineArray[57].equals("")) ? null : formatter.parse(lineArray[57]));
                    obj.setAppGap(new BigDecimal(lineArray[58]));
                    obj.setFamtInt(new BigDecimal(lineArray[59]));
                    obj.setFirstFixAmtInt(new BigDecimal(lineArray[60]));
                    obj.setFstAppValueInt(new BigDecimal(lineArray[61]));
                    obj.setFstAppDateInt((lineArray[62].equals("")) ? null : formatter.parse(lineArray[62]));
                    obj.setFamtExt(new BigDecimal(lineArray[63]));
                    obj.setFirstFixAmtExt(new BigDecimal(lineArray[64]));
                    obj.setFstAppValueExt(new BigDecimal(lineArray[65]));
                    obj.setFstAppDateExt((lineArray[66].equals("")) ? null : formatter.parse(lineArray[66]));
                    obj.setRegEmpNo(lineArray[67]);
                    obj.setRegDt((lineArray[68].equals("")) ? null : formatter.parse(lineArray[68]));
                    obj.setRegTm(lineArray[69]);
                    obj.setUpdEmpNo(lineArray[70]);
                    obj.setUpdDt((lineArray[71].equals("")) ? null : formatter.parse(lineArray[71]));
                    obj.setUpdTm(lineArray[72]);
                    if (isExist(obj.getCixNo(), obj.getDamboNo(), obj.getHisNo(), obj.getSts())) {
                        acom_dmh_hisInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_DMH_HISInfo> objList) {
        acom_dmh_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cixNo, String damboNo, BigDecimal hisNo, String sts) {
        return acom_dmh_hisInfoRepository.existsByCixNoAndDamboNoAndHisNoAndSts(cixNo, damboNo, hisNo, sts);
    }
}
