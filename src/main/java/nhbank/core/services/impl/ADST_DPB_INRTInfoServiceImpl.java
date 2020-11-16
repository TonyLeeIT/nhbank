package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.ADST_DPB_INRTInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.ADST_DPB_INRTInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.ADST_DPB_INRTInfoService;
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
public class ADST_DPB_INRTInfoServiceImpl implements ADST_DPB_INRTInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_DPB_INRTInfoRepository adst_dpb_inrtInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_DPB_INRT");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_DPB_INRTInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\ADST_DPB_INRT.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_INRT.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_DPB_INRTInfo obj = new ADST_DPB_INRTInfo();
                    obj.setAcctNo(lineArray[0]);
                    obj.setSts(lineArray[1]);
                    obj.setHisNo(new BigDecimal(lineArray[2]));
                    obj.setFromIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setToIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setFamt(new BigDecimal(lineArray[5]));
                    obj.setIntRt(new BigDecimal(lineArray[6]));
                    obj.setRegEmpNo(lineArray[7]);
                    obj.setRegDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setRegTm(lineArray[9]);
                    obj.setUpdEmpNo(lineArray[10]);
                    obj.setUpdDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setUpdTm(lineArray[12]);
                    if (isExist()) {
                        adst_dpb_inrtInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_INRTInfo> objList) {
        adst_dpb_inrtInfoRepository.saveAll(objList);
    }

    public boolean isExist() {
        return false;
    }
}
