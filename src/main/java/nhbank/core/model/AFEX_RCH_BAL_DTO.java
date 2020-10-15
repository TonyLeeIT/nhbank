package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RCH_BAL_DTO {
    private String DOC_ID;
    private Date REG_DT;
    private String CD;
    private Date TR_IL;
    private String ACT_CONFIRM_YN;
    private int SHW_CLBS;
    private String UPD_EMP_NO;
    private String OPER_ID;
    private String SHW_CONFIRM_YN;
    private Date LAST_IL;
    private String STS;
    private Date UPD_DT;
    private String CCY;
    private int SHW_OPBS;
    private int ACT_CLBS;
    private int ACT_OPBS;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;

    public AFEX_RCH_BAL_DTO() {
    }
} 
