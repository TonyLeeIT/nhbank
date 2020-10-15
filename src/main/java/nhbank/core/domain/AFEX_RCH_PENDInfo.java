package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RCH_PEND") 
@Data 
public class AFEX_RCH_PENDInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date trIl; 
private String upmuCd; 
private int origAmt; 
private String updEmpNo; 
private String otherRef; 
private Date updDt; 
private String origRef; 
private Date valIl; 
private String ibTime; 
private String saGb; 
private String regEmpNo; 
private String docId; 
private Date regDt; 
private String cd; 
private String inidCd; 
private String ourRef; 
private Date ibIl; 
private String operId; 
private String nrefCnt; 
private int bunhalSeq; 
private String confirmYn; 
private int drcrAmt; 
private String drcrGb; 
private String theirRef; 
private String ccy; 
private int trSeq; 
private int refHisNo; 
private String cancelYn; 
private String updTm; 
private String regTm; 
} 
