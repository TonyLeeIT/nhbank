package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_RCH_TRANInfo;
import nhbank.core.repositories.AFEX_RCH_TRANInfoRepository;
import nhbank.core.services.AFEX_RCH_TRANInfoService;
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
public class AFEX_RCH_TRANInfoServiceImpl implements AFEX_RCH_TRANInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_RCH_TRANInfoRepository afex_rch_tranInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_RCH_TRAN");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_RCH_TRANInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_RCH_TRAN.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RCH_TRAN.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_RCH_TRANInfo obj = new AFEX_RCH_TRANInfo();
                    obj.setCd(lineArray[0]);
                    obj.setCcy(lineArray[1]);
                    obj.setMtGb(lineArray[2]);
                    obj.setTrIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setTrSeq(new BigDecimal(lineArray[4]));
                    obj.setValIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setDrcrGb(lineArray[6]);
                    obj.setDrcrAmt(new BigDecimal(lineArray[7]));
                    obj.setOurRef(lineArray[8]);
                    obj.setTheirRef(lineArray[9]);
                    obj.setIbIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setIbTime(lineArray[11]);
                    obj.setDocId(lineArray[12]);
                    obj.setOtherRef(lineArray[13]);
                    obj.setRegEmpNo(lineArray[14]);
                    obj.setRegDt((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                    obj.setRegTm(lineArray[16]);
                    obj.setUpdEmpNo(lineArray[17]);
                    obj.setUpdDt((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setUpdTm(lineArray[19]);
                    if (isExist(obj.getCd(), obj.getCcy(), obj.getMtGb(), obj.getTrIl(), obj.getTrSeq())) {
                        afex_rch_tranInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RCH_TRANInfo> objList) {
        afex_rch_tranInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cd, String ccy, String mtGb, Date trIl, BigDecimal trSeq) {
        return afex_rch_tranInfoRepository.existsByCdAndCcyAndMtGbAndTrIlAndTrSeq(cd, ccy, mtGb, trIl, trSeq);
    }
}
