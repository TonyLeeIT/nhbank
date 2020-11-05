package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_RTB_HSSInfo;
import nhbank.core.repositories.AFEX_RTB_HSSInfoRepository;
import nhbank.core.services.AFEX_RTB_HSSInfoService;
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
public class AFEX_RTB_HSSInfoServiceImpl implements AFEX_RTB_HSSInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_RTB_HSSInfoRepository afex_rtb_hssInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_RTB_HSS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_RTB_HSSInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_RTB_HSS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RTB_HSS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_RTB_HSSInfo obj = new AFEX_RTB_HSSInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setTrCd(lineArray[1]);
                    obj.setAcIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                    obj.setLstIbIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setHssGb(lineArray[4]);
                    obj.setHssApGb(lineArray[5]);
                    obj.setSdBrNo(lineArray[6]);
                    obj.setSdDepoCd(lineArray[7]);
                    obj.setChargeType(lineArray[8]);
                    obj.setHssFee(new BigDecimal(lineArray[9]));
                    obj.setIcheIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setCcy(lineArray[11]);
                    obj.setFamt(new BigDecimal(lineArray[12]));
                    obj.setBamt(new BigDecimal(lineArray[13]));
                    obj.setTrscSeqNo(new BigDecimal(lineArray[14]));
                    obj.setRegEmpNo(lineArray[15]);
                    obj.setRegDt((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                    obj.setRegTm(lineArray[17]);
                    obj.setUpdEmpNo(lineArray[18]);
                    obj.setUpdDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setUpdTm(lineArray[20]);
                    if (isExist(obj.getRefNo())) {
                        afex_rtb_hssInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RTB_HSSInfo> objList) {
        afex_rtb_hssInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afex_rtb_hssInfoRepository.existsByRefNo(refNo);
    }
}
