package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFIF_FEH_HIS_DTO {
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
    private String NEAR_BUY_CCY;
    private BigDecimal NEAR_BUY_FAMT;
    private BigDecimal NEAR_BUY_BAMT;
    private BigDecimal NEAR_BUY_JAN;
    private BigDecimal NEAR_BUY_BJAN;
    private String NEAR_SELL_CCY;
    private BigDecimal NEAR_SELL_FAMT;
    private BigDecimal NEAR_SELL_BAMT;
    private BigDecimal NEAR_SELL_JAN;
    private BigDecimal NEAR_SELL_BJAN;
    private String NEAR_SND_DOC_NO;
    private String FAR_BUY_CCY;
    private BigDecimal FAR_BUY_FAMT;
    private BigDecimal FAR_BUY_BAMT;
    private BigDecimal FAR_BUY_JAN;
    private BigDecimal FAR_BUY_BJAN;
    private String FAR_SELL_CCY;
    private BigDecimal FAR_SELL_FAMT;
    private BigDecimal FAR_SELL_BAMT;
    private BigDecimal FAR_SELL_JAN;
    private BigDecimal FAR_SELL_BJAN;
    private String FAR_SND_DOC_NO;
    private String TR_BR;
    private String SD_BR;
    private String TR_TIME;
    private String USER_ID;
    private String MANAGER_ID;
    private String IBJI_MD;
    private String CD_SNG_NO;
    private BigDecimal CD_SIL_SEQ;
    private String FTP_SNG_NO;
    private BigDecimal FTP_SIL_SEQ;
    private String JUN_NO;
    private String YUK_NO;
    private Date LST_IB_IL;
    private String FRONT_SND_GB;
    private String PRE_STS;
    private String BE_HD_SNGNO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFIF_FEH_HIS_DTO() {
    }
} 
