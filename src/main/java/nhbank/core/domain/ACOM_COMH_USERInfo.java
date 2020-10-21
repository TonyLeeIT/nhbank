package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_COMH_USERInfo_ID.class) 
@Table(name = "ACOM_COMH_USER") 
@Data 
public class ACOM_COMH_USERInfo implements Serializable { 
@Id 
@Column(name = "OP_NO") 
private String opNo; 
@Column(name = "PASSWORD") 
private String password; 
@Column(name = "STS") 
private String sts; 
@Column(name = "PASSWD_IL") 
private Date passwdIl; 
@Column(name = "OP_GB") 
private String opGb; 
@Column(name = "KNM") 
private String knm; 
@Column(name = "FNM") 
private String fnm; 
@Column(name = "OPEN_IL") 
private Date openIl; 
@Column(name = "OPEN_USER") 
private String openUser; 
@Column(name = "CJUM") 
private String cjum; 
@Column(name = "AJUM") 
private String ajum; 
@Column(name = "SJUM") 
private String sjum; 
@Column(name = "GRP_NO") 
private String grpNo; 
@Column(name = "DEALER_NO") 
private String dealerNo; 
@Column(name = "DEALER_YN") 
private String dealerYn; 
@Column(name = "TGB") 
private String tgb; 
@Column(name = "TYPE") 
private String type; 
@Column(name = "TSEQ") 
private String tseq; 
@Column(name = "TELL_NO") 
private String tellNo; 
@Column(name = "GRP_ID") 
private String grpId; 
@Column(name = "IP_ADDR") 
private String ipAddr; 
@Column(name = "GRANT_YN") 
private String grantYn; 
@Column(name = "LOGIN_IL") 
private Date loginIl; 
@Column(name = "LOGOUT_IL") 
private Date logoutIl; 
@Column(name = "LOGIN_YN") 
private String loginYn; 
@Column(name = "LOGIN_TIME") 
private String loginTime; 
@Column(name = "LOGOUT_TIME") 
private String logoutTime; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "SENIOR_OP_NO") 
private String seniorOpNo; 
@Column(name = "OLD_PASSWD0") 
private String oldPasswd0; 
@Column(name = "OLD_PASSWD1") 
private String oldPasswd1; 
@Column(name = "OLD_PASSWD2") 
private String oldPasswd2; 
@Column(name = "OLD_PASSWD3") 
private String oldPasswd3; 
@Column(name = "OLD_PASSWD4") 
private String oldPasswd4; 
@Column(name = "OLD_PASSWD5") 
private String oldPasswd5; 
@Column(name = "OLD_PASSWD6") 
private String oldPasswd6; 
@Column(name = "OLD_PASSWD7") 
private String oldPasswd7; 
@Column(name = "OLD_PASSWD8") 
private String oldPasswd8; 
@Column(name = "OLD_PASSWD9") 
private String oldPasswd9; 
@Column(name = "PASSWD_LOCK") 
private String passwdLock; 
@Column(name = "SESS_TM_OUT") 
private BigDecimal sessTmOut; 
@Column(name = "LINE_PRT1") 
private String linePrt1; 
@Column(name = "LINE_PRT2") 
private String linePrt2; 
@Column(name = "LINE_PRT3") 
private String linePrt3; 
@Column(name = "EXPI_DT") 
private Date expiDt; 
@Column(name = "HQ_OP_NO") 
private String hqOpNo; 
@Column(name = "REG_EMP_NO") 
private String regEmpNo; 
@Column(name = "REG_DT") 
private Date regDt; 
@Column(name = "REG_TM") 
private String regTm; 
@Column(name = "UPD_EMP_NO") 
private String updEmpNo; 
@Column(name = "UPD_DT") 
private Date updDt; 
@Column(name = "UPD_TM") 
private String updTm; 
@Column(name = "RAND_SALT") 
private String randSalt; 
} 
