package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_DTG_NAPAS_RECONInfo;
import nhbank.core.repositories.ACOM_DTG_NAPAS_RECONInfoRepository;
import nhbank.core.services.ACOM_DTG_NAPAS_RECONInfoService;
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
public class ACOM_DTG_NAPAS_RECONInfoServiceImpl implements ACOM_DTG_NAPAS_RECONInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_DTG_NAPAS_RECONInfoRepository acom_dtg_napas_reconInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_DTG_NAPAS_RECONInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ACOM_DTG_NAPAS_RECON.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ACOM_DTG_NAPAS_RECON.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_DTG_NAPAS_RECONInfo obj = new ACOM_DTG_NAPAS_RECONInfo();
                obj.setBkCd(lineArray[0]);
                obj.setTrnDate(lineArray[1]);
                obj.setReconType(lineArray[2]);
                obj.setDe032AcqCd(lineArray[3]);
                obj.setDe041CrdAcptTrm(lineArray[4]);
                obj.setDe011TraceNo(lineArray[5]);
                obj.setDe002Pan(lineArray[6]);
                obj.setDe003ProcCd(lineArray[7]);
                obj.setDe004TrnAmt(new BigDecimal(lineArray[8]));
                obj.setDe005StlAmt(new BigDecimal(lineArray[9]));
                obj.setDe006BilAmt(new BigDecimal(lineArray[10]));
                obj.setDe009StlConvRt(new BigDecimal(lineArray[11]));
                obj.setDe010BilConvRt(new BigDecimal(lineArray[12]));
                obj.setDe012LocTrnTime(lineArray[13]);
                obj.setDe013LocTrnDate(lineArray[14]);
                obj.setDe015StlDate(lineArray[15]);
                obj.setDe018MerCatCd(lineArray[16]);
                obj.setDe022PosMode(lineArray[17]);
                obj.setDe025PosCondCd(lineArray[18]);
                obj.setDe037RelRefNo(lineArray[19]);
                obj.setDe038AuthIdRes(lineArray[20]);
                obj.setDe042CrdAcptId(lineArray[21]);
                obj.setDe049TrnCcy(lineArray[22]);
                obj.setDe050StlCcy(lineArray[23]);
                obj.setDe051BilCcy(lineArray[24]);
                obj.setDe060CnlTp(lineArray[25]);
                obj.setDe062NapSvcCd(lineArray[26]);
                obj.setDe063TrnRefNo(lineArray[27]);
                obj.setDe100BenCd(lineArray[28]);
                obj.setDe102SndAccInf(lineArray[29]);
                obj.setDe103RcvAccInf(lineArray[30]);
                obj.setProcess(lineArray[31]);
                obj.setMti(lineArray[32]);
                obj.setRta(new BigDecimal(lineArray[33]));
                obj.setRca(new BigDecimal(lineArray[34]));
                obj.setIss(lineArray[35]);
                obj.setSvfissnp(new BigDecimal(lineArray[36]));
                obj.setIrfissacq(new BigDecimal(lineArray[37]));
                obj.setIrfissbnb(new BigDecimal(lineArray[38]));
                obj.setSvfacqnp(new BigDecimal(lineArray[39]));
                obj.setIrfacqiss(new BigDecimal(lineArray[40]));
                obj.setIrfacqbnb(new BigDecimal(lineArray[41]));
                obj.setSvfbnbnp(new BigDecimal(lineArray[42]));
                obj.setIrfbnbiss(new BigDecimal(lineArray[43]));
                obj.setIrfbnbacq(new BigDecimal(lineArray[44]));
                obj.setRrc(lineArray[45]);
                obj.setRsv1(lineArray[46]);
                obj.setRsv2(lineArray[47]);
                obj.setRsv3(lineArray[48]);
                obj.setTrnSts(lineArray[49]);
                obj.setNewSts(lineArray[50]);
                obj.setRemark(lineArray[51]);
                obj.setRegEmpNo(lineArray[52]);
                obj.setRegDt((lineArray[53].equals("")) ? null : formatter.parse(lineArray[53]));
                obj.setRegTm(lineArray[54]);
                obj.setUpdEmpNo(lineArray[55]);
                obj.setUpdDt((lineArray[56].equals("")) ? null : formatter.parse(lineArray[56]));
                obj.setUpdTm(lineArray[57]);
                obj.setStlDate(lineArray[58]);
                if (isExist(obj.getBkCd(), obj.getTrnDate(), obj.getReconType(), obj.getDe032AcqCd(), obj.getDe041CrdAcptTrm(), obj.getDe011TraceNo())) {
                    acom_dtg_napas_reconInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_DTG_NAPAS_RECONInfo> objList) {
        acom_dtg_napas_reconInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String bkCd, String trnDate, String reconType, String de032AcqCd, String de041CrdAcptTrm, String de011TraceNo) {
        return acom_dtg_napas_reconInfoRepository.existsByBkCdAndTrnDateAndReconTypeAndDe032AcqCdAndDe041CrdAcptTrmAndDe011TraceNo(bkCd, trnDate, reconType, de032AcqCd, de041CrdAcptTrm, de011TraceNo);
    }
}
