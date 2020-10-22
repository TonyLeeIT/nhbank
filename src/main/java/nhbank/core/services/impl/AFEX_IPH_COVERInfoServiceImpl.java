package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_IPH_COVERInfo;
import nhbank.core.repositories.AFEX_IPH_COVERInfoRepository;
import nhbank.core.services.AFEX_IPH_COVERInfoService;
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
public class AFEX_IPH_COVERInfoServiceImpl implements AFEX_IPH_COVERInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_IPH_COVERInfoRepository afex_iph_coverInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_IPH_COVERInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\AFEX_IPH_COVER.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\AFEX_IPH_COVER.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_IPH_COVERInfo obj = new AFEX_IPH_COVERInfo();
                obj.setRefNo(lineArray[0]);
                obj.setSeq(new BigDecimal(lineArray[1]));
                obj.setTranDate((lineArray[2].equals("")) ? null : formatter.parse(lineArray[2]));
                obj.setDueDate((lineArray[3].equals("")) ? null : formatter.parse(lineArray[3]));
                obj.setIpCd(lineArray[4]);
                obj.setCcy(lineArray[5]);
                obj.setAmount(new BigDecimal(lineArray[6]));
                obj.setTrefNo(lineArray[7]);
                obj.setNegoBkcd(lineArray[8]);
                obj.setNegoBknm(lineArray[9]);
                obj.setReimBkcd(lineArray[10]);
                obj.setReimBknm(lineArray[11]);
                obj.setDrawer(lineArray[12]);
                obj.setTenorGb(lineArray[13]);
                obj.setTenorDay(new BigDecimal(lineArray[14]));
                obj.setTenorCode(lineArray[15]);
                obj.setHajaGb(lineArray[16]);
                obj.setCommGb1(lineArray[17]);
                obj.setHandCcy(lineArray[18]);
                obj.setHandAmt(new BigDecimal(lineArray[19]));
                obj.setCommGb2(lineArray[20]);
                obj.setCableCcy(lineArray[21]);
                obj.setCableAmt(new BigDecimal(lineArray[22]));
                obj.setCommGb3(lineArray[23]);
                obj.setLieuCcy(lineArray[24]);
                obj.setLieuAmt(new BigDecimal(lineArray[25]));
                obj.setCommGb4(lineArray[26]);
                obj.setEtcCcy(lineArray[27]);
                obj.setEtcAmt(new BigDecimal(lineArray[28]));
                obj.setOverdrawAmt(new BigDecimal(lineArray[29]));
                obj.setAcNo(lineArray[30]);
                obj.setLa10(lineArray[31]);
                obj.setLa20(lineArray[32]);
                obj.setLa11(lineArray[33]);
                obj.setLa21(lineArray[34]);
                obj.setLa12(lineArray[35]);
                obj.setLa22(lineArray[36]);
                obj.setLa13(lineArray[37]);
                obj.setLa23(lineArray[38]);
                obj.setTxt10(lineArray[39]);
                obj.setTxt20(lineArray[40]);
                obj.setTxt11(lineArray[41]);
                obj.setTxt21(lineArray[42]);
                obj.setTxt12(lineArray[43]);
                obj.setTxt22(lineArray[44]);
                obj.setTxt13(lineArray[45]);
                obj.setTxt23(lineArray[46]);
                obj.setTxt14(lineArray[47]);
                obj.setTxt24(lineArray[48]);
                obj.setTxt15(lineArray[49]);
                obj.setTxt25(lineArray[50]);
                obj.setTxt16(lineArray[51]);
                obj.setTxt26(lineArray[52]);
                obj.setTxt17(lineArray[53]);
                obj.setTxt27(lineArray[54]);
                obj.setTxt18(lineArray[55]);
                obj.setTxt28(lineArray[56]);
                obj.setTxt19(lineArray[57]);
                obj.setTxt29(lineArray[58]);
                obj.setTxt110(lineArray[59]);
                obj.setTxt210(lineArray[60]);
                obj.setTxt111(lineArray[61]);
                obj.setTxt211(lineArray[62]);
                obj.setTxt112(lineArray[63]);
                obj.setTxt212(lineArray[64]);
                obj.setTxt113(lineArray[65]);
                obj.setTxt213(lineArray[66]);
                obj.setTxt114(lineArray[67]);
                obj.setTxt214(lineArray[68]);
                obj.setTxt115(lineArray[69]);
                obj.setTxt215(lineArray[70]);
                obj.setTxt116(lineArray[71]);
                obj.setTxt216(lineArray[72]);
                obj.setTxt117(lineArray[73]);
                obj.setTxt217(lineArray[74]);
                obj.setTxt118(lineArray[75]);
                obj.setTxt218(lineArray[76]);
                obj.setVessel(lineArray[77]);
                obj.setVoyage(lineArray[78]);
                obj.setCommodity1(lineArray[79]);
                obj.setCommodity2(lineArray[80]);
                obj.setContractNo(lineArray[81]);
                obj.setHajaCd1(lineArray[82]);
                obj.setHajaCd2(lineArray[83]);
                obj.setHajaCd3(lineArray[84]);
                obj.setHajaCd4(lineArray[85]);
                obj.setHajaCd5(lineArray[86]);
                obj.setHajaCd6(lineArray[87]);
                obj.setHajaCd7(lineArray[88]);
                obj.setHajaCd8(lineArray[89]);
                obj.setHajaCd9(lineArray[90]);
                obj.setHajaCd10(lineArray[91]);
                obj.setHajaCd11(lineArray[92]);
                obj.setHajaCd12(lineArray[93]);
                obj.setHajaCd13(lineArray[94]);
                obj.setHajaCd14(lineArray[95]);
                obj.setHajaCd15(lineArray[96]);
                obj.setHajaCd16(lineArray[97]);
                obj.setHajaCd17(lineArray[98]);
                obj.setHajaCd18(lineArray[99]);
                obj.setHajaCd19(lineArray[100]);
                obj.setHajaSayu(lineArray[101]);
                obj.setRegEmpNo(lineArray[102]);
                obj.setRegDt((lineArray[103].equals("")) ? null : formatter.parse(lineArray[103]));
                obj.setRegTm(lineArray[104]);
                obj.setUpdEmpNo(lineArray[105]);
                obj.setUpdDt((lineArray[106].equals("")) ? null : formatter.parse(lineArray[106]));
                obj.setUpdTm(lineArray[107]);
                obj.setLoadPortCtry(lineArray[108]);
                obj.setDiscPortCtry(lineArray[109]);
                obj.setOrgnCtry(lineArray[110]);
                obj.setShipCtry(lineArray[111]);
                if (isExist(obj.getRefNo(), obj.getSeq())) {
                    afex_iph_coverInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPH_COVERInfo> objList) {
        afex_iph_coverInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal seq) {
        return afex_iph_coverInfoRepository.existsByRefNoAndSeq(refNo, seq);
    }
}
