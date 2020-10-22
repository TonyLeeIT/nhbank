package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_XPH_COVERInfo;
import nhbank.core.repositories.AFEX_XPH_COVERInfoRepository;
import nhbank.core.services.AFEX_XPH_COVERInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@Service
public class AFEX_XPH_COVERInfoServiceImpl implements AFEX_XPH_COVERInfoService {
    @Autowired
    AFEX_XPH_COVERInfoRepository afex_xph_coverInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_XPH_COVERInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_XPH_COVERInfo obj = new AFEX_XPH_COVERInfo();
                obj.setRefNo(lineArray[0]);
                obj.setTranDate(lineArray[1]);
                obj.setLcNo(lineArray[2]);
                obj.setIssueBknm(lineArray[3]);
                obj.setOpenDate(lineArray[4]);
                obj.setImpotName(lineArray[5]);
                obj.setCurr(lineArray[6]);
                obj.setAmount(new BigDecimal(lineArray[7]));
                obj.setTenorGb(lineArray[8]);
                obj.setTenorDay(new BigDecimal(lineArray[9]));
                obj.setTenorCode(lineArray[10]);
                obj.setMatur(lineArray[11]);
                obj.setDrawer(lineArray[12]);
                obj.setMailBkcd(lineArray[13]);
                obj.setOpenBknm1(lineArray[14]);
                obj.setOpenBknm2(lineArray[15]);
                obj.setOpenBknm3(lineArray[16]);
                obj.setOpenBknm4(lineArray[17]);
                obj.setCable(new BigDecimal(lineArray[18]));
                obj.setWhanga(new BigDecimal(lineArray[19]));
                obj.setSeqNo0(lineArray[20]);
                obj.setSeqNo1(lineArray[21]);
                obj.setSeqNo2(lineArray[22]);
                obj.setSeqNo3(lineArray[23]);
                obj.setSeqNo4(lineArray[24]);
                obj.setSeqNo5(lineArray[25]);
                obj.setSeqNo6(lineArray[26]);
                obj.setSeqNo7(lineArray[27]);
                obj.setSeqNo8(lineArray[28]);
                obj.setSeqNo9(lineArray[29]);
                obj.setSeqNo10(lineArray[30]);
                obj.setSeqNo11(lineArray[31]);
                obj.setSeqNo12(lineArray[32]);
                obj.setSeqNo13(lineArray[33]);
                obj.setTrefNo(lineArray[34]);
                obj.setLa10(lineArray[35]);
                obj.setLa20(lineArray[36]);
                obj.setLa11(lineArray[37]);
                obj.setLa21(lineArray[38]);
                obj.setLa12(lineArray[39]);
                obj.setLa22(lineArray[40]);
                obj.setLa13(lineArray[41]);
                obj.setLa23(lineArray[42]);
                obj.setLa14(lineArray[43]);
                obj.setLa24(lineArray[44]);
                obj.setLa15(lineArray[45]);
                obj.setLa25(lineArray[46]);
                obj.setTxt10(lineArray[47]);
                obj.setTxt20(lineArray[48]);
                obj.setTxt30(lineArray[49]);
                obj.setTxt11(lineArray[50]);
                obj.setTxt21(lineArray[51]);
                obj.setTxt31(lineArray[52]);
                obj.setTxt12(lineArray[53]);
                obj.setTxt22(lineArray[54]);
                obj.setTxt32(lineArray[55]);
                obj.setTxt13(lineArray[56]);
                obj.setTxt23(lineArray[57]);
                obj.setTxt33(lineArray[58]);
                obj.setTxt14(lineArray[59]);
                obj.setTxt24(lineArray[60]);
                obj.setTxt34(lineArray[61]);
                obj.setTxt15(lineArray[62]);
                obj.setTxt25(lineArray[63]);
                obj.setTxt35(lineArray[64]);
                obj.setTxt16(lineArray[65]);
                obj.setTxt26(lineArray[66]);
                obj.setTxt36(lineArray[67]);
                obj.setTxt17(lineArray[68]);
                obj.setTxt27(lineArray[69]);
                obj.setTxt37(lineArray[70]);
                obj.setTxt18(lineArray[71]);
                obj.setTxt28(lineArray[72]);
                obj.setTxt38(lineArray[73]);
                obj.setTxt19(lineArray[74]);
                obj.setTxt29(lineArray[75]);
                obj.setTxt39(lineArray[76]);
                obj.setTxt110(lineArray[77]);
                obj.setTxt210(lineArray[78]);
                obj.setTxt310(lineArray[79]);
                obj.setTxt111(lineArray[80]);
                obj.setTxt211(lineArray[81]);
                obj.setTxt311(lineArray[82]);
                obj.setTxt112(lineArray[83]);
                obj.setTxt212(lineArray[84]);
                obj.setTxt312(lineArray[85]);
                obj.setTxt113(lineArray[86]);
                obj.setTxt213(lineArray[87]);
                obj.setTxt313(lineArray[88]);
                obj.setTxt114(lineArray[89]);
                obj.setTxt214(lineArray[90]);
                obj.setTxt314(lineArray[91]);
                obj.setTxt115(lineArray[92]);
                obj.setTxt215(lineArray[93]);
                obj.setTxt315(lineArray[94]);
                obj.setTxt116(lineArray[95]);
                obj.setTxt216(lineArray[96]);
                obj.setTxt316(lineArray[97]);
                obj.setTxt117(lineArray[98]);
                obj.setTxt217(lineArray[99]);
                obj.setTxt317(lineArray[100]);
                obj.setTxt118(lineArray[101]);
                obj.setTxt218(lineArray[102]);
                obj.setTxt318(lineArray[103]);
                obj.setTxt119(lineArray[104]);
                obj.setTxt219(lineArray[105]);
                obj.setTxt319(lineArray[106]);
                obj.setTxt120(lineArray[107]);
                obj.setTxt220(lineArray[108]);
                obj.setTxt320(lineArray[109]);
                obj.setBknm(lineArray[110]);
                obj.setAcno(lineArray[111]);
                obj.setDraftAmt(new BigDecimal(lineArray[112]));
                obj.setIntRt(new BigDecimal(lineArray[113]));
                obj.setIntAmt(new BigDecimal(lineArray[114]));
                obj.setCommRt(new BigDecimal(lineArray[115]));
                obj.setCommAmt(new BigDecimal(lineArray[116]));
                obj.setLessRt(new BigDecimal(lineArray[117]));
                obj.setLessAmt(new BigDecimal(lineArray[118]));
                obj.setTotal(new BigDecimal(lineArray[119]));
                obj.setDpda(lineArray[120]);
                obj.setBrName(lineArray[121]);
                obj.setTelNo(lineArray[122]);
                obj.setDrawBic(lineArray[123]);
                obj.setDrawbkName1(lineArray[124]);
                obj.setDrawbkName2(lineArray[125]);
                obj.setDrawbkName3(lineArray[126]);
                obj.setBknm1(lineArray[127]);
                obj.setNegoDate(lineArray[128]);
                obj.setMt742Gb(lineArray[129]);
                obj.setMt754Gb(lineArray[130]);
                obj.setMt799Gb(lineArray[131]);
                obj.setMt999Gb(lineArray[132]);
                obj.setDiscreCcy(lineArray[133]);
                obj.setDiscreAmt(new BigDecimal(lineArray[134]));
                obj.setCableCcy(lineArray[135]);
                obj.setCableAmt(new BigDecimal(lineArray[136]));
                obj.setTag721(lineArray[137]);
                obj.setTag722(lineArray[138]);
                obj.setTag723(lineArray[139]);
                obj.setTag724(lineArray[140]);
                obj.setTag725(lineArray[141]);
                obj.setTag726(lineArray[142]);
                obj.setTag727(lineArray[143]);
                obj.setTag728(lineArray[144]);
                obj.setTag729(lineArray[145]);
                obj.setTag7210(lineArray[146]);
                obj.setTag791(lineArray[147]);
                obj.setTag792(lineArray[148]);
                obj.setTag793(lineArray[149]);
                obj.setTag794(lineArray[150]);
                obj.setTag795(lineArray[151]);
                obj.setTag796(lineArray[152]);
                obj.setTag797(lineArray[153]);
                obj.setTag798(lineArray[154]);
                obj.setTag799(lineArray[155]);
                obj.setTag7910(lineArray[156]);
                obj.setRegEmpNo(lineArray[157]);
                obj.setRegDt((lineArray[158].equals("")) ? null : formatter.parse(lineArray[158]));
                obj.setRegTm(lineArray[159]);
                obj.setUpdEmpNo(lineArray[160]);
                obj.setUpdDt((lineArray[161].equals("")) ? null : formatter.parse(lineArray[161]));
                obj.setUpdTm(lineArray[162]);
                obj.setTag711(lineArray[163]);
                obj.setTag712(lineArray[164]);
                obj.setTag713(lineArray[165]);
                obj.setTag714(lineArray[166]);
                obj.setTag715(lineArray[167]);
                obj.setTag716(lineArray[168]);
                obj.setApplNm(lineArray[169]);
                obj.setLoadPortCtry(lineArray[170]);
                obj.setDiscPortCtry(lineArray[171]);
                obj.setOrgnCtry(lineArray[172]);
                obj.setCmmdt(lineArray[173]);
                obj.setShipNm(lineArray[174]);
                obj.setShipCtry(lineArray[175]);
                if (isExist(obj.getRefNo())) {
                    afex_xph_coverInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_COVERInfo> objList) {
        afex_xph_coverInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afex_xph_coverInfoRepository.existsByRefNo(refNo);
    }
}
