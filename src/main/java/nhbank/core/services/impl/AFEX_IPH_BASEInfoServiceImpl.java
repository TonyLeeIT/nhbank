package nhbank.core.services.impl;

import nhbank.core.domain.AFEX_IPH_BASEInfo;
import nhbank.core.repositories.AFEX_IPH_BASEInfoRepository;
import nhbank.core.services.AFEX_IPH_BASEInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AFEX_IPH_BASEInfoServiceImpl implements AFEX_IPH_BASEInfoService {
    @Autowired
    AFEX_IPH_BASEInfoRepository afex_iph_baseInfoRepository;

    @Override
    public void updateAll() {
        try {
            List<AFEX_IPH_BASEInfo> objList = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            String line;
            BufferedReader br = new BufferedReader(new FileReader("E:\\ACOM_LMT_BASEHIS.txt"));
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split("\\|");
                AFEX_IPH_BASEInfo obj = new AFEX_IPH_BASEInfo();
                obj.setRefNo(lineArray[0]);
                obj.setTranIl((lineArray[1].equals("")) ? null : formatter.parse(lineArray[1]));
                obj.setTranSeqno(lineArray[2]);
                obj.setAdvBic(lineArray[3]);
                obj.setAdvNm(lineArray[4]);
                obj.setOpenIl((lineArray[5].equals("")) ? null : formatter.parse(lineArray[5]));
                obj.setThrNm1(lineArray[6]);
                obj.setThrNm2(lineArray[7]);
                obj.setCnfmGb(lineArray[8]);
                obj.setTransGb(lineArray[9]);
                obj.setApplCd(lineArray[10]);
                obj.setApplNm(lineArray[11]);
                obj.setApplAddr1(lineArray[12]);
                obj.setApplAddr2(lineArray[13]);
                obj.setApplAddr3(lineArray[14]);
                obj.setBeneNm(lineArray[15]);
                obj.setBeneAddr1(lineArray[16]);
                obj.setBeneAddr2(lineArray[17]);
                obj.setBeneAddr3(lineArray[18]);
                obj.setOpenCcy(lineArray[19]);
                obj.setOpenAmt(new BigDecimal(lineArray[20]));
                obj.setExpIl((lineArray[21].equals("")) ? null : formatter.parse(lineArray[21]));
                obj.setExpPlace(lineArray[22]);
                obj.setOpenGb(lineArray[23]);
                obj.setOpenWay(lineArray[24]);
                obj.setTenorGb(lineArray[25]);
                obj.setUsanGb(lineArray[26]);
                obj.setUsanTerm(lineArray[27]);
                obj.setTermGb(lineArray[28]);
                obj.setTermType(lineArray[29]);
                obj.setDraftRate(lineArray[30]);
                obj.setIntGb(lineArray[31]);
                obj.setTtreimGb(lineArray[32]);
                obj.setRaGb(lineArray[33]);
                obj.setDraweeBic(lineArray[34]);
                obj.setDraweeNm(lineArray[35]);
                obj.setReimBic(lineArray[36]);
                obj.setReimNm(lineArray[37]);
                obj.setBlGb(lineArray[38]);
                obj.setFreightGb(lineArray[39]);
                obj.setInvoCnt(lineArray[40]);
                obj.setInvoInfo(lineArray[41]);
                obj.setPackCnt(lineArray[42]);
                obj.setPackInfo(lineArray[43]);
                obj.setInsurCd(lineArray[44]);
                obj.setInsurGb(lineArray[45]);
                obj.setFromPort(lineArray[46]);
                obj.setToPort(lineArray[47]);
                obj.setShipIl((lineArray[48].equals("")) ? null : formatter.parse(lineArray[48]));
                obj.setPartGb(lineArray[49]);
                obj.setTranGb(lineArray[50]);
                obj.setChargeGb(lineArray[51]);
                obj.setAdGb(lineArray[52]);
                obj.setNegoGb(lineArray[53]);
                obj.setNegoBic(lineArray[54]);
                obj.setNegoNm(lineArray[55]);
                obj.setPresPrd(lineArray[56]);
                obj.setOrgnNm1(lineArray[57]);
                obj.setOrgnNm2(lineArray[58]);
                obj.setPriceCd(lineArray[59]);
                obj.setPriceNm(lineArray[60]);
                obj.setAmtMore(lineArray[61]);
                obj.setAmtLess(lineArray[62]);
                obj.setCommodity(lineArray[63]);
                obj.setReimDepo(lineArray[64]);
                obj.setAmdLseq(lineArray[65]);
                obj.setAmdLno(lineArray[66]);
                obj.setLastCcy(lineArray[67]);
                obj.setLastAmt(new BigDecimal(lineArray[68]));
                obj.setEdiGb(lineArray[69]);
                obj.setEdiCust(lineArray[70]);
                obj.setEdiSend(lineArray[71]);
                obj.setEdiSndIl((lineArray[72].equals("")) ? null : formatter.parse(lineArray[72]));
                obj.setEdiJumNo(lineArray[73]);
                obj.setEdiSeqNo(new BigDecimal(lineArray[74]));
                obj.setEdiSfnm(lineArray[75]);
                obj.setEdiRcv(lineArray[76]);
                obj.setEdiRcvIl((lineArray[77].equals("")) ? null : formatter.parse(lineArray[77]));
                obj.setEdiRfnm(lineArray[78]);
                obj.setSts(lineArray[79]);
                obj.setOperNo(lineArray[80]);
                obj.setMt700Nm(lineArray[81]);
                obj.setMt701Nm1(lineArray[82]);
                obj.setMt701Nm2(lineArray[83]);
                obj.setMt740Nm(lineArray[84]);
                obj.setBefAdv(lineArray[85]);
                obj.setBefReim(lineArray[86]);
                obj.setBefBnm(lineArray[87]);
                obj.setBefBadd1(lineArray[88]);
                obj.setBefBadd2(lineArray[89]);
                obj.setBefBadd3(lineArray[90]);
                obj.setSendJumgb(lineArray[91]);
                obj.setBankGb(lineArray[92]);
                obj.setMt7nnGb(lineArray[93]);
                obj.setNcuOpenCcy(lineArray[94]);
                obj.setNcuOpenAmt(new BigDecimal(lineArray[95]));
                obj.setNcuLastCcy(lineArray[96]);
                obj.setNcuLastAmt(new BigDecimal(lineArray[97]));
                obj.setCbsGb(lineArray[98]);
                obj.setTheirRef(lineArray[99]);
                obj.setCableGb(lineArray[100]);
                obj.setSpcGb(lineArray[101]);
                obj.setMngInfo(lineArray[102]);
                obj.setRaliboGb(lineArray[103]);
                obj.setRaRate(new BigDecimal(lineArray[104]));
                obj.setApplRule(lineArray[105]);
                obj.setApplRule2(lineArray[106]);
                obj.setLoadPort(lineArray[107]);
                obj.setDiscPort(lineArray[108]);
                obj.setThrNm3(lineArray[109]);
                obj.setThrNm4(lineArray[110]);
                obj.setSkbdnYn(lineArray[111]);
                obj.setRegEmpNo(lineArray[112]);
                obj.setRegDt((lineArray[113].equals("")) ? null : formatter.parse(lineArray[113]));
                obj.setRegTm(lineArray[114]);
                obj.setUpdEmpNo(lineArray[115]);
                obj.setUpdDt((lineArray[116].equals("")) ? null : formatter.parse(lineArray[116]));
                obj.setUpdTm(lineArray[117]);
                obj.setCnfmBic(lineArray[118]);
                obj.setCnfmNm(lineArray[119]);
                obj.setThrBic(lineArray[120]);
                if (isExist(obj.getRefNo())) {
                    afex_iph_baseInfoRepository.save(obj);
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
    public void insertAll(List<AFEX_IPH_BASEInfo> objList) {
        afex_iph_baseInfoRepository.saveAll(objList);
    }

    @Override
    public boolean isExist(String refNo) {
        return afex_iph_baseInfoRepository.existsByRefNo(refNo);
    }
}
