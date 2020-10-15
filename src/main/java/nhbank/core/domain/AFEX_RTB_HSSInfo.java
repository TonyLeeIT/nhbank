package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RTB_HSS") 
@Data 
public class AFEX_RTB_HSSInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private int famt; 
private String trCd; 
private int trscSeqNo; 
private String hssGb; 
private String hssApGb; 
private String updEmpNo; 
private Date lstIbIl; 
private String sdBrNo; 
private String sdDepoCd; 
private int hssFee; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private String ccy; 
private int bamt; 
private Date icheIl; 
private String chargeType; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
