package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_HIS") 
@Data 
public class ADST_DPB_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trCd; 
private String processCd; 
private String mngNo; 
private String updEmpNo; 
private String acctNo; 
private String mechGb; 
private String sdBr; 
private String sts; 
private Date acIl; 
private Date updDt; 
private Date canIl; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private int trAmt; 
private Date gisIl; 
private int sdHisNo; 
private int chnlHisNo; 
private int hisNo; 
private String chnlRefNo; 
private String cixNo; 
private int afJan; 
private Date ibIl; 
private String trTime; 
private String trBr; 
private String trGb; 
private String mngBr; 
private String updTm; 
private String regTm; 
} 
