package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_DROK_DTO {
    private String ACCT_NO;
    private Date IB_IL;
    private int DR_TRX_NO;
    private String PROCESS_CD;
    private String STS;
    private String MECH_GB;
    private Date RELS_IL;
    private String DR_OP_NO;
    private String DR_MNG_NO;
    private String RELS_OP_NO;
    private String RELS_MNG_NO;
    private String DR_BR;
    private String RELS_BR;
    private String DR_TIME;
    private String RELS_TIME;
    private Date BASE_IL;
    private int BF_NO;
    private int AF_NO;
    private int BF_RT;
    private int AF_RT;
    private Date BF_DATE;
    private Date AF_DATE;
    private String BF_STRING;
    private String AF_STRING;
    private int NUM1;
    private int NUM2;
    private int NUM3;
    private String REMARK;
    private int DR_HIS_NO;
    private int RELS_HIS_NO;
    private Date LST_IB_IL;
    private String LST_TIME;
    private Date SELF_MNG_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_DROK_DTO() {
    }
} 
