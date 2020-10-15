package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AACT_TRX_BS") 
@Data 
public class AACT_TRX_BSInfo implements Serializable { 
@Id 
@GeneratedValue 
private int bookHrt; 
private int famt; 
private String updEmpNo; 
private String ydGb; 
private String cdSngNo; 
private String abaNo; 
private String dtlsBalDvCd; 
private String ibjiCd; 
private String pstGb; 
private Date updDt; 
private String sngNo; 
private String regEmpNo; 
private String docId; 
private int hisNo; 
private String ydDsfg; 
private String jukiGb; 
private String dpNo; 
private String msgType; 
private String depoCd; 
private String fbsCd; 
private int bamt; 
private String checkNo; 
private String slipGb; 
private int basicHrt; 
private String ifrsDvCd; 
private String idNo; 
private String refNo2; 
private String orgGb; 
private String posGb; 
private Date valueIl; 
private int applHrt; 
private String mbsCd; 
private int segSeq; 
private Date actIl; 
private String bsCcy; 
private String refNo; 
private String ibfGb; 
private int ydHisno; 
private int gosiHrt; 
private int demiHrt; 
private String remark; 
private String mbsBspl; 
private Date regDt; 
private String bbsCd; 
private int ftpRt; 
private String cixNo; 
private String ydRefno; 
private String theirRefno; 
private int balAmt; 
private String ilgeGb; 
private String updTm; 
private String actBr; 
private String regTm; 
} 
