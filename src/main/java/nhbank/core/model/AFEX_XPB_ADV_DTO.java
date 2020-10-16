package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_XPB_ADV_DTO {
    private String REF_NO;
    private BigDecimal HIS_NO;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private BigDecimal AMT;
    private String ADV_GB;
    private String CA_GB;
    private String DELAY_GB;
    private Date SD_TR_IL;
    private String JUB_GB;
    private BigDecimal HD_AMT;
    private String JUN_NO1;
    private BigDecimal OVER_AMT;
    private String JUN_NO2;
    private BigDecimal LESS_CA_AMT;
    private BigDecimal LESS_CO_AMT;
    private BigDecimal LESS_GT_AMT;
    private String YUK_NO;
    private String PL_JI_GB;
    private String DEPO_BKCD;
    private String BUIB_GB;
    private BigDecimal JUN_AMT;
    private String IJ_GB;
    private Date MAN_IL;
    private Date CA_MAN_IL;
    private BigDecimal MISU_AMT;
    private BigDecimal MISU_BAMT;
    private String SONIK_GB;
    private BigDecimal SONIK_AMT;
    private Date BE_LCA_IL;
    private String NCU_CCY;
    private BigDecimal NCU_AMT;
    private BigDecimal NCU_HD_AMT;
    private BigDecimal NCU_OVER_AMT;
    private BigDecimal NCU_LESS_CA_AMT;
    private BigDecimal NCU_LESS_CO_AMT;
    private BigDecimal NCU_LESS_GT_AMT;
    private BigDecimal NCU_JUN_AMT;
    private BigDecimal NCU_MISU_AMT;
    private String JUN_NO3;
    private String PAY_DO_YN;
    private String TRSF_ABANO;
    private String TRSF_ACCT;
    private String TRSF_REFNO;
    private String TRSF_BENE_NM;
    private String TRSF_APPL_NM;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String MT103_DOC_ID;
    private String FEE_RCV_BY;

    public AFEX_XPB_ADV_DTO() {
    }
} 
