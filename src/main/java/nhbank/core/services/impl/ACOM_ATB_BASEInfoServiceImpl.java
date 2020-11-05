package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_ATB_BASEInfo;
import nhbank.core.repositories.ACOM_ATB_BASEInfoRepository;
import nhbank.core.services.ACOM_ATB_BASEInfoService;
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
public class ACOM_ATB_BASEInfoServiceImpl implements ACOM_ATB_BASEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_ATB_BASEInfoRepository acom_atb_baseInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_ATB_BASE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_ATB_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_ATB_BASE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_ATB_BASE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_ATB_BASEInfo obj = new ACOM_ATB_BASEInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setRelApplyNo(lineArray[1]);
                    obj.setSts(lineArray[2]);
                    obj.setMgntBrNo(lineArray[3]);
                    obj.setFrAcctNo(lineArray[4]);
                    obj.setToRefNo(lineArray[5]);
                    obj.setTrType(lineArray[6]);
                    obj.setFrCixNo(lineArray[7]);
                    obj.setCixNo(lineArray[8]);
                    obj.setCcy(lineArray[9]);
                    obj.setLimitAmt(new BigDecimal(lineArray[10]));
                    obj.setTrAmt(new BigDecimal(lineArray[11]));
                    obj.setDueType(lineArray[12]);
                    obj.setDueDay(new BigDecimal(lineArray[13]));
                    obj.setDueTimes(new BigDecimal(lineArray[14]));
                    obj.setTotTimes(new BigDecimal(lineArray[15]));
                    obj.setProcTimes(new BigDecimal(lineArray[16]));
                    obj.setOpnDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setExpDt((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setRetryYn(lineArray[19]);
                    obj.setPurposeCd(lineArray[20]);
                    obj.setRcvRmrk(lineArray[21]);
                    obj.setRcvAddr(lineArray[22]);
                    obj.setDepTimes(new BigDecimal(lineArray[23]));
                    obj.setType(lineArray[24]);
                    obj.setChannelType(lineArray[25]);
                    obj.setPayerInf(lineArray[26]);
                    obj.setTrsfTp(lineArray[27]);
                    obj.setTrsfDtRule(lineArray[28]);
                    obj.setFeeFreeYn(lineArray[29]);
                    obj.setToBankCd(lineArray[30]);
                    obj.setToCustNm(lineArray[31]);
                    obj.setFeeAmt(new BigDecimal(lineArray[32]));
                    obj.setApplRmrk(lineArray[33]);
                    obj.setRmteAcctDpKindCd(lineArray[34]);
                    obj.setRtgsTp(lineArray[35]);
                    obj.setOurRef(lineArray[36]);
                    obj.setMultiKey(lineArray[37]);
                    obj.setLstIbDt((lineArray[38].equals("")) ? null : formatter.parse(lineArray[38]));
                    obj.setLstIbTime(lineArray[39]);
                    obj.setRegEmpNo(lineArray[40]);
                    obj.setRegDt((lineArray[41].equals("")) ? null : formatter.parse(lineArray[41]));
                    obj.setRegTm(lineArray[42]);
                    obj.setUpdEmpNo(lineArray[43]);
                    obj.setUpdDt((lineArray[44].equals("")) ? null : formatter.parse(lineArray[44]));
                    obj.setUpdTm(lineArray[45]);
                    if (isExist(obj.getRefNo())) {
                        acom_atb_baseInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_ATB_BASEInfo> objList) {
        acom_atb_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return acom_atb_baseInfoRepository.existsByRefNo(refNo);
    }
}
