package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_INRT_DTO {
    private Date REG_DT;
    private Date TO_IL;
    private int FAMT;
    private int HIS_NO;
    private Date FROM_IL;
    private String UPD_EMP_NO;
    private String ACCT_NO;
    private String STS;
    private Date UPD_DT;
    private int INT_RT;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;

    public ADST_DPB_INRT_DTO() {
    }
} 
