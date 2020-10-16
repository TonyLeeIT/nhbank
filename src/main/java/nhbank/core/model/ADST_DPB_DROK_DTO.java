package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ADST_DPB_DROK_DTO {
    private String ACCT_NO;
    private Date IB_IL;
    private BigDecimal DR_TRX_NO;
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
    private BigDecimal BF_NO;
    private BigDecimal AF_NO;
    private BigDecimal BF_RT;
    private BigDecimal AF_RT;
    private Date BF_DATE;
    private Date AF_DATE;
    private String BF_STRING;
    private String AF_STRING;
    private BigDecimal NUM1;
    private BigDecimal NUM2;
    private BigDecimal NUM3;
    private String REMARK;
    private BigDecimal DR_HIS_NO;
    private BigDecimal RELS_HIS_NO;
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
