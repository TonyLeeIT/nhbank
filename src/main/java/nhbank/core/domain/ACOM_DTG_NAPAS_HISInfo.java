package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_DTG_NAPAS_HISInfo_ID.class) 
@Table(name = "ACOM_DTG_NAPAS_HIS") 
@Data 
public class ACOM_DTG_NAPAS_HISInfo implements Serializable { 
@Id 
@Column(name = "TRN_DATE") 
private String trnDate; 
@Id 
@Column(name = "DE032_ACQ_CD") 
private String de032AcqCd; 
@Id 
@Column(name = "DE041_CRD_ACPT_TRM") 
private String de041CrdAcptTrm; 
@Id 
@Column(name = "DE011_TRACE_NO") 
private String de011TraceNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Column(name = "INOUT_GB") 
private String inoutGb; 
@Column(name = "BK_CD") 
private String bkCd; 
@Column(name = "MTI") 
private String mti; 
@Column(name = "DE002_PAN") 
private String de002Pan; 
@Column(name = "DE003_PROC_CD") 
private String de003ProcCd; 
@Column(name = "DE004_TRN_AMT") 
private BigDecimal de004TrnAmt; 
@Column(name = "DE005_STL_AMT") 
private BigDecimal de005StlAmt; 
@Column(name = "DE006_BIL_AMT") 
private BigDecimal de006BilAmt; 
@Column(name = "DE007_TRN_DT") 
private String de007TrnDt; 
@Column(name = "DE009_STL_CONV_RT") 
private BigDecimal de009StlConvRt; 
@Column(name = "DE010_BIL_CONV_RT") 
private BigDecimal de010BilConvRt; 
@Column(name = "DE012_LOC_TRN_TIME") 
private String de012LocTrnTime; 
@Column(name = "DE013_LOC_TRN_DATE") 
private String de013LocTrnDate; 
@Column(name = "DE014_EXP_DATE") 
private String de014ExpDate; 
@Column(name = "DE015_STL_DATE") 
private String de015StlDate; 
@Column(name = "DE019_ACQ_CTRY_CD") 
private String de019AcqCtryCd; 
@Column(name = "DE018_MER_CAT_CD") 
private String de018MerCatCd; 
@Column(name = "DE022_POS_MODE") 
private String de022PosMode; 
@Column(name = "DE023_CRD_SEQ_NO") 
private String de023CrdSeqNo; 
@Column(name = "DE025_POS_COND_CD") 
private String de025PosCondCd; 
@Column(name = "DE026_PIN_CAP_CD") 
private String de026PinCapCd; 
@Column(name = "DE035_TRK2_DAT") 
private String de035Trk2Dat; 
@Column(name = "DE036_TRK3_DAT") 
private String de036Trk3Dat; 
@Column(name = "DE037_REL_REF_NO") 
private String de037RelRefNo; 
@Column(name = "DE038_AUTH_ID_RES") 
private String de038AuthIdRes; 
@Column(name = "DE039_RES_CD") 
private String de039ResCd; 
@Column(name = "DE042_CRD_ACPT_ID") 
private String de042CrdAcptId; 
@Column(name = "DE043_CRD_ACPT_LOC") 
private String de043CrdAcptLoc; 
@Column(name = "DE045_TRK1_DAT") 
private String de045Trk1Dat; 
@Column(name = "DE048_ADD_SND_NM") 
private String de048AddSndNm; 
@Column(name = "DE048_ADD_SND_ADDR") 
private String de048AddSndAddr; 
@Column(name = "DE049_TRN_CCY") 
private String de049TrnCcy; 
@Column(name = "DE050_STL_CCY") 
private String de050StlCcy; 
@Column(name = "DE051_BIL_CCY") 
private String de051BilCcy; 
@Column(name = "DE052_PIN") 
private String de052Pin; 
@Column(name = "DE054_ADD_AMT") 
private String de054AddAmt; 
@Column(name = "DE055_EMV_DAT") 
private String de055EmvDat; 
@Column(name = "DE060_CNL_TP") 
private String de060CnlTp; 
@Column(name = "DE062_NAP_SVC_CD") 
private String de062NapSvcCd; 
@Column(name = "DE063_TRN_REF_NO") 
private String de063TrnRefNo; 
@Column(name = "DE070_NET_MGT_CD") 
private String de070NetMgtCd; 
@Column(name = "DE090_ORG_TRN_KEY") 
private String de090OrgTrnKey; 
@Column(name = "DE100_BEN_CD") 
private String de100BenCd; 
@Column(name = "DE102_SND_ACC_INF") 
private String de102SndAccInf; 
@Column(name = "DE103_RCV_ACC_INF") 
private String de103RcvAccInf; 
@Column(name = "DE104_TRN_CONT") 
private String de104TrnCont; 
@Column(name = "DE105_NEW_PIN") 
private String de105NewPin; 
@Column(name = "DE120_BEN_INF") 
private String de120BenInf; 
@Column(name = "DE128_MAC_DAT") 
private String de128MacDat; 
@Column(name = "ERR_CD") 
private String errCd; 
@Column(name = "REF_NO") 
private String refNo; 
@Column(name = "RCV_IL") 
private Date rcvIl; 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Column(name = "REG_EMP_NO") 
private String regEmpNo; 
@Column(name = "REG_DT") 
private Date regDt; 
@Column(name = "REG_TM") 
private String regTm; 
@Column(name = "UPD_EMP_NO") 
private String updEmpNo; 
@Column(name = "UPD_DT") 
private Date updDt; 
@Column(name = "UPD_TM") 
private String updTm;
} 
