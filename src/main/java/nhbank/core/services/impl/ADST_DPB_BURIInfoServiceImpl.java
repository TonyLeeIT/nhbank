package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ADST_DPB_BURIInfo;
import nhbank.core.repositories.ADST_DPB_BURIInfoRepository;
import nhbank.core.services.ADST_DPB_BURIInfoService;
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
public class ADST_DPB_BURIInfoServiceImpl implements ADST_DPB_BURIInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_DPB_BURIInfoRepository adst_dpb_buriInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_DPB_BURI");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_DPB_BURIInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ADST_DPB_BURI.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_BURI.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_DPB_BURIInfo obj = new ADST_DPB_BURIInfo();
                    obj.setAcctNo(lineArray[0]);
                    obj.setBuriIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                    obj.setBuriJan(new BigDecimal(lineArray[2]));
                    obj.setFstJan(new BigDecimal(lineArray[3]));
                    obj.setMaxJan(new BigDecimal(lineArray[4]));
                    obj.setTermIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setLonSngAmt(new BigDecimal(lineArray[6]));
                    obj.setLonOvrAmt(new BigDecimal(lineArray[7]));
                    obj.setLonRtCd(lineArray[8]);
                    obj.setLonRt(new BigDecimal(lineArray[9]));
                    obj.setPrcpOverDueIntRt(new BigDecimal(lineArray[10]));
                    obj.setIntOverDueIntRt(new BigDecimal(lineArray[11]));
                    obj.setColLonInt(new BigDecimal(lineArray[12]));
                    obj.setLonPrcpYcInt(new BigDecimal(lineArray[13]));
                    obj.setLonIntYcInt(new BigDecimal(lineArray[14]));
                    obj.setLonYdCd(lineArray[15]);
                    obj.setRegEmpNo(lineArray[16]);
                    obj.setRegDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setRegTm(lineArray[18]);
                    obj.setUpdEmpNo(lineArray[19]);
                    obj.setUpdDt((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setUpdTm(lineArray[21]);
                    if (isExist(obj.getAcctNo(), obj.getBuriIl())) {
                        adst_dpb_buriInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_BURIInfo> objList) {
        adst_dpb_buriInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, Date buriIl) {
        return adst_dpb_buriInfoRepository.existsByAcctNoAndBuriIl(acctNo, buriIl);
    }
}
