package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_LNB_FEE") 
@Data 
public class ADST_LNB_FEEInfo implements Serializable { 
@Id 
@GeneratedValue 
private int bizNo; 
private int feeDsBamt; 
private String updEmpNo; 
private int schSubNo; 
private Date feeFrIl; 
private String sts; 
private int seqNo; 
private int feeORt; 
private Date updDt; 
private String refNo; 
private Date feeToIl; 
private String rateAmtGb; 
private int feeDsAmt; 
private String regEmpNo; 
private Date lstAcIl; 
private Date regDt; 
private int feeAmt; 
private int schSeq; 
private int hisNo; 
private int feeSRt; 
private int feeDays; 
private Date lstIbIl; 
private Date fstIbIl; 
private String feeGb; 
private String ccy; 
private int adjSeq; 
private Date feeRcvIl; 
private String updTm; 
private String regTm; 
} 
