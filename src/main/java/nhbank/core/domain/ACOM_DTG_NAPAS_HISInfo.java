package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_DTG_NAPAS_HIS") 
@Data 
public class ACOM_DTG_NAPAS_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String mti; 
private String de042CrdAcptId; 
private String de060CnlTp; 
private String de052Pin; 
private String updEmpNo; 
private String de011TraceNo; 
private String de038AuthIdRes; 
private String de055EmvDat; 
private String de104TrnCont; 
private String de062NapSvcCd; 
private String de002Pan; 
private String de023CrdSeqNo; 
private int de010BilConvRt; 
private Date updDt; 
private String de070NetMgtCd; 
private Date rcvIl; 
private String de105NewPin; 
private String regEmpNo; 
private int de005StlAmt; 
private String de039ResCd; 
private int hisNo; 
private String de063TrnRefNo; 
private String de049TrnCcy; 
private String de018MerCatCd; 
private String de050StlCcy; 
private String de048AddSndAddr; 
private int de009StlConvRt; 
private String de035Trk2Dat; 
private int de006BilAmt; 
private String de051BilCcy; 
private String de013LocTrnDate; 
private String de036Trk3Dat; 
private String de032AcqCd; 
private String de043CrdAcptLoc; 
private String de103RcvAccInf; 
private String de014ExpDate; 
private String bkCd; 
private String de012LocTrnTime; 
private int seqNo; 
private String de007TrnDt; 
private String de019AcqCtryCd; 
private String refNo; 
private String de045Trk1Dat; 
private String de003ProcCd; 
private Date regDt; 
private String de022PosMode; 
private String de128MacDat; 
private String de037RelRefNo; 
private String de025PosCondCd; 
private String trnDate; 
private String de048AddSndNm; 
private String de015StlDate; 
private String inoutGb; 
private int de004TrnAmt; 
private String de102SndAccInf; 
private String de026PinCapCd; 
private String errCd; 
private String de100BenCd; 
private String de041CrdAcptTrm; 
private String de090OrgTrnKey; 
private String updTm; 
private String de054AddAmt; 
private String de120BenInf; 
private String regTm; 
} 
