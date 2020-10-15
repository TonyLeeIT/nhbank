package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_LMT_SIL") 
@Data 
public class ACOM_LMT_SILInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private String silCcy; 
private String updEmpNo; 
private int djgAmt; 
private String actCd; 
private int silAmt; 
private int gurBamt; 
private int gurFamt; 
private Date updDt; 
private Date fstIl; 
private String sngNo; 
private Date lstIl; 
private Date lstIbil; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
