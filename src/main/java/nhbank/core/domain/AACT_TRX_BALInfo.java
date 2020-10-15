package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AACT_TRX_BAL") 
@Data 
public class AACT_TRX_BALInfo implements Serializable { 
@Id 
@GeneratedValue 
private String subjCd; 
private String opNo; 
private String idNo; 
private Date regDt; 
private String updEmpNo; 
private String cixNo; 
private String dtlsBalDvCd; 
private String balDvCd; 
private String sts; 
private Date updDt; 
private String refNo; 
private int balAmt; 
private String ccy; 
private String brNo; 
private String atitCd; 
private Date apclStrDt; 
private Date apclEndDt; 
private String updTm; 
private String ifrsDvCd; 
private String regEmpNo; 
private String regTm; 
} 
