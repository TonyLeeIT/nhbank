package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_ATB_APPLY") 
@Data 
public class ACOM_ATB_APPLYInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date regDt; 
private int totCnt; 
private String updEmpNo; 
private String applyNo; 
private String cixNo; 
private String fileUrl; 
private Date trxDt; 
private String sts; 
private int susCnt; 
private Date updDt; 
private String fileNm; 
private String brNo; 
private int failCnt; 
private String updTm; 
private String regEmpNo; 
private String regTm; 
} 
