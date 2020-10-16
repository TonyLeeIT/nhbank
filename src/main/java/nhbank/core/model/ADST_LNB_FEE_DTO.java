package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ADST_LNB_FEE_DTO {
    private String REF_NO;
    private int HIS_NO;
    private int SEQ_NO;
    private String STS;
    private String FEE_GB;
    private String CCY;
    private int FEE_AMT;
    private String RATE_AMT_GB;
    private int FEE_DS_AMT;
    private int FEE_DS_BAMT;
    private int FEE_O_RT;
    private int FEE_S_RT;
    private Date FEE_FR_IL;
    private Date FEE_TO_IL;
    private int FEE_DAYS;
    private int ADJ_SEQ;
    private int SCH_SEQ;
    private int SCH_SUB_NO;
    private int BIZ_NO;
    private Date FEE_RCV_IL;
    private Date FST_IB_IL;
    private Date LST_AC_IL;
    private Date LST_IB_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ADST_LNB_FEE_DTO() {
    }
} 
