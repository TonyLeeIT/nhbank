package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ADST_DPB_HIS_DTO {
    private String ACCT_NO;
    private BigDecimal HIS_NO;
    private String STS;
    private String CIX_NO;
    private String TR_GB;
    private String TR_CD;
    private String PROCESS_CD;
    private String MECH_GB;
    private BigDecimal SD_HIS_NO;
    private BigDecimal TR_AMT;
    private Date IB_IL;
    private String TR_BR;
    private String SD_BR;
    private String MNG_BR;
    private String TR_TIME;
    private Date GIS_IL;
    private Date CAN_IL;
    private String OP_NO;
    private String MNG_NO;
    private BigDecimal AF_JAN;
    private Date AC_IL;
    private String CHNL_REF_NO;
    private BigDecimal CHNL_HIS_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_DPB_HIS_DTO() {
    }
} 
