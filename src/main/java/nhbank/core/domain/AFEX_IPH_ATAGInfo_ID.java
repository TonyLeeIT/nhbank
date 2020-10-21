package nhbank.core.domain; 
 
import lombok.Data; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
 
@Data 
public class AFEX_IPH_ATAGInfo_ID implements Serializable { 
private String refNo; 
private String amdSeq; 
private String tagCd; 
private BigDecimal seq; 
} 
