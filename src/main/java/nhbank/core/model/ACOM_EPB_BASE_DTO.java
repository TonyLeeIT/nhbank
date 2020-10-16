package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_EPB_BASE_DTO {
    private String REF_NO;
    private String MNG_BR;
    private String MNG_YY;
    private String BUSI_CD;
    private String STS;
    private String EXP_CD;
    private String CCY;
    private BigDecimal ASSIGN_AMT;
    private BigDecimal ADD_AMT;
    private BigDecimal ASSIGN_CAMT;
    private BigDecimal ADD_CAMT;
    private BigDecimal PLUS_AMT;
    private BigDecimal MINUS_AMT;
    private BigDecimal TOTAL_AMT;
    private BigDecimal DR_AMT;
    private BigDecimal CR_AMT;
    private BigDecimal LST_HIS_NO;
    private Date AC_IL;
    private Date IB_IL;
    private Date LST_IL;
    private Date LST_IB_IL;
    private BigDecimal BJ_AMT;
    private BigDecimal ALLOCATE_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_EPB_BASE_DTO() {
    }
} 
