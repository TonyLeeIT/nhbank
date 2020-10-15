package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFIF_MMH_BASE")
@Data
public class AFIF_MMH_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date CONFIRM_IL;
    private String THR_RCV_DEPO_CCY;
    private int BROKER_FEE_AMT;
    private String OUR_RCV_DEPO_CD;
    private String INT_CCY;
    private String ONOFF_GB;
    private String UPD_EMP_NO;
    private String USER_ID;
    private String CHANGE_BR_STS;
    private String INT_AT_MAT_YN;
    private int TAX_AMT;
    private String COM_NM;
    private Date INT_FROM_IL;
    private Date LST_DEAL_IL;
    private String BORROW_KIND;
    private Date UPD_DT;
    private String ROLLOVER_YN;
    private String HOLI_DAY_RULE;
    private Date EXP_IL;
    private int USD_CVT_AMT;
    private String BOND_REF_NO;
    private String REG_EMP_NO;
    private String KONDOR_ID;
    private String OUR_RCV_DEPO_CCY;
    private String OUR_RCV_DEPO_NM;
    private String UPFRONT_FEE_CCY;
    private String CONTRACT_ID;
    private String EXP_YN;
    private String THR_RCV_DEPO_BIC;
    private int PRINCIPAL_AMT;
    private int SPREAD_RT;
    private int INDEX_RT;
    private int INT_AMT;
    private String CONFIRM_YN;
    private String BORROW_GB;
    private String ADV_ARR_GB;
    private String NATION_LON_GB;
    private Date INT_PAY_RCV_IL;
    private int BASE_CVT_AMT;
    private int TOTAL_RT;
    private String ROLLOVER_REF_NO;
    private Date DEAL_IL;
    private Date VALUE_IL;
    private String ACCR_TYPE;
    private String HOLIDAY_LOCATION;
    private String RATE_FREQ;
    private int INT_DAYS;
    private String FIX_FLT_GB;
    private String BROKER_FEE_CCY;
    private String SINGLE_BOTH_TYPE;
    private String REF_NO;
    private int UPFRONT_FEE_AMT;
    private String PO_YN;
    private String VALUE_YN;
    private String COUNTERPARTY_ID;
    private String LOAN_USE_GB;
    private String BORROW_LON_GB;
    private String REMARK;
    private String OUR_PAY_DEPO_CD;
    private Date REG_DT;
    private String BSNS_DAY_RULE;
    private int PO_AMT;
    private String INT_FREQ;
    private String RELATE_REF_NO;
    private Date LST_IB_IL;
    private String COM_ID;
    private Date PO_IL;
    private String RATE_GB;
    private String BANK_CD;
    private String INOUT_GB;
    private Date FST_IB_IL;
    private String COUPON_ADJ_YN;
    private String OUR_PAY_DEPO_CCY;
    private String ROLLOVER_TYPE;
    private int PO_SEQ;
    private String DEALER_ID;
    private String CCY;
    private Date INT_TO_IL;
    private String OUR_PAY_DEPO_NM;
    private String INTEROFFICE_BR_NO;
    private String UPD_TM;
    private String THR_RCV_DEPO_NM;
    private String BROKER_ID;
    private String COUNTERPARTY_NM;
    private String RATE_CCY;
    private String REG_TM;
} 
