package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_LNB_REPAY_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private BigDecimal SEQ_NO;
    private String STS;
    private BigDecimal ADJ_SEQ;
    private BigDecimal SCH_SEQ;
    private BigDecimal SCH_SUB_NO;
    private Date REPAY_IL;
    private String CCY;
    private BigDecimal REPAY_AMT;
    private BigDecimal USD_CVT_AMT;
    private BigDecimal BBS_CVT_AMT;
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
