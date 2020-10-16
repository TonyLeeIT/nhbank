package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_IPB_BLK_DTO {
    private String REF_NO;
    private BigDecimal SEQ;
    private BigDecimal SSEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private BigDecimal AMT;
    private BigDecimal HIS_NO;
    private String JAGM_GB;
    private BigDecimal JILC_BAMT;
    private BigDecimal JILC_FAMT;
    private BigDecimal JILG_BAMT;
    private BigDecimal JILG_FAMT;
    private BigDecimal SNG_SSEQ;
    private BigDecimal DJB_SEQ;
    private String SET_BKCD;
    private String JUN_GB;
    private String FJN_NO;
    private String SET_GB;
    private BigDecimal GT_AMT;
    private String AMT_GB;
    private String NCU_CCY;
    private BigDecimal NCU_AMT;
    private BigDecimal NCU_JILC_FAMT;
    private BigDecimal NCU_JILG_FAMT;
    private BigDecimal NCU_GT_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPB_BLK_DTO() {
    }
} 
