package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_ATB_BASE") 
@Data 
public class ACOM_ATB_BASEInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trType; 
private String lstIbTime; 
private String trsfTp; 
private String purposeCd; 
private int procTimes; 
private String frCixNo; 
private String rtgsTp; 
private String updEmpNo; 
private String applRmrk; 
private String frAcctNo; 
private String feeFreeYn; 
private String rcvAddr; 
private String sts; 
private Date updDt; 
private String refNo; 
private Date opnDt; 
private String channelType; 
private String trsfDtRule; 
private String type; 
private String retryYn; 
private String regEmpNo; 
private int limitAmt; 
private Date regDt; 
private String relApplyNo; 
private int trAmt; 
private String multiKey; 
private int feeAmt; 
private int dueTimes; 
private String dueType; 
private String ourRef; 
private String toCustNm; 
private String rmteAcctDpKindCd; 
private String cixNo; 
private String toRefNo; 
private String rcvRmrk; 
private Date expDt; 
private String mgntBrNo; 
private String payerInf; 
private String ccy; 
private int depTimes; 
private Date lstIbDt; 
private int totTimes; 
private String toBankCd; 
private String updTm; 
private int dueDay; 
private String regTm; 
} 
