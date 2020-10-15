package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPH_SHIP") 
@Data 
public class AFEX_XPH_SHIPInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private Date updDt; 
private String refNo; 
private String updEmpNo; 
private String updTm; 
private int seq; 
private String regEmpNo; 
private String regTm; 
} 
