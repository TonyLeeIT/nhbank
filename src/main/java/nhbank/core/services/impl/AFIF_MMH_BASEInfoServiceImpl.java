package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFIF_MMH_BASEInfo;
import nhbank.core.repositories.AFIF_MMH_BASEInfoRepository;
import nhbank.core.services.AFIF_MMH_BASEInfoService;
import nhbank.core.util.DateUtils;
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
public class AFIF_MMH_BASEInfoServiceImpl implements AFIF_MMH_BASEInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFIF_MMH_BASEInfoRepository afif_mmh_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFIF_MMH_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            String todayDate = DateUtils.dateYYYMMDD();
            String dataPath = pathConfig.getDataPath().replace("yyyymmdd", todayDate);
            File file = new File(dataPath + "\\AFIF_MMH_BASE.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(dataPath + "\\AFIF_MMH_BASE.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFIF_MMH_BASEInfo obj = new AFIF_MMH_BASEInfo();
                obj.setRefNo(lineArray[0]);
                obj.setComId(lineArray[1]);
                obj.setComNm(lineArray[2]);
                obj.setCounterpartyId(lineArray[3]);
                obj.setCounterpartyNm(lineArray[4]);
                obj.setDealIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setValueYn(lineArray[6]);
                obj.setValueIl((lineArray[7].equals("")) ? null : formatter.parse(lineArray[7]));
                obj.setExpYn(lineArray[8]);
                obj.setExpIl((lineArray[9].equals("")) ? null : formatter.parse(lineArray[9]));
                obj.setBorrowLonGb(lineArray[10]);
                obj.setCcy(lineArray[11]);
                obj.setPrincipalAmt(new BigDecimal(lineArray[12]));
                obj.setRateCcy(lineArray[13]);
                obj.setFixFltGb(lineArray[14]);
                obj.setTaxAmt(new BigDecimal(lineArray[15]));
                obj.setRateFreq(lineArray[16]);
                obj.setIndexRt(new BigDecimal(lineArray[17]));
                obj.setRateGb(lineArray[18]);
                obj.setSpreadRt(new BigDecimal(lineArray[19]));
                obj.setTotalRt(new BigDecimal(lineArray[20]));
                obj.setIntFromIl((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                obj.setIntToIl((lineArray[22].equals("")) ? null : formatter.parse(lineArray[22]));
                obj.setIntDays(new BigDecimal(lineArray[23]));
                obj.setIntCcy(lineArray[24]);
                obj.setIntAmt(new BigDecimal(lineArray[25]));
                obj.setAdvArrGb(lineArray[26]);
                obj.setSingleBothType(lineArray[27]);
                obj.setAccrType(lineArray[28]);
                obj.setBsnsDayRule(lineArray[29]);
                obj.setHolidayLocation(lineArray[30]);
                obj.setIntPayRcvIl((lineArray[31].equals("")) ? null : formatter.parse(lineArray[31]));
                obj.setConfirmYn(lineArray[32]);
                obj.setConfirmIl((lineArray[33].equals("")) ? null : formatter.parse(lineArray[33]));
                obj.setPoYn(lineArray[34]);
                obj.setPoIl((lineArray[35].equals("")) ? null : formatter.parse(lineArray[35]));
                obj.setPoSeq(new BigDecimal(lineArray[36]));
                obj.setPoAmt(new BigDecimal(lineArray[37]));
                obj.setOurRcvDepoCcy(lineArray[38]);
                obj.setOurRcvDepoCd(lineArray[39]);
                obj.setOurRcvDepoNm(lineArray[40]);
                obj.setOurPayDepoCcy(lineArray[41]);
                obj.setOurPayDepoCd(lineArray[42]);
                obj.setOurPayDepoNm(lineArray[43]);
                obj.setThrRcvDepoCcy(lineArray[44]);
                obj.setThrRcvDepoBic(lineArray[45]);
                obj.setThrRcvDepoNm(lineArray[46]);
                obj.setBrokerId(lineArray[47]);
                obj.setBrokerFeeCcy(lineArray[48]);
                obj.setBrokerFeeAmt(new BigDecimal(lineArray[49]));
                obj.setOnoffGb(lineArray[50]);
                obj.setInoutGb(lineArray[51]);
                obj.setBorrowGb(lineArray[52]);
                obj.setBorrowKind(lineArray[53]);
                obj.setNationLonGb(lineArray[54]);
                obj.setLoanUseGb(lineArray[55]);
                obj.setUsdCvtAmt(new BigDecimal(lineArray[56]));
                obj.setBaseCvtAmt(new BigDecimal(lineArray[57]));
                obj.setRolloverYn(lineArray[58]);
                obj.setRolloverType(lineArray[59]);
                obj.setRolloverRefNo(lineArray[60]);
                obj.setBankCd(lineArray[61]);
                obj.setChangeBrSts(lineArray[62]);
                obj.setFstIbIl((lineArray[63].equals("")) ? null : formatter.parse(lineArray[63]));
                obj.setLstDealIl((lineArray[64].equals("")) ? null : formatter.parse(lineArray[64]));
                obj.setLstIbIl((lineArray[65].equals("")) ? null : formatter.parse(lineArray[65]));
                obj.setDealerId(lineArray[66]);
                obj.setUserId(lineArray[67]);
                obj.setKondorId(lineArray[68]);
                obj.setRemark(lineArray[69]);
                obj.setContractId(lineArray[70]);
                obj.setRelateRefNo(lineArray[71]);
                obj.setInterofficeBrNo(lineArray[72]);
                obj.setBondRefNo(lineArray[73]);
                obj.setRegEmpNo(lineArray[74]);
                obj.setRegDt((lineArray[75].equals("")) ? null : formatter.parse(lineArray[75]));
                obj.setRegTm(lineArray[76]);
                obj.setUpdEmpNo(lineArray[77]);
                obj.setUpdDt((lineArray[78].equals("")) ? null : formatter.parse(lineArray[78]));
                obj.setUpdTm(lineArray[79]);
                obj.setUpfrontFeeCcy(lineArray[80]);
                obj.setUpfrontFeeAmt(new BigDecimal(lineArray[81]));
                obj.setIntFreq(lineArray[82]);
                obj.setHoliDayRule(lineArray[83]);
                obj.setCouponAdjYn(lineArray[84]);
                obj.setIntAtMatYn(lineArray[85]);
                if (isExist(obj.getRefNo())) {
                    afif_mmh_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFIF_MMH_BASEInfo> objList) {
        afif_mmh_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afif_mmh_baseInfoRepository.existsByRefNo(refNo);
    }
}
