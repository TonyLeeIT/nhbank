package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_LMT_CLMIT_DTO {
    private String LA_INSP_RCNO;
    private BigDecimal CHG_SQNO;
    private BigDecimal LA_INSP_RC_SQNO;
    private String LA_INSP_RC_C;
    private String FX_ACNO;
    private BigDecimal REP_CUSNO;
    private BigDecimal CUSNO;
    private String BRC;
    private String EST_CURC;
    private BigDecimal LA_PMI_AM;
    private Date LMT_DUE_DT;
    private BigDecimal LA_PRD_MTCN;
    private String PNP_LA_MGG_KDC;
    private String BND_PSV_C;
    private String LA_ITR_DSC;
    private BigDecimal ACUS_APL_ITR;
    private String WRS_C;
    private String RGMN_ENO;
    private String IVTMN_ENO;
    private String SCID;
    private BigDecimal TR_XCRT;
    private BigDecimal XCRT_SC;
    private String DBT_ACP_C;
    private String BF_LA_INSP_RCNO;
    private BigDecimal CHBF_CUSNO;
    private Date TR_DT;
    private BigDecimal FX_TR_SQNO;
    private String RMK_CNTN;
    private String FX_STSC;
    private Date LSCHG_DTM;
    private String LS_CMENO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_LMT_CLMIT_DTO() {
    }
} 
