package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_LNB_INT") 
@Data 
public class ADST_LNB_INTInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trCd; 
private String updEmpNo; 
private int intSRt; 
private int intDays; 
private int schSubNo; 
private int intDsAmt; 
private int bbsCvtAmt; 
private String intGb; 
private int bizSubseq; 
private Date intFromIl; 
private Date lstDealIl; 
private String sts; 
private int seqNo; 
private Date updDt; 
private String refNo; 
private String spreadGb; 
private int usdCvtAmt; 
private String regEmpNo; 
private Date regDt; 
private int schSeq; 
private int hisNo; 
private Date lstIbIl; 
private Date intRcvIl; 
private int intORt; 
private Date bfJsLisuIl; 
private int spreadRt; 
private Date fstIbIl; 
private int intAmt; 
private int indexRt; 
private Date bfPtLisuIl; 
private Date bfYcLisuIl; 
private String misuGb; 
private String ccy; 
private int adjSeq; 
private String trGb; 
private Date intToIl; 
private String updTm; 
private String rollGb; 
private int bizSeq; 
private String regTm; 
} 
