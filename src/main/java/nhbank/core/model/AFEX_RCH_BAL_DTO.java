package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RCH_BAL_DTO {
    private String CD;
    private String CCY;
    private Date TR_IL;
    private int SHW_OPBS;
    private int SHW_CLBS;
    private String SHW_CONFIRM_YN;
    private int ACT_OPBS;
    private int ACT_CLBS;
    private String ACT_CONFIRM_YN;
    private String OPER_ID;
    private Date LAST_IL;
    private String STS;
    private String DOC_ID;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_RCH_BAL_DTO() {
    }
} 
