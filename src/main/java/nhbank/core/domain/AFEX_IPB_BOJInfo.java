package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_IPB_BOJ") 
@Data 
public class AFEX_IPB_BOJInfo implements Serializable { 
@Id 
@GeneratedValue 
private int lgmSseq; 
private int ncuBeLgcomDsAmt; 
private String junhwanGb; 
private String updEmpNo; 
private int bldSeq; 
private String sts; 
private Date acIl; 
private int beJunhwanWamt; 
private Date updDt; 
private String refNo; 
private int lgmSeq; 
private String ibjiGb; 
private String regEmpNo; 
private int chdAmt; 
private Date regDt; 
private String bojGb; 
private Date gisIl; 
private int hisNo; 
private int beLgcomDsAmt; 
private int amt; 
private Date lstIbIl; 
private String ncuCcy; 
private String ccy; 
private String updTm; 
private int ncuAmt; 
private int seq; 
private String regTm; 
} 
