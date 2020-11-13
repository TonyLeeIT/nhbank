package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.AFEX_XPB_ITMInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.AFEX_XPB_ITMInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.AFEX_XPB_ITMInfoService;
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
public class AFEX_XPB_ITMInfoServiceImpl implements AFEX_XPB_ITMInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPB_ITMInfoRepository afex_xpb_itmInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPB_ITM");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPB_ITMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\AFEX_XPB_ITM.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPB_ITM.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPB_ITMInfo obj = new AFEX_XPB_ITMInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setAcIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                    obj.setGisIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setLstIbIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setDrGb(lineArray[5]);
                    obj.setItmCd(lineArray[6]);
                    obj.setBeItm(lineArray[7]);
                    obj.setAfItm(lineArray[8]);
                    obj.setBeItm1(new BigDecimal(lineArray[9]));
                    obj.setAfItm1(new BigDecimal(lineArray[10]));
                    obj.setRegEmpNo(lineArray[11]);
                    obj.setRegDt((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                    obj.setRegTm(lineArray[13]);
                    obj.setUpdEmpNo(lineArray[14]);
                    obj.setUpdDt((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                    obj.setUpdTm(lineArray[16]);
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        afex_xpb_itmInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPB_ITMInfo> objList) {
        afex_xpb_itmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_xpb_itmInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
