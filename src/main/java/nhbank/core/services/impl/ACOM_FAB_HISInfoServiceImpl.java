package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.ACOM_FAB_HISInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.ACOM_FAB_HISInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.ACOM_FAB_HISInfoService;
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
public class ACOM_FAB_HISInfoServiceImpl implements ACOM_FAB_HISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_FAB_HISInfoRepository acom_fab_hisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_FAB_HIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_FAB_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\ACOM_FAB_HIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_FAB_HIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_FAB_HISInfo obj = new ACOM_FAB_HISInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setTrGb(lineArray[3]);
                    obj.setTrCd(lineArray[4]);
                    obj.setIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setAcIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setGisIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setCanIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setSdHisNo(new BigDecimal(lineArray[9]));
                    obj.setTrCcy(lineArray[10]);
                    obj.setTrFamt(new BigDecimal(lineArray[11]));
                    obj.setTrBamt(new BigDecimal(lineArray[12]));
                    obj.setSalAmt(new BigDecimal(lineArray[13]));
                    obj.setEvenAmt(new BigDecimal(lineArray[14]));
                    obj.setDepriAmt(new BigDecimal(lineArray[15]));
                    obj.setSellAmt(new BigDecimal(lineArray[16]));
                    obj.setPlAmt(new BigDecimal(lineArray[17]));
                    obj.setAfJan(new BigDecimal(lineArray[18]));
                    obj.setAfDepriJan(new BigDecimal(lineArray[19]));
                    obj.setDepriJan(new BigDecimal(lineArray[20]));
                    obj.setThisDepriJan(new BigDecimal(lineArray[21]));
                    obj.setLastDepriJan(new BigDecimal(lineArray[22]));
                    obj.setCapitalJan(new BigDecimal(lineArray[23]));
                    obj.setDispJan(new BigDecimal(lineArray[24]));
                    obj.setDepriIl((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                    obj.setBfrDepriIl((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                    obj.setIlgeYn(lineArray[27]);
                    obj.setRemark(lineArray[28]);
                    obj.setBgRefNo(lineArray[29]);
                    obj.setTrBr(lineArray[30]);
                    obj.setSdBr(lineArray[31]);
                    obj.setIbTime(lineArray[32]);
                    obj.setOpNo(lineArray[33]);
                    obj.setMngNo(lineArray[34]);
                    obj.setCdSngNo(lineArray[35]);
                    obj.setCdSilSeq(new BigDecimal(lineArray[36]));
                    obj.setRegEmpNo(lineArray[37]);
                    obj.setRegDt((lineArray[38].equals("")) ? null : formatter.parse(lineArray[38]));
                    obj.setRegTm(lineArray[39]);
                    obj.setUpdEmpNo(lineArray[40]);
                    obj.setUpdDt((lineArray[41].equals("")) ? null : formatter.parse(lineArray[41]));
                    obj.setUpdTm(lineArray[42]);
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        acom_fab_hisInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_FAB_HISInfo> objList) {
        acom_fab_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return acom_fab_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
