package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_IPB_BASEInfo;
import nhbank.core.repositories.AFEX_IPB_BASEInfoRepository;
import nhbank.core.services.AFEX_IPB_BASEInfoService;
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
public class AFEX_IPB_BASEInfoServiceImpl implements AFEX_IPB_BASEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_IPB_BASEInfoRepository afex_ipb_baseInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_IPB_BASE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_IPB_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_IPB_BASE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPB_BASE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_IPB_BASEInfo obj = new AFEX_IPB_BASEInfo();
                    obj.setRefNo(lineArray[0]);
                    obj.setIkisSts(lineArray[1]);
                    obj.setBkGb(lineArray[2]);
                    obj.setCixNo(lineArray[3]);
                    obj.setBuseoNo(lineArray[4]);
                    obj.setIpCcy(lineArray[5]);
                    obj.setIpJan(new BigDecimal(lineArray[6]));
                    obj.setGtJan(new BigDecimal(lineArray[7]));
                    obj.setLgsJan(new BigDecimal(lineArray[8]));
                    obj.setLguJan(new BigDecimal(lineArray[9]));
                    obj.setBldJan(new BigDecimal(lineArray[10]));
                    obj.setInsJan(new BigDecimal(lineArray[11]));
                    obj.setBojJan(new BigDecimal(lineArray[12]));
                    obj.setBojJan1(new BigDecimal(lineArray[13]));
                    obj.setBojJan2(new BigDecimal(lineArray[14]));
                    obj.setBojBjan(new BigDecimal(lineArray[15]));
                    obj.setBojBjan1(new BigDecimal(lineArray[16]));
                    obj.setBojBjan2(new BigDecimal(lineArray[17]));
                    obj.setCorJan(new BigDecimal(lineArray[18]));
                    obj.setDjbBjan(new BigDecimal(lineArray[19]));
                    obj.setBldSeq(new BigDecimal(lineArray[20]));
                    obj.setAmdSeq(new BigDecimal(lineArray[21]));
                    obj.setLgmSeq(new BigDecimal(lineArray[22]));
                    obj.setIkisSeq(new BigDecimal(lineArray[23]));
                    obj.setIkisHisNo(new BigDecimal(lineArray[24]));
                    obj.setCorSeq(new BigDecimal(lineArray[25]));
                    obj.setDjbSeq(new BigDecimal(lineArray[26]));
                    obj.setBojSeq(new BigDecimal(lineArray[27]));
                    obj.setJajSeq(new BigDecimal(lineArray[28]));
                    obj.setItmSeq(new BigDecimal(lineArray[29]));
                    obj.setOpenIl((lineArray[30].equals("")) ? null : formatter.parse(lineArray[30]));
                    obj.setGisIl((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                    obj.setLstIl((lineArray[32].equals("")) ? null : formatter.parse(lineArray[32]));
                    obj.setLstIbIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                    obj.setOpenCcy(lineArray[34]);
                    obj.setOpenAmt(new BigDecimal(lineArray[35]));
                    obj.setIpCd(lineArray[36]);
                    obj.setBunGb(lineArray[37]);
                    obj.setMiltGb(lineArray[38]);
                    obj.setExpIl((lineArray[39].equals("")) ? null : formatter.parse(lineArray[39]));
                    obj.setBojJukYul(new BigDecimal(lineArray[40]));
                    obj.setPriceCd(lineArray[41]);
                    obj.setHsCd(lineArray[42]);
                    obj.setHsNm(lineArray[43]);
                    obj.setOrigCtry(lineArray[44]);
                    obj.setSdCtry(lineArray[45]);
                    obj.setTermGb(lineArray[46]);
                    obj.setTerm(new BigDecimal(lineArray[47]));
                    obj.setHdSngNo(lineArray[48]);
                    obj.setCanAccGb(lineArray[49]);
                    obj.setPoNo(lineArray[50]);
                    obj.setUnsongGb(lineArray[51]);
                    obj.setTcFrtGb(lineArray[52]);
                    obj.setTcFrt(new BigDecimal(lineArray[53]));
                    obj.setTcLisuIl((lineArray[54].equals("")) ? null : formatter.parse(lineArray[54]));
                    obj.setTcDsamt(new BigDecimal(lineArray[55]));
                    obj.setTcHrt(new BigDecimal(lineArray[56]));
                    obj.setTcTermGb(lineArray[57]);
                    obj.setTcRcvGb(lineArray[58]);
                    obj.setSlCd(lineArray[59]);
                    obj.setSlYoCd(lineArray[60]);
                    obj.setSetBkcd(lineArray[61]);
                    obj.setAcptBkcd(lineArray[62]);
                    obj.setConfBkcd(lineArray[63]);
                    obj.setReOpGb(lineArray[64]);
                    obj.setReopBkcd(lineArray[65]);
                    obj.setReFrtYul(new BigDecimal(lineArray[66]));
                    obj.setReReGb(lineArray[67]);
                    obj.setReReGb1(lineArray[68]);
                    obj.setOpNo(lineArray[69]);
                    obj.setOwnerNo(lineArray[70]);
                    obj.setPbrmNo(lineArray[71]);
                    obj.setCorFrt(new BigDecimal(lineArray[72]));
                    obj.setSprdFrt(new BigDecimal(lineArray[73]));
                    obj.setLcNo(lineArray[74]);
                    obj.setAmtMore(lineArray[75]);
                    obj.setAmtLess(lineArray[76]);
                    obj.setRevolveGb(lineArray[77]);
                    obj.setPartshipGb(lineArray[78]);
                    obj.setGyom(lineArray[79]);
                    obj.setComId(lineArray[80]);
                    obj.setIbfGb(lineArray[81]);
                    obj.setTcMisuCnt(new BigDecimal(lineArray[82]));
                    obj.setTcFrt2(new BigDecimal(lineArray[83]));
                    obj.setTcDsamt2(new BigDecimal(lineArray[84]));
                    obj.setBeniCtry(lineArray[85]);
                    obj.setBoseGb(lineArray[86]);
                    obj.setBeniNm(lineArray[87]);
                    obj.setTolJan(new BigDecimal(lineArray[88]));
                    obj.setTolUse(new BigDecimal(lineArray[89]));
                    obj.setSkbdnYn(lineArray[90]);
                    obj.setRegEmpNo(lineArray[91]);
                    obj.setRegDt((lineArray[92].equals("")) ? null : formatter.parse(lineArray[92]));
                    obj.setRegTm(lineArray[93]);
                    obj.setUpdEmpNo(lineArray[94]);
                    obj.setUpdDt((lineArray[95].equals("")) ? null : formatter.parse(lineArray[95]));
                    obj.setUpdTm(lineArray[96]);
                    if (isExist(obj.getRefNo())) {
                        afex_ipb_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPB_BASEInfo> objList) {
        afex_ipb_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afex_ipb_baseInfoRepository.existsByRefNo(refNo);
    }
}
