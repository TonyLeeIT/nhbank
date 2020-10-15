package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_ADH_HIS") 
@Data 
public class AFEX_ADH_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private int ediSeq; 
private int ydSeq; 
private String trCd; 
private String ibgmMd; 
private String buseoNo; 
private String mngNo; 
private String updEmpNo; 
private int baseSeq; 
private String sts; 
private Date acIl; 
private Date updDt; 
private int openAmt; 
private String brNo; 
private String ediFnm; 
private String ibTime; 
private String reIssue; 
private int brCharge; 
private int chargeAmt; 
private Date canIl; 
private String regEmpNo; 
private String opNo; 
private Date regDt; 
private String openCcy; 
private int amendSeq; 
private Date gisIl; 
private int sdHisNo; 
private Date advMakeIl; 
private int hisNo; 
private int amdCnt; 
private Date ediIl; 
private String ydGuja; 
private String cixNo; 
private Date ibIl; 
private String chargeGb; 
private String sdRefNo; 
private String trBr; 
private String trGb; 
private String advNo; 
private String updTm; 
private String regTm; 
} 
