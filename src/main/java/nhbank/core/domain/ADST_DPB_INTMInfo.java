package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_INTM") 
@Data 
public class ADST_DPB_INTMInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private Date gisIl; 
private int intSeq; 
private int taxRt; 
private int dsDays; 
private String trCd; 
private int curJan; 
private int hisNo; 
private String canOpNo; 
private String updEmpNo; 
private String acctNo; 
private Date ibIl; 
private int taxAmt; 
private Date toDt; 
private String sts; 
private int intAmt; 
private Date updDt; 
private int intRt; 
private Date fromDt; 
private String updTm; 
private int dsAmt; 
private Date canIl; 
private String regEmpNo; 
private String regTm; 
} 
