package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.ACOM_COMH_MSGInfo;
import nhbank.core.repositories.ACOM_COMH_MSGInfoRepository;
import nhbank.core.services.ACOM_COMH_MSGInfoService;
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
public class ACOM_COMH_MSGInfoServiceImpl implements ACOM_COMH_MSGInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_COMH_MSGInfoRepository acom_comh_msgInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_COMH_MSG");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_COMH_MSGInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath();
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\ACOM_COMH_MSG.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_COMH_MSG.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_COMH_MSGInfo obj = new ACOM_COMH_MSGInfo();
                    obj.setDocId(lineArray[0]);
                    obj.setMakeIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                    obj.setIoGb(lineArray[2]);
                    obj.setUpmuGb(lineArray[3]);
                    obj.setNetwGb(lineArray[4]);
                    obj.setSeqNo(new BigDecimal(lineArray[5]));
                    obj.setMsgGb(lineArray[6]);
                    obj.setCondSts(lineArray[7]);
                    obj.setBrNo(lineArray[8]);
                    obj.setTypeGb(lineArray[9]);
                    obj.setMsgType(lineArray[10]);
                    obj.setCoBkcd(lineArray[11]);
                    obj.setCoBknm1(lineArray[12]);
                    obj.setCoBknm2(lineArray[13]);
                    obj.setCoBknm3(lineArray[14]);
                    obj.setCoBknm4(lineArray[15]);
                    obj.setOurRef(lineArray[16]);
                    obj.setTheirRef(lineArray[17]);
                    obj.setMsgCcy(lineArray[18]);
                    obj.setMsgAmt(new BigDecimal(lineArray[19]));
                    obj.setOpNo(lineArray[20]);
                    obj.setApIl((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                    obj.setApTime(lineArray[22]);
                    obj.setApMngNo(lineArray[23]);
                    obj.setInoutIl((lineArray[24].equals("")) ? null : formatter.parse(lineArray[24]));
                    obj.setInoutTime(lineArray[25]);
                    obj.setDoneIl((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                    obj.setDoneTime(lineArray[27]);
                    obj.setAnsBack(lineArray[28]);
                    obj.setTrailGb(lineArray[29]);
                    obj.setTelexNo(lineArray[30]);
                    obj.setTkeyYn(lineArray[31]);
                    obj.setTkeyBkcd(lineArray[32]);
                    obj.setTkeyIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                    obj.setTkeyPref(lineArray[34]);
                    obj.setTkeyVar(lineArray[35]);
                    obj.setTkeyVal(lineArray[36]);
                    obj.setTkeyLine(lineArray[37]);
                    obj.setTkeyCni1(lineArray[38]);
                    obj.setTkeyCni2(lineArray[39]);
                    obj.setErrMsg(lineArray[40]);
                    obj.setHeadPrint(lineArray[41]);
                    obj.setBranPrint(lineArray[42]);
                    obj.setTlxMngNo(lineArray[43]);
                    obj.setPrioYn(lineArray[44]);
                    obj.setDupYn(lineArray[45]);
                    obj.setPhysDivi(lineArray[46]);
                    obj.setBeDoc(lineArray[47]);
                    obj.setAfDoc(lineArray[48]);
                    obj.setUserKey(lineArray[49]);
                    obj.setTsKey(lineArray[50]);
                    obj.setMirNo(lineArray[51]);
                    obj.setMorNo(lineArray[52]);
                    obj.setPrevTs(lineArray[53]);
                    obj.setPrevIl((lineArray[54].equals("")) ? null : formatter.parse(lineArray[54]));
                    obj.setPrevMir(lineArray[55]);
                    obj.setPrevMor(lineArray[56]);
                    obj.setFlag1(lineArray[57]);
                    obj.setFlag2(lineArray[58]);
                    obj.setFlag3(lineArray[59]);
                    obj.setGlobId(lineArray[60]);
                    obj.setMsgFileNm(lineArray[61]);
                    obj.setLstIl((lineArray[62].equals("")) ? null : formatter.parse(lineArray[62]));
                    obj.setLstTime(lineArray[63]);
                    obj.setLstTty(lineArray[64]);
                    obj.setLstOpNo(lineArray[65]);
                    obj.setRelDoc(lineArray[66]);
                    obj.setRegEmpNo(lineArray[67]);
                    obj.setRegDt((lineArray[68].equals("")) ? null : formatter.parse(lineArray[68]));
                    obj.setRegTm(lineArray[69]);
                    obj.setUpdEmpNo(lineArray[70]);
                    obj.setUpdDt((lineArray[71].equals("")) ? null : formatter.parse(lineArray[71]));
                    obj.setUpdTm(lineArray[72]);
                    if (isExist(obj.getDocId())) {
                        acom_comh_msgInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COMH_MSGInfo> objList) {
        acom_comh_msgInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String docId) {
        return acom_comh_msgInfoRepository.existsByDocId(docId);
    }
}
