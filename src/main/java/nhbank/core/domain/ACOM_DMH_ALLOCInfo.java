package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_DMH_ALLOC") 
@Data 
public class ACOM_DMH_ALLOCInfo implements Serializable { 
@Id 
@GeneratedValue 
private int allocAmt; 
private Date lstAcIl; 
private Date regDt; 
private String updEmpNo; 
private String cixNo; 
private int allocRatio; 
private String damboNo; 
private String sts; 
private int seqNo; 
private Date updDt; 
private int lstHisNo; 
private String sngNo; 
private String mngBr; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
