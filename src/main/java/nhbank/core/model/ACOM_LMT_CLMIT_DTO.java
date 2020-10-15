package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_LMT_CLMIT_DTO {
    private int CHG_SQNO;
    private int XCRT_SC;
    private String FX_ACNO;
    private String UPD_EMP_NO;
    private String RGMN_ENO;
    private String LS_CMENO;
    private int LA_PRD_MTCN;
    private String SCID;
    private int TR_XCRT;
    private Date UPD_DT;
    private int FX_TR_SQNO;
    private int LA_INSP_RC_SQNO;
    private String EST_CURC;
    private Date LSCHG_DTM;
    private String DBT_ACP_C;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String BND_PSV_C;
    private int CHBF_CUSNO;
    private String RMK_CNTN;
    private int REP_CUSNO;
    private Date LMT_DUE_DT;
    private String PNP_LA_MGG_KDC;
    private String WRS_C;
    private int ACUS_APL_ITR;
    private String BF_LA_INSP_RCNO;
    private String LA_INSP_RC_C;
    private String BRC;
    private Date TR_DT;
    private int LA_PMI_AM;
    private String LA_ITR_DSC;
    private int CUSNO;
    private String UPD_TM;
    private String LA_INSP_RCNO;
    private String FX_STSC;
    private String IVTMN_ENO;
    private String REG_TM;

    public ACOM_LMT_CLMIT_DTO() {
    }
} 
