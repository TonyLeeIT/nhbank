package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_YEDE_DTO {
    private String ACCT_NO;
    private String MODE_GB;
    private Date GEJUNG_IL;
    private BigDecimal BS_DPT_JAN;
    private BigDecimal BS_LON_JAN;
    private BigDecimal BS_JAN;
    private BigDecimal DPT_C_IAMT;
    private BigDecimal DPT_D_IAMT;
    private BigDecimal DPT_N_IAMT;
    private BigDecimal DPT_C_JAMT;
    private BigDecimal DPT_D_JAMT;
    private BigDecimal DPT_N_JAMT;
    private BigDecimal LON_C_IAMT;
    private BigDecimal LON_D_IAMT;
    private BigDecimal LON_N_IAMT;
    private BigDecimal LON_C_JAMT;
    private BigDecimal LON_D_JAMT;
    private BigDecimal LON_N_JAMT;
    private BigDecimal JBR_CK1_AMT;
    private BigDecimal JBR_CK2_AMT;
    private BigDecimal JBR_CK4_AMT;
    private BigDecimal TBR_CK1_AMT;
    private BigDecimal TBR_CK2_AMT;
    private BigDecimal TBR_CK4_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_YEDE_DTO() {
    }
} 
