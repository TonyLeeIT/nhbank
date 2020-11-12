package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_CONT_BASEInfo;
import nhbank.core.repositories.ACOM_CONT_BASEInfoRepository;
import nhbank.core.services.ACOM_CONT_BASEInfoService;
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
public class ACOM_CONT_BASEInfoServiceImpl implements ACOM_CONT_BASEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_CONT_BASEInfoRepository acom_cont_baseInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_CONT_BASE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_CONT_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_CONT_BASE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_CONT_BASE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_CONT_BASEInfo obj = new ACOM_CONT_BASEInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setCntyCd(lineArray[1]);
                    obj.setRgnCd(lineArray[2]);
                    obj.setSts(lineArray[3]);
                    obj.setInactRsnCd(lineArray[4]);
                    obj.setLstHisNo(new BigDecimal(lineArray[5]));
                    obj.setTrcllStCd(lineArray[6]);
                    obj.setMgntBrNo(lineArray[7]);
                    obj.setBrfcCd(lineArray[8]);
                    obj.setPfmcMgntBrNo(lineArray[9]);
                    obj.setIdNo(lineArray[10]);
                    obj.setCixNo(lineArray[11]);
                    obj.setDeptSeqNo(new BigDecimal(lineArray[12]));
                    obj.setSubjCd(lineArray[13]);
                    obj.setBnkDvCd(lineArray[14]);
                    obj.setPrdCd(lineArray[15]);
                    obj.setLimApvNo(lineArray[16]);
                    obj.setCurCd(lineArray[17]);
                    obj.setTrscDt((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setProcBascDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setDdacRnwDt((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setLstTrscDt((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                    obj.setContEndDt((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                    obj.setHsCd(lineArray[23]);
                    obj.setEntrMgntNo(lineArray[24]);
                    obj.setCmltMlgeAmt(new BigDecimal(lineArray[25]));
                    obj.setCorpScalCd(lineArray[26]);
                    obj.setThrCntyCd(lineArray[27]);
                    obj.setOriplCntyCd(lineArray[28]);
                    obj.setEimpDclNo(lineArray[29]);
                    obj.setDomsOtsdDvCd(lineArray[30]);
                    obj.setLongShtmDvCd(lineArray[31]);
                    obj.setPfmcDvCd(lineArray[32]);
                    obj.setAstRelnCrpdYn(lineArray[33]);
                    obj.setDbtAptcYn(lineArray[34]);
                    obj.setSugtEmpRlcoCd(lineArray[35]);
                    obj.setSugtEmpNo(lineArray[36]);
                    obj.setTmanEmpNo(lineArray[37]);
                    obj.setPbRmOffcrCd(lineArray[38]);
                    obj.setMastauthDvCd(lineArray[39]);
                    obj.setSubRefNo(lineArray[40]);
                    obj.setRegEmpNo(lineArray[41]);
                    obj.setRegDt((lineArray[42].equals("")) ? null : formatter.parse(lineArray[42]));
                    obj.setRegTm(lineArray[43]);
                    obj.setUpdEmpNo(lineArray[44]);
                    obj.setUpdDt((lineArray[45].equals("")) ? null : formatter.parse(lineArray[45]));
                    obj.setUpdTm(lineArray[46]);
                    if (isExist(obj.getRefNo(), obj.getCntyCd(), obj.getRgnCd())) {
                        acom_cont_baseInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_CONT_BASEInfo> objList) {
        acom_cont_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, String cntyCd, String rgnCd) {
        return acom_cont_baseInfoRepository.existsByRefNoAndCntyCdAndRgnCd(refNo, cntyCd, rgnCd);
    }
}
