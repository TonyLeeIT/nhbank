package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RTB_HIS") 
@Data 
public class AFEX_RTB_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trCd; 
private String updEmpNo; 
private String userId; 
private String selCcy; 
private String preSts; 
private String sts; 
private Date acIl; 
private Date updDt; 
private String refNo; 
private String buyCcy; 
private int selFamt; 
private Date canIl; 
private String regEmpNo; 
private Date regDt; 
private int buyFamt; 
private Date gisIl; 
private int sdHisNo; 
private int hisNo; 
private Date lstIbIl; 
private Date ibIl; 
private String trTime; 
private String trBr; 
private String trGb; 
private int exHrt; 
private String updTm; 
private String regTm; 
} 
