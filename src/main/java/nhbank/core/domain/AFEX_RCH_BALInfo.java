package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RCH_BAL") 
@Data 
public class AFEX_RCH_BALInfo implements Serializable { 
@Id 
@GeneratedValue 
private String docId; 
private Date regDt; 
private String cd; 
private Date trIl; 
private String actConfirmYn; 
private int shwClbs; 
private String updEmpNo; 
private String operId; 
private String shwConfirmYn; 
private Date lastIl; 
private String sts; 
private Date updDt; 
private String ccy; 
private int shwOpbs; 
private int actClbs; 
private int actOpbs; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
