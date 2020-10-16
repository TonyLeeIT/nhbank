package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COM_FEERT_DTO {
    private String LCD;
    private String MCD;
    private String SCD;
    private String MNG_BR;
    private Date APPLY_IL;
    private int FRT;
    private int MAX_FEE;
    private int MIN_FEE;
    private int ETC_FRT;
    private String CD_NM;
    private Date MAKE_IL;
    private String PL_CD;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_COM_FEERT_DTO() {
    }
} 
