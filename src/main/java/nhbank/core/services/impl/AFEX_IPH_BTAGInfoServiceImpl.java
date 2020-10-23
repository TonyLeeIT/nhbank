package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_IPH_BTAGInfo;
import nhbank.core.repositories.AFEX_IPH_BTAGInfoRepository;
import nhbank.core.services.AFEX_IPH_BTAGInfoService;
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
public class AFEX_IPH_BTAGInfoServiceImpl implements AFEX_IPH_BTAGInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_IPH_BTAGInfoRepository afex_iph_btagInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_IPH_BTAGInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFEX_IPH_BTAG.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPH_BTAG.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_IPH_BTAGInfo obj = new AFEX_IPH_BTAGInfo();
                obj.setRefNo(lineArray[0]);
                obj.setTagCd(lineArray[1]);
                obj.setSeq(new BigDecimal(lineArray[2]));
                obj.setText01(lineArray[3]);
                obj.setText02(lineArray[4]);
                obj.setText03(lineArray[5]);
                obj.setText04(lineArray[6]);
                obj.setText05(lineArray[7]);
                obj.setText06(lineArray[8]);
                obj.setText07(lineArray[9]);
                obj.setText08(lineArray[10]);
                obj.setText09(lineArray[11]);
                obj.setText10(lineArray[12]);
                obj.setText11(lineArray[13]);
                obj.setText12(lineArray[14]);
                obj.setText13(lineArray[15]);
                obj.setText14(lineArray[16]);
                obj.setText15(lineArray[17]);
                obj.setText16(lineArray[18]);
                obj.setText17(lineArray[19]);
                obj.setText18(lineArray[20]);
                obj.setText19(lineArray[21]);
                obj.setText20(lineArray[22]);
                obj.setRegEmpNo(lineArray[23]);
                obj.setRegDt((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                obj.setRegTm(lineArray[25]);
                obj.setUpdEmpNo(lineArray[26]);
                obj.setUpdDt((lineArray[27].equals("")) ? null : formatter.parse(lineArray[27]));
                obj.setUpdTm(lineArray[28]);
                if (isExist(obj.getRefNo(), obj.getTagCd(), obj.getSeq())) {
                    afex_iph_btagInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPH_BTAGInfo> objList) {
        afex_iph_btagInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, String tagCd, BigDecimal seq) {
        return afex_iph_btagInfoRepository.existsByRefNoAndTagCdAndSeq(refNo, tagCd, seq);
    }
}
