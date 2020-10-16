package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_LMT_BASEHD_DTO {
    private String SNG_NO;
    private String MNG_BR;
    private String CIX_NO;
    private Date FST_IL;
    private Date LST_IL;
    private Date CAN_IL;
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
    private BigDecimal TOT_SIL_CNT;
    private BigDecimal TOT_SIL_JANAMT;
    private BigDecimal TOT_SIL_ACCUM;
    private BigDecimal TOT_SIL_DJGJAN;
    private Date TOT_SIL_LSTIL;
    private BigDecimal TOT_BOJ_BCNT;
    private BigDecimal TOT_BOJ_BJAN;
    private BigDecimal TOT_BOJ_FCNT;
    private BigDecimal TOT_BOJ_FJAN;
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
    private String AGREE_NO;
    private String COND_STS;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_LMT_BASEHD_DTO() {
    }
} 
