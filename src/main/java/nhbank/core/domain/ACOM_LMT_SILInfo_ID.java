package nhbank.core.domain; 
 
import lombok.Data; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
 
@Data 
public class ACOM_LMT_SILInfo_ID implements Serializable { 
private String sngNo; 
private String actCd; 
private String silCcy; 
} 
