package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_LNB_AGR")
@Data
public class ADST_LNB_AGRInfo implements Serializable {
    @Id
    @GeneratedValue
    private String BUSEO_NO;
    private String UPD_EMP_NO;
    private String REPAY_GB;
    private String INT_GAP_GB;
    private String RCV_DEPO_CCY;
    private int BBS_CVT_AMT;
    private String COM_NM;
    private String BL_NO;
    private Date LST_DEAL_IL;
    private Date UPD_DT;
    private String SPREAD_GB;
    private int USD_CVT_AMT;
    private String RESTRUCTURING_YN;
    private String REG_EMP_NO;
    private String OP_NO;
    private int PAST_DUE_RT;
    private String OWNER_NO;
    private String EVID_NO;
    private Date TOT_EXP_IL;
    private Date LG_OPEN_IL;
    private String RCV_DEPO_BIC;
    private int SPREAD_RT;
    private Date CONTRACT_IL;
    private int INDEX_RT;
    private String ADV_ARR_GB;
    private String PAY_DEPO_CCY;
    private String HD_SNG_NO;
    private String EVID_CCY;
    private int DRAWDOWN_SEQ;
    private Date VALUE_IL;
    private String ACCR_TYPE;
    private int LOSS_AMT;
    private int INT_GAP;
    private int ROLL_GAP;
    private int GRACE_DAYS;
    private String FIX_FLT_GB;
    private String BK_GB;
    private int LATE_CHG_RT;
    private String SINGLE_BOTH_TYPE;
    private String REF_NO;
    private String INT_ADJ_YN;
    private String IBF_GB;
    private String COMMITFEE_YN;
    private int FEE_RT;
    private String PAY_DEPO_BIC;
    private int REPAY_GAP;
    private Date REG_DT;
    private String ROLL_GAP_GB;
    private String BSNS_DAY_RULE;
    private String YIELD;
    private String IKIS_STS;
    private int CONTRACT_AMT;
    private String LOAN_CLASS;
    private Date LST_IB_IL;
    private String COM_ID;
    private String CIX_NO;
    private int EVID_AMT;
    private Date FST_IB_IL;
    private int REPAY_CNT;
    private String SUBSTS_CD;
    private String REPAY_GAP_GB;
    private String RMPB_NO;
    private String LON_CCY;
    private int REPAY_TERM;
    private int LON_JAN;
    private String UPD_TM;
    private int BLOCK_AMT;
    private String RATE_CCY;
    private String REG_TM;
} 
