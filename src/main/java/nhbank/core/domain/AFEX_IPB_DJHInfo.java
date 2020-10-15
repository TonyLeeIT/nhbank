package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_IPB_DJH") 
@Data 
public class AFEX_IPB_DJHInfo implements Serializable { 
@Id 
@GeneratedValue 
private String hoiGb; 
private Date regDt; 
private Date gisIl; 
private int ijaBamt; 
private int ijaFrt; 
private int hisNo; 
private String updEmpNo; 
private Date lstIbIl; 
private int sseq; 
private int ijaDsTerm; 
private String sts; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private String ccy; 
private int bamt; 
private Date ijaToIl; 
private Date ijaFrIl; 
private String updTm; 
private int seq; 
private Date beLstHoiIl; 
private int dsAmt; 
private String regEmpNo; 
private String regTm; 
} 
