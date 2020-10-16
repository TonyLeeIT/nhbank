package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_LMT_BASEACT_DTO {
    private String SNG_NO;
    private String ACT_CD;
    private String MNG_BR;
    private String CIX_NO;
    private Date FST_IL;
    private Date LST_IL;
    private Date CAN_IL;
    private String SNG_STS;
    private String SNG_INFO;
    private BigDecimal ACT_AMT;
    private String ACT_RTGB;
    private BigDecimal ACT_RATE;
    private BigDecimal ACT_SPRD;
    private String ACT_RTJO;
    private BigDecimal SIL_CNT;
    private BigDecimal SIL_JANAMT;
    private BigDecimal SIL_ACCUM;
    private BigDecimal SIL_WOIJAN;
    private BigDecimal SIL_DJGJAN;
    private Date SIL_LSTIL;
    private BigDecimal BOJ_BCNT;
    private BigDecimal BOJ_BJAN;
    private BigDecimal BOJ_FCNT;
    private BigDecimal BOJ_FJAN;
    private BigDecimal WOI_YONGDO;
    private String WOI_SUNHU;
    private BigDecimal WOI_INTTRM;
    private BigDecimal WOI_GAETRM;
    private String WOI_SUTGB;
    private BigDecimal SNG_APLSEQ;
    private String SNG_AUTH;
    private Date LST_IBIL;
    private String SNG_BRNO;
    private BigDecimal BOJ_MJ_AMT;
    private String RATE_GB;
    private String RATE_JUGI;
    private BigDecimal SPREAD;
    private BigDecimal YONCHE_RATE;
    private BigDecimal GRACE_DAY;
    private String DAY_CNT_BASIS;
    private String BUSI_DAY_RULE;
    private BigDecimal PENAL_RATE;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_LMT_BASEACT_DTO() {
    }
} 
