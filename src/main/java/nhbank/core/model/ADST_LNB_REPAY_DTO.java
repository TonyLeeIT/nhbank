package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_LNB_REPAY_DTO {
    private String REF_NO;
    private int HIS_NO;
    private int SEQ_NO;
    private String STS;
    private int ADJ_SEQ;
    private int SCH_SEQ;
    private int SCH_SUB_NO;
    private Date REPAY_IL;
    private String CCY;
    private int REPAY_AMT;
    private int USD_CVT_AMT;
    private int BBS_CVT_AMT;
    private String REPAY_STYLE;
    private String INT_GB;
    private String YC_GB;
    private Date FST_DEAL_IL;
    private Date LST_DEAL_IL;
    private Date LST_IB_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_LNB_REPAY_DTO() {
    }
} 
