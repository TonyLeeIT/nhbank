package nhbank.core.domain; 
 
import lombok.Data; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
 
@Data 
public class ACOM_COMH_TAGLINEInfo_ID implements Serializable { 
private String docId; 
private BigDecimal seqNo; 
} 
