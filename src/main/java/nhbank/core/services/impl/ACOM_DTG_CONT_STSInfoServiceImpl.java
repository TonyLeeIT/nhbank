package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_DTG_CONT_STSInfo;
import nhbank.core.repositories.ACOM_DTG_CONT_STSInfoRepository;
import nhbank.core.services.ACOM_DTG_CONT_STSInfoService;
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
public class ACOM_DTG_CONT_STSInfoServiceImpl implements ACOM_DTG_CONT_STSInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_DTG_CONT_STSInfoRepository acom_dtg_cont_stsInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_DTG_CONT_STSInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ACOM_DTG_CONT_STS.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ACOM_DTG_CONT_STS.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_DTG_CONT_STSInfo obj = new ACOM_DTG_CONT_STSInfo();
                obj.setRefNo(lineArray[0]);
                obj.setSeqNo(new BigDecimal(lineArray[1]));
                obj.setBrNo(lineArray[2]);
                obj.setTrxDt((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setBfContSts(lineArray[4]);
                obj.setAfContSts(lineArray[5]);
                obj.setAcctNo(lineArray[6]);
                obj.setRegEmpNo(lineArray[7]);
                obj.setRegDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setRegTm(lineArray[9]);
                obj.setUpdEmpNo(lineArray[10]);
                obj.setUpdDt((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                obj.setUpdTm(lineArray[12]);
                if (isExist(obj.getRefNo(), obj.getSeqNo(), obj.getBrNo())) {
                    acom_dtg_cont_stsInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_DTG_CONT_STSInfo> objList) {
        acom_dtg_cont_stsInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seqNo, String brNo) {
        return acom_dtg_cont_stsInfoRepository.existsByRefNoAndSeqNoAndBrNo(refNo, seqNo, brNo);
    }
}
