package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_LMT_CLMIT") 
@Data 
public class ACOM_LMT_CLMITInfo implements Serializable { 
@Id 
@GeneratedValue 
private int chgSqno; 
private int xcrtSc; 
private String fxAcno; 
private String updEmpNo; 
private String rgmnEno; 
private String lsCmeno; 
private int laPrdMtcn; 
private String scid; 
private int trXcrt; 
private Date updDt; 
private int fxTrSqno; 
private int laInspRcSqno; 
private String estCurc; 
private Date lschgDtm; 
private String dbtAcpC; 
private String regEmpNo; 
private Date regDt; 
private String bndPsvC; 
private int chbfCusno; 
private String rmkCntn; 
private int repCusno; 
private Date lmtDueDt; 
private String pnpLaMggKdc; 
private String wrsC; 
private int acusAplItr; 
private String bfLaInspRcno; 
private String laInspRcC; 
private String brc; 
private Date trDt; 
private int laPmiAm; 
private String laItrDsc; 
private int cusno; 
private String updTm; 
private String laInspRcno; 
private String fxStsc; 
private String ivtmnEno; 
private String regTm; 
} 
