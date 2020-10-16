package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_XPH_CA_DTO {
    private Date RCV_IL;
    private int SEQ_NO;
    private String STS;
    private String REF_NO;
    private String CA_CCY;
    private int CA_AMT;
    private int LESS_CA_AMT;
    private int LESS_CO_AMT;
    private int LESS_GT_AMT;
    private int OVER_AMT;
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
    private int NCU_CA_AMT;
    private int NCU_LESS_CA_AMT;
    private int NCU_LESS_CO_AMT;
    private int NCU_LESS_GT_AMT;
    private int NCU_OVER_AMT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_XPH_CA_DTO() {
    }
} 
