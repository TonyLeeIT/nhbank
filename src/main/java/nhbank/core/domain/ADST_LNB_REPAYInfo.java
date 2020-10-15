package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_LNB_REPAY") 
@Data 
public class ADST_LNB_REPAYInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private Date repayIl; 
private int schSeq; 
private Date fstDealIl; 
private int hisNo; 
private String updEmpNo; 
private Date lstIbIl; 
private int schSubNo; 
private int bbsCvtAmt; 
private String intGb; 
private int repayAmt; 
private Date lstDealIl; 
private String sts; 
private int seqNo; 
private Date updDt; 
private String ycGb; 
private String refNo; 
private String ccy; 
private int adjSeq; 
private int usdCvtAmt; 
private String repayStyle; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
