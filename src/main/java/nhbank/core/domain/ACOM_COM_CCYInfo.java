package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COM_CCY") 
@Data 
public class ACOM_COM_CCYInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private String cd; 
private String gosiGb; 
private int unit; 
private String updEmpNo; 
private int digit; 
private String ctryCd; 
private int seqNo; 
private Date updDt; 
private Date makeIl; 
private String updTm; 
private String bokCd; 
private int yearGb; 
private String nm; 
private String regEmpNo; 
private String regTm; 
} 
