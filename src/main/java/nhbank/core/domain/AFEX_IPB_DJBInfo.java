package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_IPB_DJB") 
@Data 
public class AFEX_IPB_DJBInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private Date gisIl; 
private String djbGb; 
private int hisNo; 
private Date lisuIl; 
private String updEmpNo; 
private Date lstIbIl; 
private int krSeq; 
private int blkSseq; 
private int djhGun; 
private int expGun; 
private String sts; 
private Date acIl; 
private int shGun; 
private Date updDt; 
private int jan; 
private String refNo; 
private String ccy; 
private int bamt; 
private Date lstHoiIl; 
private String updTm; 
private int seq; 
private String regEmpNo; 
private String regTm; 
} 
