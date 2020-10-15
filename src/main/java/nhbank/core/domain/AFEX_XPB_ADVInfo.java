package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPB_ADV") 
@Data 
public class AFEX_XPB_ADVInfo implements Serializable { 
@Id 
@GeneratedValue 
private int ncuHdAmt; 
private String trsfApplNm; 
private String updEmpNo; 
private int misuBamt; 
private Date beLcaIl; 
private String sts; 
private String caGb; 
private int ncuLessCaAmt; 
private Date updDt; 
private int lessCoAmt; 
private Date sdTrIl; 
private String ijGb; 
private String regEmpNo; 
private String mt103DocId; 
private Date gisIl; 
private int hdAmt; 
private String junNo1; 
private int ncuLessGtAmt; 
private String junNo2; 
private int hisNo; 
private int ncuMisuAmt; 
private String junNo3; 
private int amt; 
private String ncuCcy; 
private String sonikGb; 
private int misuAmt; 
private String trsfRefno; 
private int ncuLessCoAmt; 
private String buibGb; 
private String trsfAcct; 
private int lessCaAmt; 
private String payDoYn; 
private int sonikAmt; 
private String jubGb; 
private String trsfBeneNm; 
private String plJiGb; 
private Date acIl; 
private String advGb; 
private Date manIl; 
private String refNo; 
private int ncuOverAmt; 
private String trsfAbano; 
private int junAmt; 
private Date regDt; 
private String yukNo; 
private String feeRcvBy; 
private Date lstIbIl; 
private Date caManIl; 
private String depoBkcd; 
private int ncuJunAmt; 
private String ccy; 
private int lessGtAmt; 
private String delayGb; 
private String updTm; 
private int ncuAmt; 
private int overAmt; 
private String regTm; 
} 
