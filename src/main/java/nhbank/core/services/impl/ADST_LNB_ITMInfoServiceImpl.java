package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ADST_LNB_ITMInfo;
import nhbank.core.repositories.ADST_LNB_ITMInfoRepository;
import nhbank.core.services.ADST_LNB_ITMInfoService;
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
public class ADST_LNB_ITMInfoServiceImpl implements ADST_LNB_ITMInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_LNB_ITMInfoRepository adst_lnb_itmInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_LNB_ITM");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_LNB_ITMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ADST_LNB_ITM.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_LNB_ITM.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_LNB_ITMInfo obj = new ADST_LNB_ITMInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setHisNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setTrCd(lineArray[3]);
                    obj.setItmCd(lineArray[4]);
                    obj.setBfTotExpIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                    obj.setAfTotExpIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                    obj.setBfRealExpIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                    obj.setAfRealExpIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setBfRepayGb(lineArray[9]);
                    obj.setAfRepayGb(lineArray[10]);
                    obj.setBfSchGb(lineArray[11]);
                    obj.setAfSchGb(lineArray[12]);
                    obj.setBfAccrualGb(lineArray[13]);
                    obj.setAfAccrualGb(lineArray[14]);
                    obj.setBfActGb(lineArray[15]);
                    obj.setAfActGb(lineArray[16]);
                    obj.setBfGraceDays(new BigDecimal(lineArray[17]));
                    obj.setAfGraceDays(new BigDecimal(lineArray[18]));
                    obj.setBfTimesPast(new BigDecimal(lineArray[19]));
                    obj.setAfTimesPast(new BigDecimal(lineArray[20]));
                    obj.setBfIntAdjYn(lineArray[21]);
                    obj.setAfIntAdjYn(lineArray[22]);
                    obj.setBfEvidNo(lineArray[23]);
                    obj.setAfEvidNo(lineArray[24]);
                    obj.setBfEvidCcy(lineArray[25]);
                    obj.setAfEvidCcy(lineArray[26]);
                    obj.setBfEvidAmt(new BigDecimal(lineArray[27]));
                    obj.setAfEvidAmt(new BigDecimal(lineArray[28]));
                    obj.setBfAutoDebitYn(lineArray[29]);
                    obj.setAfAutoDebitYn(lineArray[30]);
                    obj.setBfLastChgYn(lineArray[31]);
                    obj.setAfLastChgYn(lineArray[32]);
                    obj.setBfLastChgRt(new BigDecimal(lineArray[33]));
                    obj.setAfLastChgRt(new BigDecimal(lineArray[34]));
                    obj.setBfPastDueRt(new BigDecimal(lineArray[35]));
                    obj.setAfPastDueRt(new BigDecimal(lineArray[36]));
                    obj.setBfAccrualRt(new BigDecimal(lineArray[37]));
                    obj.setAfAccrualRt(new BigDecimal(lineArray[38]));
                    obj.setBfRepayGap(new BigDecimal(lineArray[39]));
                    obj.setAfRepayGap(new BigDecimal(lineArray[40]));
                    obj.setBfRepayGapGb(lineArray[41]);
                    obj.setAfRepayGapGb(lineArray[42]);
                    obj.setBfRepayTerm(new BigDecimal(lineArray[43]));
                    obj.setAfRepayTerm(new BigDecimal(lineArray[44]));
                    obj.setBfRepayAdjSeq(new BigDecimal(lineArray[45]));
                    obj.setAfRepayAdjSeq(new BigDecimal(lineArray[46]));
                    obj.setBfPrnYcGb(lineArray[47]);
                    obj.setAfPrnYcGb(lineArray[48]);
                    obj.setBfPrnYcIl((lineArray[49].equals("")) ? null : formatter.parse(lineArray[49]));
                    obj.setAfPrnYcIl((lineArray[50].equals("")) ? null : formatter.parse(lineArray[50]));
                    obj.setBfGuchTerm(new BigDecimal(lineArray[51]));
                    obj.setAfGuchTerm(new BigDecimal(lineArray[52]));
                    obj.setBfIntGap(new BigDecimal(lineArray[53]));
                    obj.setAfIntGap(new BigDecimal(lineArray[54]));
                    obj.setBfIntGapGb(lineArray[55]);
                    obj.setAfIntGapGb(lineArray[56]);
                    obj.setBfIntAdjSeq(new BigDecimal(lineArray[57]));
                    obj.setAfIntAdjSeq(new BigDecimal(lineArray[58]));
                    obj.setBfIntYcGb(lineArray[59]);
                    obj.setAfIntYcGb(lineArray[60]);
                    obj.setBfIntYcIl((lineArray[61].equals("")) ? null : formatter.parse(lineArray[61]));
                    obj.setAfIntYcIl((lineArray[62].equals("")) ? null : formatter.parse(lineArray[62]));
                    obj.setBfAdvArrGb(lineArray[63]);
                    obj.setAfAdvArrGb(lineArray[64]);
                    obj.setBfSingleBothType(lineArray[65]);
                    obj.setAfSingleBothType(lineArray[66]);
                    obj.setBfAccrType(lineArray[67]);
                    obj.setAfAccrType(lineArray[68]);
                    obj.setBfBsnsDayRule(lineArray[69]);
                    obj.setAfBsnsDayRule(lineArray[70]);
                    obj.setBfRollGap(new BigDecimal(lineArray[71]));
                    obj.setAfRollGap(new BigDecimal(lineArray[72]));
                    obj.setBfRollGapGb(lineArray[73]);
                    obj.setAfRollGapGb(lineArray[74]);
                    obj.setBfFixFltGb(lineArray[75]);
                    obj.setAfFixFltGb(lineArray[76]);
                    obj.setBfSpreadGb(lineArray[77]);
                    obj.setAfSpreadGb(lineArray[78]);
                    obj.setBfSpreadRt(new BigDecimal(lineArray[79]));
                    obj.setAfSpreadRt(new BigDecimal(lineArray[80]));
                    obj.setBfLstRt(new BigDecimal(lineArray[81]));
                    obj.setAfLstRt(new BigDecimal(lineArray[82]));
                    obj.setBfRateChgYn(lineArray[83]);
                    obj.setAfRateChgYn(lineArray[84]);
                    obj.setFstIbIl((lineArray[85].equals("")) ? null : formatter.parse(lineArray[85]));
                    obj.setLstAcIl((lineArray[86].equals("")) ? null : formatter.parse(lineArray[86]));
                    obj.setLstIbIl((lineArray[87].equals("")) ? null : formatter.parse(lineArray[87]));
                    obj.setBfNxRollIl((lineArray[88].equals("")) ? null : formatter.parse(lineArray[88]));
                    obj.setAfNxRollIl((lineArray[89].equals("")) ? null : formatter.parse(lineArray[89]));
                    obj.setBfNxtRt(new BigDecimal(lineArray[90]));
                    obj.setAfNxtRt(new BigDecimal(lineArray[91]));
                    obj.setBfNxtSchYn(lineArray[92]);
                    obj.setAfNxtSchYn(lineArray[93]);
                    obj.setBfNewSchYn(lineArray[94]);
                    obj.setAfNewSchYn(lineArray[95]);
                    obj.setRegEmpNo(lineArray[96]);
                    obj.setRegDt((lineArray[97].equals("")) ? null : formatter.parse(lineArray[97]));
                    obj.setRegTm(lineArray[98]);
                    obj.setUpdEmpNo(lineArray[99]);
                    obj.setUpdDt((lineArray[100].equals("")) ? null : formatter.parse(lineArray[100]));
                    obj.setUpdTm(lineArray[101]);
                    if (isExist(obj.getRefNo(), obj.getHisNo())) {
                        adst_lnb_itmInfoRepository.save(obj);
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
    public void insertAll(List<ADST_LNB_ITMInfo> objList) {
        adst_lnb_itmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal hisNo) {
        return adst_lnb_itmInfoRepository.existsByRefNoAndHisNo(refNo, hisNo);
    }
}
