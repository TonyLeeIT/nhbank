package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_LNB_AGR_DTO {
    private String REF_NO;
    private String IKIS_STS;
    private String BK_GB;
    private String CIX_NO;
    private String BUSEO_NO;
    private String COM_ID;
    private String COM_NM;
    private Date CONTRACT_IL;
    private Date VALUE_IL;
    private Date TOT_EXP_IL;
    private String LON_CCY;
    private int CONTRACT_AMT;
    private int LON_JAN;
    private String REPAY_GB;
    private int REPAY_TERM;
    private int REPAY_GAP;
    private String REPAY_GAP_GB;
    private int GRACE_DAYS;
    private int REPAY_CNT;
    private int DRAWDOWN_SEQ;
    private String RATE_CCY;
    private String FIX_FLT_GB;
    private int INDEX_RT;
    private String SPREAD_GB;
    private int SPREAD_RT;
    private int ROLL_GAP;
    private String ROLL_GAP_GB;
    private int LATE_CHG_RT;
    private int PAST_DUE_RT;
    private String ADV_ARR_GB;
    private String SINGLE_BOTH_TYPE;
    private String ACCR_TYPE;
    private String BSNS_DAY_RULE;
    private int INT_GAP;
    private String INT_GAP_GB;
    private String INT_ADJ_YN;
    private String YIELD;
    private String HD_SNG_NO;
    private String COMMITFEE_YN;
    private int FEE_RT;
    private String PAY_DEPO_CCY;
    private String PAY_DEPO_BIC;
    private String RCV_DEPO_CCY;
    private String RCV_DEPO_BIC;
    private String EVID_NO;
    private String EVID_CCY;
    private int EVID_AMT;
    private int USD_CVT_AMT;
    private int BBS_CVT_AMT;
    private int LOSS_AMT;
    private String RESTRUCTURING_YN;
    private String LOAN_CLASS;
    private Date FST_IB_IL;
    private Date LST_DEAL_IL;
    private Date LST_IB_IL;
    private String OP_NO;
    private String OWNER_NO;
    private String RMPB_NO;
    private String IBF_GB;
    private String BL_NO;
    private Date LG_OPEN_IL;
    private int BLOCK_AMT;
    private String SUBSTS_CD;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_LNB_AGR_DTO() {
    }
} 
