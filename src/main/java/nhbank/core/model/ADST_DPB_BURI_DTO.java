package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ADST_DPB_BURI_DTO {
    private String ACCT_NO;
    private Date BURI_IL;
    private BigDecimal BURI_JAN;
    private BigDecimal FST_JAN;
    private BigDecimal MAX_JAN;
    private Date TERM_IL;
    private BigDecimal LON_SNG_AMT;
    private BigDecimal LON_OVR_AMT;
    private String LON_RT_CD;
    private BigDecimal LON_RT;
    private BigDecimal PRCP_OVER_DUE_INT_RT;
    private BigDecimal INT_OVER_DUE_INT_RT;
    private BigDecimal COL_LON_INT;
    private BigDecimal LON_PRCP_YC_INT;
    private BigDecimal LON_INT_YC_INT;
    private String LON_YD_CD;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_BURI_DTO() {
    }
} 
