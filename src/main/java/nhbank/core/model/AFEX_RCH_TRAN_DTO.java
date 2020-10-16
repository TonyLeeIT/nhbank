package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AFEX_RCH_TRAN_DTO {
    private String CD;
    private String CCY;
    private String MT_GB;
    private Date TR_IL;
    private BigDecimal TR_SEQ;
    private Date VAL_IL;
    private String DRCR_GB;
    private BigDecimal DRCR_AMT;
    private String OUR_REF;
    private String THEIR_REF;
    private Date IB_IL;
    private String IB_TIME;
    private String DOC_ID;
    private String OTHER_REF;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_RCH_TRAN_DTO() {
    }
} 
