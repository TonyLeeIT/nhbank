package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COM_VOUCHER") 
@Data 
public class ACOM_COM_VOUCHERInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trCd; 
private String freeText8; 
private String prtGb; 
private String opName; 
private String upmuCd; 
private String freeText4; 
private String updEmpNo; 
private String freeText5; 
private String freeText6; 
private String freeText7; 
private String freeText1; 
private int voucherNo; 
private String benef; 
private String freeText2; 
private String freeText3; 
private String trxDt; 
private String acIl; 
private String tellNo; 
private Date updDt; 
private String refNo; 
private String otherRefNo; 
private String remark; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private int hisNo; 
private String cixName; 
private String cixNo; 
private String trxName; 
private String updTm; 
private String acBr; 
private int prtSeq; 
private String regTm; 
} 
