package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
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
    private BigDecimal CONTRACT_AMT;
    private BigDecimal LON_JAN;
    private String REPAY_GB;
    private BigDecimal REPAY_TERM;
    private BigDecimal REPAY_GAP;
    private String REPAY_GAP_GB;
    private BigDecimal GRACE_DAYS;
    private BigDecimal REPAY_CNT;
    private BigDecimal DRAWDOWN_SEQ;
    private String RATE_CCY;
    private String FIX_FLT_GB;
    private BigDecimal INDEX_RT;
    private String SPREAD_GB;
    private BigDecimal SPREAD_RT;
    private BigDecimal ROLL_GAP;
    private String ROLL_GAP_GB;
    private BigDecimal LATE_CHG_RT;
    private BigDecimal PAST_DUE_RT;
    private String ADV_ARR_GB;
    private String SINGLE_BOTH_TYPE;
    private String ACCR_TYPE;
    private String BSNS_DAY_RULE;
    private BigDecimal INT_GAP;
    private String INT_GAP_GB;
    private String INT_ADJ_YN;
    private String YIELD;
    private String HD_SNG_NO;
    private String COMMITFEE_YN;
    private BigDecimal FEE_RT;
    private String PAY_DEPO_CCY;
    private String PAY_DEPO_BIC;
    private String RCV_DEPO_CCY;
    private String RCV_DEPO_BIC;
    private String EVID_NO;
    private String EVID_CCY;
    private BigDecimal EVID_AMT;
    private BigDecimal USD_CVT_AMT;
    private BigDecimal BBS_CVT_AMT;
    private BigDecimal LOSS_AMT;
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
    private BigDecimal BLOCK_AMT;
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
