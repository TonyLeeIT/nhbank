package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_LMT_SIL_DTO {
    private String SNG_NO;
    private String ACT_CD;
    private String SIL_CCY;
    private Date FST_IL;
    private Date LST_IL;
    private Date LST_IBIL;
    private int SIL_AMT;
    private int DJG_AMT;
    private int GUR_BAMT;
    private int GUR_FAMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_LMT_SIL_DTO() {
    }
} 
