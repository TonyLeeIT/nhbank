package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_CIX_BASE")
@Data
public class ACOM_CIX_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String JOB_PLACE;
    private String ID_TP;
    private String CORP_TP;
    private String UPD_EMP_NO;
    private Date LST_DT;
    private String CIX_CD;
    private String MAIN_TEL_NO;
    private String ADDR_HNM2_3;
    private String ADDR_HNM2_2;
    private String ADDR_HNM2_4;
    private String HQ_CIX_NO;
    private Date UPD_DT;
    private String CUST_ENM;
    private String ADDR_HNM2_1;
    private String JOB_CORRES;
    private String JOB_PLC_ADDR_2;
    private String JOB_PLC_ADDR_3;
    private String JOB_PLC_ADDR_1;
    private String REG_EMP_NO;
    private String OP_NO;
    private String DMCL_CTRY_CD;
    private Date OPEN_DT;
    private String CUST_SNM;
    private String YD_GUJA;
    private String POST_NO2;
    private String MOBILE_NO;
    private String ADDR_HNM_1;
    private String ADDR_HNM_3;
    private String ADDR_HNM_2;
    private String ADDR_HNM_4;
    private String GYUMO_CD;
    private String JOB_POS;
    private String JOB_YEAR;
    private String POST_NO;
    private String MARRIAGE_YN;
    private String ID_NO;
    private int PROFIT_EX_TAX;
    private String HQ_ID_NO;
    private String TEL_NO;
    private String ADDR_ENM_4;
    private String ADDR_ENM_3;
    private Date END_ID_DT;
    private String ID_NM;
    private String ADDR_ENM_2;
    private String ADDR_ENM_1;
    private String LST_BR;
    private String CTRY_CD;
    private String UPJO_CD;
    private int AMT_EMPLOYEE;
    private Date BIRTH_DT;
    private String CUST_HNM;
    private String CREDIT_GRADE;
    private String HOUSE_OWN_YN;
    private String MAIL_TP;
    private int SALES_SCALE;
    private String JOB_CTRY_CD;
    private String BIRTH_PLACE;
    private String OCCUP_SINCE;
    private String JOB_MON;
    private String BIC_CD;
    private Date REG_DT;
    private String JOB_PLC_ADDR_4;
    private String MNG_INFO;
    private int PDIN_CAPTL;
    private String OPEN_BR;
    private String TEL_NO2;
    private String MAIL_ADDR_3;
    private String MAIL_ADDR_2;
    private String EMAIL_ADDR;
    private String JOB_POST_NO;
    private int ASSET;
    private String MAIL_ADDR_4;
    private String CIX_NO;
    private String SEX_CD;
    private String MAIL_ADDR_1;
    private String REMARKS2;
    private String CUST_HSNM;
    private String FAX_NO;
    private String REMARKS1;
    private String ID_NO_KOR;
    private String JOB_CD;
    private String UPD_TM;
    private int CAPITAL;
    private String REG_TM;
} 
