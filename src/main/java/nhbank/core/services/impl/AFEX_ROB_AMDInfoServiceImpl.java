package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_ROB_AMDInfo;
import nhbank.core.repositories.AFEX_ROB_AMDInfoRepository;
import nhbank.core.services.AFEX_ROB_AMDInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFEX_ROB_AMDInfoServiceImpl implements AFEX_ROB_AMDInfoService {
    @Autowired
    AFEX_ROB_AMDInfoRepository afex_rob_amdInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_ROB_AMDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_ROB_AMDInfo obj = new AFEX_ROB_AMDInfo();
                obj.setRefNo(lineArray[0]);
                obj.setChgSeq(new BigDecimal(lineArray[1]));
                obj.setTblGb(lineArray[2]);
                obj.setSts(lineArray[3]);
                obj.setChgCd(lineArray[4]);
                obj.setAcIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setGisIl((lineArray[6].equals("")) ? null : formatter.parse(lineArray[6]));
                obj.setLstIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setLstIbIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setIbjiMd(lineArray[9]);
                obj.setInfoName1(lineArray[10]);
                obj.setInfoName2(lineArray[11]);
                obj.setInfoName3(lineArray[12]);
                obj.setInfoName4(lineArray[13]);
                obj.setInfoName5(lineArray[14]);
                obj.setInfoName6(lineArray[15]);
                obj.setApplNm1(lineArray[16]);
                obj.setApplNm2(lineArray[17]);
                obj.setApplAddr1(lineArray[18]);
                obj.setApplAddr2(lineArray[19]);
                obj.setApplAddr3(lineArray[20]);
                obj.setRcvNm1(lineArray[21]);
                obj.setRcvNm2(lineArray[22]);
                obj.setRcvAddr1(lineArray[23]);
                obj.setRcvAddr2(lineArray[24]);
                obj.setRcvAddr3(lineArray[25]);
                obj.setRcvAcctNo(lineArray[26]);
                obj.setRcvBkAcno(lineArray[27]);
                obj.setRcvBknm1(lineArray[28]);
                obj.setRcvBknm2(lineArray[29]);
                obj.setRcvBkAddr1(lineArray[30]);
                obj.setRcvBkAddr2(lineArray[31]);
                obj.setRcvBkAddr3(lineArray[32]);
                obj.setMjGb(lineArray[33]);
                obj.setOpNo(lineArray[34]);
                obj.setOwnerNo(lineArray[35]);
                obj.setYdGuja(lineArray[36]);
                obj.setHisNo(new BigDecimal(lineArray[37]));
                obj.setOperNo(lineArray[38]);
                obj.setMt199Name(lineArray[39]);
                obj.setMt192Name(lineArray[40]);
                obj.setBaseSts(lineArray[41]);
                obj.setCanGb(lineArray[42]);
                obj.setInterBank1(lineArray[43]);
                obj.setInterBank2(lineArray[44]);
                obj.setInfo72Name1(lineArray[45]);
                obj.setInfo72Name2(lineArray[46]);
                obj.setInfo72Name3(lineArray[47]);
                obj.setInfo72Name4(lineArray[48]);
                obj.setInfo72Name5(lineArray[49]);
                obj.setInfo72Name6(lineArray[50]);
                obj.setRegEmpNo(lineArray[51]);
                obj.setRegDt((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
                obj.setRegTm(lineArray[53]);
                obj.setUpdEmpNo(lineArray[54]);
                obj.setUpdDt((lineArray[55].equals("")) ? null : formatter.parse(lineArray[55]));
                obj.setUpdTm(lineArray[56]);
                if (isExist(obj.getRefNo(), obj.getChgSeq(), obj.getTblGb())) {
                    afex_rob_amdInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_ROB_AMDInfo> objList) {
        afex_rob_amdInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal chgSeq, String tblGb) {
        return afex_rob_amdInfoRepository.existsByRefNoAndChgSeqAndTblGb(refNo, chgSeq, tblGb);
    }
}
