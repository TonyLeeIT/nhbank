package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_INTM_DTO {
    private String ACCT_NO;
    private Date IB_IL;
    private Date GIS_IL;
    private int INT_SEQ;
    private String STS;
    private String TR_CD;
    private int CUR_JAN;
    private int DS_AMT;
    private int DS_DAYS;
    private int INT_RT;
    private int INT_AMT;
    private int TAX_RT;
    private int TAX_AMT;
    private Date FROM_DT;
    private Date TO_DT;
    private int HIS_NO;
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
