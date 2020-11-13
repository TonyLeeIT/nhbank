package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.AFEX_XPB_ADVInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.AFEX_XPB_ADVInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.AFEX_XPB_ADVInfoService;
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
public class AFEX_XPB_ADVInfoServiceImpl implements AFEX_XPB_ADVInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPB_ADVInfoRepository afex_xpb_advInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPB_ADV");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPB_ADVInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\AFEX_XPB_ADV.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPB_ADV.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPB_ADVInfo obj = new AFEX_XPB_ADVInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setLstIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setCcy(lineArray[6]);
                    obj.setAmt(new BigDecimal(lineArray[7]));
                    obj.setAdvGb(lineArray[8]);
                    obj.setCaGb(lineArray[9]);
                    obj.setDelayGb(lineArray[10]);
                    obj.setSdTrIl((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setJubGb(lineArray[12]);
                    obj.setHdAmt(new BigDecimal(lineArray[13]));
                    obj.setJunNo1(lineArray[14]);
                    obj.setOverAmt(new BigDecimal(lineArray[15]));
                    obj.setJunNo2(lineArray[16]);
                    obj.setLessCaAmt(new BigDecimal(lineArray[17]));
                    obj.setLessCoAmt(new BigDecimal(lineArray[18]));
                    obj.setLessGtAmt(new BigDecimal(lineArray[19]));
                    obj.setYukNo(lineArray[20]);
                    obj.setPlJiGb(lineArray[21]);
                    obj.setDepoBkcd(lineArray[22]);
                    obj.setBuibGb(lineArray[23]);
                    obj.setJunAmt(new BigDecimal(lineArray[24]));
                    obj.setIjGb(lineArray[25]);
                    obj.setManIl((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                    obj.setCaManIl((lineArray[27].equals("")) ? null : formatter.parse(lineArray[27]));
                    obj.setMisuAmt(new BigDecimal(lineArray[28]));
                    obj.setMisuBamt(new BigDecimal(lineArray[29]));
                    obj.setSonikGb(lineArray[30]);
                    obj.setSonikAmt(new BigDecimal(lineArray[31]));
                    obj.setBeLcaIl((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                    obj.setNcuCcy(lineArray[33]);
                    obj.setNcuAmt(new BigDecimal(lineArray[34]));
                    obj.setNcuHdAmt(new BigDecimal(lineArray[35]));
                    obj.setNcuOverAmt(new BigDecimal(lineArray[36]));
                    obj.setNcuLessCaAmt(new BigDecimal(lineArray[37]));
                    obj.setNcuLessCoAmt(new BigDecimal(lineArray[38]));
                    obj.setNcuLessGtAmt(new BigDecimal(lineArray[39]));
                    obj.setNcuJunAmt(new BigDecimal(lineArray[40]));
                    obj.setNcuMisuAmt(new BigDecimal(lineArray[41]));
                    obj.setJunNo3(lineArray[42]);
                    obj.setPayDoYn(lineArray[43]);
                    obj.setTrsfAbano(lineArray[44]);
                    obj.setTrsfAcct(lineArray[45]);
                    obj.setTrsfRefno(lineArray[46]);
                    obj.setTrsfBeneNm(lineArray[47]);
                    obj.setTrsfApplNm(lineArray[48]);
                    obj.setRegEmpNo(lineArray[49]);
                    obj.setRegDt((lineArray[50].equals("")) ? null : formatter.parse(lineArray[50]));
                    obj.setRegTm(lineArray[51]);
                    obj.setUpdEmpNo(lineArray[52]);
                    obj.setUpdDt((lineArray[53].equals("")) ? null : formatter.parse(lineArray[53]));
                    obj.setUpdTm(lineArray[54]);
                    obj.setMt103DocId(lineArray[55]);
                    obj.setFeeRcvBy(lineArray[56]);
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        afex_xpb_advInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPB_ADVInfo> objList) {
        afex_xpb_advInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_xpb_advInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
