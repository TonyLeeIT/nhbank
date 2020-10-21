package nhbank.core.domain; 
 
import lombok.Data; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
 
@Data 
public class ADST_DPB_INTMInfo_ID implements Serializable { 
private String acctNo; 
private Date ibIl; 
private Date gisIl; 
private BigDecimal intSeq; 
} 
