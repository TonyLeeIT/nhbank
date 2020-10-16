package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFEX_RCH_RECON_DTO {
    private String CD;
    private String CCY;
    private String SA_GB;
    private Date TR_IL;
    private BigDecimal TR_SEQ;
    private Date RECON_IL;
    private BigDecimal RECON_SEQ;
    private String RECON_GB;
    private Date VAL_IL;
    private String OUR_REF;
    private String DRCR_GB;
    private BigDecimal DRCR_AMT;
    private String THEIR_REF;
    private String UPMU_CD;
    private String INID_CD;
    private BigDecimal ORIG_AMT;
    private BigDecimal BUNHAL_SEQ;
    private Date IB_IL;
    private String IB_TIME;
    private String OPER_ID;
    private String CANCEL_YN;
    private String ORIG_REF;
    private String CONFIRM_YN;
    private String NREF_CNT;
    private String AMEND_CNT;
    private String DOC_ID;
    private String OTHER_REF;
    private BigDecimal REF_HIS_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFEX_RCH_RECON_DTO() {
    }
} 
