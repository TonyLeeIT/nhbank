package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ADST_LNB_INT_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private BigDecimal SEQ_NO;
    private String STS;
    private BigDecimal ADJ_SEQ;
    private BigDecimal SCH_SEQ;
    private BigDecimal SCH_SUB_NO;
    private Date INT_RCV_IL;
    private String CCY;
    private BigDecimal INT_AMT;
    private BigDecimal INT_DS_AMT;
    private BigDecimal USD_CVT_AMT;
    private BigDecimal BBS_CVT_AMT;
    private String TR_CD;
    private String INT_GB;
    private String TR_GB;
    private String MISU_GB;
    private String ROLL_GB;
    private BigDecimal INDEX_RT;
    private String SPREAD_GB;
    private BigDecimal SPREAD_RT;
    private BigDecimal INT_O_RT;
    private BigDecimal INT_S_RT;
    private Date INT_FROM_IL;
    private Date INT_TO_IL;
    private BigDecimal INT_DAYS;
    private BigDecimal BIZ_SEQ;
    private BigDecimal BIZ_SUBSEQ;
    private Date BF_JS_LISU_IL;
    private Date BF_PT_LISU_IL;
    private Date BF_YC_LISU_IL;
    private Date FST_IB_IL;
    private Date LST_DEAL_IL;
    private Date LST_IB_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_LNB_INT_DTO() {
    }
} 
