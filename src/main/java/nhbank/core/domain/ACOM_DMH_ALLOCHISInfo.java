package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_DMH_ALLOCHIS") 
@Data 
public class ACOM_DMH_ALLOCHISInfo implements Serializable { 
@Id 
@GeneratedValue 
private int allocAmt; 
private String opNo; 
private Date regDt; 
private Date gisIl; 
private int hisNo; 
private String mngNo; 
private String updEmpNo; 
private String cixNo; 
private int allocRatio; 
private Date ibIl; 
private String sdBr; 
private String damboNo; 
private String sts; 
private Date acIl; 
private String trTime; 
private int seqNo; 
private Date updDt; 
private String trBr; 
private String sngNo; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
