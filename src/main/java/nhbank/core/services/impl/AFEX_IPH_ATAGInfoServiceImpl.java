package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_IPH_ATAGInfo;
import nhbank.core.repositories.AFEX_IPH_ATAGInfoRepository;
import nhbank.core.services.AFEX_IPH_ATAGInfoService;
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
public class AFEX_IPH_ATAGInfoServiceImpl implements AFEX_IPH_ATAGInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_IPH_ATAGInfoRepository afex_iph_atagInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_IPH_ATAG");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_IPH_ATAGInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_IPH_ATAG.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPH_ATAG.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_IPH_ATAGInfo obj = new AFEX_IPH_ATAGInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setAmdSeq(lineArray[1]);
                    obj.setTagCd(lineArray[2]);
                    obj.setSeq(new BigDecimal(lineArray[3]));
                    obj.setText01(lineArray[4]);
                    obj.setText02(lineArray[5]);
                    obj.setText03(lineArray[6]);
                    obj.setText04(lineArray[7]);
                    obj.setText05(lineArray[8]);
                    obj.setText06(lineArray[9]);
                    obj.setText07(lineArray[10]);
                    obj.setText08(lineArray[11]);
                    obj.setText09(lineArray[12]);
                    obj.setText10(lineArray[13]);
                    obj.setRegEmpNo(lineArray[14]);
                    obj.setRegDt((lineArray[15].equals("")) ? null : formatter.parse(lineArray[15]));
                    obj.setRegTm(lineArray[16]);
                    obj.setUpdEmpNo(lineArray[17]);
                    obj.setUpdDt((lineArray[18].equals("")) ? null : formatter.parse(lineArray[18]));
                    obj.setUpdTm(lineArray[19]);
                    if (isExist(obj.getRefNo(), obj.getAmdSeq(), obj.getTagCd(), obj.getSeq())) {
                        afex_iph_atagInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPH_ATAGInfo> objList) {
        afex_iph_atagInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, String amdSeq, String tagCd, BigDecimal seq) {
        return afex_iph_atagInfoRepository.existsByRefNoAndAmdSeqAndTagCdAndSeq(refNo, amdSeq, tagCd, seq);
    }
}
