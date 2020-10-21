package nhbank.core.domain; 
 
import lombok.Data; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
 
@Data 
public class AFEX_ADH_HISInfo_ID implements Serializable { 
private String advNo; 
private BigDecimal hisNo; 
} 
