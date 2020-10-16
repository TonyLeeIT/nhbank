package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RCH_SEQNO_DTO {
    private Date TR_IL;
    private String SA_GB;
    private String CD;
    private String CCY;
    private int SEQNO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_RCH_SEQNO_DTO() {
    }
} 
