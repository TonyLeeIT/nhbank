package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_LMT_BASEHD")
@Data
public class ACOM_LMT_BASEHDInfo implements Serializable {
    @Id
    @GeneratedValue
    private int WOI_GAETRM;
    private String WOI_SUTGB;
    private int GRACE_DAY;
    private String UPD_EMP_NO;
    private int SNG_ABTAMT;
    private String COND_STS;
    private int TOT_BOJ_BJAN;
    private Date TOT_SIL_LSTIL;
    private String SNG_BRNO;
    private int TOT_BOJ_FJAN;
    private String IK_CIXNO;
    private String SNG_AUTH;
    private String SNG_CLERK;
    private String IS_SNGNO;
    private Date UPD_DT;
    private String SNG_JUMJANG;
    private Date FST_IL;
    private Date EXP_IL;
    private String SNG_ASTMGR;
    private String SNG_NO;
    private Date LST_IL;
    private int EXP_MM;
    private Date CAN_IL;
    private String SNG_COND;
    private String REG_EMP_NO;
    private String IS_BRNO;
    private String BUSI_DAY_RULE;
    private String AGREE_NO;
    private String REVOL_GB;
    private int TOT_SIL_JANAMT;
    private String MNG_BR;
    private String DAY_CNT_BASIS;
    private int WOI_YONGDO;
    private int TOT_SIL_ACCUM;
    private Date IK_IL;
    private String SNG_STS;
    private String IK_SNGNO;
    private String WOI_SUNHU;
    private int BOJ_MJ_AMT;
    private int WOI_INTTRM;
    private String RATE_JUGI;
    private String IS_CIXNO;
    private String SNG_CCY;
    private String SIS_SNGNO;
    private int SNG_ABTRT;
    private String SNG_CHAJANG;
    private int SPREAD;
    private int PENAL_RATE;
    private String POGWL_GB;
    private Date REG_DT;
    private int YONCHE_RATE;
    private int SNG_AMT;
    private String CIX_NO;
    private String SNG_INFO;
    private int TOT_SIL_CNT;
    private String RATE_GB;
    private String IK_BRNO;
    private Date IS_IL;
    private int SNG_APLSEQ;
    private String GIHAN_GB;
    private Date SNG_IL;
    private int TOT_BOJ_BCNT;
    private String SNG_LONMGR;
    private int TOT_BOJ_FCNT;
    private Date LST_IBIL;
    private String UPD_TM;
    private int TOT_SIL_DJGJAN;
    private String REG_TM;
} 
