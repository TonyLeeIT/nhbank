package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.ACOM_EPB_BASEInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.ACOM_EPB_BASEInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.ACOM_EPB_BASEInfoService;
import nhbank.core.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ACOM_EPB_BASEInfoServiceImpl implements ACOM_EPB_BASEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_EPB_BASEInfoRepository acom_epb_baseInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_EPB_BASE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_EPB_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\ACOM_EPB_BASE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_EPB_BASE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_EPB_BASEInfo obj = new ACOM_EPB_BASEInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setMngBr(lineArray[1]);
                    obj.setMngYy(lineArray[2]);
                    obj.setBusiCd(lineArray[3]);
                    obj.setSts(lineArray[4]);
                    obj.setExpCd(lineArray[5]);
                    obj.setCcy(lineArray[6]);
                    obj.setAssignAmt(new BigDecimal(lineArray[7]));
                    obj.setAddAmt(new BigDecimal(lineArray[8]));
                    obj.setAssignCamt(new BigDecimal(lineArray[9]));
                    obj.setAddCamt(new BigDecimal(lineArray[10]));
                    obj.setPlusAmt(new BigDecimal(lineArray[11]));
                    obj.setMinusAmt(new BigDecimal(lineArray[12]));
                    obj.setTotalAmt(new BigDecimal(lineArray[13]));
                    obj.setDrAmt(new BigDecimal(lineArray[14]));
                    obj.setCrAmt(new BigDecimal(lineArray[15]));
                    obj.setLstHisNo(new BigDecimal(lineArray[16]));
                    obj.setAcIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setIbIl((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setLstIl((lineArray[19].equals("")) ? null : formatter.parse(lineArray[19]));
                    obj.setLstIbIl((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setBjAmt(new BigDecimal(lineArray[21]));
                    obj.setAllocateAmt(new BigDecimal(lineArray[22]));
                    obj.setRegEmpNo(lineArray[23]);
                    obj.setRegDt((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                    obj.setRegTm(lineArray[25]);
                    obj.setUpdEmpNo(lineArray[26]);
                    obj.setUpdDt((lineArray[27].equals("")) ? null : formatter.parse(lineArray[27]));
                    obj.setUpdTm(lineArray[28]);
                    if (isExist(obj.getRefNo())) {
                        acom_epb_baseInfoRepository.save(obj);
                    } else {
                        objList.add(obj);
                    }
                }
                br.close();
                if (!objList.isEmpty())
                    insertAll(objList);
                checkUpdate.setStatus("Done");
                checkUpdateRepository.save(checkUpdate);
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
    public void insertAll(List<ACOM_EPB_BASEInfo> objList) {
        acom_epb_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return acom_epb_baseInfoRepository.existsByRefNo(refNo);
    }
}
