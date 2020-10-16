package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RCH_VOSTRO_DTO {
    private Date IB_IL;
    private BigDecimal SEQ_NO;
    private BigDecimal HIS_NO;
    private BigDecimal CD_AMT;
    private Date AC_IL;
    private String OP_NO;
    private Date VAL_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_RCH_VOSTRO_DTO() {
    }
} 
