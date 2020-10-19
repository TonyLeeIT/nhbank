package nhbank.core.domain;

import lombok.Data;
import nhbank.core.idclass.ACOM_LMT_BASEHIS_ID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "ACOM_LMT_BASEHIS")
@Data
@IdClass(ACOM_LMT_BASEHIS_ID.class)
public class ACOM_LMT_BASEHISInfo implements Serializable {
    @Id
    private String sngNo;
    @Id
    private String actCd;
    @Id
    private BigDecimal hisNo;
    @Id
    private String hisGb;
    private String trCd;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private String mngBr;
    private String cixNo;
    private String sngSts;
    private String sngInfo;
    private String sisSngno;
    private String pogwlGb;
    private String revolGb;
    private String gihanGb;
    private BigDecimal expMm;
    private Date expIl;
    private Date sngIl;
    private String sngCcy;
    private BigDecimal sngAmt;
    private BigDecimal sngAbtrt;
    private BigDecimal sngAbtamt;
    private BigDecimal actAmt;
    private String actRtgb;
    private BigDecimal actRate;
    private BigDecimal actSprd;
    private String actRtjo;
    private BigDecimal silCnt;
    private BigDecimal silJanamt;
    private BigDecimal silAccum;
    private BigDecimal silWoijan;
    private BigDecimal silDjgjan;
    private Date silLstil;
    private BigDecimal bojBcnt;
    private BigDecimal bojBjan;
    private BigDecimal bojFcnt;
    private BigDecimal bojFjan;
    private BigDecimal woiYongdo;
    private String woiSunhu;
    private BigDecimal woiInttrm;
    private BigDecimal woiGaetrm;
    private String woiSutgb;
    private String sngCond;
    private String isSngno;
    private String isCixno;
    private String isBrno;
    private Date isIl;
    private String ikSngno;
    private String ikCixno;
    private String ikBrno;
    private Date ikIl;
    private BigDecimal sngAplseq;
    private String sngAuth;
    private Date lstIbil;
    private String sngBrno;
    private String sngClerk;
    private String sngAstmgr;
    private String sngLonmgr;
    private String sngChajang;
    private String sngJumjang;
    private BigDecimal bojMjAmt;
    private String rateGb;
    private String rateJugi;
    private BigDecimal spread;
    private BigDecimal yoncheRate;
    private BigDecimal graceDay;
    private String dayCntBasis;
    private String busiDayRule;
    private BigDecimal penalRate;
    private String trBr;
    private String sdBr;
    private String trTime;
    private String opNo;
    private String mngNo;
    private String agreeNo;
    private String condSts;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
