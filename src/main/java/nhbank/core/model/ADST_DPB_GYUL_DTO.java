package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_GYUL_DTO {
    private Date IB_IL;
    private String YEDE;
    private String ACCT_NO;
    private String STS;
    private int JS_INT;
    private int PRCP_YC_INT;
    private int INT_YC_INT;
    private int MM_AVG_AMT;
    private int INT_TAX1;
    private int INT_TAX2;
    private int HIS_NO;
    private String ERR_PGM;
    private String ERR_MSG;
    private String ERR_NO;
    private Date LST_IB_IL;
    private String LST_TIME;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_GYUL_DTO() {
    }
} 
