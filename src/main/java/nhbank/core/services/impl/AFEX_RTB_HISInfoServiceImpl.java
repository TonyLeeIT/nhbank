package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.AFEX_RTB_HISInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.AFEX_RTB_HISInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.AFEX_RTB_HISInfoService;
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
public class AFEX_RTB_HISInfoServiceImpl implements AFEX_RTB_HISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_RTB_HISInfoRepository afex_rtb_hisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_RTB_HIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_RTB_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\AFEX_RTB_HIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RTB_HIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_RTB_HISInfo obj = new AFEX_RTB_HISInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setTrGb(lineArray[3]);
                    obj.setTrCd(lineArray[4]);
                    obj.setIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setAcIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setGisIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setCanIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setSdHisNo(new BigDecimal(lineArray[9]));
                    obj.setBuyCcy(lineArray[10]);
                    obj.setBuyFamt(new BigDecimal(lineArray[11]));
                    obj.setSelCcy(lineArray[12]);
                    obj.setSelFamt(new BigDecimal(lineArray[13]));
                    obj.setExHrt(new BigDecimal(lineArray[14]));
                    obj.setTrBr(lineArray[15]);
                    obj.setTrTime(lineArray[16]);
                    obj.setUserId(lineArray[17]);
                    obj.setLstIbIl((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setPreSts(lineArray[19]);
                    obj.setRegEmpNo(lineArray[20]);
                    obj.setRegDt((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                    obj.setRegTm(lineArray[22]);
                    obj.setUpdEmpNo(lineArray[23]);
                    obj.setUpdDt((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                    obj.setUpdTm(lineArray[25]);
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        afex_rtb_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RTB_HISInfo> objList) {
        afex_rtb_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_rtb_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
