package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_IPH_ATAGInfo;
import nhbank.core.repositories.AFEX_IPH_ATAGInfoRepository;
import nhbank.core.services.AFEX_IPH_ATAGInfoService;
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
public class AFEX_IPH_ATAGInfoServiceImpl implements AFEX_IPH_ATAGInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_IPH_ATAGInfoRepository afex_iph_atagInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_IPH_ATAGInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\AFEX_IPH_ATAG.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\AFEX_IPH_ATAG.dat"));
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
            if (!objList.isEmpty())
                insertAll(objList);
        } catch (Exception ex) {
            ex.printStackTrace();
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
