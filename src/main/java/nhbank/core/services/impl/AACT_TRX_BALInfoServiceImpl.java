package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AACT_TRX_BALInfo;
import nhbank.core.repositories.AACT_TRX_BALInfoRepository;
import nhbank.core.services.AACT_TRX_BALInfoService;
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
public class AACT_TRX_BALInfoServiceImpl implements AACT_TRX_BALInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AACT_TRX_BALInfoRepository aact_trx_balInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AACT_TRX_BAL");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AACT_TRX_BALInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AACT_TRX_BAL.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AACT_TRX_BAL.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AACT_TRX_BALInfo obj = new AACT_TRX_BALInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setBalDvCd(lineArray[1]);
                    obj.setDtlsBalDvCd(lineArray[2]);
                    obj.setIfrsDvCd(lineArray[3]);
                    obj.setAtitCd(lineArray[4]);
                    obj.setCcy(lineArray[5]);
                    obj.setApclStrDt((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setApclEndDt((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setBrNo(lineArray[8]);
                    obj.setBalAmt(new BigDecimal(lineArray[9]));
                    obj.setSubjCd(lineArray[10]);
                    obj.setOpNo(lineArray[11]);
                    obj.setIdNo(lineArray[12]);
                    obj.setCixNo(lineArray[13]);
                    obj.setSts(lineArray[14]);
                    obj.setRegEmpNo(lineArray[15]);
                    obj.setRegDt((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                    obj.setRegTm(lineArray[17]);
                    obj.setUpdEmpNo(lineArray[18]);
                    obj.setUpdDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setUpdTm(lineArray[20]);
                    if (isExist(obj.getRefNo(), obj.getBalDvCd(), obj.getDtlsBalDvCd(), obj.getIfrsDvCd(), obj.getAtitCd(), obj.getCcy(), obj.getApclStrDt(), obj.getApclEndDt())) {
                        aact_trx_balInfoRepository.save(obj);
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
    public void insertAll(List<AACT_TRX_BALInfo> objList) {
        aact_trx_balInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, String balDvCd, String dtlsBalDvCd, String ifrsDvCd, String atitCd, String ccy, Date apclStrDt, Date apclEndDt) {
        return aact_trx_balInfoRepository.existsByRefNoAndBalDvCdAndDtlsBalDvCdAndIfrsDvCdAndAtitCdAndCcyAndApclStrDtAndApclEndDt(refNo, balDvCd, dtlsBalDvCd, ifrsDvCd, atitCd, ccy, apclStrDt, apclEndDt);
    }
}
