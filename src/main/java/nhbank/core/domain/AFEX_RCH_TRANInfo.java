package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RCH_TRAN") 
@Data 
public class AFEX_RCH_TRANInfo implements Serializable { 
@Id 
@GeneratedValue 
private String docId; 
private Date regDt; 
private String cd; 
private Date trIl; 
private String ourRef; 
private String updEmpNo; 
private String otherRef; 
private Date ibIl; 
private int drcrAmt; 
private Date updDt; 
private String drcrGb; 
private String theirRef; 
private String mtGb; 
private String ccy; 
private int trSeq; 
private Date valIl; 
private String ibTime; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
