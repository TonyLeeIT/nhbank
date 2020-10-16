package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_DMH_BASE_DTO {
    private String CIX_NO;
    private String DAMBO_NO;
    private String STS;
    private String SYSTEM_GB;
    private BigDecimal SEQ_NO;
    private String DAMBO_CD;
    private String DAMBO_TYPE;
    private Date DAMBO_EXP_DATE;
    private String CCY;
    private BigDecimal FAMT;
    private BigDecimal OBANK_FIX_AMT;
    private BigDecimal FIRST_FIX_AMT;
    private String DAMBO_ADDR;
    private String DAMBO_CITY;
    private BigDecimal APP_LAND_VALUE;
    private String OFFER_GB;
    private String GRT_ID_NO;
    private BigDecimal GRT_PORTION;
    private String ACCT_NO;
    private String ISSUE_NM;
    private String DAMBO_CNT_GB;
    private String DAMBO_GUR_YN;
    private String APPRAISER_TYPE;
    private String APP_APPRAISER;
    private BigDecimal FST_APP_VALUE;
    private Date FST_APP_DATE;
    private Date RE_APP_DATE;
    private BigDecimal RE_APP_VALUE;
    private String JUDICIAL_SCRIVENER;
    private String FIX_STS;
    private String CERT_TYPE;
    private String CERT_STS;
    private String CERT_NO;
    private String INSUR_CODE;
    private String INSUR_POLICY_NO;
    private String INSUR_COMPANY;
    private Date INSUR_EXP_DATE;
    private BigDecimal INSUR_AMT;
    private String INSUR_REMARK;
    private String TO_MORTGAGE;
    private String COLL_OWNER_NAME;
    private String INSUR_OBJ_ADDR;
    private BigDecimal ALLOC_RATIO;
    private BigDecimal ALLOC_AMT;
    private String MNG_BR;
    private BigDecimal LST_HIS_NO;
    private Date AC_IL;
    private Date LST_AC_IL;
    private String OP_NO;
    private String DEPOSIT_CD;
    private String ST_CO_GB;
    private String ST_CO_NAME;
    private Date FILING_DATE;
    private String FILING_NUM;
    private Date EXPIRE_DATE;
    private BigDecimal PRIORITY;
    private Date STS_EXP_DATE;
    private BigDecimal APP_GAP;
    private BigDecimal FAMT_INT;
    private BigDecimal FIRST_FIX_AMT_INT;
    private BigDecimal FST_APP_VALUE_INT;
    private Date FST_APP_DATE_INT;
    private BigDecimal FAMT_EXT;
    private BigDecimal FIRST_FIX_AMT_EXT;
    private BigDecimal FST_APP_VALUE_EXT;
    private Date FST_APP_DATE_EXT;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_DMH_BASE_DTO() {
    }
} 
