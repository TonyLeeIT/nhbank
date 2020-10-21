package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_LMT_BASEHDInfo_ID.class)
@Table(name = "ACOM_LMT_BASEHD")
@Data
public class ACOM_LMT_BASEHDInfo implements Serializable {
    @Id
    @Column(name = "SNG_NO")
    private String sngNo;
    @Column(name = "MNG_BR")
    private String mngBr;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "FST_IL")
    private Date fstIl;
    @Column(name = "LST_IL")
    private Date lstIl;
    @Column(name = "CAN_IL")
    private Date canIl;
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
    @Column(name = "TOT_SIL_CNT")
    private BigDecimal totSilCnt;
    @Column(name = "TOT_SIL_JANAMT")
    private BigDecimal totSilJanamt;
    @Column(name = "TOT_SIL_ACCUM")
    private BigDecimal totSilAccum;
    @Column(name = "TOT_SIL_DJGJAN")
    private BigDecimal totSilDjgjan;
    @Column(name = "TOT_SIL_LSTIL")
    private Date totSilLstil;
    @Column(name = "TOT_BOJ_BCNT")
    private BigDecimal totBojBcnt;
    @Column(name = "TOT_BOJ_BJAN")
    private BigDecimal totBojBjan;
    @Column(name = "TOT_BOJ_FCNT")
    private BigDecimal totBojFcnt;
    @Column(name = "TOT_BOJ_FJAN")
    private BigDecimal totBojFjan;
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
