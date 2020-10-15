package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COM_ALLOW") 
@Data 
public class ACOM_COM_ALLOWInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private String trxRefNo; 
private int assetAmt; 
private String updEmpNo; 
private String collectCd; 
private int allowAmt; 
private String cixNo; 
private String gwamCd; 
private int collectAmt; 
private String sts; 
private Date updDt; 
private String refNo; 
private String mngBr; 
private String curc; 
private int exhgAmt; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
