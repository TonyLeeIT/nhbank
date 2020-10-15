package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COMH_USER") 
@Data 
public class ACOM_COMH_USERInfo implements Serializable { 
@Id 
@GeneratedValue 
private String LINE_PRT2; 
private String LOGIN_TIME; 
private String LINE_PRT1; 
private Date EXPI_DT; 
private String FNM; 
private String GRP_ID; 
private String OP_GB; 
private String LINE_PRT3; 
private String UPD_EMP_NO; 
private String SJUM; 
private String IP_ADDR; 
private String DEALER_YN; 
private String STS; 
private String TELL_NO; 
private String OLD_PASSWD6; 
private String OLD_PASSWD7; 
private Date UPD_DT; 
private String OLD_PASSWD8; 
private String OLD_PASSWD9; 
private String RAND_SALT; 
private String TYPE; 
private String AJUM; 
private String REG_EMP_NO; 
private String OP_NO; 
private String CJUM; 
private Date PASSWD_IL; 
private String OPEN_USER; 
private String GRANT_YN; 
private String OLD_PASSWD2; 
private String OLD_PASSWD3; 
private String GRP_NO; 
private String OLD_PASSWD4; 
private String OLD_PASSWD5; 
private String TGB; 
private String OLD_PASSWD0; 
private String OLD_PASSWD1; 
private String PASSWORD; 
private Date LOGOUT_IL; 
private Date OPEN_IL; 
private int SESS_TM_OUT; 
private String KNM; 
private String TSEQ; 
private String DEALER_NO; 
private String LOGOUT_TIME; 
private String PASSWD_LOCK; 
private Date REG_DT; 
private String HQ_OP_NO; 
private String SENIOR_OP_NO; 
private Date LST_IB_IL; 
private Date LOGIN_IL; 
private String LOGIN_YN; 
private String UPD_TM; 
private String REG_TM; 
} 
