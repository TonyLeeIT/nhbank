package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_XPB_BDS_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private BigDecimal BUDO_SEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private BigDecimal AMT;
    private BigDecimal HDC_AMT;
    private BigDecimal BAMT;
    private BigDecimal BDC_AMT;
    private BigDecimal BD_IJA;
    private BigDecimal HC_HIJA;
    private String H_JI_GB;
    private BigDecimal CA_SUM_AMT;
    private String SONIK_GB;
    private BigDecimal SONIK_AMT;
    private String NCU_CCY;
    private BigDecimal NCU_AMT;
    private BigDecimal NCU_HDC_AMT;
    private BigDecimal NCU_CA_SUM_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPB_BDS_DTO() {
    }
} 
