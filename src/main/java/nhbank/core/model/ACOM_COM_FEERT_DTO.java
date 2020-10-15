package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COM_FEERT_DTO {
    private Date REG_DT;
    private int MAX_FEE;
    private String UPD_EMP_NO;
    private int FRT;
    private String LCD;
    private String CD_NM;
    private String MCD;
    private Date APPLY_IL;
    private String PL_CD;
    private int MIN_FEE;
    private String SCD;
    private Date UPD_DT;
    private Date MAKE_IL;
    private String MNG_BR;
    private int ETC_FRT;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;

    public ACOM_COM_FEERT_DTO() {
    }
} 
