package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_YEDE") 
@Data 
public class ADST_DPB_YEDEInfo implements Serializable { 
@Id 
@GeneratedValue 
private int tbrCk2Amt; 
private int lonCJamt; 
private int tbrCk1Amt; 
private String updEmpNo; 
private int dptNIamt; 
private int lonNIamt; 
private String acctNo; 
private int dptDJamt; 
private Date gejungIl; 
private int lonDJamt; 
private int bsJan; 
private Date updDt; 
private int dptCJamt; 
private String modeGb; 
private int jbrCk4Amt; 
private String regEmpNo; 
private int tbrCk4Amt; 
private Date regDt; 
private int jbrCk2Amt; 
private int lonCIamt; 
private int dptNJamt; 
private int dptDIamt; 
private int jbrCk1Amt; 
private int lonNJamt; 
private int lonDIamt; 
private int bsDptJan; 
private int bsLonJan; 
private int dptCIamt; 
private String updTm; 
private String regTm; 
} 
