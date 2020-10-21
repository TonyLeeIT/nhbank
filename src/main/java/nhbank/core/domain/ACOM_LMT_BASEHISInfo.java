package nhbank.core.domain;

import lombok.Data;
import nhbank.core.idclass.ACOM_LMT_BASEHIS_ID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "ACOM_LMT_BASEHIS")
@IdClass(ACOM_LMT_BASEHIS_ID.class)
@Data
public class ACOM_LMT_BASEHISInfo implements Serializable {
    @Id
    @Column(name = "SNG_NO")
    private String sngNo;
    @Id
    @Column(name = "ACT_CD")
    private String actCd;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Id
    @Column(name = "HIS_GB")
    private String hisGb;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "MNG_BR")
    private String mngBr;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "SNG_STS")
    private String sngSts;
    @Column(name = "SNG_INFO")
    private String sngInfo;
    @Column(name = "SIS_SNGNO")
    private String sisSngno;
    @Column(name = "POGWL_GB")
    private String pogwlGb;
    @Column(name = "REVOL_GB")
    private String revolGb;
    @Column(name = "GIHAN_GB")
    private String gihanGb;
    @Column(name = "EXP_MM")
    private BigDecimal expMm;
    @Column(name = "EXP_IL")
    private Date expIl;
    @Column(name = "SNG_IL")
    private Date sngIl;
    @Column(name = "SNG_CCY")
    private String sngCcy;
    @Column(name = "SNG_AMT")
    private BigDecimal sngAmt;
    @Column(name = "SNG_ABTRT")
    private BigDecimal sngAbtrt;
    @Column(name = "SNG_ABTAMT")
    private BigDecimal sngAbtamt;
    @Column(name = "ACT_AMT")
    private BigDecimal actAmt;
    @Column(name = "ACT_RTGB")
    private String actRtgb;
    @Column(name = "ACT_RATE")
    private BigDecimal actRate;
    @Column(name = "ACT_SPRD")
    private BigDecimal actSprd;
    @Column(name = "ACT_RTJO")
    private String actRtjo;
    @Column(name = "SIL_CNT")
    private BigDecimal silCnt;
    @Column(name = "SIL_JANAMT")
    private BigDecimal silJanamt;
    @Column(name = "SIL_ACCUM")
    private BigDecimal silAccum;
    @Column(name = "SIL_WOIJAN")
    private BigDecimal silWoijan;
    @Column(name = "SIL_DJGJAN")
    private BigDecimal silDjgjan;
    @Column(name = "SIL_LSTIL")
    private Date silLstil;
    @Column(name = "BOJ_BCNT")
    private BigDecimal bojBcnt;
    @Column(name = "BOJ_BJAN")
    private BigDecimal bojBjan;
    @Column(name = "BOJ_FCNT")
    private BigDecimal bojFcnt;
    @Column(name = "BOJ_FJAN")
    private BigDecimal bojFjan;
    @Column(name = "WOI_YONGDO")
    private BigDecimal woiYongdo;
    @Column(name = "WOI_SUNHU")
    private String woiSunhu;
    @Column(name = "WOI_INTTRM")
    private BigDecimal woiInttrm;
    @Column(name = "WOI_GAETRM")
    private BigDecimal woiGaetrm;
    @Column(name = "WOI_SUTGB")
    private String woiSutgb;
    @Column(name = "SNG_COND")
    private String sngCond;
    @Column(name = "IS_SNGNO")
    private String isSngno;
    @Column(name = "IS_CIXNO")
    private String isCixno;
    @Column(name = "IS_BRNO")
    private String isBrno;
    @Column(name = "IS_IL")
    private Date isIl;
    @Column(name = "IK_SNGNO")
    private String ikSngno;
    @Column(name = "IK_CIXNO")
    private String ikCixno;
    @Column(name = "IK_BRNO")
    private String ikBrno;
    @Column(name = "IK_IL")
    private Date ikIl;
    @Column(name = "SNG_APLSEQ")
    private BigDecimal sngAplseq;
    @Column(name = "SNG_AUTH")
    private String sngAuth;
    @Column(name = "LST_IBIL")
    private Date lstIbil;
    @Column(name = "SNG_BRNO")
    private String sngBrno;
    @Column(name = "SNG_CLERK")
    private String sngClerk;
    @Column(name = "SNG_ASTMGR")
    private String sngAstmgr;
    @Column(name = "SNG_LONMGR")
    private String sngLonmgr;
    @Column(name = "SNG_CHAJANG")
    private String sngChajang;
    @Column(name = "SNG_JUMJANG")
    private String sngJumjang;
    @Column(name = "BOJ_MJ_AMT")
    private BigDecimal bojMjAmt;
    @Column(name = "RATE_GB")
    private String rateGb;
    @Column(name = "RATE_JUGI")
    private String rateJugi;
    @Column(name = "SPREAD")
    private BigDecimal spread;
    @Column(name = "YONCHE_RATE")
    private BigDecimal yoncheRate;
    @Column(name = "GRACE_DAY")
    private BigDecimal graceDay;
    @Column(name = "DAY_CNT_BASIS")
    private String dayCntBasis;
    @Column(name = "BUSI_DAY_RULE")
    private String busiDayRule;
    @Column(name = "PENAL_RATE")
    private BigDecimal penalRate;
    @Column(name = "TR_BR")
    private String trBr;
    @Column(name = "SD_BR")
    private String sdBr;
    @Column(name = "TR_TIME")
    private String trTime;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "MNG_NO")
    private String mngNo;
    @Column(name = "AGREE_NO")
    private String agreeNo;
    @Column(name = "COND_STS")
    private String condSts;
    @Column(name = "REG_EMP_NO")
    private String regEmpNo;
    @Column(name = "REG_DT")
    private Date regDt;
    @Column(name = "REG_TM")
    private String regTm;
    @Column(name = "UPD_EMP_NO")
    private String updEmpNo;
    @Column(name = "UPD_DT")
    private Date updDt;
    @Column(name = "UPD_TM")
    private String updTm;
} 
