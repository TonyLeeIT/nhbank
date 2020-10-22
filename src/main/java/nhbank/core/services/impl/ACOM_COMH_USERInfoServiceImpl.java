package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_COMH_USERInfo;
import nhbank.core.repositories.ACOM_COMH_USERInfoRepository;
import nhbank.core.services.ACOM_COMH_USERInfoService;
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
public class ACOM_COMH_USERInfoServiceImpl implements ACOM_COMH_USERInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_COMH_USERInfoRepository acom_comh_userInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_COMH_USERInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\ACOM_COMH_USER.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\ACOM_COMH_USER.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_COMH_USERInfo obj = new ACOM_COMH_USERInfo();
                obj.setOpNo(lineArray[0]);
                obj.setPassword(lineArray[1]);
                obj.setSts(lineArray[2]);
                obj.setPasswdIl((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setOpGb(lineArray[4]);
                obj.setKnm(lineArray[5]);
                obj.setFnm(lineArray[6]);
                obj.setOpenIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setOpenUser(lineArray[8]);
                obj.setCjum(lineArray[9]);
                obj.setAjum(lineArray[10]);
                obj.setSjum(lineArray[11]);
                obj.setGrpNo(lineArray[12]);
                obj.setDealerNo(lineArray[13]);
                obj.setDealerYn(lineArray[14]);
                obj.setTgb(lineArray[15]);
                obj.setType(lineArray[16]);
                obj.setTseq(lineArray[17]);
                obj.setTellNo(lineArray[18]);
                obj.setGrpId(lineArray[19]);
                obj.setIpAddr(lineArray[20]);
                obj.setGrantYn(lineArray[21]);
                obj.setLoginIl((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                obj.setLogoutIl((lineArray[23].equals("")) ? null : formatter.parse(lineArray[23]));
                obj.setLoginYn(lineArray[24]);
                obj.setLoginTime(lineArray[25]);
                obj.setLogoutTime(lineArray[26]);
                obj.setLstIbIl((lineArray[27].equals("")) ? null : formatter.parse(lineArray[27]));
                obj.setSeniorOpNo(lineArray[28]);
                obj.setOldPasswd0(lineArray[29]);
                obj.setOldPasswd1(lineArray[30]);
                obj.setOldPasswd2(lineArray[31]);
                obj.setOldPasswd3(lineArray[32]);
                obj.setOldPasswd4(lineArray[33]);
                obj.setOldPasswd5(lineArray[34]);
                obj.setOldPasswd6(lineArray[35]);
                obj.setOldPasswd7(lineArray[36]);
                obj.setOldPasswd8(lineArray[37]);
                obj.setOldPasswd9(lineArray[38]);
                obj.setPasswdLock(lineArray[39]);
                obj.setSessTmOut(new BigDecimal(lineArray[40]));
                obj.setLinePrt1(lineArray[41]);
                obj.setLinePrt2(lineArray[42]);
                obj.setLinePrt3(lineArray[43]);
                obj.setExpiDt((lineArray[44].equals("")) ? null : formatter.parse(lineArray[44]));
                obj.setHqOpNo(lineArray[45]);
                obj.setRegEmpNo(lineArray[46]);
                obj.setRegDt((lineArray[47].equals("")) ? null : formatter.parse(lineArray[47]));
                obj.setRegTm(lineArray[48]);
                obj.setUpdEmpNo(lineArray[49]);
                obj.setUpdDt((lineArray[50].equals("")) ? null : formatter.parse(lineArray[50]));
                obj.setUpdTm(lineArray[51]);
                obj.setRandSalt(lineArray[52]);
                if (isExist(obj.getOpNo())) {
                    acom_comh_userInfoRepository.save(obj);
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
    public void insertAll(List<ACOM_COMH_USERInfo> objList) {
        acom_comh_userInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String opNo) {
        return acom_comh_userInfoRepository.existsByOpNo(opNo);
    }
}
