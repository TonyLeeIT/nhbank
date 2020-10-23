package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.ACOM_CIX_BASEInfo;
import nhbank.core.repositories.ACOM_CIX_BASEInfoRepository;
import nhbank.core.services.ACOM_CIX_BASEInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

import nhbank.core.util.DateUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class ACOM_CIX_BASEInfoServiceImpl implements ACOM_CIX_BASEInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    ACOM_CIX_BASEInfoRepository acom_cix_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<ACOM_CIX_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\ACOM_CIX_BASE.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\ACOM_CIX_BASE.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                ACOM_CIX_BASEInfo obj = new ACOM_CIX_BASEInfo();
                obj.setCixNo(lineArray[0]);
                obj.setIdNo(lineArray[1]);
                obj.setIdTp(lineArray[2]);
                obj.setEndIdDt((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setIdNm(lineArray[4]);
                obj.setIdNoKor(lineArray[5]);
                obj.setOpenBr(lineArray[6]);
                obj.setLstBr(lineArray[7]);
                obj.setOpenDt((lineArray[8].equals("")) ? null : formatter.parse(lineArray[8]));
                obj.setLstDt((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setCustEnm(lineArray[10]);
                obj.setCustSnm(lineArray[11]);
                obj.setCustHnm(lineArray[12]);
                obj.setCustHsnm(lineArray[13]);
                obj.setAddrEnm1(lineArray[14]);
                obj.setAddrEnm2(lineArray[15]);
                obj.setAddrEnm3(lineArray[16]);
                obj.setAddrEnm4(lineArray[17]);
                obj.setAddrHnm1(lineArray[18]);
                obj.setAddrHnm2(lineArray[19]);
                obj.setAddrHnm3(lineArray[20]);
                obj.setAddrHnm4(lineArray[21]);
                obj.setAddrHnm21(lineArray[22]);
                obj.setAddrHnm22(lineArray[23]);
                obj.setAddrHnm23(lineArray[24]);
                obj.setAddrHnm24(lineArray[25]);
                obj.setPostNo(lineArray[26]);
                obj.setPostNo2(lineArray[27]);
                obj.setMainTelNo(lineArray[28]);
                obj.setTelNo(lineArray[29]);
                obj.setTelNo2(lineArray[30]);
                obj.setMobileNo(lineArray[31]);
                obj.setFaxNo(lineArray[32]);
                obj.setCixCd(lineArray[33]);
                obj.setCtryCd(lineArray[34]);
                obj.setDmclCtryCd(lineArray[35]);
                obj.setGyumoCd(lineArray[36]);
                obj.setUpjoCd(lineArray[37]);
                obj.setJobCd(lineArray[38]);
                obj.setJobPlace(lineArray[39]);
                obj.setJobPlcAddr1(lineArray[40]);
                obj.setJobPlcAddr2(lineArray[41]);
                obj.setJobPlcAddr3(lineArray[42]);
                obj.setJobPlcAddr4(lineArray[43]);
                obj.setJobPostNo(lineArray[44]);
                obj.setJobCorres(lineArray[45]);
                obj.setJobPos(lineArray[46]);
                obj.setJobYear(lineArray[47]);
                obj.setJobMon(lineArray[48]);
                obj.setJobCtryCd(lineArray[49]);
                obj.setOccupSince(lineArray[50]);
                obj.setSexCd(lineArray[51]);
                obj.setBirthDt((lineArray[52].equals("")) ? null : formatter.parse(lineArray[52]));
                obj.setBirthPlace(lineArray[53]);
                obj.setMarriageYn(lineArray[54]);
                obj.setHouseOwnYn(lineArray[55]);
                obj.setBicCd(lineArray[56]);
                obj.setOpNo(lineArray[57]);
                obj.setYdGuja(lineArray[58]);
                obj.setMngInfo(lineArray[59]);
                obj.setMailTp(lineArray[60]);
                obj.setMailAddr1(lineArray[61]);
                obj.setMailAddr2(lineArray[62]);
                obj.setMailAddr3(lineArray[63]);
                obj.setMailAddr4(lineArray[64]);
                obj.setCreditGrade(lineArray[65]);
                obj.setEmailAddr(lineArray[66]);
                obj.setCapital(new BigDecimal(lineArray[67]));
                obj.setSalesScale(new BigDecimal(lineArray[68]));
                obj.setProfitExTax(new BigDecimal(lineArray[69]));
                obj.setAsset(new BigDecimal(lineArray[70]));
                obj.setPdinCaptl(new BigDecimal(lineArray[71]));
                obj.setAmtEmployee(new BigDecimal(lineArray[72]));
                obj.setCorpTp(lineArray[73]);
                obj.setRemarks1(lineArray[74]);
                obj.setRemarks2(lineArray[75]);
                obj.setHqCixNo(lineArray[76]);
                obj.setHqIdNo(lineArray[77]);
                obj.setRegEmpNo(lineArray[78]);
                obj.setRegDt((lineArray[79].equals("")) ? null : formatter.parse(lineArray[79]));
                obj.setRegTm(lineArray[80]);
                obj.setUpdEmpNo(lineArray[81]);
                obj.setUpdDt((lineArray[82].equals("")) ? null : formatter.parse(lineArray[82]));
                obj.setUpdTm(lineArray[83]);
                if (isExist(obj.getCixNo())) {
                    acom_cix_baseInfoRepository.save(obj);
                } else {
                    objList.add(obj);
                }
            }
            br.close();
            if (!objList.isEmpty())
                insertAll(objList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void insertAll(List<ACOM_CIX_BASEInfo> objList) {
        acom_cix_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String cixNo) {
        return acom_cix_baseInfoRepository.existsByCixNo(cixNo);
    }
}
