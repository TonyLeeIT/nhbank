package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AACT_TRX_BSInfo_ID.class) 
@Table(name = "AACT_TRX_BS") 
@Data 
public class AACT_TRX_BSInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Id 
@Column(name = "SEG_SEQ") 
private BigDecimal segSeq; 
@Column(name = "REF_NO2") 
private String refNo2; 
@Column(name = "ORG_GB") 
private String orgGb; 
@Column(name = "ILGE_GB") 
private String ilgeGb; 
@Column(name = "YD_GB") 
private String ydGb; 
@Column(name = "PST_GB") 
private String pstGb; 
@Column(name = "IBF_GB") 
private String ibfGb; 
@Column(name = "POS_GB") 
private String posGb; 
@Column(name = "ACT_IL") 
private Date actIl; 
@Column(name = "ACT_BR") 
private String actBr; 
@Column(name = "BS_CCY") 
private String bsCcy; 
@Column(name = "FBS_CD") 
private String fbsCd; 
@Column(name = "BBS_CD") 
private String bbsCd; 
@Column(name = "MBS_BSPL") 
private String mbsBspl; 
@Column(name = "MBS_CD") 
private String mbsCd; 
@Column(name = "IBJI_CD") 
private String ibjiCd; 
@Column(name = "SLIP_GB") 
private String slipGb; 
@Column(name = "JUKI_GB") 
private String jukiGb; 
@Column(name = "FAMT") 
private BigDecimal famt; 
@Column(name = "BAMT") 
private BigDecimal bamt; 
@Column(name = "APPL_HRT") 
private BigDecimal applHrt; 
@Column(name = "BASIC_HRT") 
private BigDecimal basicHrt; 
@Column(name = "BOOK_HRT") 
private BigDecimal bookHrt; 
@Column(name = "DEMI_HRT") 
private BigDecimal demiHrt; 
@Column(name = "GOSI_HRT") 
private BigDecimal gosiHrt; 
@Column(name = "FTP_RT") 
private BigDecimal ftpRt; 
@Column(name = "CD_SNG_NO") 
private String cdSngNo; 
@Column(name = "YD_DSFG") 
private String ydDsfg; 
@Column(name = "YD_REFNO") 
private String ydRefno; 
@Column(name = "YD_HISNO") 
private BigDecimal ydHisno; 
@Column(name = "DOC_ID") 
private String docId; 
@Column(name = "REMARK") 
private String remark; 
@Column(name = "MSG_TYPE") 
private String msgType; 
@Column(name = "DP_NO") 
private String dpNo; 
@Column(name = "DEPO_CD") 
private String depoCd; 
@Column(name = "VALUE_IL") 
private Date valueIl; 
@Column(name = "SNG_NO") 
private String sngNo; 
@Column(name = "ABA_NO") 
private String abaNo; 
@Column(name = "CHECK_NO") 
private String checkNo; 
@Column(name = "THEIR_REFNO") 
private String theirRefno; 
@Column(name = "IFRS_DV_CD") 
private String ifrsDvCd; 
@Column(name = "DTLS_BAL_DV_CD") 
private String dtlsBalDvCd; 
@Column(name = "BAL_AMT") 
private BigDecimal balAmt; 
@Column(name = "ID_NO") 
private String idNo; 
@Column(name = "CIX_NO") 
private String cixNo; 
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
