package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.ADST_LNB_REPAYInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.ADST_LNB_REPAYInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.ADST_LNB_REPAYInfoService;
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
public class ADST_LNB_REPAYInfoServiceImpl implements ADST_LNB_REPAYInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_LNB_REPAYInfoRepository adst_lnb_repayInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_LNB_REPAY");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_LNB_REPAYInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\ADST_LNB_REPAY.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_LNB_REPAY.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_LNB_REPAYInfo obj = new ADST_LNB_REPAYInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSeqNo(new BigDecimal(lineArray[2]));
                    obj.setSts(lineArray[3]);
                    obj.setAdjSeq(new BigDecimal(lineArray[4]));
                    obj.setSchSeq(new BigDecimal(lineArray[5]));
                    obj.setSchSubNo(new BigDecimal(lineArray[6]));
                    obj.setRepayIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setCcy(lineArray[8]);
                    obj.setRepayAmt(new BigDecimal(lineArray[9]));
                    obj.setUsdCvtAmt(new BigDecimal(lineArray[10]));
                    obj.setBbsCvtAmt(new BigDecimal(lineArray[11]));
                    obj.setRepayStyle(lineArray[12]);
                    obj.setIntGb(lineArray[13]);
                    obj.setYcGb(lineArray[14]);
                    obj.setFstDealIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                    obj.setLstDealIl((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                    obj.setLstIbIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setRegEmpNo(lineArray[18]);
                    obj.setRegDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setRegTm(lineArray[20]);
                    obj.setUpdEmpNo(lineArray[21]);
                    obj.setUpdDt((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                    obj.setUpdTm(lineArray[23]);
                    if (isExist(obj.getRefNo(), obj.getHisNo(), obj.getSeqNo())) {
                        adst_lnb_repayInfoRepository.save(obj);
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
    public void insertAll(List<ADST_LNB_REPAYInfo> objList) {
        adst_lnb_repayInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo, BigDecimal seqNo) {
        return adst_lnb_repayInfoRepository.existsByRefNoAndHisNoAndSeqNo(refNo, hisNo, seqNo);
    }
}
