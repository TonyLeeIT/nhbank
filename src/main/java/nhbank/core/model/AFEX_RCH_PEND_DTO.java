package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RCH_PEND_DTO {
    private Date TR_IL;
    private String UPMU_CD;
    private int ORIG_AMT;
    private String UPD_EMP_NO;
    private String OTHER_REF;
    private Date UPD_DT;
    private String ORIG_REF;
    private Date VAL_IL;
    private String IB_TIME;
    private String SA_GB;
    private String REG_EMP_NO;
    private String DOC_ID;
    private Date REG_DT;
    private String CD;
    private String INID_CD;
    private String OUR_REF;
    private Date IB_IL;
    private String OPER_ID;
    private String NREF_CNT;
    private int BUNHAL_SEQ;
    private String CONFIRM_YN;
    private int DRCR_AMT;
    private String DRCR_GB;
    private String THEIR_REF;
    private String CCY;
    private int TR_SEQ;
    private int REF_HIS_NO;
    private String CANCEL_YN;
    private String UPD_TM;
    private String REG_TM;

    public AFEX_RCH_PEND_DTO() {
    }
} 
