package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.ADST_DPB_HISInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.ADST_DPB_HISInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.ADST_DPB_HISInfoService;
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
public class ADST_DPB_HISInfoServiceImpl implements ADST_DPB_HISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_DPB_HISInfoRepository adst_dpb_hisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_DPB_HIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_DPB_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\ADST_DPB_HIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_HIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_DPB_HISInfo obj = new ADST_DPB_HISInfo();
                    obj.setAcctNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setCixNo(lineArray[3]);
                    obj.setTrGb(lineArray[4]);
                    obj.setTrCd(lineArray[5]);
                    obj.setProcessCd(lineArray[6]);
                    obj.setMechGb(lineArray[7]);
                    obj.setSdHisNo(new BigDecimal(lineArray[8]));
                    obj.setTrAmt(new BigDecimal(lineArray[9]));
                    obj.setIbIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setTrBr(lineArray[11]);
                    obj.setSdBr(lineArray[12]);
                    obj.setMngBr(lineArray[13]);
                    obj.setTrTime(lineArray[14]);
                    obj.setGisIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                    obj.setCanIl((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                    obj.setOpNo(lineArray[17]);
                    obj.setMngNo(lineArray[18]);
                    obj.setAfJan(new BigDecimal(lineArray[19]));
                    obj.setAcIl((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setChnlRefNo(lineArray[21]);
                    obj.setChnlHisNo(new BigDecimal(lineArray[22]));
                    obj.setRegEmpNo(lineArray[23]);
                    obj.setRegDt((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                    obj.setRegTm(lineArray[25]);
                    obj.setUpdEmpNo(lineArray[26]);
                    obj.setUpdDt((lineArray[27].equals("")) ? null : formatter.parse(lineArray[27]));
                    obj.setUpdTm(lineArray[28]);
                    if (isExist(obj.getAcctNo(), obj.getHisNo())) {
                        adst_dpb_hisInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_HISInfo> objList) {
        adst_dpb_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, BigDecimal hisNo) {
        return adst_dpb_hisInfoRepository.existsByAcctNoAndHisNo(acctNo, hisNo);
    }
}
