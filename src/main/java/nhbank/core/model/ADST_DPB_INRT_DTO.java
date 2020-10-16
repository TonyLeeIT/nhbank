package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_INRT_DTO {
    private String ACCT_NO;
    private String STS;
    private BigDecimal HIS_NO;
    private Date FROM_IL;
    private Date TO_IL;
    private BigDecimal FAMT;
    private BigDecimal INT_RT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_INRT_DTO() {
    }
} 
