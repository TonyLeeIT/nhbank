package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFIF_MTH_HIS") 
@Data 
public class AFIF_MTH_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trCd; 
private String updEmpNo; 
private String userId; 
private String cdSngNo; 
private String sdBr; 
private int cdSilSeq; 
private String sndDocNo; 
private String sts; 
private Date acIl; 
private int trBamt; 
private Date updDt; 
private String refNo; 
private int trFamt; 
private String ftpSngNo; 
private Date canIl; 
private int ftpSilSeq; 
private String regEmpNo; 
private Date regDt; 
private Date gisIl; 
private String ibjiMd; 
private int sdHisNo; 
private int hisNo; 
private Date lstIbIl; 
private int afJan; 
private Date ibIl; 
private String managerId; 
private String trTime; 
private String trBr; 
private String trGb; 
private String updTm; 
private String trCcy; 
private String frontSndGb; 
private String regTm; 
} 
