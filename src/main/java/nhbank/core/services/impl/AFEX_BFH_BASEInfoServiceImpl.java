package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_BFH_BASEInfo;
import nhbank.core.repositories.AFEX_BFH_BASEInfoRepository;
import nhbank.core.services.AFEX_BFH_BASEInfoService;
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
public class AFEX_BFH_BASEInfoServiceImpl implements AFEX_BFH_BASEInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_BFH_BASEInfoRepository afex_bfh_baseInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_BFH_BASE");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_BFH_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_BFH_BASE.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_BFH_BASE.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_BFH_BASEInfo obj = new AFEX_BFH_BASEInfo();
                    obj.setRecvIl((lineArray[0].equals("")) ? null : formatter.parse(lineArray[0]));
                    obj.setSeqNo(new BigDecimal(lineArray[1]));
                    obj.setMakeIl((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                    obj.setRefNo(lineArray[3]);
                    obj.setCondSts(lineArray[4]);
                    obj.setRecvGb(lineArray[5]);
                    obj.setRecvBr(lineArray[6]);
                    obj.setCixNo(lineArray[7]);
                    obj.setAcIl((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                    obj.setGisIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                    obj.setLstIl((lineArray[10].equals("")) ? null : formatter.parse(lineArray[10]));
                    obj.setLstIbIl((lineArray[11].equals("")) ? null : formatter.parse(lineArray[11]));
                    obj.setBftGb(lineArray[12]);
                    obj.setIgnoreYn(lineArray[13]);
                    obj.setRecvDocid(lineArray[14]);
                    obj.setPayCnt(new BigDecimal(lineArray[15]));
                    obj.setMsgType(lineArray[16]);
                    obj.setValueIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setRecvCcy(lineArray[18]);
                    obj.setRecvAmt(new BigDecimal(lineArray[19]));
                    obj.setCurCcy(lineArray[20]);
                    obj.setCurAmt(new BigDecimal(lineArray[21]));
                    obj.setSendRefNo(lineArray[22]);
                    obj.setRecvRefNo(lineArray[23]);
                    obj.setSendDepo(lineArray[24]);
                    obj.setSendBkcd(lineArray[25]);
                    obj.setSendBknm(lineArray[26]);
                    obj.setSendAddr1(lineArray[27]);
                    obj.setSendAddr2(lineArray[28]);
                    obj.setSendAddr3(lineArray[29]);
                    obj.setJgBkcd(lineArray[30]);
                    obj.setJgBknm(lineArray[31]);
                    obj.setJgBkAddr1(lineArray[32]);
                    obj.setJgBkAddr2(lineArray[33]);
                    obj.setJgBkAddr3(lineArray[34]);
                    obj.setJgBkAcct(lineArray[35]);
                    obj.setBeneBkcd(lineArray[36]);
                    obj.setBeneBknm(lineArray[37]);
                    obj.setBeneAddr1(lineArray[38]);
                    obj.setBeneAddr2(lineArray[39]);
                    obj.setBeneAddr3(lineArray[40]);
                    obj.setBeneAcct(lineArray[41]);
                    obj.setTag72Info1(lineArray[42]);
                    obj.setTag72Info2(lineArray[43]);
                    obj.setTag72Info3(lineArray[44]);
                    obj.setTag72Info4(lineArray[45]);
                    obj.setTag72Info5(lineArray[46]);
                    obj.setTag72Info6(lineArray[47]);
                    obj.setRegEmpNo(lineArray[48]);
                    obj.setRegDt((lineArray[49].equals("")) ? null : formatter.parse(lineArray[49]));
                    obj.setRegTm(lineArray[50]);
                    obj.setUpdEmpNo(lineArray[51]);
                    obj.setUpdDt((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
                    obj.setUpdTm(lineArray[53]);
                    obj.setIntBkcd(lineArray[54]);
                    obj.setIntBknm(lineArray[55]);
                    obj.setIntAddr1(lineArray[56]);
                    obj.setIntAddr2(lineArray[57]);
                    obj.setIntAddr3(lineArray[58]);
                    obj.setNoddctYn(lineArray[59]);
                    if (isExist(obj.getRecvIl(), obj.getSeqNo())) {
                        afex_bfh_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_BFH_BASEInfo> objList) {
        afex_bfh_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(Date recvIl, BigDecimal seqNo) {
        return afex_bfh_baseInfoRepository.existsByRecvIlAndSeqNo(recvIl, seqNo);
    }
}
