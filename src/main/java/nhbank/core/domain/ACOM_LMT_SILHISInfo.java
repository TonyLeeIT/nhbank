package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_LMT_SILHIS") 
@Data 
public class ACOM_LMT_SILHISInfo implements Serializable { 
@Id 
@GeneratedValue 
private int trxFamt; 
private int gurFjan; 
private String trCd; 
private String upmuCd; 
private String georCd; 
private String mngNo; 
private String updEmpNo; 
private String actCd; 
private int silAmt; 
private int gurBamt; 
private String silGb; 
private int trxBamt; 
private String sdBr; 
private String sts; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private String gurFpmgb; 
private String sngNo; 
private int gurBjan; 
private String gurBpmgb; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private String silCcy; 
private Date gisIl; 
private int hisNo; 
private int trscSeqNo; 
private int djgAmt; 
private Date ibIl; 
private String djgPmgb; 
private int gurFamt; 
private String trTime; 
private String trBr; 
private String silPmgb; 
private int djgJan; 
private int silJan; 
private String updTm; 
private String regTm; 
} 
