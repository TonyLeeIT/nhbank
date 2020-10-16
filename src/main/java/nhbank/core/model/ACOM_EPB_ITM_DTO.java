package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_EPB_ITM_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String DR_GB;
    private String ITM_CD;
    private String BE_ITM;
    private String AF_ITM;
    private BigDecimal BE_ITM1;
    private BigDecimal AF_ITM1;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_EPB_ITM_DTO() {
    }
} 
