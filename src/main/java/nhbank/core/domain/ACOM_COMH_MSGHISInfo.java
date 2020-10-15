package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COMH_MSGHIS") 
@Data 
public class ACOM_COMH_MSGHISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String docId; 
private String opNo; 
private Date regDt; 
private String updEmpNo; 
private String condSts; 
private String makeTime; 
private String makeTty; 
private int seqNo; 
private Date updDt; 
private String stmTail; 
private String stmRmk; 
private Date makeIl; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
