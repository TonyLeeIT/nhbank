package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPB_LGM") 
@Data 
public class AFEX_XPB_LGMInfo implements Serializable { 
@Id 
@GeneratedValue 
private int opNo; 
private Date regDt; 
private Date gisIl; 
private int hisNo; 
private String updEmpNo; 
private Date lstIbIl; 
private String hajaCd; 
private String sts; 
private Date acIl; 
private String trTime; 
private Date updDt; 
private String refNo; 
private String trBr; 
private String hajaMngInfo; 
private String hajaSayu; 
private String updTm; 
private String mjGb; 
private String regEmpNo; 
private String regTm; 
} 
