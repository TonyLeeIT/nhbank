package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COMH_TAGLINE") 
@Data 
public class ACOM_COMH_TAGLINEInfo implements Serializable { 
@Id 
@GeneratedValue 
private String docId; 
private Date regDt; 
private String lineType; 
private String updEmpNo; 
private String tagNo; 
private String tagGb; 
private int subNo; 
private String lineData; 
private int seqNo; 
private Date updDt; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
