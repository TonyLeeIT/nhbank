package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_INRT") 
@Data 
public class ADST_DPB_INRTInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private Date toIl; 
private int famt; 
private int hisNo; 
private Date fromIl; 
private String updEmpNo; 
private String acctNo; 
private String sts; 
private Date updDt; 
private int intRt; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
