package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RIH_HIS") 
@Data 
public class AFEX_RIH_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private int ydSeq; 
private String trCd; 
private String mngNo; 
private String updEmpNo; 
private String cdSngNo; 
private String sdBr; 
private int cdSilSeq; 
private String sts; 
private Date acIl; 
private int trBamt; 
private Date updDt; 
private String refNo; 
private int trFamt; 
private String ibTime; 
private Date canIl; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private Date gisIl; 
private String ibjiMd; 
private int sdHisNo; 
private int hisNo; 
private String ydGuja; 
private int bokSeq; 
private String cixNo; 
private int afJan; 
private Date ibIl; 
private String feeMd; 
private String trBr; 
private String trGb; 
private String updTm; 
private String trCcy; 
private String regTm; 
} 
