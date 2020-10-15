package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_CIX_LOCAL") 
@Data 
public class ACOM_CIX_LOCALInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private String itemNm; 
private Date updDt; 
private String updEmpNo; 
private String regDvCd; 
private String cixNo; 
private String updTm; 
private String itemCtt; 
private String regEmpNo; 
private String regTm; 
} 
