package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RCH_BASE") 
@Data 
public class AFEX_RCH_BASEInfo implements Serializable { 
@Id 
@GeneratedValue 
private String reconYn; 
private String depo57a; 
private String updEmpNo; 
private String ctryCd; 
private String afCd; 
private String sts; 
private Date updDt; 
private String bknm; 
private String dbsCd; 
private String depoType; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private String cd; 
private String vostroYn; 
private int mk950Seq; 
private String depoEtc3; 
private String depoEtc2; 
private String depo56a; 
private String depoEtc1; 
private Date chngIl; 
private Date depoIl; 
private String cbsCd; 
private String bkcd; 
private String attenNo; 
private String ccy; 
private Date makeIl; 
private String mngBr; 
private String updTm; 
private String mngrNo; 
private String regTm; 
} 
