package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AACT_TRX_BAL_DTO {
    private String REF_NO;
    private String BAL_DV_CD;
    private String DTLS_BAL_DV_CD;
    private String IFRS_DV_CD;
    private String ATIT_CD;
    private String CCY;
    private Date APCL_STR_DT;
    private Date APCL_END_DT;
    private String BR_NO;
    private int BAL_AMT;
    private String SUBJ_CD;
    private String OP_NO;
    private String ID_NO;
    private String CIX_NO;
    private String STS;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AACT_TRX_BAL_DTO() {
    }
} 
