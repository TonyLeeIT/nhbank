package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_DTG_NAPAS_HISInfo;
import nhbank.core.repositories.ACOM_DTG_NAPAS_HISInfoRepository;
import nhbank.core.services.ACOM_DTG_NAPAS_HISInfoService;
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
public class ACOM_DTG_NAPAS_HISInfoServiceImpl implements ACOM_DTG_NAPAS_HISInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_DTG_NAPAS_HISInfoRepository acom_dtg_napas_hisInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_DTG_NAPAS_HISInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\ACOM_DTG_NAPAS_HIS.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\ACOM_DTG_NAPAS_HIS.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_DTG_NAPAS_HISInfo obj = new ACOM_DTG_NAPAS_HISInfo();
                obj.setTrnDate(lineArray[0]);
                obj.setDe032AcqCd(lineArray[1]);
                obj.setDe041CrdAcptTrm(lineArray[2]);
                obj.setDe011TraceNo(lineArray[3]);
                obj.setHisNo(new BigDecimal(lineArray[4]));
                obj.setInoutGb(lineArray[5]);
                obj.setBkCd(lineArray[6]);
                obj.setMti(lineArray[7]);
                obj.setDe002Pan(lineArray[8]);
                obj.setDe003ProcCd(lineArray[9]);
                obj.setDe004TrnAmt(new BigDecimal(lineArray[10]));
                obj.setDe005StlAmt(new BigDecimal(lineArray[11]));
                obj.setDe006BilAmt(new BigDecimal(lineArray[12]));
                obj.setDe007TrnDt(lineArray[13]);
                obj.setDe009StlConvRt(new BigDecimal(lineArray[14]));
                obj.setDe010BilConvRt(new BigDecimal(lineArray[15]));
                obj.setDe012LocTrnTime(lineArray[16]);
                obj.setDe013LocTrnDate(lineArray[17]);
                obj.setDe014ExpDate(lineArray[18]);
                obj.setDe015StlDate(lineArray[19]);
                obj.setDe019AcqCtryCd(lineArray[20]);
                obj.setDe018MerCatCd(lineArray[21]);
                obj.setDe022PosMode(lineArray[22]);
                obj.setDe023CrdSeqNo(lineArray[23]);
                obj.setDe025PosCondCd(lineArray[24]);
                obj.setDe026PinCapCd(lineArray[25]);
                obj.setDe035Trk2Dat(lineArray[26]);
                obj.setDe036Trk3Dat(lineArray[27]);
                obj.setDe037RelRefNo(lineArray[28]);
                obj.setDe038AuthIdRes(lineArray[29]);
                obj.setDe039ResCd(lineArray[30]);
                obj.setDe042CrdAcptId(lineArray[31]);
                obj.setDe043CrdAcptLoc(lineArray[32]);
                obj.setDe045Trk1Dat(lineArray[33]);
                obj.setDe048AddSndNm(lineArray[34]);
                obj.setDe048AddSndAddr(lineArray[35]);
                obj.setDe049TrnCcy(lineArray[36]);
                obj.setDe050StlCcy(lineArray[37]);
                obj.setDe051BilCcy(lineArray[38]);
                obj.setDe052Pin(lineArray[39]);
                obj.setDe054AddAmt(lineArray[40]);
                obj.setDe055EmvDat(lineArray[41]);
                obj.setDe060CnlTp(lineArray[42]);
                obj.setDe062NapSvcCd(lineArray[43]);
                obj.setDe063TrnRefNo(lineArray[44]);
                obj.setDe070NetMgtCd(lineArray[45]);
                obj.setDe090OrgTrnKey(lineArray[46]);
                obj.setDe100BenCd(lineArray[47]);
                obj.setDe102SndAccInf(lineArray[48]);
                obj.setDe103RcvAccInf(lineArray[49]);
                obj.setDe104TrnCont(lineArray[50]);
                obj.setDe105NewPin(lineArray[51]);
                obj.setDe120BenInf(lineArray[52]);
                obj.setDe128MacDat(lineArray[53]);
                obj.setErrCd(lineArray[54]);
                obj.setRefNo(lineArray[55]);
                obj.setRcvIl((lineArray[56].equals("")) ? null : formatter.parse(lineArray[56]));
                obj.setSeqNo(new BigDecimal(lineArray[57]));
                obj.setRegEmpNo(lineArray[58]);
                obj.setRegDt((lineArray[59].equals("")) ? null : formatter.parse(lineArray[59]));
                obj.setRegTm(lineArray[60]);
                obj.setUpdEmpNo(lineArray[61]);
                obj.setUpdDt((lineArray[62].equals("")) ? null : formatter.parse(lineArray[62]));
                obj.setUpdTm(lineArray[63]);
                if (isExist(obj.getTrnDate(), obj.getDe032AcqCd(), obj.getDe041CrdAcptTrm(), obj.getDe011TraceNo(), obj.getHisNo())) {
                    acom_dtg_napas_hisInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_DTG_NAPAS_HISInfo> objList) {
        acom_dtg_napas_hisInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String trnDate, String de032AcqCd, String de041CrdAcptTrm, String de011TraceNo, BigDecimal hisNo) {
        return acom_dtg_napas_hisInfoRepository.existsByTrnDateAndDe032AcqCdAndDe041CrdAcptTrmAndDe011TraceNoAndHisNo(trnDate, de032AcqCd, de041CrdAcptTrm, de011TraceNo, hisNo);
    }
}
