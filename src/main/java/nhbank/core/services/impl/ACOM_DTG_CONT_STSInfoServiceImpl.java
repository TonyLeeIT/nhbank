package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_DTG_CONT_STSInfo;
import nhbank.core.repositories.ACOM_DTG_CONT_STSInfoRepository;
import nhbank.core.services.ACOM_DTG_CONT_STSInfoService;
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
public class ACOM_DTG_CONT_STSInfoServiceImpl implements ACOM_DTG_CONT_STSInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_DTG_CONT_STSInfoRepository acom_dtg_cont_stsInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_DTG_CONT_STS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_DTG_CONT_STSInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_DTG_CONT_STS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_DTG_CONT_STS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_DTG_CONT_STSInfo obj = new ACOM_DTG_CONT_STSInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setSeqNo(new BigDecimal(lineArray[1]));
                    obj.setBrNo(lineArray[2]);
                    obj.setTrxDt((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setBfContSts(lineArray[4]);
                    obj.setAfContSts(lineArray[5]);
                    obj.setAcctNo(lineArray[6]);
                    obj.setRegEmpNo(lineArray[7]);
                    obj.setRegDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setRegTm(lineArray[9]);
                    obj.setUpdEmpNo(lineArray[10]);
                    obj.setUpdDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setUpdTm(lineArray[12]);
                    if (isExist(obj.getRefNo(), obj.getSeqNo(), obj.getBrNo())) {
                        acom_dtg_cont_stsInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_DTG_CONT_STSInfo> objList) {
        acom_dtg_cont_stsInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seqNo, String brNo) {
        return acom_dtg_cont_stsInfoRepository.existsByRefNoAndSeqNoAndBrNo(refNo, seqNo, brNo);
    }
}
