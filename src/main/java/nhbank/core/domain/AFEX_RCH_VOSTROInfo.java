package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RCH_VOSTRO") 
@Data 
public class AFEX_RCH_VOSTROInfo implements Serializable { 
@Id 
@GeneratedValue 
private String opNo; 
private Date regDt; 
private int hisNo; 
private String updEmpNo; 
private Date ibIl; 
private Date acIl; 
private int seqNo; 
private int cdAmt; 
private Date updDt; 
private Date valIl; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
