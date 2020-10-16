package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_LNB_SCH_DTO {
    private String REF_NO;
    private String SCH_GB;
    private BigDecimal ADJ_SEQ;
    private BigDecimal SCH_SEQ;
    private String STS;
    private String PROCESS_GB;
    private Date MAKE_IL;
    private Date PLAN_IL;
    private String CCY;
    private BigDecimal PLAN_AMT;
    private Date FST_PAY_IL;
    private BigDecimal PAY_AMT;
    private BigDecimal USD_CVT_AMT;
    private BigDecimal BBS_CVT_AMT;
    private BigDecimal DS_AMT;
    private BigDecimal INDEX_RT;
    private String SPREAD_GB;
    private BigDecimal SPREAD_RT;
    private BigDecimal TOTAL_RT;
    private Date FROM_IL;
    private Date TO_IL;
    private BigDecimal DS_TERM;
    private BigDecimal MISU_INT_AMT;
    private BigDecimal JS_AMT;
    private BigDecimal JS_RCV_AMT;
    private BigDecimal JS_DS_AMT;
    private Date JS_FR_IL;
    private Date JS_TO_IL;
    private BigDecimal JS_DS_TERM;
    private Date JS_LISU_IL;
    private BigDecimal PT_AMT;
    private BigDecimal PT_RCV_AMT;
    private BigDecimal PT_DS_AMT;
    private Date PT_FR_IL;
    private Date PT_TO_IL;
    private BigDecimal PT_DS_TERM;
    private Date PT_LISU_IL;
    private BigDecimal PT_RT;
    private BigDecimal YC_AMT;
    private BigDecimal YC_RCV_AMT;
    private BigDecimal YC_DS_AMT;
    private Date YC_FR_IL;
    private Date YC_TO_IL;
    private BigDecimal YC_DS_TERM;
    private Date YC_LISU_IL;
    private BigDecimal YC_RT;
    private int MAKE_HIS_NO;
    private int LST_SUB_NO;
    private Date LST_AC_IL;
    private Date LST_IB_IL;
    private String FIX_GB;
    private int FIX_AMT;
    private int PV_RT;
    private int PV_AMT;
    private int SEQ_NO;
    private Date RATE_FIX_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_LNB_SCH_DTO() {
    }
} 
