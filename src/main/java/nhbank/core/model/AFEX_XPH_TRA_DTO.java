package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_XPH_TRA_DTO {
    private String REF_NO;
    private String TRA_GB;
    private BigDecimal HIS_NO;
    private BigDecimal SEQ_NO;
    private String STS;
    private Date AC_IL;
    private Date GIS_IL;
    private String CCY;
    private BigDecimal AMT;
    private String IN_OUT_GB;
    private String MT_GUBUN;
    private String TLX_NO;
    private String FILE_NAME;
    private String THRU_BANK;
    private String NCU_CCY;
    private BigDecimal NCU_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPH_TRA_DTO() {
    }
} 
