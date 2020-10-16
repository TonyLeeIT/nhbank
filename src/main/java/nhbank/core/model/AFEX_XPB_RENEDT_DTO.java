package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_XPB_RENEDT_DTO {
    private Date MNG_IL;
    private String REF_NO;
    private String STS;
    private String CCY;
    private BigDecimal AMT;
    private BigDecimal BAMT;
    private Date PRE_CA_IL;
    private Date RENE_IL;
    private String RENE_JUM;
    private String NCU_CCY;
    private BigDecimal NCU_AMT;
    private Date CA_IL;
    private BigDecimal CA_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPB_RENEDT_DTO() {
    }
} 
