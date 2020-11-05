package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_COMH_TAGLINEInfo;
import nhbank.core.repositories.ACOM_COMH_TAGLINEInfoRepository;
import nhbank.core.services.ACOM_COMH_TAGLINEInfoService;
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
public class ACOM_COMH_TAGLINEInfoServiceImpl implements ACOM_COMH_TAGLINEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_COMH_TAGLINEInfoRepository acom_comh_taglineInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_COMH_TAGLINE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_COMH_TAGLINEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_COMH_TAGLINE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_COMH_TAGLINE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_COMH_TAGLINEInfo obj = new ACOM_COMH_TAGLINEInfo();
                    obj.setDocId(lineArray[0]);
                    obj.setSeqNo(new BigDecimal(lineArray[1]));
                    obj.setLineType(lineArray[2]);
                    obj.setTagNo(lineArray[3]);
                    obj.setSubNo(new BigDecimal(lineArray[4]));
                    obj.setLineData(lineArray[5]);
                    obj.setTagGb(lineArray[6]);
                    obj.setRegEmpNo(lineArray[7]);
                    obj.setRegDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setRegTm(lineArray[9]);
                    obj.setUpdEmpNo(lineArray[10]);
                    obj.setUpdDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setUpdTm(lineArray[12]);
                    if (isExist(obj.getDocId(), obj.getSeqNo())) {
                        acom_comh_taglineInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COMH_TAGLINEInfo> objList) {
        acom_comh_taglineInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String docId, BigDecimal seqNo) {
        return acom_comh_taglineInfoRepository.existsByDocIdAndSeqNo(docId, seqNo);
    }
}
