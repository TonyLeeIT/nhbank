package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COMH_MSGHIS_DTO {
    private String DOC_ID;
    private int SEQ_NO;
    private String COND_STS;
    private String STM_RMK;
    private String STM_TAIL;
    private Date MAKE_IL;
    private String MAKE_TIME;
    private String MAKE_TTY;
    private String OP_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_COMH_MSGHIS_DTO() {
    }
} 
