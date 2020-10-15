package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_LMT_BASEACT") 
@Data 
public class ACOM_LMT_BASEACTInfo implements Serializable { 
@Id 
@GeneratedValue 
private int silWoijan; 
private int woiGaetrm; 
private String woiSutgb; 
private int graceDay; 
private String updEmpNo; 
private String sngSts; 
private String actCd; 
private String sngBrno; 
private int actAmt; 
private String woiSunhu; 
private int bojMjAmt; 
private String actRtjo; 
private int silCnt; 
private String sngAuth; 
private int bojBcnt; 
private int woiInttrm; 
private String rateJugi; 
private Date updDt; 
private Date fstIl; 
private int bojFcnt; 
private int actSprd; 
private String sngNo; 
private Date lstIl; 
private int spread; 
private int penalRate; 
private Date canIl; 
private String regEmpNo; 
private Date regDt; 
private int silJanamt; 
private int yoncheRate; 
private int silDjgjan; 
private int actRate; 
private String cixNo; 
private String actRtgb; 
private String sngInfo; 
private int bojBjan; 
private int bojFjan; 
private String rateGb; 
private String busiDayRule; 
private Date silLstil; 
private int sngAplseq; 
private String mngBr; 
private Date lstIbil; 
private String dayCntBasis; 
private String updTm; 
private int woiYongdo; 
private int silAccum; 
private String regTm; 
} 
