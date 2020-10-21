package nhbank.core.domain; 
 
import lombok.Data; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
 
@Data 
public class AFEX_RCH_RECONInfo_ID implements Serializable { 
private String cd; 
private String ccy; 
private String saGb; 
private Date trIl; 
private BigDecimal trSeq; 
private Date reconIl; 
} 
