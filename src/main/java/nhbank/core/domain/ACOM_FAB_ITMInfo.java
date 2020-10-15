package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_FAB_ITM") 
@Data 
public class ACOM_FAB_ITMInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private Date gisIl; 
private int hisNo; 
private String drGb; 
private String updEmpNo; 
private Date lstIbIl; 
private String itmCd; 
private int afItm1; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private String afItm; 
private String updTm; 
private int beItm1; 
private String beItm; 
private String regEmpNo; 
private String regTm; 
} 
