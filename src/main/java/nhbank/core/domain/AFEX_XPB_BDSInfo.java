package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPB_BDS") 
@Data 
public class AFEX_XPB_BDSInfo implements Serializable { 
@Id 
@GeneratedValue 
private String updEmpNo; 
private int bdIja; 
private int sonikAmt; 
private int hcHija; 
private int budoSeq; 
private String sts; 
private Date acIl; 
private Date updDt; 
private int hdcAmt; 
private String refNo; 
private String regEmpNo; 
private Date regDt; 
private Date gisIl; 
private int hisNo; 
private int ncuHdcAmt; 
private int amt; 
private Date lstIbIl; 
private int ncuCaSumAmt; 
private int bdcAmt; 
private String ncuCcy; 
private int caSumAmt; 
private String hJiGb; 
private String sonikGb; 
private String ccy; 
private int bamt; 
private String updTm; 
private int ncuAmt; 
private String regTm; 
} 
