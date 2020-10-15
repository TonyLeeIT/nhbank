package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_GYUL") 
@Data 
public class ADST_DPB_GYULInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private int intTax1; 
private int intTax2; 
private String yede; 
private int hisNo; 
private String lstTime; 
private String updEmpNo; 
private Date lstIbIl; 
private String acctNo; 
private String errMsg; 
private Date ibIl; 
private String sts; 
private int intYcInt; 
private String errNo; 
private Date updDt; 
private String errPgm; 
private int prcpYcInt; 
private int mmAvgAmt; 
private String updTm; 
private int jsInt; 
private String regEmpNo; 
private String regTm; 
} 
