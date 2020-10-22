package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_XPH_CAInfo;
import nhbank.core.repositories.AFEX_XPH_CAInfoRepository;
import nhbank.core.services.AFEX_XPH_CAInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_XPH_CAInfoServiceImpl implements AFEX_XPH_CAInfoService {
    @Autowired
    AFEX_XPH_CAInfoRepository afex_xph_caInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_XPH_CAInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_XPH_CAInfo obj = new AFEX_XPH_CAInfo();
                obj.setRcvIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                obj.setSeqNo(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setRefNo(lineArray[3]);
                obj.setCaCcy(lineArray[4]);
                obj.setCaAmt(new BigDecimal(lineArray[5]));
                obj.setLessCaAmt(new BigDecimal(lineArray[6]));
                obj.setLessCoAmt(new BigDecimal(lineArray[7]));
                obj.setLessGtAmt(new BigDecimal(lineArray[8]));
                obj.setOverAmt(new BigDecimal(lineArray[9]));
                obj.setCaIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                obj.setDepoBkcd(lineArray[11]);
                obj.setSdBalIl((lineArray[12].equals("")) ? null : formatter.parse(lineArray[12]));
                obj.setCcGb(lineArray[13]);
                obj.setCcIl((lineArray[14].equals("")) ? null : formatter.parse(lineArray[14]));
                obj.setCcRtCd(lineArray[15]);
                obj.setTrGb(lineArray[16]);
                obj.setMtTrMd(lineArray[17]);
                obj.setSwiftKey(lineArray[18]);
                obj.setRcvGb(lineArray[19]);
                obj.setOpNo(lineArray[20]);
                obj.setDepoCd(lineArray[21]);
                obj.setCdGb(lineArray[22]);
                obj.setDivGb(lineArray[23]);
                obj.setDivRef(lineArray[24]);
                obj.setNcuCaCcy(lineArray[25]);
                obj.setNcuCaAmt(new BigDecimal(lineArray[26]));
                obj.setNcuLessCaAmt(new BigDecimal(lineArray[27]));
                obj.setNcuLessCoAmt(new BigDecimal(lineArray[28]));
                obj.setNcuLessGtAmt(new BigDecimal(lineArray[29]));
                obj.setNcuOverAmt(new BigDecimal(lineArray[30]));
                obj.setRegEmpNo(lineArray[31]);
                obj.setRegDt((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                obj.setRegTm(lineArray[33]);
                obj.setUpdEmpNo(lineArray[34]);
                obj.setUpdDt((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                obj.setUpdTm(lineArray[36]);
                if (isExist(obj.getRcvIl(), obj.getSeqNo())) {
                    afex_xph_caInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_CAInfo> objList) {
        afex_xph_caInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date rcvIl, BigDecimal seqNo) {
        return afex_xph_caInfoRepository.existsByRcvIlAndSeqNo(rcvIl, seqNo);
    }
}
