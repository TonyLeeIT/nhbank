package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_HEJI_DTO {
    private String ACCT_NO;
    private Date IB_IL;
    private BigDecimal TRX_NO;
    private String TR_CD;
    private String BF_CIX_NO;
    private BigDecimal DEP_CNT;
    private String STS;
    private String MECH_GB;
    private String OP_NO;
    private String IB_TIME;
    private Date CLS_IL;
    private Date GIS_IL;
    private Date CAN_IL;
    private BigDecimal TAX_RT;
    private BigDecimal DPT_RT;
    private BigDecimal CLS_BAMT;
    private BigDecimal CLS_AAMT;
    private BigDecimal BF_INT_BAMT;
    private BigDecimal BF_INT_AAMT;
    private BigDecimal AF_INT_BAMT;
    private BigDecimal AF_INT_AAMT;
    private BigDecimal TAX1_AMT;
    private BigDecimal TAX2_AMT;
    private BigDecimal TAX3_AMT;
    private BigDecimal TAX4_AMT;
    private BigDecimal RTN_INT_BAMT;
    private BigDecimal RTN_INT_AAMT;
    private BigDecimal RTN_TAX1_AMT;
    private BigDecimal RTN_TAX2_AMT;
    private BigDecimal RTN_TAX3_AMT;
    private BigDecimal RTN_TAX4_AMT;
    private BigDecimal TOT_PAY_BAMT;
    private BigDecimal TOT_PAY_AAMT;
    private BigDecimal HIS_NO;
    private BigDecimal CLS_FEE;
    private BigDecimal PNLT_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_HEJI_DTO() {
    }
} 
