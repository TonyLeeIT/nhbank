package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_BFH_PAYInfo;
import nhbank.core.repositories.AFEX_BFH_PAYInfoRepository;
import nhbank.core.services.AFEX_BFH_PAYInfoService;
import nhbank.core.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFEX_BFH_PAYInfoServiceImpl implements AFEX_BFH_PAYInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_BFH_PAYInfoRepository afex_bfh_payInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_BFH_PAYInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_BFH_PAY.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_BFH_PAY.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_BFH_PAYInfo obj = new AFEX_BFH_PAYInfo();
                obj.setRefNo(lineArray[0]);
                obj.setPayCnt(new BigDecimal(lineArray[1]));
                obj.setMakeIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                obj.setCondSts(lineArray[3]);
                obj.setHisNo(new BigDecimal(lineArray[4]));
                obj.setPayGb(lineArray[5]);
                obj.setAcIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setGisIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setLstIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setLstIbIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setPayDocid(lineArray[10]);
                obj.setMsgType(lineArray[11]);
                obj.setValueIl((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                obj.setSendRefNo(lineArray[13]);
                obj.setRecvRefNo(lineArray[14]);
                obj.setSetlDepo(lineArray[15]);
                obj.setSetlBkcd(lineArray[16]);
                obj.setSetlBknm(lineArray[17]);
                obj.setSetlAddr1(lineArray[18]);
                obj.setSetlAddr2(lineArray[19]);
                obj.setSetlAddr3(lineArray[20]);
                obj.setJgBkcd(lineArray[21]);
                obj.setJgBknm(lineArray[22]);
                obj.setJgBkAddr1(lineArray[23]);
                obj.setJgBkAddr2(lineArray[24]);
                obj.setJgBkAddr3(lineArray[25]);
                obj.setJgBkAcct(lineArray[26]);
                obj.setBeneBkcd(lineArray[27]);
                obj.setBeneBknm(lineArray[28]);
                obj.setBeneAddr1(lineArray[29]);
                obj.setBeneAddr2(lineArray[30]);
                obj.setBeneAddr3(lineArray[31]);
                obj.setBeneAcct(lineArray[32]);
                obj.setTag72Info1(lineArray[33]);
                obj.setTag72Info2(lineArray[34]);
                obj.setTag72Info3(lineArray[35]);
                obj.setTag72Info4(lineArray[36]);
                obj.setTag72Info5(lineArray[37]);
                obj.setTag72Info6(lineArray[38]);
                obj.setTranCcy(lineArray[39]);
                obj.setTranAmt(new BigDecimal(lineArray[40]));
                obj.setFeeCcy(lineArray[41]);
                obj.setFeeAmt(new BigDecimal(lineArray[42]));
                obj.setFeeGb(lineArray[43]);
                obj.setRegEmpNo(lineArray[44]);
                obj.setRegDt((lineArray[45].equals("")) ? null : formatter.parse(lineArray[45]));
                obj.setRegTm(lineArray[46]);
                obj.setUpdEmpNo(lineArray[47]);
                obj.setUpdDt((lineArray[48].equals("")) ? null : formatter.parse(lineArray[48]));
                obj.setUpdTm(lineArray[49]);
                obj.setNoddctYn(lineArray[50]);
                obj.setRemark1(lineArray[51]);
                obj.setRemark2(lineArray[52]);
                obj.setRemark3(lineArray[53]);
                obj.setRemark4(lineArray[54]);
                obj.setRemark5(lineArray[55]);
                obj.setRemark6(lineArray[56]);
                obj.setRefundIl((lineArray[57].equals("")) ? null : formatter.parse(lineArray[57]));
                obj.setConfirmIl((lineArray[58].equals("")) ? null : formatter.parse(lineArray[58]));
                obj.setProcType(lineArray[59]);
                obj.setRefundAmt(new BigDecimal(lineArray[60]));
                obj.setVcbDownYn(lineArray[61]);
                if (isExist(obj.getRefNo(), obj.getPayCnt())) {
                    afex_bfh_payInfoRepository.save(obj);
                } else {
                    objList.add(obj);
                }
            }
            if (!objList.isEmpty())
                insertAll(objList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertAll(List<AFEX_BFH_PAYInfo> objList) {
        afex_bfh_payInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal payCnt) {
        return afex_bfh_payInfoRepository.existsByRefNoAndPayCnt(refNo, payCnt);
    }
}
