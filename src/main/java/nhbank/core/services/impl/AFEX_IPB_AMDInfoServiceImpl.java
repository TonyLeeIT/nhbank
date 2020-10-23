package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_IPB_AMDInfo;
import nhbank.core.repositories.AFEX_IPB_AMDInfoRepository;
import nhbank.core.services.AFEX_IPB_AMDInfoService;
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
public class AFEX_IPB_AMDInfoServiceImpl implements AFEX_IPB_AMDInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_IPB_AMDInfoRepository afex_ipb_amdInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_IPB_AMDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_IPB_AMD.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPB_AMD.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_IPB_AMDInfo obj = new AFEX_IPB_AMDInfo();
                obj.setRefNo(lineArray[0]);
                obj.setSeq(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setAcIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setGisIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setLstIbIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setCcy(lineArray[6]);
                obj.setIdAmt(new BigDecimal(lineArray[7]));
                obj.setHisNo(new BigDecimal(lineArray[8]));
                obj.setAmdCd(lineArray[9]);
                obj.setBeCcy(lineArray[10]);
                obj.setAfCcy(lineArray[11]);
                obj.setBeAmt(new BigDecimal(lineArray[12]));
                obj.setAfAmt(new BigDecimal(lineArray[13]));
                obj.setBeExpIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setAfExpIl((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                obj.setBojJukYul(new BigDecimal(lineArray[16]));
                obj.setTcDsamt(new BigDecimal(lineArray[17]));
                obj.setReReGb(lineArray[18]);
                obj.setBeMore(lineArray[19]);
                obj.setBeLess(lineArray[20]);
                obj.setAfMore(lineArray[21]);
                obj.setAfLess(lineArray[22]);
                obj.setBeTcLisuIl((lineArray[23].equals("")) ? null : formatter.parse(lineArray[23]));
                obj.setRegEmpNo(lineArray[24]);
                obj.setRegDt((lineArray[25].equals("")) ? null : formatter.parse(lineArray[25]));
                obj.setRegTm(lineArray[26]);
                obj.setUpdEmpNo(lineArray[27]);
                obj.setUpdDt((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                obj.setUpdTm(lineArray[29]);
                if (isExist(obj.getRefNo(), obj.getSeq())) {
                    afex_ipb_amdInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPB_AMDInfo> objList) {
        afex_ipb_amdInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq) {
        return afex_ipb_amdInfoRepository.existsByRefNoAndSeq(refNo, seq);
    }
}
