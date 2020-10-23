package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AACT_TRX_BALInfo;
import nhbank.core.repositories.AACT_TRX_BALInfoRepository;
import nhbank.core.services.AACT_TRX_BALInfoService;
import nhbank.core.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AACT_TRX_BALInfoServiceImpl implements AACT_TRX_BALInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AACT_TRX_BALInfoRepository aact_trx_balInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AACT_TRX_BALInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AACT_TRX_BAL.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AACT_TRX_BAL.dat"));
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
            if (!objList.isEmpty())
                insertAll(objList);
        } catch (Exception ex) {
            ex.printStackTrace();
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
