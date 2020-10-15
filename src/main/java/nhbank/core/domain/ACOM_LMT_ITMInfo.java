package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_LMT_ITM") 
@Data 
public class ACOM_LMT_ITMInfo implements Serializable { 
@Id 
@GeneratedValue 
private String beAitm01; 
private String beAitm02; 
private String afAitm02; 
private String afAitm01; 
private String afAitm04; 
private String afAitm03; 
private int beNitm; 
private String updEmpNo; 
private int afNitm; 
private Date acIl; 
private Date updDt; 
private String sngNo; 
private String regEmpNo; 
private String beAitm10; 
private Date regDt; 
private Date gisIl; 
private String afAitm10; 
private Date lstIbIl; 
private String itmCd; 
private String beAitm07; 
private String afAitm06; 
private String beAitm08; 
private String afAitm05; 
private String trGb; 
private String beAitm09; 
private String afAitm08; 
private String afAitm07; 
private String beAitm03; 
private String updTm; 
private String beAitm04; 
private String afAitm09; 
private int seq; 
private String beAitm05; 
private String beAitm06; 
private String regTm; 
} 
