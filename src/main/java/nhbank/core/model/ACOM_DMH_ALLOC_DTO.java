package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_DMH_ALLOC_DTO {
    private String DAMBO_NO;
    private String CIX_NO;
    private String SNG_NO;
    private int SEQ_NO;
    private String STS;
    private int ALLOC_RATIO;
    private int ALLOC_AMT;
    private String MNG_BR;
    private int LST_HIS_NO;
    private Date LST_AC_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_DMH_ALLOC_DTO() {
    }
} 
