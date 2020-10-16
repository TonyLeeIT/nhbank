package nhbank.core.model;

import lombok.Data;

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
    private int DEPRI_AMT;
    private int SELL_AMT;
    private int PL_AMT;
    private int AF_JAN;
    private int AF_DEPRI_JAN;
    private int DEPRI_JAN;
    private int THIS_DEPRI_JAN;
    private int LAST_DEPRI_JAN;
    private int CAPITAL_JAN;
    private int DISP_JAN;
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
    private int CD_SIL_SEQ;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_FAB_HIS_DTO() {
    }
} 
