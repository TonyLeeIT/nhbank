package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_XPH_SHIP_RESEND_DTO {
    private String REF_NO;
    private BigDecimal BH_SEQ;
    private BigDecimal SEQ;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPH_SHIP_RESEND_DTO() {
    }
} 
