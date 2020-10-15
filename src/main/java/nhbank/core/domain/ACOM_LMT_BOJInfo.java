package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_LMT_BOJ") 
@Data 
public class ACOM_LMT_BOJInfo implements Serializable { 
@Id 
@GeneratedValue 
private String linkRefNo; 
private String mngNo; 
private String updEmpNo; 
private String cdSngNo; 
private int applHrt; 
private String ccyGb; 
private String relRefNo; 
private int cdSilSeq; 
private String sts; 
private Date acIl; 
private Date updDt; 
private String sngNo; 
private String ibTime; 
private String remark; 
private String ibjiGb; 
private int payAmt; 
private Date canIl; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private String bojGb; 
private Date gisIl; 
private String ibjiMd; 
private String trGwam; 
private int amt; 
private String ydGuja; 
private Date ibIl; 
private String payCcy; 
private int canHisNo; 
private String damboNo; 
private String geojuGb; 
private String trGeor; 
private String trBr; 
private String ccy; 
private int cptySeq; 
private String updTm; 
private int seq; 
private int relHisNo; 
private String regTm; 
} 
