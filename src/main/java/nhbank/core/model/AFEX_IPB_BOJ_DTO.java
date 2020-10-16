package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_IPB_BOJ_DTO {
    private String REF_NO;
    private BigDecimal SEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private BigDecimal AMT;
    private BigDecimal HIS_NO;
    private String IBJI_GB;
    private String BOJ_GB;
    private BigDecimal BE_LGCOM_DS_AMT;
    private BigDecimal LGM_SEQ;
    private BigDecimal LGM_SSEQ;
    private BigDecimal BLD_SEQ;
    private String NCU_CCY;
    private BigDecimal NCU_AMT;
    private BigDecimal NCU_BE_LGCOM_DS_AMT;
    private BigDecimal CHD_AMT;
    private String JUNHWAN_GB;
    private BigDecimal BE_JUNHWAN_WAMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPB_BOJ_DTO() {
    }
} 
