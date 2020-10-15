package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_IPB_BLK") 
@Data 
public class AFEX_IPB_BLKInfo implements Serializable { 
@Id 
@GeneratedValue 
private int djbSeq; 
private int ncuGtAmt; 
private String setBkcd; 
private String updEmpNo; 
private int jilcBamt; 
private int jilcFamt; 
private int jilgBamt; 
private String sts; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private int jilgFamt; 
private String amtGb; 
private String regEmpNo; 
private Date regDt; 
private Date gisIl; 
private int gtAmt; 
private int hisNo; 
private int amt; 
private Date lstIbIl; 
private int sseq; 
private int sngSseq; 
private String junGb; 
private String setGb; 
private String ncuCcy; 
private int ncuJilcFamt; 
private String ccy; 
private String jagmGb; 
private String fjnNo; 
private String updTm; 
private int ncuAmt; 
private int ncuJilgFamt; 
private int seq; 
private String regTm; 
} 
