package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_BURI_DTO {
    private String ACCT_NO;
    private Date BURI_IL;
    private int BURI_JAN;
    private int FST_JAN;
    private int MAX_JAN;
    private Date TERM_IL;
    private int LON_SNG_AMT;
    private int LON_OVR_AMT;
    private String LON_RT_CD;
    private int LON_RT;
    private int PRCP_OVER_DUE_INT_RT;
    private int INT_OVER_DUE_INT_RT;
    private int COL_LON_INT;
    private int LON_PRCP_YC_INT;
    private int LON_INT_YC_INT;
    private String LON_YD_CD;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_BURI_DTO() {
    }
} 
