package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPB_RENEDT") 
@Data 
public class AFEX_XPB_RENEDTInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private int amt; 
private String updEmpNo; 
private Date caIl; 
private String reneJum; 
private Date mngIl; 
private String ncuCcy; 
private Date reneIl; 
private String sts; 
private int caAmt; 
private Date preCaIl; 
private Date updDt; 
private String refNo; 
private String ccy; 
private int bamt; 
private String updTm; 
private int ncuAmt; 
private String regEmpNo; 
private String regTm; 
} 
