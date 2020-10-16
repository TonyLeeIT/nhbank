package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_FAB_HIS_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private String STS;
    private String TR_GB;
    private String TR_CD;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private Date CAN_IL;
    private BigDecimal SD_HIS_NO;
    private String TR_CCY;
    private BigDecimal TR_FAMT;
    private BigDecimal TR_BAMT;
    private BigDecimal SAL_AMT;
    private BigDecimal EVEN_AMT;
    private BigDecimal DEPRI_AMT;
    private BigDecimal SELL_AMT;
    private BigDecimal PL_AMT;
    private BigDecimal AF_JAN;
    private BigDecimal AF_DEPRI_JAN;
    private BigDecimal DEPRI_JAN;
    private BigDecimal THIS_DEPRI_JAN;
    private BigDecimal LAST_DEPRI_JAN;
    private BigDecimal CAPITAL_JAN;
    private BigDecimal DISP_JAN;
    private Date DEPRI_IL;
    private Date BFR_DEPRI_IL;
    private String ILGE_YN;
    private String REMARK;
    private String BG_REF_NO;
    private String TR_BR;
    private String SD_BR;
    private String IB_TIME;
    private String OP_NO;
    private String MNG_NO;
    private String CD_SNG_NO;
    private BigDecimal CD_SIL_SEQ;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_FAB_HIS_DTO() {
    }
} 
