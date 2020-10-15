package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_IPH_HIS") 
@Data 
public class AFEX_IPH_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String docId4; 
private String docId3; 
private String docId2; 
private String trCd; 
private String mngNo; 
private String updEmpNo; 
private String sts; 
private int seqNo; 
private Date updDt; 
private String refNo; 
private String ibTime; 
private String docId1; 
private int amdSeq; 
private Date canIl; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private int sdHisNo; 
private int hisNo; 
private String gwamCd; 
private Date ibIl; 
private String trBr; 
private String trGb; 
private String updTm; 
private String regTm; 
} 
