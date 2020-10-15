package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_EPB_RPT") 
@Data 
public class ACOM_EPB_RPTInfo implements Serializable { 
@Id 
@GeneratedValue 
private String trCd; 
private String updEmpNo; 
private int plCrAmt; 
private String busiGrpCd; 
private String plCd; 
private Date acrFmDt; 
private int bizSubSeq; 
private String dnGb; 
private int trBamt; 
private Date updDt; 
private String refNo; 
private String remark; 
private int bgCrAmt; 
private String regEmpNo; 
private String mngYr; 
private int acrAmt; 
private Date regDt; 
private int hisNo; 
private Date acrToDt; 
private String busiCd; 
private int bgDrAmt; 
private String acrNo; 
private Date trDt; 
private String trGb; 
private String acrSts; 
private String mngBr; 
private String updTm; 
private String trCcy; 
private int bizSeq; 
private int plDrAmt; 
private String regTm; 
} 
