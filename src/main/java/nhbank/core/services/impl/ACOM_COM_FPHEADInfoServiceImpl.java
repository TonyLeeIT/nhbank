package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_COM_FPHEADInfo;
import nhbank.core.repositories.ACOM_COM_FPHEADInfoRepository;
import nhbank.core.services.ACOM_COM_FPHEADInfoService;
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
public class ACOM_COM_FPHEADInfoServiceImpl implements ACOM_COM_FPHEADInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_COM_FPHEADInfoRepository acom_com_fpheadInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_COM_FPHEAD");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_COM_FPHEADInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_COM_FPHEAD.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_COM_FPHEAD.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_COM_FPHEADInfo obj = new ACOM_COM_FPHEADInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setPrtKind(lineArray[2]);
                    obj.setUpmuCd(lineArray[3]);
                    obj.setTrCd(lineArray[4]);
                    obj.setTxDate((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setCixNo(lineArray[6]);
                    obj.setTitleTxt(lineArray[7]);
                    obj.setHeadTxt(lineArray[8]);
                    obj.setTellNo(lineArray[9]);
                    obj.setTellNm(lineArray[10]);
                    obj.setOpNo(lineArray[11]);
                    obj.setOpNm(lineArray[12]);
                    obj.setRegEmpNo(lineArray[13]);
                    obj.setRegDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setRegTm(lineArray[15]);
                    obj.setUpdEmpNo(lineArray[16]);
                    obj.setUpdDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setUpdTm(lineArray[18]);
                    if (isExist(obj.getRefNo(), obj.getHisNo(), obj.getPrtKind())) {
                        acom_com_fpheadInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COM_FPHEADInfo> objList) {
        acom_com_fpheadInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo, String prtKind) {
        return acom_com_fpheadInfoRepository.existsByRefNoAndHisNoAndPrtKind(refNo, hisNo, prtKind);
    }
}
