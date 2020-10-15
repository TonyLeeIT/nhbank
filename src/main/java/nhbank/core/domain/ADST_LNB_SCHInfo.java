package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_LNB_SCH") 
@Data 
public class ADST_LNB_SCHInfo implements Serializable { 
@Id 
@GeneratedValue 
private int jsDsTerm; 
private int ptRcvAmt; 
private int pvAmt; 
private int ycRcvAmt; 
private Date fromIl; 
private String updEmpNo; 
private int planAmt; 
private Date fstPayIl; 
private int bbsCvtAmt; 
private int ycRt; 
private String sts; 
private Date ptLisuIl; 
private int pvRt; 
private Date updDt; 
private String spreadGb; 
private Date ycToIl; 
private int usdCvtAmt; 
private int payAmt; 
private String regEmpNo; 
private Date planIl; 
private Date toIl; 
private int ptAmt; 
private Date ptToIl; 
private Date ycFrIl; 
private Date ycLisuIl; 
private int lstSubNo; 
private int jsDsAmt; 
private int spreadRt; 
private int indexRt; 
private int jsAmt; 
private int dsTerm; 
private int adjSeq; 
private int makeHisNo; 
private int misuIntAmt; 
private int ycDsAmt; 
private int dsAmt; 
private int ptDsTerm; 
private int totalRt; 
private String fixGb; 
private int ycAmt; 
private int ycDsTerm; 
private int jsRcvAmt; 
private Date jsLisuIl; 
private int ptRt; 
private int fixAmt; 
private int seqNo; 
private String refNo; 
private Date jsFrIl; 
private String processGb; 
private Date lstAcIl; 
private Date regDt; 
private int schSeq; 
private Date lstIbIl; 
private Date jsToIl; 
private int ptDsAmt; 
private Date rateFixIl; 
private String schGb; 
private Date makeIl; 
private String ccy; 
private String updTm; 
private Date ptFrIl; 
private String regTm; 
} 
