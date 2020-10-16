package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RCH_PEND_DTO {
    private String CD;
    private String CCY;
    private String SA_GB;
    private Date TR_IL;
    private int TR_SEQ;
    private Date VAL_IL;
    private String OUR_REF;
    private String DRCR_GB;
    private int DRCR_AMT;
    private String THEIR_REF;
    private String UPMU_CD;
    private String INID_CD;
    private int ORIG_AMT;
    private int BUNHAL_SEQ;
    private Date IB_IL;
    private String IB_TIME;
    private String OPER_ID;
    private String CANCEL_YN;
    private String ORIG_REF;
    private String CONFIRM_YN;
    private String NREF_CNT;
    private String DOC_ID;
    private String OTHER_REF;
    private int REF_HIS_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_RCH_PEND_DTO() {
    }
} 
