package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_IPB_LGM_DTO {
    private String REF_NO;
    private BigDecimal SEQ;
    private BigDecimal SSEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private BigDecimal AMT;
    private BigDecimal HIS_NO;
    private BigDecimal P_SSEQ;
    private BigDecimal JAN;
    private BigDecimal BOJ_BJAN2;
    private BigDecimal BOJ_JAN2;
    private String BL_GB;
    private BigDecimal BOJ_JUK_YUL;
    private Date YMAN_IL;
    private Date S_YJ_IL;
    private BigDecimal S_DS_AMT;
    private String S_JUK_GB;
    private Date BL_JUB_IL;
    private String TR_GB;
    private Date TC_LISU_IL;
    private String BL_NO;
    private BigDecimal BLD_SEQ;
    private BigDecimal INS_HIS_NO;
    private Date BL_BAL_IL;
    private String LG_HOI_GB;
    private String CS_GB;
    private BigDecimal TERM;
    private String TERM_GB;
    private BigDecimal JILG_BAMT;
    private BigDecimal JILG_FAMT;
    private Date LGCOM_FR_IL;
    private Date LGCOM_TO_IL;
    private BigDecimal LGCOM_FRT;
    private BigDecimal LGCOM_DS_AMT;
    private String MFCS_RT_CD;
    private String BOJFEE_GB;
    private String BOJ_JUK_GB;
    private String SHIP_NM;
    private String SHIP_CO;
    private String SHIP_CO_ADDR1;
    private String SHIP_CO_ADDR2;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPB_LGM_DTO() {
    }
} 
