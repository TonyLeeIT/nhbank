package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_BFH_PAY") 
@Data 
public class AFEX_BFH_PAYInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date confirmIl; 
private String jgBknm; 
private String updEmpNo; 
private String condSts; 
private String feeCcy; 
private int tranAmt; 
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
private String regEmpNo; 
private Date gisIl; 
private String jgBkcd; 
private String payDocid; 
private int hisNo; 
private String msgType; 
private String jgBkAcct; 
private String payGb; 
private String feeGb; 
private String beneBknm; 
private String beneAddr1; 
private String sendRefNo; 
private Date refundIl; 
private String procType; 
private String beneAddr3; 
private String beneAddr2; 
private Date valueIl; 
private String setlBkcd; 
private Date acIl; 
private String refNo; 
private String beneBkcd; 
private Date regDt; 
private String tranCcy; 
private int refundAmt; 
private String setlDepo; 
private String setlAddr2; 
private String recvRefNo; 
private String setlAddr3; 
private int feeAmt; 
private String setlAddr1; 
private String remark1; 
private Date lstIbIl; 
private String remark3; 
private String setlBknm; 
private String beneAcct; 
private String remark2; 
private String remark5; 
private String remark4; 
private String vcbDownYn; 
private String remark6; 
private Date makeIl; 
private String updTm; 
private int payCnt; 
private String regTm; 
} 
