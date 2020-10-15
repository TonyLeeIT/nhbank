package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_INTM_DTO {
    private Date REG_DT;
    private Date GIS_IL;
    private int INT_SEQ;
    private int TAX_RT;
    private int DS_DAYS;
    private String TR_CD;
    private int CUR_JAN;
    private int HIS_NO;
    private String CAN_OP_NO;
    private String UPD_EMP_NO;
    private String ACCT_NO;
    private Date IB_IL;
    private int TAX_AMT;
    private Date TO_DT;
    private String STS;
    private int INT_AMT;
    private Date UPD_DT;
    private int INT_RT;
    private Date FROM_DT;
    private String UPD_TM;
    private int DS_AMT;
    private Date CAN_IL;
    private String REG_EMP_NO;
    private String REG_TM;

    public ADST_DPB_INTM_DTO() {
    }
} 
