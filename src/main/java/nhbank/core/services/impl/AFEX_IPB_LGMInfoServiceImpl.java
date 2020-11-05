package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.domain.AFEX_IPB_LGMInfo;
import nhbank.core.repositories.AFEX_IPB_LGMInfoRepository;
import nhbank.core.services.AFEX_IPB_LGMInfoService;
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
public class AFEX_IPB_LGMInfoServiceImpl implements AFEX_IPB_LGMInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    AFEX_IPB_LGMInfoRepository afex_ipb_lgmInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("AFEX_IPB_LGM");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<AFEX_IPB_LGMInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            String uploadPath = pathConfig.getUploadPath();
            File file = new File(dataPath + "\\AFEX_IPB_LGM.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\AFEX_IPB_LGM.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    AFEX_IPB_LGMInfo obj = new AFEX_IPB_LGMInfo();
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
                    obj.setPSseq(new BigDecimal(lineArray[10]));
                    obj.setJan(new BigDecimal(lineArray[11]));
                    obj.setBojBjan2(new BigDecimal(lineArray[12]));
                    obj.setBojJan2(new BigDecimal(lineArray[13]));
                    obj.setBlGb(lineArray[14]);
                    obj.setBojJukYul(new BigDecimal(lineArray[15]));
                    obj.setYmanIl((lineArray[16].equals("")) ? null : formatter.parse(lineArray[16]));
                    obj.setSYjIl((lineArray[17].equals("")) ? null : formatter.parse(lineArray[17]));
                    obj.setSDsAmt(new BigDecimal(lineArray[18]));
                    obj.setSJukGb(lineArray[19]);
                    obj.setBlJubIl((lineArray[20].equals("")) ? null : formatter.parse(lineArray[20]));
                    obj.setTrGb(lineArray[21]);
                    obj.setTcLisuIl((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                    obj.setBlNo(lineArray[23]);
                    obj.setBldSeq(new BigDecimal(lineArray[24]));
                    obj.setInsHisNo(new BigDecimal(lineArray[25]));
                    obj.setBlBalIl((lineArray[26].equals("")) ? null : formatter.parse(lineArray[26]));
                    obj.setLgHoiGb(lineArray[27]);
                    obj.setCsGb(lineArray[28]);
                    obj.setTerm(new BigDecimal(lineArray[29]));
                    obj.setTermGb(lineArray[30]);
                    obj.setJilgBamt(new BigDecimal(lineArray[31]));
                    obj.setJilgFamt(new BigDecimal(lineArray[32]));
                    obj.setLgcomFrIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                    obj.setLgcomToIl((lineArray[34].equals("")) ? null : formatter.parse(lineArray[34]));
                    obj.setLgcomFrt(new BigDecimal(lineArray[35]));
                    obj.setLgcomDsAmt(new BigDecimal(lineArray[36]));
                    obj.setMfcsRtCd(lineArray[37]);
                    obj.setBojfeeGb(lineArray[38]);
                    obj.setBojJukGb(lineArray[39]);
                    obj.setShipNm(lineArray[40]);
                    obj.setShipCo(lineArray[41]);
                    obj.setShipCoAddr1(lineArray[42]);
                    obj.setShipCoAddr2(lineArray[43]);
                    obj.setRegEmpNo(lineArray[44]);
                    obj.setRegDt((lineArray[45].equals("")) ? null : formatter.parse(lineArray[45]));
                    obj.setRegTm(lineArray[46]);
                    obj.setUpdEmpNo(lineArray[47]);
                    obj.setUpdDt((lineArray[48].equals("")) ? null : formatter.parse(lineArray[48]));
                    obj.setUpdTm(lineArray[49]);
                    if (isExist(obj.getRefNo(), obj.getSeq(), obj.getSseq())) {
                        afex_ipb_lgmInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPB_LGMInfo> objList) {
        afex_ipb_lgmInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq, BigDecimal sseq) {
        return afex_ipb_lgmInfoRepository.existsByRefNoAndSeqAndSseq(refNo, seq, sseq);
    }
}
