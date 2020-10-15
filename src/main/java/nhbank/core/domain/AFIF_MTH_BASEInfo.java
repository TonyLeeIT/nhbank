package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFIF_MTH_BASE") 
@Data 
public class AFIF_MTH_BASEInfo implements Serializable { 
@Id 
@GeneratedValue 
private String frontId; 
private String toDepoCd; 
private String tag21; 
private String tag57Nm; 
private Date dealIl; 
private Date valueIl; 
private String updEmpNo; 
private String userId; 
private String dealType; 
private String tag56ABic; 
private String tag72Info1; 
private String tag72Info2; 
private Date lstDealIl; 
private String tag72Info3; 
private Date updDt; 
private String refNo; 
private String tag58Bic; 
private String poYn; 
private String valueYn; 
private String fromDepoNm; 
private String regEmpNo; 
private Date regDt; 
private String toDepoNm; 
private String tag58Nm; 
private String tag57Bic; 
private int amt; 
private String toCcy; 
private Date lstIbIl; 
private String tag53B; 
private Date poIl; 
private Date fstIbIl; 
private int poSeq; 
private String tag56ANm; 
private String ccy; 
private String tag56DBicName2; 
private String tag56DBicName1; 
private String tag56DBicName4; 
private String tag56DBicName3; 
private String updTm; 
private String fromDepoCd; 
private String regTm; 
} 
