package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_XPB_RENEDT_DTO {
    private Date REG_DT;
    private int AMT;
    private String UPD_EMP_NO;
    private Date CA_IL;
    private String RENE_JUM;
    private Date MNG_IL;
    private String NCU_CCY;
    private Date RENE_IL;
    private String STS;
    private int CA_AMT;
    private Date PRE_CA_IL;
    private Date UPD_DT;
    private String REF_NO;
    private String CCY;
    private int BAMT;
    private String UPD_TM;
    private int NCU_AMT;
    private String REG_EMP_NO;
    private String REG_TM;

    public AFEX_XPB_RENEDT_DTO() {
    }
} 
