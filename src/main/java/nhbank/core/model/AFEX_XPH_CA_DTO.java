package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_XPH_CA_DTO {
    private Date RCV_IL;
    private BigDecimal SEQ_NO;
    private String STS;
    private String REF_NO;
    private String CA_CCY;
    private BigDecimal CA_AMT;
    private BigDecimal LESS_CA_AMT;
    private BigDecimal LESS_CO_AMT;
    private BigDecimal LESS_GT_AMT;
    private BigDecimal OVER_AMT;
    private Date CA_IL;
    private String DEPO_BKCD;
    private Date SD_BAL_IL;
    private String CC_GB;
    private Date CC_IL;
    private String CC_RT_CD;
    private String TR_GB;
    private String MT_TR_MD;
    private String SWIFT_KEY;
    private String RCV_GB;
    private String OP_NO;
    private String DEPO_CD;
    private String CD_GB;
    private String DIV_GB;
    private String DIV_REF;
    private String NCU_CA_CCY;
    private BigDecimal NCU_CA_AMT;
    private BigDecimal NCU_LESS_CA_AMT;
    private BigDecimal NCU_LESS_CO_AMT;
    private BigDecimal NCU_LESS_GT_AMT;
    private BigDecimal NCU_OVER_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPH_CA_DTO() {
    }
} 
