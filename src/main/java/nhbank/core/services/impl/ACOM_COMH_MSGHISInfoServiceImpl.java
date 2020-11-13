package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.ACOM_COMH_MSGHISInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.ACOM_COMH_MSGHISInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.ACOM_COMH_MSGHISInfoService;
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
public class ACOM_COMH_MSGHISInfoServiceImpl implements ACOM_COMH_MSGHISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_COMH_MSGHISInfoRepository acom_comh_msghisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_COMH_MSGHIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_COMH_MSGHISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\ACOM_COMH_MSGHIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_COMH_MSGHIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_COMH_MSGHISInfo obj = new ACOM_COMH_MSGHISInfo();
                    obj.setDocId(lineArray[0]);
                    obj.setSeqNo(new BigDecimal(lineArray[1]));
                    obj.setCondSts(lineArray[2]);
                    obj.setStmRmk(lineArray[3]);
                    obj.setStmTail(lineArray[4]);
                    obj.setMakeIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setMakeTime(lineArray[6]);
                    obj.setMakeTty(lineArray[7]);
                    obj.setOpNo(lineArray[8]);
                    obj.setRegEmpNo(lineArray[9]);
                    obj.setRegDt((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setRegTm(lineArray[11]);
                    obj.setUpdEmpNo(lineArray[12]);
                    obj.setUpdDt((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                    obj.setUpdTm(lineArray[14]);
                    if (isExist(obj.getDocId(), obj.getSeqNo())) {
                        acom_comh_msghisInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COMH_MSGHISInfo> objList) {
        acom_comh_msghisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String docId, BigDecimal seqNo) {
        return acom_comh_msghisInfoRepository.existsByDocIdAndSeqNo(docId, seqNo);
    }
}
