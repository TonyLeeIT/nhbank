package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_XPB_BDM_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private BigDecimal AMT;
    private String BUDO_CD;
    private BigDecimal SH_SEQ;
    private BigDecimal SH_SUM_AMT;
    private String BM_GB;
    private BigDecimal MI_SEQ;
    private BigDecimal MI_TR_BAMT;
    private BigDecimal MI_SH_BAMT;
    private String NCU_CCY;
    private BigDecimal NCU_AMT;
    private BigDecimal NCU_SH_SUM_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPB_BDM_DTO() {
    }
} 
