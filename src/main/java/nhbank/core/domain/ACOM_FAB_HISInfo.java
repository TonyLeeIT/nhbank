package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_FAB_HIS") 
@Data 
public class ACOM_FAB_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trCd; 
private int lastDepriJan; 
private String mngNo; 
private String updEmpNo; 
private String cdSngNo; 
private int salAmt; 
private String sdBr; 
private int afDepriJan; 
private int cdSilSeq; 
private String sts; 
private Date acIl; 
private int trBamt; 
private Date updDt; 
private String refNo; 
private int trFamt; 
private Date depriIl; 
private String ibTime; 
private String remark; 
private Date canIl; 
private String regEmpNo; 
private int depriAmt; 
private String opNo; 
private Date regDt; 
private int sellAmt; 
private Date gisIl; 
private int thisDepriJan; 
private int sdHisNo; 
private String bgRefNo; 
private Date bfrDepriIl; 
private int hisNo; 
private int capitalJan; 
private int afJan; 
private Date ibIl; 
private int depriJan; 
private String ilgeYn; 
private int dispJan; 
private String trBr; 
private String trGb; 
private int plAmt; 
private String updTm; 
private int evenAmt; 
private String trCcy; 
private String regTm; 
} 
