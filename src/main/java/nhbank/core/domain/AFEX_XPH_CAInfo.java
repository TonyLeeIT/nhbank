package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPH_CA") 
@Data 
public class AFEX_XPH_CAInfo implements Serializable { 
@Id 
@GeneratedValue 
private int ncuLessCoAmt; 
private String divRef; 
private String mtTrMd; 
private String updEmpNo; 
private String ccGb; 
private int lessCaAmt; 
private String caCcy; 
private String sts; 
private int caAmt; 
private String rcvGb; 
private int ncuLessCaAmt; 
private int seqNo; 
private Date updDt; 
private String refNo; 
private int lessCoAmt; 
private int ncuOverAmt; 
private Date rcvIl; 
private String divGb; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private Date sdBalIl; 
private int ncuLessGtAmt; 
private String ncuCaCcy; 
private String ccRtCd; 
private String cdGb; 
private Date caIl; 
private String swiftKey; 
private String depoBkcd; 
private Date ccIl; 
private String depoCd; 
private int ncuCaAmt; 
private int lessGtAmt; 
private String trGb; 
private String updTm; 
private int overAmt; 
private String regTm; 
} 
