package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COM_CCY_DTO {
    private String CD;
    private String BOK_CD;
    private String NM;
    private int UNIT;
    private int DIGIT;
    private String CTRY_CD;
    private String GOSI_GB;
    private int SEQ_NO;
    private int YEAR_GB;
    private Date MAKE_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_COM_CCY_DTO() {
    }
} 
