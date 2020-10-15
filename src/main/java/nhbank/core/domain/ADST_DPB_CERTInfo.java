package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_CERT") 
@Data 
public class ADST_DPB_CERTInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private String drOpno; 
private String updEmpNo; 
private String drTime; 
private String acctNo; 
private Date ibIl; 
private int txTrxNo; 
private String sts; 
private String prtKind; 
private Date updDt; 
private String updTm; 
private String remark; 
private String regEmpNo; 
private String regTm; 
} 
