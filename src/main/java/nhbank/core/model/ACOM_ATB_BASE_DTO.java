package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_ATB_BASE_DTO {
    private String REF_NO;
    private String REL_APPLY_NO;
    private String STS;
    private String MGNT_BR_NO;
    private String FR_ACCT_NO;
    private String TO_REF_NO;
    private String TR_TYPE;
    private String FR_CIX_NO;
    private String CIX_NO;
    private String CCY;
    private BigDecimal LIMIT_AMT;
    private BigDecimal TR_AMT;
    private String DUE_TYPE;
    private BigDecimal DUE_DAY;
    private BigDecimal DUE_TIMES;
    private BigDecimal TOT_TIMES;
    private BigDecimal PROC_TIMES;
    private Date OPN_DT;
    private Date EXP_DT;
    private String RETRY_YN;
    private String PURPOSE_CD;
    private String RCV_RMRK;
    private String RCV_ADDR;
    private BigDecimal DEP_TIMES;
    private String TYPE;
    private String CHANNEL_TYPE;
    private String PAYER_INF;
    private String TRSF_TP;
    private String TRSF_DT_RULE;
    private String FEE_FREE_YN;
    private String TO_BANK_CD;
    private String TO_CUST_NM;
    private BigDecimal FEE_AMT;
    private String APPL_RMRK;
    private String RMTE_ACCT_DP_KIND_CD;
    private String RTGS_TP;
    private String OUR_REF;
    private String MULTI_KEY;
    private Date LST_IB_DT;
    private String LST_IB_TIME;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_ATB_BASE_DTO() {
    }
} 
