package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_RIH_REFUNDInfo;
import nhbank.core.repositories.AFEX_RIH_REFUNDInfoRepository;
import nhbank.core.services.AFEX_RIH_REFUNDInfoService;
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
public class AFEX_RIH_REFUNDInfoServiceImpl implements AFEX_RIH_REFUNDInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_RIH_REFUNDInfoRepository afex_rih_refundInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_RIH_REFUND");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_RIH_REFUNDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_RIH_REFUND.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_RIH_REFUND.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_RIH_REFUNDInfo obj = new AFEX_RIH_REFUNDInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setSeqNo(new BigDecimal(lineArray[1]));
                    obj.setSts(lineArray[2]);
                    obj.setRtCd(lineArray[3]);
                    obj.setMoneyCd(lineArray[4]);
                    obj.setRcvGb(lineArray[5]);
                    obj.setRcvBr(lineArray[6]);
                    obj.setCixNo(lineArray[7]);
                    obj.setCcy(lineArray[8]);
                    obj.setFamt(new BigDecimal(lineArray[9]));
                    obj.setOrgFamt(new BigDecimal(lineArray[10]));
                    obj.setTheirRefNo(lineArray[11]);
                    obj.setChGb(lineArray[12]);
                    obj.setChAmt(new BigDecimal(lineArray[13]));
                    obj.setMjGb(lineArray[14]);
                    obj.setFeeCnt(new BigDecimal(lineArray[15]));
                    obj.setFeeMsg(lineArray[16]);
                    obj.setInmsgGb(lineArray[17]);
                    obj.setInMsg(lineArray[18]);
                    obj.setCreditCur(lineArray[19]);
                    obj.setCreditAmt(new BigDecimal(lineArray[20]));
                    obj.setCreditIl((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                    obj.setApplNm(lineArray[22]);
                    obj.setApplAddr1(lineArray[23]);
                    obj.setApplAddr2(lineArray[24]);
                    obj.setApplAddr3(lineArray[25]);
                    obj.setApliAcno(lineArray[26]);
                    obj.setJgDepoCd(lineArray[27]);
                    obj.setJgDepoNm(lineArray[28]);
                    obj.setJgBkcd(lineArray[29]);
                    obj.setJgBkAbano(lineArray[30]);
                    obj.setJgBknm(lineArray[31]);
                    obj.setJgBkAddr1(lineArray[32]);
                    obj.setJgBkAddr2(lineArray[33]);
                    obj.setJgBkAddr3(lineArray[34]);
                    obj.setRcvNm(lineArray[35]);
                    obj.setRcvAddr1(lineArray[36]);
                    obj.setRcvAddr2(lineArray[37]);
                    obj.setRcvAddr3(lineArray[38]);
                    obj.setRcvAcctNo(lineArray[39]);
                    obj.setDepoCode(lineArray[40]);
                    obj.setDepoName1(lineArray[41]);
                    obj.setSbankBkcd(lineArray[42]);
                    obj.setSbankBknm(lineArray[43]);
                    obj.setSbankAddr1(lineArray[44]);
                    obj.setSbankAddr2(lineArray[45]);
                    obj.setSbankAddr3(lineArray[46]);
                    obj.setCbankBkcd(lineArray[47]);
                    obj.setCbankBknm(lineArray[48]);
                    obj.setCbankAddr1(lineArray[49]);
                    obj.setCbankAddr2(lineArray[50]);
                    obj.setCbankAddr3(lineArray[51]);
                    obj.setValueDate((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
                    obj.setFeeCur(lineArray[53]);
                    obj.setFeeAmt(new BigDecimal(lineArray[54]));
                    obj.setInfo70Name1(lineArray[55]);
                    obj.setInfo70Name2(lineArray[56]);
                    obj.setInfo70Name3(lineArray[57]);
                    obj.setInfo70Name4(lineArray[58]);
                    obj.setInfoName1(lineArray[59]);
                    obj.setInfoName2(lineArray[60]);
                    obj.setInfoName3(lineArray[61]);
                    obj.setInfoName4(lineArray[62]);
                    obj.setInfoName5(lineArray[63]);
                    obj.setInfoName6(lineArray[64]);
                    obj.setIntBkcd(lineArray[65]);
                    obj.setIntBknm(lineArray[66]);
                    obj.setIntBkAddr1(lineArray[67]);
                    obj.setIntBkAddr2(lineArray[68]);
                    obj.setIntBkAddr3(lineArray[69]);
                    obj.setIntBkAcct(lineArray[70]);
                    obj.setJgBkAcct(lineArray[71]);
                    obj.setProcType(lineArray[72]);
                    obj.setImad(lineArray[73]);
                    obj.setOmad(lineArray[74]);
                    obj.setRequestIl((lineArray[75].equals("")) ? null : formatter.parse(lineArray[75]));
                    obj.setRequestHis(new BigDecimal(lineArray[76]));
                    obj.setAmendIl((lineArray[77].equals("")) ? null : formatter.parse(lineArray[77]));
                    obj.setAmendHis(new BigDecimal(lineArray[78]));
                    obj.setOutmsgGb(lineArray[79]);
                    obj.setRefundRecvMttype(lineArray[80]);
                    obj.setRefundRecvMsg(lineArray[81]);
                    obj.setRefundRecvIl((lineArray[82].equals("")) ? null : formatter.parse(lineArray[82]));
                    obj.setQuesSendMttype(lineArray[83]);
                    obj.setQuesSendMsg(lineArray[84]);
                    obj.setQuesSendIl((lineArray[85].equals("")) ? null : formatter.parse(lineArray[85]));
                    obj.setCnfmRecvMttype(lineArray[86]);
                    obj.setCnfmRecvMsg(lineArray[87]);
                    obj.setCnfmRecvIl((lineArray[88].equals("")) ? null : formatter.parse(lineArray[88]));
                    obj.setRfndSendMttype(lineArray[89]);
                    obj.setRfndSendMsg(lineArray[90]);
                    obj.setRfndSendIl((lineArray[91].equals("")) ? null : formatter.parse(lineArray[91]));
                    obj.setRefundAmt(new BigDecimal(lineArray[92]));
                    obj.setAmdAmt(new BigDecimal(lineArray[93]));
                    obj.setAmdComm(new BigDecimal(lineArray[94]));
                    obj.setAmdFee(new BigDecimal(lineArray[95]));
                    obj.setRefundTheirRef(lineArray[96]);
                    obj.setRefundRemark1(lineArray[97]);
                    obj.setRefundRemark2(lineArray[98]);
                    obj.setRefundRemark3(lineArray[99]);
                    obj.setRefundRemark4(lineArray[100]);
                    obj.setRefundRemark5(lineArray[101]);
                    obj.setRefundRemark6(lineArray[102]);
                    obj.setRefundRemark7(lineArray[103]);
                    obj.setRefundRemark8(lineArray[104]);
                    obj.setMngBr(lineArray[105]);
                    obj.setOperId(lineArray[106]);
                    obj.setMngrId(lineArray[107]);
                    obj.setRegEmpNo(lineArray[108]);
                    obj.setRegDt((lineArray[109].equals("")) ? null : formatter.parse(lineArray[109]));
                    obj.setRegTm(lineArray[110]);
                    obj.setUpdEmpNo(lineArray[111]);
                    obj.setUpdDt((lineArray[112].equals("")) ? null : formatter.parse(lineArray[112]));
                    obj.setUpdTm(lineArray[113]);
                    if (isExist(obj.getRefNo(), obj.getSeqNo())) {
                        afex_rih_refundInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_RIH_REFUNDInfo> objList) {
        afex_rih_refundInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seqNo) {
        return afex_rih_refundInfoRepository.existsByRefNoAndSeqNo(refNo, seqNo);
    }
}
