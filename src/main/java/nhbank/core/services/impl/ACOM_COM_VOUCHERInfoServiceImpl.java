package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.controllers.NHBankController;
import nhbank.core.domain.ACOM_COM_VOUCHERInfo;
import nhbank.core.domain.CheckUpdate;
import nhbank.core.repositories.ACOM_COM_VOUCHERInfoRepository;
import nhbank.core.repositories.CheckUpdateRepository;
import nhbank.core.services.ACOM_COM_VOUCHERInfoService;
import nhbank.core.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ACOM_COM_VOUCHERInfoServiceImpl implements ACOM_COM_VOUCHERInfoService {
    public static final Logger logger = LoggerFactory.getLogger(NHBankController.class);
    @Autowired
    PathConfig pathConfig;
    @Autowired
    CheckUpdateRepository checkUpdateRepository;
    @Autowired
    ACOM_COM_VOUCHERInfoRepository acom_com_voucherInfoRepository;

    @Override
    public void updateAll() throws IOException {
        CheckUpdate checkUpdate = new CheckUpdate();
        checkUpdate.setTableName("ACOM_COM_VOUCHER");
        checkUpdate.setUpdateTime(LocalDateTime.now());
        BufferedReader br = null;
        try {
            List<ACOM_COM_VOUCHERInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String dataPath = pathConfig.getDataPath();
            File file = new File(dataPath + "\\ACOM_COM_VOUCHER.dat");
            if (!file.exists()) {
                logger.info("No such file");
            } else {
                br = new BufferedReader(new FileReader(dataPath + "\\ACOM_COM_VOUCHER.dat"));
                while ((line = br.readLine()) != null) {
                    String[] lineArray = line.split("\\|");
                    ACOM_COM_VOUCHERInfo obj = new ACOM_COM_VOUCHERInfo();
                    obj.setAcIl(lineArray[0]);
                    obj.setAcBr(lineArray[1]);
                    obj.setRefNo(lineArray[2]);
                    obj.setHisNo(new BigDecimal(lineArray[3]));
                    obj.setOtherRefNo(lineArray[4]);
                    obj.setUpmuCd(lineArray[5]);
                    obj.setTrCd(lineArray[6]);
                    obj.setTrxName(lineArray[7]);
                    obj.setTrxDt(lineArray[8]);
                    obj.setCixNo(lineArray[9]);
                    obj.setCixName(lineArray[10]);
                    obj.setTellNo(lineArray[11]);
                    obj.setBenef(lineArray[12]);
                    obj.setRemark(lineArray[13]);
                    obj.setFreeText1(lineArray[14]);
                    obj.setFreeText2(lineArray[15]);
                    obj.setFreeText3(lineArray[16]);
                    obj.setFreeText4(lineArray[17]);
                    obj.setFreeText5(lineArray[18]);
                    obj.setFreeText6(lineArray[19]);
                    obj.setFreeText7(lineArray[20]);
                    obj.setFreeText8(lineArray[21]);
                    obj.setPrtGb(lineArray[22]);
                    obj.setOpNo(lineArray[23]);
                    obj.setOpName(lineArray[24]);
                    obj.setVoucherNo(new BigDecimal(lineArray[25]));
                    obj.setPrtSeq(new BigDecimal(lineArray[26]));
                    obj.setRegEmpNo(lineArray[27]);
                    obj.setRegDt((lineArray[28].equals("")) ? null : formatter.parse(lineArray[28]));
                    obj.setRegTm(lineArray[29]);
                    obj.setUpdEmpNo(lineArray[30]);
                    obj.setUpdDt((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                    obj.setUpdTm(lineArray[32]);
                    if (isExist(obj.getAcIl(), obj.getAcBr())) {
                        acom_com_voucherInfoRepository.save(obj);
                    } else {
                        objList.add(obj);
                    }
                }
                br.close();
                if (!objList.isEmpty())
                    insertAll(objList);
                checkUpdate.setStatus("Done");
                checkUpdateRepository.save(checkUpdate);
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
    public void insertAll(List<ACOM_COM_VOUCHERInfo> objList) {
        acom_com_voucherInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String acIl, String acBr) {
        return acom_com_voucherInfoRepository.existsByAcIlAndAcBr(acIl, acBr);
    }
}
