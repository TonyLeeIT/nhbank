package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_IPB_BLKInfo;
import nhbank.core.repositories.AFEX_IPB_BLKInfoRepository;
import nhbank.core.services.AFEX_IPB_BLKInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFEX_IPB_BLKInfoServiceImpl implements AFEX_IPB_BLKInfoService {
    @Autowired
    AFEX_IPB_BLKInfoRepository afex_ipb_blkInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_IPB_BLKInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_IPB_BLKInfo obj = new AFEX_IPB_BLKInfo();
                obj.setRefNo(lineArray[0]);
                obj.setSeq(new BigDecimal(lineArray[1]));
                obj.setSseq(new BigDecimal(lineArray[2]));
                obj.setSts(lineArray[3]);
                obj.setAcIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                obj.setGisIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setLstIbIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setCcy(lineArray[7]);
                obj.setAmt(new BigDecimal(lineArray[8]));
                obj.setHisNo(new BigDecimal(lineArray[9]));
                obj.setJagmGb(lineArray[10]);
                obj.setJilcBamt(new BigDecimal(lineArray[11]));
                obj.setJilcFamt(new BigDecimal(lineArray[12]));
                obj.setJilgBamt(new BigDecimal(lineArray[13]));
                obj.setJilgFamt(new BigDecimal(lineArray[14]));
                obj.setSngSseq(new BigDecimal(lineArray[15]));
                obj.setDjbSeq(new BigDecimal(lineArray[16]));
                obj.setSetBkcd(lineArray[17]);
                obj.setJunGb(lineArray[18]);
                obj.setFjnNo(lineArray[19]);
                obj.setSetGb(lineArray[20]);
                obj.setGtAmt(new BigDecimal(lineArray[21]));
                obj.setAmtGb(lineArray[22]);
                obj.setNcuCcy(lineArray[23]);
                obj.setNcuAmt(new BigDecimal(lineArray[24]));
                obj.setNcuJilcFamt(new BigDecimal(lineArray[25]));
                obj.setNcuJilgFamt(new BigDecimal(lineArray[26]));
                obj.setNcuGtAmt(new BigDecimal(lineArray[27]));
                obj.setRegEmpNo(lineArray[28]);
                obj.setRegDt((lineArray[29].equals("")) ? null : formatter.parse(lineArray[29]));
                obj.setRegTm(lineArray[30]);
                obj.setUpdEmpNo(lineArray[31]);
                obj.setUpdDt((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                obj.setUpdTm(lineArray[33]);
                if (isExist(obj.getRefNo(), obj.getSeq(), obj.getSseq())) {
                    afex_ipb_blkInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPB_BLKInfo> objList) {
        afex_ipb_blkInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq, BigDecimal sseq) {
        return afex_ipb_blkInfoRepository.existsByRefNoAndSeqAndSseq(refNo, seq, sseq);
    }
}
