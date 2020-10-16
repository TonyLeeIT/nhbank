package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_RTB_HIS_DTO {
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
    private String BUY_CCY;
    private BigDecimal BUY_FAMT;
    private String SEL_CCY;
    private BigDecimal SEL_FAMT;
    private BigDecimal EX_HRT;
    private String TR_BR;
    private String TR_TIME;
    private String USER_ID;
    private Date LST_IB_IL;
    private String PRE_STS;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_RTB_HIS_DTO() {
    }
} 
