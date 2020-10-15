package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPB_AMD") 
@Data 
public class AFEX_XPB_AMDInfo implements Serializable { 
@Id 
@GeneratedValue 
private int beIntAmt; 
private int beUsanceTerm; 
private String beWhanRcvGb; 
private String mngNo; 
private String updEmpNo; 
private int afUsanceTerm; 
private int afHijaTerm; 
private Date beMoJubIl; 
private Date afManGijIl; 
private String sts; 
private Date acIl; 
private int beWhanFrt; 
private Date afYmanIl; 
private Date afMoJubIl; 
private int seqNo; 
private int afWhanFrt; 
private Date updDt; 
private String refNo; 
private int beHijaTerm; 
private Date lstIl; 
private String beNegoGb; 
private Date canIl; 
private String regEmpNo; 
private String afReneReqGb; 
private String opNo; 
private Date regDt; 
private Date beManGijIl; 
private Date gisIl; 
private String afTenorGb; 
private int hisNo; 
private Date beLstIsuIl; 
private int afIntAmt; 
private String beTenorGb; 
private String beReneReqGb; 
private String afHjIlCd; 
private Date lstIbIl; 
private String beHjIlCd; 
private Date afLstIsuIl; 
private Date beYmanIl; 
private String updTm; 
private String afWhanRcvGb; 
private String afNegoGb; 
private String regTm; 
} 
