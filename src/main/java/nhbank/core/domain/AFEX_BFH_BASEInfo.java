package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_BFH_BASE") 
@Data 
public class AFEX_BFH_BASEInfo implements Serializable { 
@Id 
@GeneratedValue 
private String recvGb; 
private String jgBknm; 
private String updEmpNo; 
private String intAddr3; 
private String condSts; 
private String intAddr2; 
private String intAddr1; 
private String tag72Info1; 
private String tag72Info2; 
private String tag72Info3; 
private String tag72Info4; 
private String tag72Info5; 
private Date updDt; 
private String tag72Info6; 
private Date lstIl; 
private String jgBkAddr1; 
private String jgBkAddr2; 
private String noddctYn; 
private String jgBkAddr3; 
private String recvBr; 
private String regEmpNo; 
private Date gisIl; 
private String jgBkcd; 
private String recvDocid; 
private int recvAmt; 
private String curCcy; 
private String sendBkcd; 
private String ignoreYn; 
private String msgType; 
private String jgBkAcct; 
private String intBknm; 
private String beneBknm; 
private String sendAddr1; 
private String sendAddr3; 
private String sendAddr2; 
private String beneAddr1; 
private String sendRefNo; 
private String beneAddr3; 
private String beneAddr2; 
private Date valueIl; 
private Date recvIl; 
private String bftGb; 
private String recvCcy; 
private Date acIl; 
private int seqNo; 
private String intBkcd; 
private String refNo; 
private String beneBkcd; 
private Date regDt; 
private String recvRefNo; 
private Date lstIbIl; 
private String beneAcct; 
private String cixNo; 
private int curAmt; 
private String sendBknm; 
private Date makeIl; 
private String sendDepo; 
private String updTm; 
private int payCnt; 
private String regTm; 
} 
