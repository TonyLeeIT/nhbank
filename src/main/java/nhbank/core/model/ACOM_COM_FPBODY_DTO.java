package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COM_FPBODY_DTO {
    private String REF_NO;
    private int HIS_NO;
    private String PRT_KIND;
    private int LINE_SEQ;
    private String LINE_TXT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_COM_FPBODY_DTO() {
    }
} 
