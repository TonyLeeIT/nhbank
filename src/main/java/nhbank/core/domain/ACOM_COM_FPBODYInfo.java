package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COM_FPBODY") 
@Data 
public class ACOM_COM_FPBODYInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private String prtKind; 
private Date updDt; 
private int hisNo; 
private int lineSeq; 
private String lineTxt; 
private String refNo; 
private String updEmpNo; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
