package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ADST_DPB_TRANInfo;
import nhbank.core.repositories.ADST_DPB_TRANInfoRepository;
import nhbank.core.services.ADST_DPB_TRANInfoService;
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
public class ADST_DPB_TRANInfoServiceImpl implements ADST_DPB_TRANInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ADST_DPB_TRANInfoRepository adst_dpb_tranInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ADST_DPB_TRAN");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ADST_DPB_TRANInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ADST_DPB_TRAN.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_TRAN.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ADST_DPB_TRANInfo obj = new ADST_DPB_TRANInfo();
                    obj.setAcctNo(lineArray[0]);
                    obj.setIbIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                    obj.setTrxNo(new BigDecimal(lineArray[2]));
                    obj.setMngBr(lineArray[3]);
                    obj.setPrintGb(lineArray[4]);
                    obj.setNoPbookGb(lineArray[5]);
                    obj.setNoPrintGb(lineArray[6]);
                    obj.setSts(lineArray[7]);
                    obj.setYdGb(lineArray[8]);
                    obj.setSlipGb(lineArray[9]);
                    obj.setMuinjaGb(lineArray[10]);
                    obj.setIbgmSlipGb(lineArray[11]);
                    obj.setIntSlipGb(lineArray[12]);
                    obj.setTaxSlipGb(lineArray[13]);
                    obj.setJigbYdGb(lineArray[14]);
                    obj.setChkYdGb(lineArray[15]);
                    obj.setCashTrGb(lineArray[16]);
                    obj.setFxTrGb(lineArray[17]);
                    obj.setIbjiGb(lineArray[18]);
                    obj.setTrCd(lineArray[19]);
                    obj.setSubTrCd(lineArray[20]);
                    obj.setMechGb(lineArray[21]);
                    obj.setFundGb(lineArray[22]);
                    obj.setTrCcy(lineArray[23]);
                    obj.setTrAmt(new BigDecimal(lineArray[24]));
                    obj.setTrAamt(new BigDecimal(lineArray[25]));
                    obj.setAfJan(new BigDecimal(lineArray[26]));
                    obj.setChkGb(lineArray[27]);
                    obj.setChkNo(lineArray[28]);
                    obj.setAcIl((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                    obj.setGisIl((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                    obj.setOpNo(lineArray[31]);
                    obj.setTrBr(lineArray[32]);
                    obj.setTseqNo(lineArray[33]);
                    obj.setTrBk(lineArray[34]);
                    obj.setTrTime(lineArray[35]);
                    obj.setRemark(lineArray[36]);
                    obj.setReqCustId(lineArray[37]);
                    obj.setYdRefNo(lineArray[38]);
                    obj.setYdTheirRefNo(lineArray[39]);
                    obj.setYdHisNo(new BigDecimal(lineArray[40]));
                    obj.setSdBk(lineArray[41]);
                    obj.setTotFee(new BigDecimal(lineArray[42]));
                    obj.setTax1Amt(new BigDecimal(lineArray[43]));
                    obj.setTax2Amt(new BigDecimal(lineArray[44]));
                    obj.setTax3Amt(new BigDecimal(lineArray[45]));
                    obj.setTax4Amt(new BigDecimal(lineArray[46]));
                    obj.setIntPayCnt(new BigDecimal(lineArray[47]));
                    obj.setBfIntCalIl((lineArray[48].equals("")) ? null : formatter.parse(lineArray[48]));
                    obj.setBfIntRcvIl((lineArray[49].equals("")) ? null : formatter.parse(lineArray[49]));
                    obj.setDptRt(new BigDecimal(lineArray[50]));
                    obj.setApplHrt(new BigDecimal(lineArray[51]));
                    obj.setPjHrt(new BigDecimal(lineArray[52]));
                    obj.setBookHrt(new BigDecimal(lineArray[53]));
                    obj.setBasicHrt(new BigDecimal(lineArray[54]));
                    obj.setGosiHrt(new BigDecimal(lineArray[55]));
                    obj.setDemiHrt(new BigDecimal(lineArray[56]));
                    obj.setExRtSngNo(new BigDecimal(lineArray[57]));
                    obj.setDptRtSngNo(new BigDecimal(lineArray[58]));
                    obj.setCashFee(new BigDecimal(lineArray[59]));
                    obj.setFedDocId(lineArray[60]);
                    obj.setHisNo(new BigDecimal(lineArray[61]));
                    obj.setLstIbIl((lineArray[62].equals("")) ? null : formatter.parse(lineArray[62]));
                    obj.setLstTime(lineArray[63]);
                    obj.setSelfMngIl((lineArray[64].equals("")) ? null : formatter.parse(lineArray[64]));
                    obj.setCheck1Amt(new BigDecimal(lineArray[65]));
                    obj.setCheck2Amt(new BigDecimal(lineArray[66]));
                    obj.setCheck3Amt(new BigDecimal(lineArray[67]));
                    obj.setCheck1Aamt(new BigDecimal(lineArray[68]));
                    obj.setCheck2Aamt(new BigDecimal(lineArray[69]));
                    obj.setCheck3Aamt(new BigDecimal(lineArray[70]));
                    obj.setChnlRefNo(lineArray[71]);
                    obj.setChnlHisNo(new BigDecimal(lineArray[72]));
                    obj.setEtcFee1(new BigDecimal(lineArray[73]));
                    obj.setOldTrxNo(lineArray[74]);
                    obj.setFromDt((lineArray[75].equals("")) ? null : formatter.parse(lineArray[75]));
                    obj.setToDt((lineArray[76].equals("")) ? null : formatter.parse(lineArray[76]));
                    obj.setRegEmpNo(lineArray[77]);
                    obj.setRegDt((lineArray[78].equals("")) ? null : formatter.parse(lineArray[78]));
                    obj.setRegTm(lineArray[79]);
                    obj.setUpdEmpNo(lineArray[80]);
                    obj.setUpdDt((lineArray[81].equals("")) ? null : formatter.parse(lineArray[81]));
                    obj.setUpdTm(lineArray[82]);
                    if (isExist(obj.getAcctNo(), obj.getIbIl(), obj.getTrxNo())) {
                        adst_dpb_tranInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_TRANInfo> objList) {
        adst_dpb_tranInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, Date ibIl, BigDecimal trxNo) {
        return adst_dpb_tranInfoRepository.existsByAcctNoAndIbIlAndTrxNo(acctNo, ibIl, trxNo);
    }
}
