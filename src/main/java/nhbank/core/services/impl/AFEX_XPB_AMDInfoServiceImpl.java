package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_XPB_AMDInfo;
import nhbank.core.repositories.AFEX_XPB_AMDInfoRepository;
import nhbank.core.services.AFEX_XPB_AMDInfoService;
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
public class AFEX_XPB_AMDInfoServiceImpl implements AFEX_XPB_AMDInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPB_AMDInfoRepository afex_xpb_amdInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPB_AMD");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPB_AMDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_XPB_AMD.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPB_AMD.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPB_AMDInfo obj = new AFEX_XPB_AMDInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setSeqNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setLstIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setLstIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setCanIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setHisNo(new BigDecimal(lineArray[8]));
                    obj.setBeTenorGb(lineArray[9]);
                    obj.setBeReneReqGb(lineArray[10]);
                    obj.setBeNegoGb(lineArray[11]);
                    obj.setBeHjIlCd(lineArray[12]);
                    obj.setBeManGijIl((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                    obj.setBeHijaTerm(new BigDecimal(lineArray[14]));
                    obj.setBeUsanceTerm(new BigDecimal(lineArray[15]));
                    obj.setBeYmanIl((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                    obj.setBeMoJubIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setBeLstIsuIl((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setBeWhanRcvGb(lineArray[19]);
                    obj.setBeWhanFrt(new BigDecimal(lineArray[20]));
                    obj.setBeIntAmt(new BigDecimal(lineArray[21]));
                    obj.setAfTenorGb(lineArray[22]);
                    obj.setAfReneReqGb(lineArray[23]);
                    obj.setAfNegoGb(lineArray[24]);
                    obj.setAfHjIlCd(lineArray[25]);
                    obj.setAfManGijIl((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                    obj.setAfHijaTerm(new BigDecimal(lineArray[27]));
                    obj.setAfUsanceTerm(new BigDecimal(lineArray[28]));
                    obj.setAfYmanIl((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                    obj.setAfMoJubIl((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                    obj.setAfLstIsuIl((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                    obj.setAfWhanRcvGb(lineArray[32]);
                    obj.setAfWhanFrt(new BigDecimal(lineArray[33]));
                    obj.setAfIntAmt(new BigDecimal(lineArray[34]));
                    obj.setOpNo(lineArray[35]);
                    obj.setMngNo(lineArray[36]);
                    obj.setRegEmpNo(lineArray[37]);
                    obj.setRegDt((lineArray[38].equals("")) ? null : formatter.parse(lineArray[38]));
                    obj.setRegTm(lineArray[39]);
                    obj.setUpdEmpNo(lineArray[40]);
                    obj.setUpdDt((lineArray[41].equals("")) ? null : formatter.parse(lineArray[41]));
                    obj.setUpdTm(lineArray[42]);
                    if (isExist(obj.getRefNo(), obj.getSeqNo())) {
                        afex_xpb_amdInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPB_AMDInfo> objList) {
        afex_xpb_amdInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seqNo) {
        return afex_xpb_amdInfoRepository.existsByRefNoAndSeqNo(refNo, seqNo);
    }
}
