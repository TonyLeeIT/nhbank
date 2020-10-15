package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COM_ALLOW_DTO {
    private Date REG_DT;
    private String TRX_REF_NO;
    private int ASSET_AMT;
    private String UPD_EMP_NO;
    private String COLLECT_CD;
    private int ALLOW_AMT;
    private String CIX_NO;
    private String GWAM_CD;
    private int COLLECT_AMT;
    private String STS;
    private Date UPD_DT;
    private String REF_NO;
    private String MNG_BR;
    private String CURC;
    private int EXHG_AMT;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;

    public ACOM_COM_ALLOW_DTO() {
    }
} 
