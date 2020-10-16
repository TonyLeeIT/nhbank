package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_ATB_APPLY_DTO {
    private String APPLY_NO;
    private Date TRX_DT;
    private String STS;
    private String CIX_NO;
    private String BR_NO;
    private String FILE_NM;
    private String FILE_URL;
    private BigDecimal TOT_CNT;
    private BigDecimal SUS_CNT;
    private BigDecimal FAIL_CNT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_ATB_APPLY_DTO() {
    }
} 
