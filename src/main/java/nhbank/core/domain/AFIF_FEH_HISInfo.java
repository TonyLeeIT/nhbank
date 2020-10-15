package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFIF_FEH_HIS") 
@Data 
public class AFIF_FEH_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trCd; 
private String junNo; 
private String updEmpNo; 
private String userId; 
private String cdSngNo; 
private String preSts; 
private int farSellFamt; 
private String sts; 
private int nearBuyBamt; 
private Date updDt; 
private int nearBuyFamt; 
private int farSellBamt; 
private Date canIl; 
private int ftpSilSeq; 
private String regEmpNo; 
private Date gisIl; 
private int sdHisNo; 
private int nearSellJan; 
private int hisNo; 
private String nearSellCcy; 
private Date ibIl; 
private int nearSellBjan; 
private String managerId; 
private String trTime; 
private int farBuyBjan; 
private String frontSndGb; 
private int farSellBjan; 
private String sdBr; 
private int cdSilSeq; 
private Date acIl; 
private String nearBuyCcy; 
private String refNo; 
private String ftpSngNo; 
private int nearBuyJan; 
private int nearSellBamt; 
private String farSndDocNo; 
private int nearSellFamt; 
private Date regDt; 
private String yukNo; 
private String nearSndDocNo; 
private String ibjiMd; 
private int nearBuyBjan; 
private int farBuyFamt; 
private Date lstIbIl; 
private int farBuyBamt; 
private String beHdSngno; 
private int farBuyJan; 
private String trBr; 
private int farSellJan; 
private String trGb; 
private String farBuyCcy; 
private String updTm; 
private String farSellCcy; 
private String regTm; 
} 
