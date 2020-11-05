package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_RCH_RECONInfo;
import nhbank.core.repositories.AFEX_RCH_RECONInfoRepository;
import nhbank.core.services.AFEX_RCH_RECONInfoService;
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
public class AFEX_RCH_RECONInfoServiceImpl implements AFEX_RCH_RECONInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_RCH_RECONInfoRepository afex_rch_reconInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_RCH_RECON");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_RCH_RECONInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_RCH_RECON.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RCH_RECON.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_RCH_RECONInfo obj = new AFEX_RCH_RECONInfo();
                    obj.setCd(lineArray[0]);
                    obj.setCcy(lineArray[1]);
                    obj.setSaGb(lineArray[2]);
                    obj.setTrIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setTrSeq(new BigDecimal(lineArray[4]));
                    obj.setReconIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setReconSeq(new BigDecimal(lineArray[6]));
                    obj.setReconGb(lineArray[7]);
                    obj.setValIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setOurRef(lineArray[9]);
                    obj.setDrcrGb(lineArray[10]);
                    obj.setDrcrAmt(new BigDecimal(lineArray[11]));
                    obj.setTheirRef(lineArray[12]);
                    obj.setUpmuCd(lineArray[13]);
                    obj.setInidCd(lineArray[14]);
                    obj.setOrigAmt(new BigDecimal(lineArray[15]));
                    obj.setBunhalSeq(new BigDecimal(lineArray[16]));
                    obj.setIbIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setIbTime(lineArray[18]);
                    obj.setOperId(lineArray[19]);
                    obj.setCancelYn(lineArray[20]);
                    obj.setOrigRef(lineArray[21]);
                    obj.setConfirmYn(lineArray[22]);
                    obj.setNrefCnt(lineArray[23]);
                    obj.setAmendCnt(lineArray[24]);
                    obj.setDocId(lineArray[25]);
                    obj.setOtherRef(lineArray[26]);
                    obj.setRefHisNo(new BigDecimal(lineArray[27]));
                    obj.setRegEmpNo(lineArray[28]);
                    obj.setRegDt((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                    obj.setRegTm(lineArray[30]);
                    obj.setUpdEmpNo(lineArray[31]);
                    obj.setUpdDt((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                    obj.setUpdTm(lineArray[33]);
                    if (isExist(obj.getCd(), obj.getCcy(), obj.getSaGb(), obj.getTrIl(), obj.getTrSeq(), obj.getReconIl())) {
                        afex_rch_reconInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RCH_RECONInfo> objList) {
        afex_rch_reconInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cd, String ccy, String saGb, Date trIl, BigDecimal trSeq, Date reconIl) {
        return afex_rch_reconInfoRepository.existsByCdAndCcyAndSaGbAndTrIlAndTrSeqAndReconIl(cd, ccy, saGb, trIl, trSeq, reconIl);
    }
}
