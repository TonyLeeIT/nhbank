package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPH_TRA") 
@Data 
public class AFEX_XPH_TRAInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private Date gisIl; 
private int hisNo; 
private String mtGubun; 
private int amt; 
private String updEmpNo; 
private String thruBank; 
private String fileName; 
private String traGb; 
private String ncuCcy; 
private String tlxNo; 
private String sts; 
private Date acIl; 
private int seqNo; 
private String inOutGb; 
private Date updDt; 
private String refNo; 
private String ccy; 
private String updTm; 
private int ncuAmt; 
private String regEmpNo; 
private String regTm; 
} 
