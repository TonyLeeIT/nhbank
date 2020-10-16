package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_DMH_ALLOCHIS_DTO {
    private String DAMBO_NO;
    private String CIX_NO;
    private String SNG_NO;
    private BigDecimal SEQ_NO;
    private BigDecimal HIS_NO;
    private String STS;
    private BigDecimal ALLOC_RATIO;
    private BigDecimal ALLOC_AMT;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private String TR_BR;
    private String SD_BR;
    private String TR_TIME;
    private String OP_NO;
    private String MNG_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_DMH_ALLOCHIS_DTO() {
    }
} 
