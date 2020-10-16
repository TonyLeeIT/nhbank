package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class AFIF_MTH_BASE_DTO {
    private String REF_NO;
    private Date DEAL_IL;
    private String DEAL_TYPE;
    private String VALUE_YN;
    private Date VALUE_IL;
    private String CCY;
    private BigDecimal AMT;
    private String FROM_DEPO_CD;
    private String FROM_DEPO_NM;
    private String TO_CCY;
    private String TO_DEPO_CD;
    private String TO_DEPO_NM;
    private String PO_YN;
    private Date PO_IL;
    private BigDecimal PO_SEQ;
    private String TAG21;
    private String TAG53_B;
    private String TAG56_A_BIC;
    private String TAG56_A_NM;
    private String TAG56_D_BIC_NAME1;
    private String TAG56_D_BIC_NAME2;
    private String TAG56_D_BIC_NAME3;
    private String TAG56_D_BIC_NAME4;
    private String TAG57_BIC;
    private String TAG57_NM;
    private String TAG58_BIC;
    private String TAG58_NM;
    private String TAG72_INFO1;
    private String TAG72_INFO2;
    private String TAG72_INFO3;
    private Date FST_IB_IL;
    private Date LST_DEAL_IL;
    private Date LST_IB_IL;
    private String USER_ID;
    private String FRONT_ID;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public AFIF_MTH_BASE_DTO() {
    }
} 
