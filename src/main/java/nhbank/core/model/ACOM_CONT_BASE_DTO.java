package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_CONT_BASE_DTO {
    private String REF_NO;
    private String CNTY_CD;
    private String RGN_CD;
    private String STS;
    private String INACT_RSN_CD;
    private int LST_HIS_NO;
    private String TRCLL_ST_CD;
    private String MGNT_BR_NO;
    private String BRFC_CD;
    private String PFMC_MGNT_BR_NO;
    private String ID_NO;
    private String CIX_NO;
    private int DEPT_SEQ_NO;
    private String SUBJ_CD;
    private String BNK_DV_CD;
    private String PRD_CD;
    private String LIM_APV_NO;
    private String CUR_CD;
    private Date TRSC_DT;
    private Date PROC_BASC_DT;
    private Date DDAC_RNW_DT;
    private Date LST_TRSC_DT;
    private Date CONT_END_DT;
    private String HS_CD;
    private String ENTR_MGNT_NO;
    private int CMLT_MLGE_AMT;
    private String CORP_SCAL_CD;
    private String THR_CNTY_CD;
    private String ORIPL_CNTY_CD;
    private String EIMP_DCL_NO;
    private String DOMS_OTSD_DV_CD;
    private String LONG_SHTM_DV_CD;
    private String PFMC_DV_CD;
    private String AST_RELN_CRPD_YN;
    private String DBT_APTC_YN;
    private String SUGT_EMP_RLCO_CD;
    private String SUGT_EMP_NO;
    private String TMAN_EMP_NO;
    private String PB_RM_OFFCR_CD;
    private String MASTAUTH_DV_CD;
    private String SUB_REF_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_CONT_BASE_DTO() {
    }
} 
