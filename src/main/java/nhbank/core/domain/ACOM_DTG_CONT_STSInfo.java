package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_DTG_CONT_STS") 
@Data 
public class ACOM_DTG_CONT_STSInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private String updEmpNo; 
private String acctNo; 
private Date trxDt; 
private String bfContSts; 
private String afContSts; 
private int seqNo; 
private Date updDt; 
private String refNo; 
private String brNo; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
