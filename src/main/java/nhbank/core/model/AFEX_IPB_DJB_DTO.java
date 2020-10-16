package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_IPB_DJB_DTO {
    private String REF_NO;
    private BigDecimal SEQ;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private Date LST_IB_IL;
    private String CCY;
    private BigDecimal BAMT;
    private BigDecimal HIS_NO;
    private String DJB_GB;
    private BigDecimal JAN;
    private Date LISU_IL;
    private BigDecimal DJH_GUN;
    private BigDecimal EXP_GUN;
    private BigDecimal SH_GUN;
    private BigDecimal KR_SEQ;
    private BigDecimal BLK_SSEQ;
    private Date LST_HOI_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_IPB_DJB_DTO() {
    }
} 
