package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RTB_BASE") 
@Data 
public class AFEX_RTB_BASEInfo implements Serializable { 
@Id 
@GeneratedValue 
private String idNo; 
private Date regDt; 
private int buyFamt; 
private int frtRt; 
private String updEmpNo; 
private String sayuCd; 
private Date lstIbIl; 
private String selCcy; 
private String cixNo; 
private String frtGb; 
private String cixNm; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private String nationCd; 
private String buyCcy; 
private int selFamt; 
private int exHrt; 
private int frtAmt; 
private String updTm; 
private String rateAmtGb; 
private String remark; 
private String regEmpNo; 
private String regTm; 
} 
