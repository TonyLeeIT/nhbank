package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COM_FPHEAD") 
@Data 
public class ACOM_COM_FPHEADInfo implements Serializable { 
@Id 
@GeneratedValue 
private String opNo; 
private Date regDt; 
private String opNm; 
private String trCd; 
private int hisNo; 
private String upmuCd; 
private String updEmpNo; 
private String headTxt; 
private String cixNo; 
private String tellNm; 
private String prtKind; 
private String tellNo; 
private Date updDt; 
private String refNo; 
private String titleTxt; 
private Date txDate; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
