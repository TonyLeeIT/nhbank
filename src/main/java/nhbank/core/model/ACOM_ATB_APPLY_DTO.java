package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_ATB_APPLY_DTO {
    private String APPLY_NO;
    private Date TRX_DT;
    private String STS;
    private String CIX_NO;
    private String BR_NO;
    private String FILE_NM;
    private String FILE_URL;
    private int TOT_CNT;
    private int SUS_CNT;
    private int FAIL_CNT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_ATB_APPLY_DTO() {
    }
} 
