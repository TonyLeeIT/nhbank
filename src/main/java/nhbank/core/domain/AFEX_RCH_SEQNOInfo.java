package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RCH_SEQNO") 
@Data 
public class AFEX_RCH_SEQNOInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private String cd; 
private Date trIl; 
private int seqno; 
private Date updDt; 
private String ccy; 
private String updEmpNo; 
private String saGb; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
