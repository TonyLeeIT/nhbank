package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_CONT_BASE") 
@Data 
public class ACOM_CONT_BASEInfo implements Serializable { 
@Id 
@GeneratedValue 
private String idNo; 
private int cmltMlgeAmt; 
private String pbRmOffcrCd; 
private String dbtAptcYn; 
private String trcllStCd; 
private Date procBascDt; 
private String hsCd; 
private String updEmpNo; 
private String curCd; 
private Date trscDt; 
private Date ddacRnwDt; 
private String brfcCd; 
private String sts; 
private String pfmcDvCd; 
private String oriplCntyCd; 
private Date updDt; 
private String refNo; 
private String entrMgntNo; 
private String domsOtsdDvCd; 
private String sugtEmpRlcoCd; 
private String bnkDvCd; 
private int lstHisNo; 
private String prdCd; 
private Date contEndDt; 
private String rgnCd; 
private String pfmcMgntBrNo; 
private String eimpDclNo; 
private String inactRsnCd; 
private String limApvNo; 
private String sugtEmpNo; 
private String tmanEmpNo; 
private String regEmpNo; 
private String subjCd; 
private Date regDt; 
private String corpScalCd; 
private String cixNo; 
private Date lstTrscDt; 
private String subRefNo; 
private int deptSeqNo; 
private String mastauthDvCd; 
private String mgntBrNo; 
private String astRelnCrpdYn; 
private String cntyCd; 
private String longShtmDvCd; 
private String updTm; 
private String thrCntyCd; 
private String regTm; 
} 
