package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ADST_DPB_INTM_DTO {
    private String ACCT_NO;
    private Date IB_IL;
    private Date GIS_IL;
    private BigDecimal INT_SEQ;
    private String STS;
    private String TR_CD;
    private BigDecimal CUR_JAN;
    private BigDecimal DS_AMT;
    private BigDecimal DS_DAYS;
    private BigDecimal INT_RT;
    private BigDecimal INT_AMT;
    private BigDecimal TAX_RT;
    private BigDecimal TAX_AMT;
    private Date FROM_DT;
    private Date TO_DT;
    private BigDecimal HIS_NO;
    private Date CAN_IL;
    private String CAN_OP_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_INTM_DTO() {
    }
} 
