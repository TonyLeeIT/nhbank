package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_LMT_BASEHIS_DTO {
    private String SNG_NO;
    private String ACT_CD;
    private BigDecimal HIS_NO;
    private String HIS_GB;
    private String TR_CD;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private Date CAN_IL;
    private String MNG_BR;
    private String CIX_NO;
    private String SNG_STS;
    private String SNG_INFO;
    private String SIS_SNGNO;
    private String POGWL_GB;
    private String REVOL_GB;
    private String GIHAN_GB;
    private BigDecimal EXP_MM;
    private Date EXP_IL;
    private Date SNG_IL;
    private String SNG_CCY;
    private BigDecimal SNG_AMT;
    private BigDecimal SNG_ABTRT;
    private BigDecimal SNG_ABTAMT;
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
    private String SNG_COND;
    private String IS_SNGNO;
    private String IS_CIXNO;
    private String IS_BRNO;
    private Date IS_IL;
    private String IK_SNGNO;
    private String IK_CIXNO;
    private String IK_BRNO;
    private Date IK_IL;
    private BigDecimal SNG_APLSEQ;
    private String SNG_AUTH;
    private Date LST_IBIL;
    private String SNG_BRNO;
    private String SNG_CLERK;
    private String SNG_ASTMGR;
    private String SNG_LONMGR;
    private String SNG_CHAJANG;
    private String SNG_JUMJANG;
    private BigDecimal BOJ_MJ_AMT;
    private String RATE_GB;
    private String RATE_JUGI;
    private BigDecimal SPREAD;
    private BigDecimal YONCHE_RATE;
    private BigDecimal GRACE_DAY;
    private String DAY_CNT_BASIS;
    private String BUSI_DAY_RULE;
    private BigDecimal PENAL_RATE;
    private String TR_BR;
    private String SD_BR;
    private String TR_TIME;
    private String OP_NO;
    private String MNG_NO;
    private String AGREE_NO;
    private String COND_STS;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_LMT_BASEHIS_DTO() {
    }
} 
