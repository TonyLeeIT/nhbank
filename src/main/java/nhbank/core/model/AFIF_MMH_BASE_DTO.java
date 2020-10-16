package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFIF_MMH_BASE_DTO {
    private String REF_NO;
    private String COM_ID;
    private String COM_NM;
    private String COUNTERPARTY_ID;
    private String COUNTERPARTY_NM;
    private Date DEAL_IL;
    private String VALUE_YN;
    private Date VALUE_IL;
    private String EXP_YN;
    private Date EXP_IL;
    private String BORROW_LON_GB;
    private String CCY;
    private BigDecimal PRINCIPAL_AMT;
    private String RATE_CCY;
    private String FIX_FLT_GB;
    private BigDecimal TAX_AMT;
    private String RATE_FREQ;
    private BigDecimal INDEX_RT;
    private String RATE_GB;
    private BigDecimal SPREAD_RT;
    private BigDecimal TOTAL_RT;
    private Date INT_FROM_IL;
    private Date INT_TO_IL;
    private BigDecimal INT_DAYS;
    private String INT_CCY;
    private BigDecimal INT_AMT;
    private String ADV_ARR_GB;
    private String SINGLE_BOTH_TYPE;
    private String ACCR_TYPE;
    private String BSNS_DAY_RULE;
    private String HOLIDAY_LOCATION;
    private Date INT_PAY_RCV_IL;
    private String CONFIRM_YN;
    private Date CONFIRM_IL;
    private String PO_YN;
    private Date PO_IL;
    private BigDecimal PO_SEQ;
    private BigDecimal PO_AMT;
    private String OUR_RCV_DEPO_CCY;
    private String OUR_RCV_DEPO_CD;
    private String OUR_RCV_DEPO_NM;
    private String OUR_PAY_DEPO_CCY;
    private String OUR_PAY_DEPO_CD;
    private String OUR_PAY_DEPO_NM;
    private String THR_RCV_DEPO_CCY;
    private String THR_RCV_DEPO_BIC;
    private String THR_RCV_DEPO_NM;
    private String BROKER_ID;
    private String BROKER_FEE_CCY;
    private BigDecimal BROKER_FEE_AMT;
    private String ONOFF_GB;
    private String INOUT_GB;
    private String BORROW_GB;
    private String BORROW_KIND;
    private String NATION_LON_GB;
    private String LOAN_USE_GB;
    private BigDecimal USD_CVT_AMT;
    private BigDecimal BASE_CVT_AMT;
    private String ROLLOVER_YN;
    private String ROLLOVER_TYPE;
    private String ROLLOVER_REF_NO;
    private String BANK_CD;
    private String CHANGE_BR_STS;
    private Date FST_IB_IL;
    private Date LST_DEAL_IL;
    private Date LST_IB_IL;
    private String DEALER_ID;
    private String USER_ID;
    private String KONDOR_ID;
    private String REMARK;
    private String CONTRACT_ID;
    private String RELATE_REF_NO;
    private String INTEROFFICE_BR_NO;
    private String BOND_REF_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String UPFRONT_FEE_CCY;
    private BigDecimal UPFRONT_FEE_AMT;
    private String INT_FREQ;
    private String HOLI_DAY_RULE;
    private String COUPON_ADJ_YN;
    private String INT_AT_MAT_YN;

    public AFIF_MMH_BASE_DTO() {
    }
} 
