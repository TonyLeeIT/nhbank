package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_IPB_AMD_DTO {
    private String REF_NO;
    private BigDecimal SEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private BigDecimal ID_AMT;
    private BigDecimal HIS_NO;
    private String AMD_CD;
    private String BE_CCY;
    private String AF_CCY;
    private BigDecimal BE_AMT;
    private BigDecimal AF_AMT;
    private Date BE_EXP_IL;
    private Date AF_EXP_IL;
    private BigDecimal BOJ_JUK_YUL;
    private BigDecimal TC_DSAMT;
    private String RE_RE_GB;
    private String BE_MORE;
    private String BE_LESS;
    private String AF_MORE;
    private String AF_LESS;
    private Date BE_TC_LISU_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPB_AMD_DTO() {
    }
} 
