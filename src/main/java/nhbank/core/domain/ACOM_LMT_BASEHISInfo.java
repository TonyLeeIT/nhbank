package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ACOM_LMT_BASEHIS")
@Data
public class ACOM_LMT_BASEHISInfo implements Serializable {
    @Id
    private String SNG_NO;
    private int SIL_WOIJAN;
    private String TR_CD;
    private int WOI_GAETRM;
    private String WOI_SUTGB;
    private int GRACE_DAY;
    private String MNG_NO;
    private String UPD_EMP_NO;
    private int SNG_ABTAMT;
    private String COND_STS;
    private String ACT_CD;
    private String SNG_BRNO;
    private String IK_CIXNO;
    private String ACT_RTJO;
    private String SNG_AUTH;
    private int BOJ_BCNT;
    private String SNG_CLERK;
    private String IS_SNGNO;
    private Date UPD_DT;
    private String SNG_JUMJANG;
    private Date EXP_IL;
    private int BOJ_FCNT;
    private String SNG_ASTMGR;
    private int EXP_MM;
    private Date CAN_IL;
    private String SNG_COND;
    private String REG_EMP_NO;
    private String OP_NO;
    private Date GIS_IL;
    private int SIL_DJGJAN;
    private String IS_BRNO;
    private int HIS_NO;
    private int ACT_RATE;
    private Date IB_IL;
    private String BUSI_DAY_RULE;
    private String TR_TIME;
    private String AGREE_NO;
    private String REVOL_GB;
    private String MNG_BR;
    private String DAY_CNT_BASIS;
    private int WOI_YONGDO;
    private String HIS_GB;
    private Date IK_IL;
    private String SNG_STS;
    private String IK_SNGNO;
    private int ACT_AMT;
    private String SD_BR;
    private String WOI_SUNHU;
    private int BOJ_MJ_AMT;
    private int SIL_CNT;
    private Date AC_IL;
    private int WOI_INTTRM;
    private String RATE_JUGI;
    private String IS_CIXNO;
    private String SNG_CCY;
    private String SIS_SNGNO;
    private int SNG_ABTRT;
    private int ACT_SPRD;
    private String SNG_CHAJANG;
    private int SPREAD;
    private int PENAL_RATE;
    private String POGWL_GB;
    private Date REG_DT;
    private int SIL_JANAMT;
    private int YONCHE_RATE;
    private int SNG_AMT;
    private String CIX_NO;
    private String ACT_RTGB;
    private String SNG_INFO;
    private int BOJ_BJAN;
    private int BOJ_FJAN;
    private String RATE_GB;
    private String IK_BRNO;
    private Date IS_IL;
    private Date SIL_LSTIL;
    private int SNG_APLSEQ;
    private String GIHAN_GB;
    private String TR_BR;
    private Date SNG_IL;
    private String SNG_LONMGR;
    private Date LST_IBIL;
    private String UPD_TM;
    private int SIL_ACCUM;
    private String REG_TM;
} 
