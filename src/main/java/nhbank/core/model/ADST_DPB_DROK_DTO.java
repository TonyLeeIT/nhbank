package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_DROK_DTO {
    private String DR_OP_NO;
    private String PROCESS_CD;
    private String DR_BR;
    private String RELS_OP_NO;
    private String RELS_TIME;
    private String UPD_EMP_NO;
    private Date AF_DATE;
    private int RELS_HIS_NO;
    private String ACCT_NO;
    private String MECH_GB;
    private String STS;
    private Date UPD_DT;
    private int DR_TRX_NO;
    private Date SELF_MNG_IL;
    private Date RELS_IL;
    private String REMARK;
    private String RELS_MNG_NO;
    private int BF_RT;
    private int BF_NO;
    private String REG_EMP_NO;
    private Date BF_DATE;
    private Date REG_DT;
    private String AF_STRING;
    private String BF_STRING;
    private String DR_MNG_NO;
    private String RELS_BR;
    private int NUM2;
    private String LST_TIME;
    private String DR_TIME;
    private Date BASE_IL;
    private int AF_RT;
    private int NUM3;
    private Date LST_IB_IL;
    private Date IB_IL;
    private int AF_NO;
    private int NUM1;
    private int DR_HIS_NO;
    private String UPD_TM;
    private String REG_TM;

    public ADST_DPB_DROK_DTO() {
    }
} 
