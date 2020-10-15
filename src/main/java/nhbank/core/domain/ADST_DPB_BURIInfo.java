package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_BURI") 
@Data 
public class ADST_DPB_BURIInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private int prcpOverDueIntRt; 
private int lonIntYcInt; 
private Date termIl; 
private int lonPrcpYcInt; 
private String updEmpNo; 
private String acctNo; 
private int lonSngAmt; 
private int intOverDueIntRt; 
private String lonRtCd; 
private int maxJan; 
private Date buriIl; 
private int lonOvrAmt; 
private Date updDt; 
private String lonYdCd; 
private int lonRt; 
private int colLonInt; 
private String updTm; 
private int fstJan; 
private int buriJan; 
private String regEmpNo; 
private String regTm; 
} 
