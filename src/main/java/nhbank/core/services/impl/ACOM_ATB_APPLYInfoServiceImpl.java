package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.ACOM_ATB_APPLYInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.ACOM_ATB_APPLYInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.ACOM_ATB_APPLYInfoService;
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
public class ACOM_ATB_APPLYInfoServiceImpl implements ACOM_ATB_APPLYInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_ATB_APPLYInfoRepository acom_atb_applyInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_ATB_APPLY");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_ATB_APPLYInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\ACOM_ATB_APPLY.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_ATB_APPLY.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_ATB_APPLYInfo obj = new ACOM_ATB_APPLYInfo();
                    obj.setApplyNo(lineArray[0]);
                    obj.setTrxDt((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setCixNo(lineArray[3]);
                    obj.setBrNo(lineArray[4]);
                    obj.setFileNm(lineArray[5]);
                    obj.setFileUrl(lineArray[6]);
                    obj.setTotCnt(new BigDecimal(lineArray[7]));
                    obj.setSusCnt(new BigDecimal(lineArray[8]));
                    obj.setFailCnt(new BigDecimal(lineArray[9]));
                    obj.setRegEmpNo(lineArray[10]);
                    obj.setRegDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setRegTm(lineArray[12]);
                    obj.setUpdEmpNo(lineArray[13]);
                    obj.setUpdDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setUpdTm(lineArray[15]);
                    if (isExist(obj.getApplyNo())) {
                        acom_atb_applyInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_ATB_APPLYInfo> objList) {
        acom_atb_applyInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String applyNo) {
        return acom_atb_applyInfoRepository.existsByApplyNo(applyNo);
    }
}
