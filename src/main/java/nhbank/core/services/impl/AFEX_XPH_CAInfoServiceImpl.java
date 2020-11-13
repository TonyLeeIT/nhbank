package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.AFEX_XPH_CAInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.AFEX_XPH_CAInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.AFEX_XPH_CAInfoService;
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
import java.util.Date;
import java.util.List;

@Service
public class AFEX_XPH_CAInfoServiceImpl implements AFEX_XPH_CAInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPH_CAInfoRepository afex_xph_caInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPH_CA");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPH_CAInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\AFEX_XPH_CA.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPH_CA.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPH_CAInfo obj = new AFEX_XPH_CAInfo();
                    obj.setRcvIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                    obj.setSeqNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setRefNo(lineArray[3]);
                    obj.setCaCcy(lineArray[4]);
                    obj.setCaAmt(new BigDecimal(lineArray[5]));
                    obj.setLessCaAmt(new BigDecimal(lineArray[6]));
                    obj.setLessCoAmt(new BigDecimal(lineArray[7]));
                    obj.setLessGtAmt(new BigDecimal(lineArray[8]));
                    obj.setOverAmt(new BigDecimal(lineArray[9]));
                    obj.setCaIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setDepoBkcd(lineArray[11]);
                    obj.setSdBalIl((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                    obj.setCcGb(lineArray[13]);
                    obj.setCcIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                    obj.setCcRtCd(lineArray[15]);
                    obj.setTrGb(lineArray[16]);
                    obj.setMtTrMd(lineArray[17]);
                    obj.setSwiftKey(lineArray[18]);
                    obj.setRcvGb(lineArray[19]);
                    obj.setOpNo(lineArray[20]);
                    obj.setDepoCd(lineArray[21]);
                    obj.setCdGb(lineArray[22]);
                    obj.setDivGb(lineArray[23]);
                    obj.setDivRef(lineArray[24]);
                    obj.setNcuCaCcy(lineArray[25]);
                    obj.setNcuCaAmt(new BigDecimal(lineArray[26]));
                    obj.setNcuLessCaAmt(new BigDecimal(lineArray[27]));
                    obj.setNcuLessCoAmt(new BigDecimal(lineArray[28]));
                    obj.setNcuLessGtAmt(new BigDecimal(lineArray[29]));
                    obj.setNcuOverAmt(new BigDecimal(lineArray[30]));
                    obj.setRegEmpNo(lineArray[31]);
                    obj.setRegDt((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                    obj.setRegTm(lineArray[33]);
                    obj.setUpdEmpNo(lineArray[34]);
                    obj.setUpdDt((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                    obj.setUpdTm(lineArray[36]);
                    if (isExist(obj.getRcvIl(), obj.getSeqNo())) {
                        afex_xph_caInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_CAInfo> objList) {
        afex_xph_caInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date rcvIl, BigDecimal seqNo) {
        return afex_xph_caInfoRepository.existsByRcvIlAndSeqNo(rcvIl, seqNo);
    }
}
