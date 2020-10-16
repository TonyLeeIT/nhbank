package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_DPB_YEDE_DTO {
    private String ACCT_NO;
    private String MODE_GB;
    private Date GEJUNG_IL;
    private int BS_DPT_JAN;
    private int BS_LON_JAN;
    private int BS_JAN;
    private int DPT_C_IAMT;
    private int DPT_D_IAMT;
    private int DPT_N_IAMT;
    private int DPT_C_JAMT;
    private int DPT_D_JAMT;
    private int DPT_N_JAMT;
    private int LON_C_IAMT;
    private int LON_D_IAMT;
    private int LON_N_IAMT;
    private int LON_C_JAMT;
    private int LON_D_JAMT;
    private int LON_N_JAMT;
    private int JBR_CK1_AMT;
    private int JBR_CK2_AMT;
    private int JBR_CK4_AMT;
    private int TBR_CK1_AMT;
    private int TBR_CK2_AMT;
    private int TBR_CK4_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_YEDE_DTO() {
    }
} 
