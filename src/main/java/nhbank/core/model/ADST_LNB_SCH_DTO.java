package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_LNB_SCH_DTO {
    private String REF_NO;
    private String SCH_GB;
    private int ADJ_SEQ;
    private int SCH_SEQ;
    private String STS;
    private String PROCESS_GB;
    private Date MAKE_IL;
    private Date PLAN_IL;
    private String CCY;
    private int PLAN_AMT;
    private Date FST_PAY_IL;
    private int PAY_AMT;
    private int USD_CVT_AMT;
    private int BBS_CVT_AMT;
    private int DS_AMT;
    private int INDEX_RT;
    private String SPREAD_GB;
    private int SPREAD_RT;
    private int TOTAL_RT;
    private Date FROM_IL;
    private Date TO_IL;
    private int DS_TERM;
    private int MISU_INT_AMT;
    private int JS_AMT;
    private int JS_RCV_AMT;
    private int JS_DS_AMT;
    private Date JS_FR_IL;
    private Date JS_TO_IL;
    private int JS_DS_TERM;
    private Date JS_LISU_IL;
    private int PT_AMT;
    private int PT_RCV_AMT;
    private int PT_DS_AMT;
    private Date PT_FR_IL;
    private Date PT_TO_IL;
    private int PT_DS_TERM;
    private Date PT_LISU_IL;
    private int PT_RT;
    private int YC_AMT;
    private int YC_RCV_AMT;
    private int YC_DS_AMT;
    private Date YC_FR_IL;
    private Date YC_TO_IL;
    private int YC_DS_TERM;
    private Date YC_LISU_IL;
    private int YC_RT;
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
