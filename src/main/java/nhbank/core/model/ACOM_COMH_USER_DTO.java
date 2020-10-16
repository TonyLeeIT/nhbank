package nhbank.core.model;

import lombok.Data;

import java.util.Date;

@Data
public class ACOM_COMH_USER_DTO {
    private String OP_NO;
    private String PASSWORD;
    private String STS;
    private Date PASSWD_IL;
    private String OP_GB;
    private String KNM;
    private String FNM;
    private Date OPEN_IL;
    private String OPEN_USER;
    private String CJUM;
    private String AJUM;
    private String SJUM;
    private String GRP_NO;
    private String DEALER_NO;
    private String DEALER_YN;
    private String TGB;
    private String TYPE;
    private String TSEQ;
    private String TELL_NO;
    private String GRP_ID;
    private String IP_ADDR;
    private String GRANT_YN;
    private Date LOGIN_IL;
    private Date LOGOUT_IL;
    private String LOGIN_YN;
    private String LOGIN_TIME;
    private String LOGOUT_TIME;
    private Date LST_IB_IL;
    private String SENIOR_OP_NO;
    private String OLD_PASSWD0;
    private String OLD_PASSWD1;
    private String OLD_PASSWD2;
    private String OLD_PASSWD3;
    private String OLD_PASSWD4;
    private String OLD_PASSWD5;
    private String OLD_PASSWD6;
    private String OLD_PASSWD7;
    private String OLD_PASSWD8;
    private String OLD_PASSWD9;
    private String PASSWD_LOCK;
    private int SESS_TM_OUT;
    private String LINE_PRT1;
    private String LINE_PRT2;
    private String LINE_PRT3;
    private Date EXPI_DT;
    private String HQ_OP_NO;
    private String REG_EMP_NO;
    private Date REG_DT;
    private String REG_TM;
    private String UPD_EMP_NO;
    private Date UPD_DT;
    private String UPD_TM;
    private String RAND_SALT;

    public ACOM_COMH_USER_DTO() {
    }
} 
