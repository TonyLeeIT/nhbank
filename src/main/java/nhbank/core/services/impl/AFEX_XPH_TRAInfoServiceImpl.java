package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.AFEX_XPH_TRAInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.AFEX_XPH_TRAInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.AFEX_XPH_TRAInfoService;
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
public class AFEX_XPH_TRAInfoServiceImpl implements AFEX_XPH_TRAInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPH_TRAInfoRepository afex_xph_traInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPH_TRA");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPH_TRAInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\AFEX_XPH_TRA.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPH_TRA.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPH_TRAInfo obj = new AFEX_XPH_TRAInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setTraGb(lineArray[1]);
                    obj.setHisNo(new BigDecimal(lineArray[2]));
                    obj.setSeqNo(new BigDecimal(lineArray[3]));
                    obj.setSts(lineArray[4]);
                    obj.setAcIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setGisIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setCcy(lineArray[7]);
                    obj.setAmt(new BigDecimal(lineArray[8]));
                    obj.setInOutGb(lineArray[9]);
                    obj.setMtGubun(lineArray[10]);
                    obj.setTlxNo(lineArray[11]);
                    obj.setFileName(lineArray[12]);
                    obj.setThruBank(lineArray[13]);
                    obj.setNcuCcy(lineArray[14]);
                    obj.setNcuAmt(new BigDecimal(lineArray[15]));
                    obj.setRegEmpNo(lineArray[16]);
                    obj.setRegDt((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setRegTm(lineArray[18]);
                    obj.setUpdEmpNo(lineArray[19]);
                    obj.setUpdDt((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setUpdTm(lineArray[21]);
                    if (isExist(obj.getRefNo(), obj.getTraGb(), obj.getHisNo(), obj.getSeqNo())) {
                        afex_xph_traInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_TRAInfo> objList) {
        afex_xph_traInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, String traGb, BigDecimal hisNo, BigDecimal seqNo) {
        return afex_xph_traInfoRepository.existsByRefNoAndTraGbAndHisNoAndSeqNo(refNo, traGb, hisNo, seqNo);
    }
}
