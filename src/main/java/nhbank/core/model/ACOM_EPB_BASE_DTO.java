package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_EPB_BASE_DTO {
    private String REF_NO;
    private String MNG_BR;
    private String MNG_YY;
    private String BUSI_CD;
    private String STS;
    private String EXP_CD;
    private String CCY;
    private int ASSIGN_AMT;
    private int ADD_AMT;
    private int ASSIGN_CAMT;
    private int ADD_CAMT;
    private int PLUS_AMT;
    private int MINUS_AMT;
    private int TOTAL_AMT;
    private int DR_AMT;
    private int CR_AMT;
    private int LST_HIS_NO;
    private Date AC_IL;
    private Date IB_IL;
    private Date LST_IL;
    private Date LST_IB_IL;
    private int BJ_AMT;
    private int ALLOCATE_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_EPB_BASE_DTO() {
    }
} 
