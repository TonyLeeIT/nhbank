package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPB_BDM") 
@Data 
public class AFEX_XPB_BDMInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private Date gisIl; 
private int hisNo; 
private int amt; 
private String budoCd; 
private String updEmpNo; 
private Date lstIbIl; 
private String bmGb; 
private int miSeq; 
private int miShBamt; 
private String ncuCcy; 
private int shSeq; 
private int shSumAmt; 
private String sts; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private String ccy; 
private int miTrBamt; 
private int ncuShSumAmt; 
private String updTm; 
private int ncuAmt; 
private String regEmpNo; 
private String regTm; 
} 
