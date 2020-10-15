package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_DTG_NAPAS_RECON") 
@Data 
public class ACOM_DTG_NAPAS_RECONInfo implements Serializable { 
@Id 
@GeneratedValue 
private int irfissacq; 
private String rrc; 
private String de042CrdAcptId; 
private String mti; 
private String de060CnlTp; 
private int irfissbnb; 
private String updEmpNo; 
private String newSts; 
private String de011TraceNo; 
private String de038AuthIdRes; 
private int svfacqnp; 
private String de062NapSvcCd; 
private String de002Pan; 
private int de010BilConvRt; 
private int irfbnbiss; 
private String trnSts; 
private int irfbnbacq; 
private Date updDt; 
private String process; 
private String regEmpNo; 
private int de005StlAmt; 
private String de063TrnRefNo; 
private String de049TrnCcy; 
private String de018MerCatCd; 
private String de050StlCcy; 
private int rca; 
private int de009StlConvRt; 
private String rsv3; 
private int de006BilAmt; 
private String rsv1; 
private String rsv2; 
private String de051BilCcy; 
private String de013LocTrnDate; 
private int rta; 
private String reconType; 
private String de032AcqCd; 
private String de103RcvAccInf; 
private int svfbnbnp; 
private int irfacqiss; 
private String bkCd; 
private String de012LocTrnTime; 
private String de003ProcCd; 
private String remark; 
private Date regDt; 
private String de022PosMode; 
private String de037RelRefNo; 
private String iss; 
private String de025PosCondCd; 
private String trnDate; 
private String de015StlDate; 
private int svfissnp; 
private int de004TrnAmt; 
private String de102SndAccInf; 
private String de100BenCd; 
private String stlDate; 
private String de041CrdAcptTrm; 
private String updTm; 
private int irfacqbnb; 
private String regTm; 
} 
