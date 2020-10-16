package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_LMT_BASEHIS_DTO {
    private String SNG_NO;
    private String ACT_CD;
    private int HIS_NO;
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
    private int EXP_MM;
    private Date EXP_IL;
    private Date SNG_IL;
    private String SNG_CCY;
    private int SNG_AMT;
    private int SNG_ABTRT;
    private int SNG_ABTAMT;
    private int ACT_AMT;
    private String ACT_RTGB;
    private int ACT_RATE;
    private int ACT_SPRD;
    private String ACT_RTJO;
    private int SIL_CNT;
    private int SIL_JANAMT;
    private int SIL_ACCUM;
    private int SIL_WOIJAN;
    private int SIL_DJGJAN;
    private Date SIL_LSTIL;
    private int BOJ_BCNT;
    private int BOJ_BJAN;
    private int BOJ_FCNT;
    private int BOJ_FJAN;
    private int WOI_YONGDO;
    private String WOI_SUNHU;
    private int WOI_INTTRM;
    private int WOI_GAETRM;
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
    private int SNG_APLSEQ;
    private String SNG_AUTH;
    private Date LST_IBIL;
    private String SNG_BRNO;
    private String SNG_CLERK;
    private String SNG_ASTMGR;
    private String SNG_LONMGR;
    private String SNG_CHAJANG;
    private String SNG_JUMJANG;
    private int BOJ_MJ_AMT;
    private String RATE_GB;
    private String RATE_JUGI;
    private int SPREAD;
    private int YONCHE_RATE;
    private int GRACE_DAY;
    private String DAY_CNT_BASIS;
    private String BUSI_DAY_RULE;
    private int PENAL_RATE;
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
