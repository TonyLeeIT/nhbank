package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_IPB_AMD") 
@Data 
public class AFEX_IPB_AMDInfo implements Serializable { 
@Id 
@GeneratedValue 
private String updEmpNo; 
private int tcDsamt; 
private Date beTcLisuIl; 
private String sts; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private String regEmpNo; 
private String amdCd; 
private Date beExpIl; 
private Date regDt; 
private Date afExpIl; 
private Date gisIl; 
private String beLess; 
private String beCcy; 
private int hisNo; 
private String afMore; 
private Date lstIbIl; 
private String beMore; 
private String afCcy; 
private int bojJukYul; 
private int beAmt; 
private String reReGb; 
private String afLess; 
private String ccy; 
private int idAmt; 
private String updTm; 
private int seq; 
private int afAmt; 
private String regTm; 
} 
