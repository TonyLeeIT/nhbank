package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_LNB_BASE")
@Data
public class ADST_LNB_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String BUSEO_NO;
    private Date MSG_LST_ISU_IL;
    private String ACT_GB;
    private String INT_YC_GB;
    private int BBS_CVT_AMT;
    private String BL_NO;
    private int CAP_RT_PRD;
    private Date LST_DEAL_IL;
    private int PARTIAL_AMT;
    private Date REAL_EXP_IL;
    private Date UPD_DT;
    private String REG_EMP_NO;
    private int REG_PAY_AMT;
    private int PAST_DUE_RT;
    private String OWNER_NO;
    private String LATE_CHG_YN;
    private Date TOT_EXP_IL;
    private int MKJ_AMT;
    private int BROKA_FEE;
    private Date LST_BILL_IL;
    private int SPREAD_RT;
    private int FLOOR_RT_PRD;
    private Date LST_IIB_IL;
    private int MISU_AMT;
    private int FLOOR_RT_LIFE;
    private String LN_PRPS_CD;
    private String EVID_CCY;
    private Date PARTIAL_EXPI_DT;
    private String LONG_SHORT_TYPE;
    private String ACCR_TYPE;
    private int GRACE_DAYS;
    private int INT_ADJ_SEQ;
    private Date NX_BILL_IL;
    private String BK_GB;
    private int LATE_CHG_RT;
    private String SINGLE_BOTH_TYPE;
    private String IBF_GB;
    private int REPAY_GAP;
    private String ROLL_GAP_GB;
    private int ALL_IN_YIELD;
    private String NEW_SCH_YN;
    private int GUCH_TERM;
    private String FLOOR_RT_YN;
    private String COM_ID;
    private Date NX_ISU_IL;
    private Date FST_IB_IL;
    private int APPLI_FEE;
    private String PRN_YC_GB;
    private String REPAY_GAP_GB;
    private String RMPB_NO;
    private String LON_CCY;
    private int LON_JAN;
    private String NXT_SCH_YN;
    private int LST_RT;
    private String TERM_GB;
    private int FST_LON_AMT;
    private String THR_RCV_DEPO_CCY;
    private int INT_NX_SEQ;
    private String UPD_EMP_NO;
    private String REPAY_GB;
    private String ACCRUAL_GB;
    private String INT_GAP_GB;
    private int NON_EQ_AMT;
    private String COM_NM;
    private String SND_DOC_NO;
    private int MKJ_SEQ;
    private String SPREAD_GB;
    private int USD_CVT_AMT;
    private String RESTRUCTURING_YN;
    private String OP_NO;
    private int MISU_SEQ;
    private String EVID_NO;
    private String CAP_RT_YN;
    private int CAP_RT_LIFE;
    private Date LG_OPEN_IL;
    private Date LST_REPAY_IL;
    private String THR_RCV_DEPO_BIC;
    private int AGR_SEQ_NO;
    private int REPAY_ADJ_SEQ;
    private String NON_EQ_GB;
    private String ADV_ARR_GB;
    private int OTHER_FEE;
    private Date OPEN_IL;
    private String HD_SNG_NO;
    private Date NX_REPAY_IL;
    private int PARTIAL_JAN;
    private int TIMES_PAST_DUE_CNT;
    private Date INT_YC_IL;
    private int LOSS_AMT;
    private int INT_GAP;
    private String AGR_REF_NO;
    private int ROLL_GAP;
    private Date PRN_YC_IL;
    private int NXT_RT;
    private String FIX_FLT_GB;
    private int YC_GUN;
    private Date LST_ISU_IL;
    private String FLAT_SLIDING;
    private String REF_NO;
    private String INT_ADJ_YN;
    private String RATE_CHG_YN;
    private Date REG_DT;
    private int REPAY_NX_SEQ;
    private String BSNS_DAY_RULE;
    private Date FST_REPAY_IL;
    private int RENEW_FEE;
    private String IKIS_STS;
    private Date NX_ROLL_IL;
    private Date LST_IB_IL;
    private String CIX_NO;
    private Date FST_EXP_IL;
    private String FEE_YN;
    private int EVID_AMT;
    private int ORIGI_FEE;
    private int ACCRUAL_RT;
    private int REPAY_CNT;
    private String SCH_GB;
    private int REPAY_TERM;
    private String PARTIAL_YN;
    private String AUTO_DEBIT_YN;
    private String UPD_TM;
    private String RATE_CCY;
    private String REG_TM;
} 
