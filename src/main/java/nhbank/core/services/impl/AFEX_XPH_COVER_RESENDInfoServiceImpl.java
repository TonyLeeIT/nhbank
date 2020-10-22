package nhbank.core.services.impl;

import nhbank.core.config.PathConfig;
import nhbank.core.domain.AFEX_XPH_COVER_RESENDInfo;
import nhbank.core.repositories.AFEX_XPH_COVER_RESENDInfoRepository;
import nhbank.core.services.AFEX_XPH_COVER_RESENDInfoService;
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
public class AFEX_XPH_COVER_RESENDInfoServiceImpl implements AFEX_XPH_COVER_RESENDInfoService {
    @Autowired
    PathConfig pathConfig;
    @Autowired
    AFEX_XPH_COVER_RESENDInfoRepository afex_xph_cover_resendInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_XPH_COVER_RESENDInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            File file = new File(pathConfig.getDataPath() + "\\AFEX_XPH_COVER_RESEND.dat");
            if (!file.exists()) {
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(pathConfig.getDataPath() + "\\AFEX_XPH_COVER_RESEND.dat"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_XPH_COVER_RESENDInfo obj = new AFEX_XPH_COVER_RESENDInfo();
                obj.setRefNo(lineArray[0]);
                obj.setBhSeq(new BigDecimal(lineArray[1]));
                obj.setSts(lineArray[2]);
                obj.setHisNo(new BigDecimal(lineArray[3]));
                obj.setTranDate(lineArray[4]);
                obj.setLcNo(lineArray[5]);
                obj.setIssueBknm(lineArray[6]);
                obj.setOpenDate(lineArray[7]);
                obj.setImpotName(lineArray[8]);
                obj.setCurr(lineArray[9]);
                obj.setAmount(new BigDecimal(lineArray[10]));
                obj.setTenorGb(lineArray[11]);
                obj.setTenorDay(new BigDecimal(lineArray[12]));
                obj.setTenorCode(lineArray[13]);
                obj.setMatur(lineArray[14]);
                obj.setDrawer(lineArray[15]);
                obj.setMailBkcd(lineArray[16]);
                obj.setOpenBknm1(lineArray[17]);
                obj.setOpenBknm2(lineArray[18]);
                obj.setOpenBknm3(lineArray[19]);
                obj.setOpenBknm4(lineArray[20]);
                obj.setCable(new BigDecimal(lineArray[21]));
                obj.setWhanga(new BigDecimal(lineArray[22]));
                obj.setSeqNo0(lineArray[23]);
                obj.setSeqNo1(lineArray[24]);
                obj.setSeqNo2(lineArray[25]);
                obj.setSeqNo3(lineArray[26]);
                obj.setSeqNo4(lineArray[27]);
                obj.setSeqNo5(lineArray[28]);
                obj.setSeqNo6(lineArray[29]);
                obj.setSeqNo7(lineArray[30]);
                obj.setSeqNo8(lineArray[31]);
                obj.setSeqNo9(lineArray[32]);
                obj.setSeqNo10(lineArray[33]);
                obj.setSeqNo11(lineArray[34]);
                obj.setSeqNo12(lineArray[35]);
                obj.setSeqNo13(lineArray[36]);
                obj.setTrefNo(lineArray[37]);
                obj.setLa10(lineArray[38]);
                obj.setLa20(lineArray[39]);
                obj.setLa11(lineArray[40]);
                obj.setLa21(lineArray[41]);
                obj.setLa12(lineArray[42]);
                obj.setLa22(lineArray[43]);
                obj.setLa13(lineArray[44]);
                obj.setLa23(lineArray[45]);
                obj.setTxt10(lineArray[46]);
                obj.setTxt20(lineArray[47]);
                obj.setTxt30(lineArray[48]);
                obj.setTxt11(lineArray[49]);
                obj.setTxt21(lineArray[50]);
                obj.setTxt31(lineArray[51]);
                obj.setTxt12(lineArray[52]);
                obj.setTxt22(lineArray[53]);
                obj.setTxt32(lineArray[54]);
                obj.setTxt13(lineArray[55]);
                obj.setTxt23(lineArray[56]);
                obj.setTxt33(lineArray[57]);
                obj.setTxt14(lineArray[58]);
                obj.setTxt24(lineArray[59]);
                obj.setTxt34(lineArray[60]);
                obj.setTxt15(lineArray[61]);
                obj.setTxt25(lineArray[62]);
                obj.setTxt35(lineArray[63]);
                obj.setTxt16(lineArray[64]);
                obj.setTxt26(lineArray[65]);
                obj.setTxt36(lineArray[66]);
                obj.setTxt17(lineArray[67]);
                obj.setTxt27(lineArray[68]);
                obj.setTxt37(lineArray[69]);
                obj.setTxt18(lineArray[70]);
                obj.setTxt28(lineArray[71]);
                obj.setTxt38(lineArray[72]);
                obj.setTxt19(lineArray[73]);
                obj.setTxt29(lineArray[74]);
                obj.setTxt39(lineArray[75]);
                obj.setTxt110(lineArray[76]);
                obj.setTxt210(lineArray[77]);
                obj.setTxt310(lineArray[78]);
                obj.setTxt111(lineArray[79]);
                obj.setTxt211(lineArray[80]);
                obj.setTxt311(lineArray[81]);
                obj.setTxt112(lineArray[82]);
                obj.setTxt212(lineArray[83]);
                obj.setTxt312(lineArray[84]);
                obj.setTxt113(lineArray[85]);
                obj.setTxt213(lineArray[86]);
                obj.setTxt313(lineArray[87]);
                obj.setTxt114(lineArray[88]);
                obj.setTxt214(lineArray[89]);
                obj.setTxt314(lineArray[90]);
                obj.setTxt115(lineArray[91]);
                obj.setTxt215(lineArray[92]);
                obj.setTxt315(lineArray[93]);
                obj.setTxt116(lineArray[94]);
                obj.setTxt216(lineArray[95]);
                obj.setTxt316(lineArray[96]);
                obj.setTxt117(lineArray[97]);
                obj.setTxt217(lineArray[98]);
                obj.setTxt317(lineArray[99]);
                obj.setTxt118(lineArray[100]);
                obj.setTxt218(lineArray[101]);
                obj.setTxt318(lineArray[102]);
                obj.setBknm(lineArray[103]);
                obj.setAcno(lineArray[104]);
                obj.setDraftAmt(new BigDecimal(lineArray[105]));
                obj.setIntRt(new BigDecimal(lineArray[106]));
                obj.setIntAmt(new BigDecimal(lineArray[107]));
                obj.setCommRt(new BigDecimal(lineArray[108]));
                obj.setCommAmt(new BigDecimal(lineArray[109]));
                obj.setLessRt(new BigDecimal(lineArray[110]));
                obj.setLessAmt(new BigDecimal(lineArray[111]));
                obj.setTotal(new BigDecimal(lineArray[112]));
                obj.setDpda(lineArray[113]);
                obj.setBrName(lineArray[114]);
                obj.setTelNo(lineArray[115]);
                obj.setDrawBic(lineArray[116]);
                obj.setDrawbkName1(lineArray[117]);
                obj.setDrawbkName2(lineArray[118]);
                obj.setDrawbkName3(lineArray[119]);
                obj.setBknm1(lineArray[120]);
                obj.setNegoDate(lineArray[121]);
                obj.setDiscreAmt(new BigDecimal(lineArray[122]));
                obj.setCableAmt(new BigDecimal(lineArray[123]));
                obj.setRegEmpNo(lineArray[124]);
                obj.setRegDt((lineArray[125].equals("")) ? null : formatter.parse(lineArray[125]));
                obj.setRegTm(lineArray[126]);
                obj.setUpdEmpNo(lineArray[127]);
                obj.setUpdDt((lineArray[128].equals("")) ? null : formatter.parse(lineArray[128]));
                obj.setUpdTm(lineArray[129]);
                if (isExist(obj.getRefNo(), obj.getBhSeq())) {
                    afex_xph_cover_resendInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_XPH_COVER_RESENDInfo> objList) {
        afex_xph_cover_resendInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo, BigDecimal bhSeq) {
        return afex_xph_cover_resendInfoRepository.existsByRefNoAndBhSeq(refNo, bhSeq);
    }
}
