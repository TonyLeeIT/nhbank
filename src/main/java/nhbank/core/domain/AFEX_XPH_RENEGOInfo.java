package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPH_RENEGO") 
@Data 
public class AFEX_XPH_RENEGOInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date trIl; 
private String updEmpNo; 
private String ccGb; 
private int dcAmt; 
private String negoCcy; 
private String reimBkcd; 
private String sts; 
private int cable; 
private int collAmt; 
private String collBkcd; 
private Date updDt; 
private int exprAmt; 
private String refNo; 
private int negoAmt; 
private String regEmpNo; 
private Date regDt; 
private String yukNo; 
private String ncuNegoCcy; 
private int hijaAmt; 
private String exprCcy; 
private String ccRtCd; 
private Date exprIl; 
private String m999Nm; 
private Date negoIl; 
private String reimBknm; 
private String collBknm; 
private Date ccIl; 
private String reneGb; 
private String m202Nm; 
private String updTm; 
private int ncuNegoAmt; 
private String regTm; 
} 
