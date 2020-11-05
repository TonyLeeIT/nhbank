package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_IPH_AMDInfo;
import nhbank.core.repositories.AFEX_IPH_AMDInfoRepository;
import nhbank.core.services.AFEX_IPH_AMDInfoService;
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
public class AFEX_IPH_AMDInfoServiceImpl implements AFEX_IPH_AMDInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_IPH_AMDInfoRepository afex_iph_amdInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_IPH_AMD");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_IPH_AMDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_IPH_AMD.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPH_AMD.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_IPH_AMDInfo obj = new AFEX_IPH_AMDInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setAmdSeq(lineArray[1]);
                    obj.setAmdNo(lineArray[2]);
                    obj.setTranIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                    obj.setAmdIl((lineArray[4].equals("")) ? null : formatter.parse(lineArray[4]));
                    obj.setSts(lineArray[5]);
                    obj.setAdvBic(lineArray[6]);
                    obj.setAdvNm(lineArray[7]);
                    obj.setOpenIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setTheirRef(lineArray[9]);
                    obj.setBeneNm(lineArray[10]);
                    obj.setBeneAddr1(lineArray[11]);
                    obj.setBeneAddr2(lineArray[12]);
                    obj.setBeneAddr3(lineArray[13]);
                    obj.setBefoCcy(lineArray[14]);
                    obj.setBefoAmt(new BigDecimal(lineArray[15]));
                    obj.setIncAmt(new BigDecimal(lineArray[16]));
                    obj.setDecAmt(new BigDecimal(lineArray[17]));
                    obj.setAmdCcy(lineArray[18]);
                    obj.setAmdAmt(new BigDecimal(lineArray[19]));
                    obj.setExpIl((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setShipIl((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                    obj.setReimBic(lineArray[22]);
                    obj.setReimNm(lineArray[23]);
                    obj.setChargeGb(lineArray[24]);
                    obj.setPartShip(lineArray[25]);
                    obj.setTranShip(lineArray[26]);
                    obj.setRaGb(lineArray[27]);
                    obj.setOrgnNm1(lineArray[28]);
                    obj.setOrgnNm2(lineArray[29]);
                    obj.setPriceNm(lineArray[30]);
                    obj.setFromPort(lineArray[31]);
                    obj.setToPort(lineArray[32]);
                    obj.setAmtMore(lineArray[33]);
                    obj.setAmtLess(lineArray[34]);
                    obj.setOperNo(lineArray[35]);
                    obj.setMt707Nm(lineArray[36]);
                    obj.setMt747Nm(lineArray[37]);
                    obj.setApplCd(lineArray[38]);
                    obj.setEdiGb(lineArray[39]);
                    obj.setEdiCust(lineArray[40]);
                    obj.setEdiSend(lineArray[41]);
                    obj.setEdiSndIl((lineArray[42].equals("")) ? null : formatter.parse(lineArray[42]));
                    obj.setEdiJumNo(lineArray[43]);
                    obj.setEdiSeqNo(new BigDecimal(lineArray[44]));
                    obj.setEdiSfnm(lineArray[45]);
                    obj.setEdiRcv(lineArray[46]);
                    obj.setEdiRcvIl((lineArray[47].equals("")) ? null : formatter.parse(lineArray[47]));
                    obj.setEdiRfnm(lineArray[48]);
                    obj.setThrNm(lineArray[49]);
                    obj.setSendJumgb(lineArray[50]);
                    obj.setBankGb(lineArray[51]);
                    obj.setNcuBefoCcy(lineArray[52]);
                    obj.setNcuBefoAmt(new BigDecimal(lineArray[53]));
                    obj.setNcuIncAmt(new BigDecimal(lineArray[54]));
                    obj.setNcuDecAmt(new BigDecimal(lineArray[55]));
                    obj.setNcuAmdCcy(lineArray[56]);
                    obj.setNcuAmdAmt(new BigDecimal(lineArray[57]));
                    obj.setHisNo(new BigDecimal(lineArray[58]));
                    obj.setCbsGb(lineArray[59]);
                    obj.setMngInfo(lineArray[60]);
                    obj.setPresPrd(lineArray[61]);
                    obj.setLoadPort(lineArray[62]);
                    obj.setDiscPort(lineArray[63]);
                    obj.setRegEmpNo(lineArray[64]);
                    obj.setRegDt((lineArray[65].equals("")) ? null : formatter.parse(lineArray[65]));
                    obj.setRegTm(lineArray[66]);
                    obj.setUpdEmpNo(lineArray[67]);
                    obj.setUpdDt((lineArray[68].equals("")) ? null : formatter.parse(lineArray[68]));
                    obj.setUpdTm(lineArray[69]);
                    obj.setApplNm(lineArray[70]);
                    obj.setApplAddr1(lineArray[71]);
                    obj.setApplAddr2(lineArray[72]);
                    obj.setApplAddr3(lineArray[73]);
                    obj.setPurposeCd(lineArray[74]);
                    obj.setCancelCd(lineArray[75]);
                    obj.setTransGb(lineArray[76]);
                    obj.setApplRule(lineArray[77]);
                    obj.setApplRule2(lineArray[78]);
                    obj.setNegoGb(lineArray[79]);
                    obj.setUsanTerm(lineArray[80]);
                    obj.setTermGb(lineArray[81]);
                    obj.setTermType(lineArray[82]);
                    obj.setDraftRate(lineArray[83]);
                    obj.setDraweeBic(lineArray[84]);
                    obj.setDraweeNm(lineArray[85]);
                    obj.setCnfmBic(lineArray[86]);
                    obj.setCnfmNm(lineArray[87]);
                    obj.setThrNm2(lineArray[88]);
                    obj.setThrNm3(lineArray[89]);
                    obj.setThrNm4(lineArray[90]);
                    obj.setNegoBic(lineArray[91]);
                    obj.setTtreimGb(lineArray[92]);
                    obj.setCnfmGb(lineArray[93]);
                    obj.setThrBic(lineArray[94]);
                    if (isExist(obj.getRefNo(), obj.getAmdSeq())) {
                        afex_iph_amdInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPH_AMDInfo> objList) {
        afex_iph_amdInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, String amdSeq) {
        return afex_iph_amdInfoRepository.existsByRefNoAndAmdSeq(refNo, amdSeq);
    }
}
