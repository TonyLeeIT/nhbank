package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_LMT_SIL_DTO {
    private Date REG_DT;
    private String SIL_CCY;
    private String UPD_EMP_NO;
    private int DJG_AMT;
    private String ACT_CD;
    private int SIL_AMT;
    private int GUR_BAMT;
    private int GUR_FAMT;
    private Date UPD_DT;
    private Date FST_IL;
    private String SNG_NO;
    private Date LST_IL;
    private Date LST_IBIL;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;

    public ACOM_LMT_SIL_DTO() {
    }
} 
