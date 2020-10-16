package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COM_ALLOW_DTO {
    private String REF_NO;
    private String TRX_REF_NO;
    private String MNG_BR;
    private String CIX_NO;
    private String GWAM_CD;
    private String CURC;
    private BigDecimal ASSET_AMT;
    private BigDecimal EXHG_AMT;
    private BigDecimal ALLOW_AMT;
    private BigDecimal COLLECT_AMT;
    private String COLLECT_CD;
    private String STS;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_COM_ALLOW_DTO() {
    }
} 
