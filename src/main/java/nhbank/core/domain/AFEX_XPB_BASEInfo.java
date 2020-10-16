package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPB_BASE")
@Data
public class AFEX_XPB_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String ikisSts;
    private String bkGb;
    private String cixNo;
    private String comNo;
    private String buseoNo;
    private String mngInfo;
    private int xpJan;
    private int budoJan;
    private int misuBjan;
    private int misuJan;
    private int lessSumAmt;
    private int overSumAmt;
    private int csSumAmt;
    private int jiSeq;
    private int setSeq;
    private int budoSeq;
    private Date negoIl;
    private Date gisIl;
    private Date lstIl;
    private Date lstIbIl;
    private String negoCcy;
    private int negoAmt;
    private String xpGb;
    private String negoGb;
    private String bonjiGb;
    private String tenorGb;
    private String oaGb;
    private String hjIlCd;
    private Date manGijIl;
    private String hajaMngInfo;
    private String halGb;
    private int comRt;
    private int comAmt;
    private int intRt;
    private int intAmt;
    private int hijaTerm;
    private int usanceTerm;
    private String hsCd;
    private String spNm;
    private String xpType;
    private String sdCtry;
    private String priceCd;
    private String openBkcd;
    private String setBkcd;
    private String depoBkcd;
    private String reneBkcd;
    private int jasaAmt;
    private int tasaAmt;
    private String trefNo;
    private String openBknm;
    private String reDepoGb;
    private String ipNm;
    private Date shipIl;
    private String invoiceNo;
    private String singoNo;
    private String reneReqGb;
    private String reneGb;
    private Date reneAcIl;
    private Date reneGisIl;
    private String reneOrefNo;
    private int reneTerm;
    private int r2Frt;
    private int r2Fee;
    private int r2IjaAmt;
    private String caCcy;
    private int caAmt;
    private int insuAmt;
    private int jiAmt;
    private int setAmt;
    private Date hmanIl;
    private Date ymanIl;
    private Date ydcIl;
    private Date budoIl;
    private int budoAmt;
    private int budoSamt;
    private Date misuIl;
    private String obcrGb;
    private Date budoLisuIl;
    private Date lstCaIl;
    private Date moJubIl;
    private Date moBalIl;
    private String balGb;
    private int miGun;
    private int miplGun;
    private String hdSngNo;
    private Date ijaLisuIl;
    private int lstIjaHrt;
    private int lstIjaHRt;
    private String gaWijaGb;
    private String ijaMjGb1;
    private String ijaMjGb2;
    private String ijaHcGb;
    private String bdIjaGb;
    private String ftpRtGb;
    private int ftpRt;
    private int ikisHisNo;
    private int ikisIjAmt;
    private String opNo;
    private String ownerNo;
    private String pbrmNo;
    private Date turnIl;
    private int aaTraCnt;
    private int caTraCnt;
    private int dlTraCnt;
    private String coverGb;
    private Date lstIsuIl;
    private Date bdDelayIl;
    private String gyom;
    private String reimGb;
    private String reimBkcd;
    private String chgNegoYn;
    private String mngInfo2;
    private String comId;
    private String tsLcYn;
    private String tsAdvNo;
    private int tsSeqNo;
    private int tsNegoAmt;
    private String raRefNo;
    private int raClmCnt;
    private String ibfGb;
    private String whanRcvGb;
    private int rptAmt1;
    private int rptAmt2;
    private int rptAmt3;
    private int rptAmt4;
    private int rptAmt5;
    private String rptAcct1;
    private String boseGb;
    private int payableAmt;
    private String actpayRefNo1;
    private String suspayRefNo1;
    private String suspayRefNo2;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
