package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.AFEX_IPB_BLKInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.AFEX_IPB_BLKInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.AFEX_IPB_BLKInfoService;
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
public class AFEX_IPB_BLKInfoServiceImpl implements AFEX_IPB_BLKInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_IPB_BLKInfoRepository afex_ipb_blkInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_IPB_BLK");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_IPB_BLKInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\AFEX_IPB_BLK.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPB_BLK.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_IPB_BLKInfo obj = new AFEX_IPB_BLKInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setSeq(new BigDecimal(lineArray[1]));
                    obj.setSseq(new BigDecimal(lineArray[2]));
                    obj.setSts(lineArray[3]);
                    obj.setAcIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setGisIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setLstIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setCcy(lineArray[7]);
                    obj.setAmt(new BigDecimal(lineArray[8]));
                    obj.setHisNo(new BigDecimal(lineArray[9]));
                    obj.setJagmGb(lineArray[10]);
                    obj.setJilcBamt(new BigDecimal(lineArray[11]));
                    obj.setJilcFamt(new BigDecimal(lineArray[12]));
                    obj.setJilgBamt(new BigDecimal(lineArray[13]));
                    obj.setJilgFamt(new BigDecimal(lineArray[14]));
                    obj.setSngSseq(new BigDecimal(lineArray[15]));
                    obj.setDjbSeq(new BigDecimal(lineArray[16]));
                    obj.setSetBkcd(lineArray[17]);
                    obj.setJunGb(lineArray[18]);
                    obj.setFjnNo(lineArray[19]);
                    obj.setSetGb(lineArray[20]);
                    obj.setGtAmt(new BigDecimal(lineArray[21]));
                    obj.setAmtGb(lineArray[22]);
                    obj.setNcuCcy(lineArray[23]);
                    obj.setNcuAmt(new BigDecimal(lineArray[24]));
                    obj.setNcuJilcFamt(new BigDecimal(lineArray[25]));
                    obj.setNcuJilgFamt(new BigDecimal(lineArray[26]));
                    obj.setNcuGtAmt(new BigDecimal(lineArray[27]));
                    obj.setRegEmpNo(lineArray[28]);
                    obj.setRegDt((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                    obj.setRegTm(lineArray[30]);
                    obj.setUpdEmpNo(lineArray[31]);
                    obj.setUpdDt((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                    obj.setUpdTm(lineArray[33]);
                    if (isExist(obj.getRefNo(), obj.getSeq(), obj.getSseq())) {
                        afex_ipb_blkInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPB_BLKInfo> objList) {
        afex_ipb_blkInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq, BigDecimal sseq) {
        return afex_ipb_blkInfoRepository.existsByRefNoAndSeqAndSseq(refNo, seq, sseq);
    }
}
