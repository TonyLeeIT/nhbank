package nhbank.core.domain; 
 
import lombok.Data; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
 
@Data 
public class ADST_DPB_BURIInfo_ID implements Serializable { 
private String acctNo; 
private Date buriIl; 
} 
