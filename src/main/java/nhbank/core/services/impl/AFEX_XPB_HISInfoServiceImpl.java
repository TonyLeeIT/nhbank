package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_XPB_HISInfo;
import nhbank.core.repositories.AFEX_XPB_HISInfoRepository;
import nhbank.core.services.AFEX_XPB_HISInfoService;
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
public class AFEX_XPB_HISInfoServiceImpl implements AFEX_XPB_HISInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_XPB_HISInfoRepository afex_xpb_hisInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_XPB_HIS");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_XPB_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_XPB_HIS.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_XPB_HIS.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_XPB_HISInfo obj = new AFEX_XPB_HISInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setTrGb(lineArray[3]);
                    obj.setTrCd(lineArray[4]);
                    obj.setCixNo(lineArray[5]);
                    obj.setIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setAcIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setGisIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setCanIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                    obj.setSdHisNo(new BigDecimal(lineArray[10]));
                    obj.setTrCcy(lineArray[11]);
                    obj.setTrFamt(new BigDecimal(lineArray[12]));
                    obj.setTrBamt(new BigDecimal(lineArray[13]));
                    obj.setAfJan(new BigDecimal(lineArray[14]));
                    obj.setFeeMd(lineArray[15]);
                    obj.setTrBr(lineArray[16]);
                    obj.setSdBr(lineArray[17]);
                    obj.setIbTime(lineArray[18]);
                    obj.setOpNo(lineArray[19]);
                    obj.setMngNo(lineArray[20]);
                    obj.setIbjiMd(lineArray[21]);
                    obj.setYdSeq(new BigDecimal(lineArray[22]));
                    obj.setYdGuja(lineArray[23]);
                    obj.setEdircvDocNm(lineArray[24]);
                    obj.setEdircvIl((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                    obj.setEdircvSeqNo(new BigDecimal(lineArray[26]));
                    obj.setEdisndDoc1Nm(lineArray[27]);
                    obj.setEdisnd1SeqNo(new BigDecimal(lineArray[28]));
                    obj.setEdisndDoc2Nm(lineArray[29]);
                    obj.setEdisnd2SeqNo(new BigDecimal(lineArray[30]));
                    obj.setEdisndDoc3Nm(lineArray[31]);
                    obj.setEdisnd3SeqNo(new BigDecimal(lineArray[32]));
                    obj.setEdisndDoc4Nm(lineArray[33]);
                    obj.setEdisnd4SeqNo(new BigDecimal(lineArray[34]));
                    obj.setEdisndDoc5Nm(lineArray[35]);
                    obj.setEdisnd5SeqNo(new BigDecimal(lineArray[36]));
                    obj.setBokSeq(new BigDecimal(lineArray[37]));
                    obj.setCdSngNo(lineArray[38]);
                    obj.setCdSilSeq(new BigDecimal(lineArray[39]));
                    obj.setFtpSngNo(lineArray[40]);
                    obj.setFtpSilSeq(new BigDecimal(lineArray[41]));
                    obj.setIjGb(lineArray[42]);
                    obj.setJichGb(lineArray[43]);
                    obj.setHijaGb(lineArray[44]);
                    obj.setPlCd(lineArray[45]);
                    obj.setJichmGb(lineArray[46]);
                    obj.setHcGb(lineArray[47]);
                    obj.setBijaGb(lineArray[48]);
                    obj.setBeTerm(new BigDecimal(lineArray[49]));
                    obj.setBeHterm(new BigDecimal(lineArray[50]));
                    obj.setCrBamt(new BigDecimal(lineArray[51]));
                    obj.setBeLisuIl((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
                    obj.setBeHrt(new BigDecimal(lineArray[53]));
                    obj.setBeHRt2(new BigDecimal(lineArray[54]));
                    obj.setBeYmanIl((lineArray[55].equals("")) ? null : formatter.parse(lineArray[55]));
                    obj.setBeYdcIl((lineArray[56].equals("")) ? null : formatter.parse(lineArray[56]));
                    obj.setBeShIl((lineArray[57].equals("")) ? null : formatter.parse(lineArray[57]));
                    obj.setBeBudoIl((lineArray[58].equals("")) ? null : formatter.parse(lineArray[58]));
                    obj.setBeFtpRt(new BigDecimal(lineArray[59]));
                    obj.setBeIkisHis(new BigDecimal(lineArray[60]));
                    obj.setBeIkisIj(new BigDecimal(lineArray[61]));
                    obj.setBeHdSngNo(lineArray[62]);
                    obj.setBePbrmNo(lineArray[63]);
                    obj.setGitaAmt(new BigDecimal(lineArray[64]));
                    obj.setCaSeq(new BigDecimal(lineArray[65]));
                    obj.setBaeseoIl((lineArray[66].equals("")) ? null : formatter.parse(lineArray[66]));
                    obj.setActpayHisNo1(new BigDecimal(lineArray[67]));
                    obj.setSuspayHisNo1(new BigDecimal(lineArray[68]));
                    obj.setSuspayHisNo2(new BigDecimal(lineArray[69]));
                    obj.setRegEmpNo(lineArray[70]);
                    obj.setRegDt((lineArray[71].equals("")) ? null : formatter.parse(lineArray[71]));
                    obj.setRegTm(lineArray[72]);
                    obj.setUpdEmpNo(lineArray[73]);
                    obj.setUpdDt((lineArray[74].equals("")) ? null : formatter.parse(lineArray[74]));
                    obj.setUpdTm(lineArray[75]);
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        afex_xpb_hisInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPB_HISInfo> objList) {
        afex_xpb_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return afex_xpb_hisInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
