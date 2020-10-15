package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_LNB_HIS") 
@Data 
public class ADST_LNB_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trCd; 
private int bfMsbSeq; 
private String updEmpNo; 
private String userId; 
private String cdSngNo; 
private String sndDocNo; 
private Date bfLisuIl; 
private String sts; 
private Date bfIycIl; 
private int trBamt; 
private Date updDt; 
private int bfIntSeq; 
private int trFamt; 
private int bfRepaySeq; 
private Date canIl; 
private int ftpSilSeq; 
private String regEmpNo; 
private Date bfNrepayIl; 
private Date gisIl; 
private int sdHisNo; 
private String shJagumGb; 
private int hisNo; 
private String ydGuja; 
private int afJan; 
private Date ibIl; 
private String managerId; 
private Date bfPycIl; 
private String trTime; 
private String trCcy; 
private String sdBr; 
private int bfMisuAmt; 
private int cdSilSeq; 
private Date acIl; 
private String refNo; 
private String ftpSngNo; 
private Date bfNrollIl; 
private Date regDt; 
private String ibjiMd; 
private Date lstIbIl; 
private Date bfLrepayIl; 
private String cixNo; 
private Date bfNisuIl; 
private String feeMd; 
private Date bfLiibIl; 
private String trBr; 
private String trGb; 
private String updTm; 
private int bfLstRt; 
private String regTm; 
} 
