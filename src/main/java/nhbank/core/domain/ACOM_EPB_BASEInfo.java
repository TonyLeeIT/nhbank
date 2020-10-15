package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_EPB_BASE") 
@Data 
public class ACOM_EPB_BASEInfo implements Serializable { 
@Id 
@GeneratedValue 
private int assignCamt; 
private int plusAmt; 
private int addAmt; 
private int minusAmt; 
private int assignAmt; 
private String updEmpNo; 
private int drAmt; 
private int totalAmt; 
private String sts; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private int lstHisNo; 
private int crAmt; 
private Date lstIl; 
private String expCd; 
private String regEmpNo; 
private Date regDt; 
private Date lstIbIl; 
private String mngYy; 
private String busiCd; 
private Date ibIl; 
private int bjAmt; 
private int addCamt; 
private String ccy; 
private int allocateAmt; 
private String mngBr; 
private String updTm; 
private String regTm; 
} 
