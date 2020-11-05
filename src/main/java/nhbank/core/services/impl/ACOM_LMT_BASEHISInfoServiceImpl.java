package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_LMT_BASEHISInfo;
import nhbank.core.repositories.ACOM_LMT_BASEHISInfoRepository;
import nhbank.core.services.ACOM_LMT_BASEHISInfoService;
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
public class ACOM_LMT_BASEHISInfoServiceImpl implements ACOM_LMT_BASEHISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_LMT_BASEHISInfoRepository acom_lmt_basehisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_LMT_BASEHIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_LMT_BASEHISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_LMT_BASEHIS.txt");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_LMT_BASEHIS.txt"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_LMT_BASEHISInfo obj = new ACOM_LMT_BASEHISInfo();
                    obj.setSngNo(lineArray[0]);
                    obj.setActCd(lineArray[1]);
                    obj.setHisNo(new BigDecimal(lineArray[2]));
                    obj.setHisGb(lineArray[3]);
                    obj.setTrCd(lineArray[4]);
                    obj.setIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setAcIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setGisIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setCanIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setMngBr(lineArray[9]);
                    obj.setCixNo(lineArray[10]);
                    obj.setSngSts(lineArray[11]);
                    obj.setSngInfo(lineArray[12]);
                    obj.setSisSngno(lineArray[13]);
                    obj.setPogwlGb(lineArray[14]);
                    obj.setRevolGb(lineArray[15]);
                    obj.setGihanGb(lineArray[16]);
                    obj.setExpMm(new BigDecimal(lineArray[17]));
                    obj.setExpIl((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setSngIl((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setSngCcy(lineArray[20]);
                    obj.setSngAmt(new BigDecimal(lineArray[21]));
                    obj.setSngAbtrt(new BigDecimal(lineArray[22]));
                    obj.setSngAbtamt(new BigDecimal(lineArray[23]));
                    obj.setActAmt(new BigDecimal(lineArray[24]));
                    obj.setActRtgb(lineArray[25]);
                    obj.setActRate(new BigDecimal(lineArray[26]));
                    obj.setActSprd(new BigDecimal(lineArray[27]));
                    obj.setActRtjo(lineArray[28]);
                    obj.setSilCnt(new BigDecimal(lineArray[29]));
                    obj.setSilJanamt(new BigDecimal(lineArray[30]));
                    obj.setSilAccum(new BigDecimal(lineArray[31]));
                    obj.setSilWoijan(new BigDecimal(lineArray[32]));
                    obj.setSilDjgjan(new BigDecimal(lineArray[33]));
                    obj.setSilLstil((lineArray[34].equals("")) ? null : formatter.parse(lineArray[34]));
                    obj.setBojBcnt(new BigDecimal(lineArray[35]));
                    obj.setBojBjan(new BigDecimal(lineArray[36]));
                    obj.setBojFcnt(new BigDecimal(lineArray[37]));
                    obj.setBojFjan(new BigDecimal(lineArray[38]));
                    obj.setWoiYongdo(new BigDecimal(lineArray[39]));
                    obj.setWoiSunhu(lineArray[40]);
                    obj.setWoiInttrm(new BigDecimal(lineArray[41]));
                    obj.setWoiGaetrm(new BigDecimal(lineArray[42]));
                    obj.setWoiSutgb(lineArray[43]);
                    obj.setSngCond(lineArray[44]);
                    obj.setIsSngno(lineArray[45]);
                    obj.setIsCixno(lineArray[46]);
                    obj.setIsBrno(lineArray[47]);
                    obj.setIsIl((lineArray[48].equals("")) ? null : formatter.parse(lineArray[48]));
                    obj.setIkSngno(lineArray[49]);
                    obj.setIkCixno(lineArray[50]);
                    obj.setIkBrno(lineArray[51]);
                    obj.setIkIl((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
                    obj.setSngAplseq(new BigDecimal(lineArray[53]));
                    obj.setSngAuth(lineArray[54]);
                    obj.setLstIbil((lineArray[55].equals("")) ? null : formatter.parse(lineArray[55]));
                    obj.setSngBrno(lineArray[56]);
                    obj.setSngClerk(lineArray[57]);
                    obj.setSngAstmgr(lineArray[58]);
                    obj.setSngLonmgr(lineArray[59]);
                    obj.setSngChajang(lineArray[60]);
                    obj.setSngJumjang(lineArray[61]);
                    obj.setBojMjAmt(new BigDecimal(lineArray[62]));
                    obj.setRateGb(lineArray[63]);
                    obj.setRateJugi(lineArray[64]);
                    obj.setSpread(new BigDecimal(lineArray[65]));
                    obj.setYoncheRate(new BigDecimal(lineArray[66]));
                    obj.setGraceDay(new BigDecimal(lineArray[67]));
                    obj.setDayCntBasis(lineArray[68]);
                    obj.setBusiDayRule(lineArray[69]);
                    obj.setPenalRate(new BigDecimal(lineArray[70]));
                    obj.setTrBr(lineArray[71]);
                    obj.setSdBr(lineArray[72]);
                    obj.setTrTime(lineArray[73]);
                    obj.setOpNo(lineArray[74]);
                    obj.setMngNo(lineArray[75]);
                    obj.setAgreeNo(lineArray[76]);
                    obj.setCondSts(lineArray[77]);
                    obj.setRegEmpNo(lineArray[78]);
                    obj.setRegDt((lineArray[79].equals("")) ? null : formatter.parse(lineArray[79]));
                    obj.setRegTm(lineArray[80]);
                    obj.setUpdEmpNo(lineArray[81]);
                    obj.setUpdDt((lineArray[82].equals("")) ? null : formatter.parse(lineArray[82]));
                    obj.setUpdTm(lineArray[83]);
                    if (isExist(obj.getSngNo(), obj.getActCd(), obj.getHisNo(), obj.getHisGb())) {
                        acom_lmt_basehisInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_LMT_BASEHISInfo> objList) {
        acom_lmt_basehisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String sngNo, String actCd, BigDecimal hisNo, String hisGb) {
        return acom_lmt_basehisInfoRepository.existsBySngNoAndActCdAndHisNoAndHisGb(sngNo, actCd, hisNo, hisGb);
    }
}
