package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AACT_TRX_PLInfo;
import nhbank.core.repositories.AACT_TRX_PLInfoRepository;
import nhbank.core.services.AACT_TRX_PLInfoService;
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
public class AACT_TRX_PLInfoServiceImpl implements AACT_TRX_PLInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AACT_TRX_PLInfoRepository aact_trx_plInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AACT_TRX_PL");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AACT_TRX_PLInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AACT_TRX_PL.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AACT_TRX_PL.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AACT_TRX_PLInfo obj = new AACT_TRX_PLInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSegSeq(new BigDecimal(lineArray[2]));
                    obj.setRefNo2(lineArray[3]);
                    obj.setOrgGb(lineArray[4]);
                    obj.setIlgeGb(lineArray[5]);
                    obj.setYdGb(lineArray[6]);
                    obj.setPstGb(lineArray[7]);
                    obj.setIbfGb(lineArray[8]);
                    obj.setPosGb(lineArray[9]);
                    obj.setActIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setActBr(lineArray[11]);
                    obj.setPlCcy(lineArray[12]);
                    obj.setPlCd(lineArray[13]);
                    obj.setIbjiCd(lineArray[14]);
                    obj.setSlipGb(lineArray[15]);
                    obj.setJukiGb(lineArray[16]);
                    obj.setUpmuCd(lineArray[17]);
                    obj.setGeorCd(lineArray[18]);
                    obj.setFeeCd(lineArray[19]);
                    obj.setGamGb(lineArray[20]);
                    obj.setODsCcy(lineArray[21]);
                    obj.setODsAmt(new BigDecimal(lineArray[22]));
                    obj.setOIntRt(new BigDecimal(lineArray[23]));
                    obj.setOFromIl((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                    obj.setOToIl((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                    obj.setOIlsu(new BigDecimal(lineArray[26]));
                    obj.setOFeeFamt(new BigDecimal(lineArray[27]));
                    obj.setOFeeBamt(new BigDecimal(lineArray[28]));
                    obj.setOApplHrt(new BigDecimal(lineArray[29]));
                    obj.setOFtpRt(new BigDecimal(lineArray[30]));
                    obj.setSDsCcy(lineArray[31]);
                    obj.setSDsAmt(new BigDecimal(lineArray[32]));
                    obj.setSIntRt(new BigDecimal(lineArray[33]));
                    obj.setSFromIl((lineArray[34].equals("")) ? null : formatter.parse(lineArray[34]));
                    obj.setSToIl((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                    obj.setSIlsu(new BigDecimal(lineArray[36]));
                    obj.setSFeeFamt(new BigDecimal(lineArray[37]));
                    obj.setSFeeBamt(new BigDecimal(lineArray[38]));
                    obj.setSApplHrt(new BigDecimal(lineArray[39]));
                    obj.setSBasicHrt(new BigDecimal(lineArray[40]));
                    obj.setSBookHrt(new BigDecimal(lineArray[41]));
                    obj.setSDemiHrt(new BigDecimal(lineArray[42]));
                    obj.setSGosiHrt(new BigDecimal(lineArray[43]));
                    obj.setSFtpRt(new BigDecimal(lineArray[44]));
                    obj.setPCcy(lineArray[45]);
                    obj.setPFamt(new BigDecimal(lineArray[46]));
                    obj.setPBamt(new BigDecimal(lineArray[47]));
                    obj.setPApplHrt(new BigDecimal(lineArray[48]));
                    obj.setPBasicHrt(new BigDecimal(lineArray[49]));
                    obj.setPBookHrt(new BigDecimal(lineArray[50]));
                    obj.setPDemiHrt(new BigDecimal(lineArray[51]));
                    obj.setPGosiHrt(new BigDecimal(lineArray[52]));
                    obj.setPFtpRt(new BigDecimal(lineArray[53]));
                    obj.setYdRefno(lineArray[54]);
                    obj.setYdHisno(new BigDecimal(lineArray[55]));
                    obj.setDocId(lineArray[56]);
                    obj.setRemark(lineArray[57]);
                    obj.setTheirRefno(lineArray[58]);
                    obj.setIfrsDvCd(lineArray[59]);
                    obj.setIdNo(lineArray[60]);
                    obj.setCixNo(lineArray[61]);
                    obj.setRegEmpNo(lineArray[62]);
                    obj.setRegDt((lineArray[63].equals("")) ? null : formatter.parse(lineArray[63]));
                    obj.setRegTm(lineArray[64]);
                    obj.setUpdEmpNo(lineArray[65]);
                    obj.setUpdDt((lineArray[66].equals("")) ? null : formatter.parse(lineArray[66]));
                    obj.setUpdTm(lineArray[67]);
                    if (isExist(obj.getRefNo(), obj.getHisNo(), obj.getSegSeq())) {
                        aact_trx_plInfoRepository.save(obj);
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
    public void insertAll(List<AACT_TRX_PLInfo> objList) {
        aact_trx_plInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo, BigDecimal segSeq) {
        return aact_trx_plInfoRepository.existsByRefNoAndHisNoAndSegSeq(refNo, hisNo, segSeq);
    }
}
