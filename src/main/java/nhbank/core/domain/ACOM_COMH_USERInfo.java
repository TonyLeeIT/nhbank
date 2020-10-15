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
private String linePrt2; 
private String loginTime; 
private String linePrt1; 
private Date expiDt; 
private String fnm; 
private String grpId; 
private String opGb; 
private String linePrt3; 
private String updEmpNo; 
private String sjum; 
private String ipAddr; 
private String dealerYn; 
private String sts; 
private String tellNo; 
private String oldPasswd6; 
private String oldPasswd7; 
private Date updDt; 
private String oldPasswd8; 
private String oldPasswd9; 
private String randSalt; 
private String type; 
private String ajum; 
private String regEmpNo; 
private String opNo; 
private String cjum; 
private Date passwdIl; 
private String openUser; 
private String grantYn; 
private String oldPasswd2; 
private String oldPasswd3; 
private String grpNo; 
private String oldPasswd4; 
private String oldPasswd5; 
private String tgb; 
private String oldPasswd0; 
private String oldPasswd1; 
private String password; 
private Date logoutIl; 
private Date openIl; 
private int sessTmOut; 
private String knm; 
private String tseq; 
private String dealerNo; 
private String logoutTime; 
private String passwdLock; 
private Date regDt; 
private String hqOpNo; 
private String seniorOpNo; 
private Date lstIbIl; 
private Date loginIl; 
private String loginYn; 
private String updTm; 
private String regTm; 
} 
