package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_RTB_BASEInfo;
import nhbank.core.repositories.AFEX_RTB_BASEInfoRepository;
import nhbank.core.services.AFEX_RTB_BASEInfoService;
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
public class AFEX_RTB_BASEInfoServiceImpl implements AFEX_RTB_BASEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_RTB_BASEInfoRepository afex_rtb_baseInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_RTB_BASE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_RTB_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_RTB_BASE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RTB_BASE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_RTB_BASEInfo obj = new AFEX_RTB_BASEInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setCixNo(lineArray[1]);
                    obj.setCixNm(lineArray[2]);
                    obj.setBuyCcy(lineArray[3]);
                    obj.setBuyFamt(new BigDecimal(lineArray[4]));
                    obj.setSelCcy(lineArray[5]);
                    obj.setSelFamt(new BigDecimal(lineArray[6]));
                    obj.setExHrt(new BigDecimal(lineArray[7]));
                    obj.setRateAmtGb(lineArray[8]);
                    obj.setFrtGb(lineArray[9]);
                    obj.setFrtRt(new BigDecimal(lineArray[10]));
                    obj.setFrtAmt(new BigDecimal(lineArray[11]));
                    obj.setAcIl((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                    obj.setLstIbIl((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                    obj.setIdNo(lineArray[14]);
                    obj.setNationCd(lineArray[15]);
                    obj.setRemark(lineArray[16]);
                    obj.setRegEmpNo(lineArray[17]);
                    obj.setRegDt((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setRegTm(lineArray[19]);
                    obj.setUpdEmpNo(lineArray[20]);
                    obj.setUpdDt((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                    obj.setUpdTm(lineArray[22]);
                    obj.setSayuCd(lineArray[23]);
                    if (isExist(obj.getRefNo())) {
                        afex_rtb_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RTB_BASEInfo> objList) {
        afex_rtb_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afex_rtb_baseInfoRepository.existsByRefNo(refNo);
    }
}
