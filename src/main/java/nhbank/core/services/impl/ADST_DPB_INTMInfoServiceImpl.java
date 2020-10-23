package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ADST_DPB_INTMInfo;
import nhbank.core.repositories.ADST_DPB_INTMInfoRepository;
import nhbank.core.services.ADST_DPB_INTMInfoService;
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
public class ADST_DPB_INTMInfoServiceImpl implements ADST_DPB_INTMInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ADST_DPB_INTMInfoRepository adst_dpb_intmInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ADST_DPB_INTMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ADST_DPB_INTM.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ADST_DPB_INTM.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ADST_DPB_INTMInfo obj = new ADST_DPB_INTMInfo();
                obj.setAcctNo(lineArray[0]);
                obj.setIbIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                obj.setGisIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                obj.setIntSeq(new BigDecimal(lineArray[3]));
                obj.setSts(lineArray[4]);
                obj.setTrCd(lineArray[5]);
                obj.setCurJan(new BigDecimal(lineArray[6]));
                obj.setDsAmt(new BigDecimal(lineArray[7]));
                obj.setDsDays(new BigDecimal(lineArray[8]));
                obj.setIntRt(new BigDecimal(lineArray[9]));
                obj.setIntAmt(new BigDecimal(lineArray[10]));
                obj.setTaxRt(new BigDecimal(lineArray[11]));
                obj.setTaxAmt(new BigDecimal(lineArray[12]));
                obj.setFromDt((lineArray[13].equals("")) ? null : formatter.parse(lineArray[13]));
                obj.setToDt((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setHisNo(new BigDecimal(lineArray[15]));
                obj.setCanIl((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                obj.setCanOpNo(lineArray[17]);
                obj.setRegEmpNo(lineArray[18]);
                obj.setRegDt((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                obj.setRegTm(lineArray[20]);
                obj.setUpdEmpNo(lineArray[21]);
                obj.setUpdDt((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                obj.setUpdTm(lineArray[23]);
                if (isExist(obj.getAcctNo(), obj.getIbIl(), obj.getGisIl(), obj.getIntSeq())) {
                    adst_dpb_intmInfoRepository.save(obj);
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
    public void insertAll(List<ADST_DPB_INTMInfo> objList) {
        adst_dpb_intmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acctNo, Date ibIl, Date gisIl, BigDecimal intSeq) {
        return adst_dpb_intmInfoRepository.existsByAcctNoAndIbIlAndGisIlAndIntSeq(acctNo, ibIl, gisIl, intSeq);
    }
}
