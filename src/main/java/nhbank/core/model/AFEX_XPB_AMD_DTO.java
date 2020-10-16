package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_XPB_AMD_DTO {
    private String REF_NO;
    private BigDecimal SEQ_NO;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IL;
    private Date LST_IB_IL;
    private Date CAN_IL;
    private BigDecimal HIS_NO;
    private String BE_TENOR_GB;
    private String BE_RENE_REQ_GB;
    private String BE_NEGO_GB;
    private String BE_HJ_IL_CD;
    private Date BE_MAN_GIJ_IL;
    private BigDecimal BE_HIJA_TERM;
    private BigDecimal BE_USANCE_TERM;
    private Date BE_YMAN_IL;
    private Date BE_MO_JUB_IL;
    private Date BE_LST_ISU_IL;
    private String BE_WHAN_RCV_GB;
    private BigDecimal BE_WHAN_FRT;
    private BigDecimal BE_INT_AMT;
    private String AF_TENOR_GB;
    private String AF_RENE_REQ_GB;
    private String AF_NEGO_GB;
    private String AF_HJ_IL_CD;
    private Date AF_MAN_GIJ_IL;
    private BigDecimal AF_HIJA_TERM;
    private BigDecimal AF_USANCE_TERM;
    private Date AF_YMAN_IL;
    private Date AF_MO_JUB_IL;
    private Date AF_LST_ISU_IL;
    private String AF_WHAN_RCV_GB;
    private BigDecimal AF_WHAN_FRT;
    private BigDecimal AF_INT_AMT;
    private String OP_NO;
    private String MNG_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPB_AMD_DTO() {
    }
} 
