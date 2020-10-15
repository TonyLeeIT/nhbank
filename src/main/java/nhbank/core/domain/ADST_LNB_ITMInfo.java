package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_LNB_ITM")
@Data
public class ADST_LNB_ITMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String TR_CD;
    private String AF_AUTO_DEBIT_YN;
    private int BF_LAST_CHG_RT;
    private int BF_SPREAD_RT;
    private String AF_ACT_GB;
    private Date AF_NX_ROLL_IL;
    private String AF_SCH_GB;
    private int AF_ROLL_GAP;
    private String STS;
    private Date UPD_DT;
    private String BF_ADV_ARR_GB;
    private String BF_ACCR_TYPE;
    private Date BF_NX_ROLL_IL;
    private String REG_EMP_NO;
    private int AF_REPAY_GAP;
    private int BF_ROLL_GAP;
    private String BF_LAST_CHG_YN;
    private String AF_SPREAD_GB;
    private String AF_LAST_CHG_YN;
    private String AF_ADV_ARR_GB;
    private String AF_INT_ADJ_YN;
    private Date BF_TOT_EXP_IL;
    private Date AF_TOT_EXP_IL;
    private String BF_INT_ADJ_YN;
    private String BF_NEW_SCH_YN;
    private String AF_REPAY_GB;
    private int AF_LAST_CHG_RT;
    private int AF_REPAY_ADJ_SEQ;
    private String AF_NEW_SCH_YN;
    private String BF_ACT_GB;
    private String BF_NXT_SCH_YN;
    private int AF_NXT_RT;
    private String AF_NXT_SCH_YN;
    private int AF_SPREAD_RT;
    private String AF_ACCRUAL_GB;
    private int AF_INT_GAP;
    private String BF_ACCRUAL_GB;
    private int AF_EVID_AMT;
    private String AF_SINGLE_BOTH_TYPE;
    private String BF_REPAY_GB;
    private String BF_RATE_CHG_YN;
    private String BF_REPAY_GAP_GB;
    private String ITM_CD;
    private String BF_EVID_NO;
    private Date FST_IB_IL;
    private int BF_GRACE_DAYS;
    private String BF_INT_GAP_GB;
    private String AF_INT_GAP_GB;
    private int AF_GRACE_DAYS;
    private int BF_LST_RT;
    private String UPD_EMP_NO;
    private int BF_INT_GAP;
    private Date BF_REAL_EXP_IL;
    private String AF_BSNS_DAY_RULE;
    private int BF_REPAY_GAP;
    private int AF_REPAY_TERM;
    private String AF_PRN_YC_GB;
    private String BF_EVID_CCY;
    private int BF_REPAY_TERM;
    private int AF_INT_ADJ_SEQ;
    private String AF_INT_YC_GB;
    private String AF_REPAY_GAP_GB;
    private String AF_ROLL_GAP_GB;
    private int AF_GUCH_TERM;
    private String AF_FIX_FLT_GB;
    private String BF_FIX_FLT_GB;
    private int AF_LST_RT;
    private int HIS_NO;
    private Date BF_PRN_YC_IL;
    private Date BF_INT_YC_IL;
    private String AF_EVID_CCY;
    private String BF_SINGLE_BOTH_TYPE;
    private int BF_PAST_DUE_RT;
    private String BF_SPREAD_GB;
    private String BF_SCH_GB;
    private int BF_TIMES_PAST;
    private int AF_PAST_DUE_RT;
    private int BF_GUCH_TERM;
    private String AF_ACCR_TYPE;
    private Date AF_REAL_EXP_IL;
    private String BF_AUTO_DEBIT_YN;
    private String REF_NO;
    private Date AF_PRN_YC_IL;
    private int BF_INT_ADJ_SEQ;
    private Date AF_INT_YC_IL;
    private String BF_BSNS_DAY_RULE;
    private String BF_ROLL_GAP_GB;
    private String BF_PRN_YC_GB;
    private Date LST_AC_IL;
    private Date REG_DT;
    private String AF_EVID_NO;
    private int BF_EVID_AMT;
    private String BF_INT_YC_GB;
    private Date LST_IB_IL;
    private String AF_RATE_CHG_YN;
    private int BF_NXT_RT;
    private int BF_ACCRUAL_RT;
    private int BF_REPAY_ADJ_SEQ;
    private int AF_TIMES_PAST;
    private int AF_ACCRUAL_RT;
    private String UPD_TM;
    private String REG_TM;
} 
