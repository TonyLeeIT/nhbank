package nhbank.core.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ACOM_CIX_BASE_DTO {
    private String CIX_NO;
    private String ID_NO;
    private String ID_TP;
    private Date END_ID_DT;
    private String ID_NM;
    private String ID_NO_KOR;
    private String OPEN_BR;
    private String LST_BR;
    private Date OPEN_DT;
    private Date LST_DT;
    private String CUST_ENM;
    private String CUST_SNM;
    private String CUST_HNM;
    private String CUST_HSNM;
    private String ADDR_ENM_1;
    private String ADDR_ENM_2;
    private String ADDR_ENM_3;
    private String ADDR_ENM_4;
    private String ADDR_HNM_1;
    private String ADDR_HNM_2;
    private String ADDR_HNM_3;
    private String ADDR_HNM_4;
    private String ADDR_HNM2_1;
    private String ADDR_HNM2_2;
    private String ADDR_HNM2_3;
    private String ADDR_HNM2_4;
    private String POST_NO;
    private String POST_NO2;
    private String MAIN_TEL_NO;
    private String TEL_NO;
    private String TEL_NO2;
    private String MOBILE_NO;
    private String FAX_NO;
    private String CIX_CD;
    private String CTRY_CD;
    private String DMCL_CTRY_CD;
    private String GYUMO_CD;
    private String UPJO_CD;
    private String JOB_CD;
    private String JOB_PLACE;
    private String JOB_PLC_ADDR_1;
    private String JOB_PLC_ADDR_2;
    private String JOB_PLC_ADDR_3;
    private String JOB_PLC_ADDR_4;
    private String JOB_POST_NO;
    private String JOB_CORRES;
    private String JOB_POS;
    private String JOB_YEAR;
    private String JOB_MON;
    private String JOB_CTRY_CD;
    private String OCCUP_SINCE;
    private String SEX_CD;
    private Date BIRTH_DT;
    private String BIRTH_PLACE;
    private String MARRIAGE_YN;
    private String HOUSE_OWN_YN;
    private String BIC_CD;
    private String OP_NO;
    private String YD_GUJA;
    private String MNG_INFO;
    private String MAIL_TP;
    private String MAIL_ADDR_1;
    private String MAIL_ADDR_2;
    private String MAIL_ADDR_3;
    private String MAIL_ADDR_4;
    private String CREDIT_GRADE;
    private String EMAIL_ADDR;
    private BigDecimal CAPITAL;
    private BigDecimal SALES_SCALE;
    private BigDecimal PROFIT_EX_TAX;
    private BigDecimal ASSET;
    private BigDecimal PDIN_CAPTL;
    private BigDecimal AMT_EMPLOYEE;
    private String CORP_TP;
    private String REMARKS1;
    private String REMARKS2;
    private String HQ_CIX_NO;
    private String HQ_ID_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;

    public ACOM_CIX_BASE_DTO() {
    }
} 
