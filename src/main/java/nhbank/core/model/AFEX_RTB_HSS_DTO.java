package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_RTB_HSS_DTO {
    private String REF_NO;
    private String TR_CD;
    private Date AC_IL;
    private Date LST_IB_IL;
    private String HSS_GB;
    private String HSS_AP_GB;
    private String SD_BR_NO;
    private String SD_DEPO_CD;
    private String CHARGE_TYPE;
    private BigDecimal HSS_FEE;
    private Date ICHE_IL;
    private String CCY;
    private BigDecimal FAMT;
    private BigDecimal BAMT;
    private BigDecimal TRSC_SEQ_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_RTB_HSS_DTO() {
    }
} 
