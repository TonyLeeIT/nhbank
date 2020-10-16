package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_ROH_HIS_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private String STS;
    private String TR_GB;
    private String TR_CD;
    private String CIX_NO;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private Date CAN_IL;
    private BigDecimal SD_HIS_NO;
    private String TR_CCY;
    private BigDecimal TR_FAMT;
    private BigDecimal TR_BAMT;
    private BigDecimal AF_JAN;
    private String FEE_MD;
    private String TR_BR;
    private String SD_BR;
    private String IB_TIME;
    private String OP_NO;
    private String MNG_NO;
    private String IBJI_MD;
    private BigDecimal YD_SEQ;
    private String YD_GUJA;
    private String CD_SNG_NO;
    private BigDecimal CD_SIL_SEQ;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_ROH_HIS_DTO() {
    }
} 
