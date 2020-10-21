package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_LMT_BASEACTInfo_ID.class)
@Table(name = "ACOM_LMT_BASEACT")
@Data
public class ACOM_LMT_BASEACTInfo implements Serializable {
    @Id
    @Column(name = "SNG_NO")
    private String sngNo;
    @Id
    @Column(name = "ACT_CD")
    private String actCd;
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
    @Column(name = "SNG_APLSEQ")
    private BigDecimal sngAplseq;
    @Column(name = "SNG_AUTH")
    private String sngAuth;
    @Column(name = "LST_IBIL")
    private Date lstIbil;
    @Column(name = "SNG_BRNO")
    private String sngBrno;
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
