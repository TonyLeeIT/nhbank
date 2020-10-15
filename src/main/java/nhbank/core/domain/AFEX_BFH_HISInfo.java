package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_BFH_HIS") 
@Data 
public class AFEX_BFH_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trCd; 
private String updEmpNo; 
private int beforeAmt; 
private int afterAmt; 
private String sts; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private String bfRecvRefNo; 
private Date canIl; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private Date gisIl; 
private int sdHisNo; 
private int hisNo; 
private String bfRecvBkcd; 
private String cixNo; 
private Date ibIl; 
private String bfRecvDepo; 
private String bfBaseSts; 
private int bfChAmt; 
private String trGb; 
private String mngBr; 
private String updTm; 
private String regTm; 
} 
