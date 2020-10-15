package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RCH_VOSTRO_DTO {
    private String OP_NO;
    private Date REG_DT;
    private int HIS_NO;
    private String UPD_EMP_NO;
    private Date IB_IL;
    private Date AC_IL;
    private int SEQ_NO;
    private int CD_AMT;
    private Date UPD_DT;
    private Date VAL_IL;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;

    public AFEX_RCH_VOSTRO_DTO() {
    }
} 
