package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_LMT_SILHIS_DTO {
    private String SNG_NO;
    private String ACT_CD;
    private String SIL_CCY;
    private BigDecimal HIS_NO;
    private String STS;
    private String TR_CD;
    private Date IB_IL;
    private Date AC_IL;
    private Date GIS_IL;
    private String REF_NO;
    private String SIL_GB;
    private String UPMU_CD;
    private String GEOR_CD;
    private BigDecimal SIL_AMT;
    private String SIL_PMGB;
    private BigDecimal SIL_JAN;
    private BigDecimal DJG_AMT;
    private String DJG_PMGB;
    private BigDecimal DJG_JAN;
    private BigDecimal GUR_BAMT;
    private String GUR_BPMGB;
    private BigDecimal GUR_BJAN;
    private BigDecimal GUR_FAMT;
    private String GUR_FPMGB;
    private BigDecimal GUR_FJAN;
    private String TR_BR;
    private String SD_BR;
    private String TR_TIME;
    private String OP_NO;
    private String MNG_NO;
    private BigDecimal TRSC_SEQ_NO;
    private BigDecimal TRX_FAMT;
    private BigDecimal TRX_BAMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_LMT_SILHIS_DTO() {
    }
} 
