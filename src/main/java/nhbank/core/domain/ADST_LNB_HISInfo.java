package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ADST_LNB_HISInfo_ID.class) 
@Table(name = "ADST_LNB_HIS") 
@Data 
public class ADST_LNB_HISInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Column(name = "STS") 
private String sts; 
@Column(name = "TR_GB") 
private String trGb; 
@Column(name = "TR_CD") 
private String trCd; 
@Column(name = "CIX_NO") 
private String cixNo; 
@Column(name = "IB_IL") 
private Date ibIl; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "CAN_IL") 
private Date canIl; 
@Column(name = "SD_HIS_NO") 
private BigDecimal sdHisNo; 
@Column(name = "TR_CCY") 
private String trCcy; 
@Column(name = "TR_FAMT") 
private BigDecimal trFamt; 
@Column(name = "TR_BAMT") 
private BigDecimal trBamt; 
@Column(name = "AF_JAN") 
private BigDecimal afJan; 
@Column(name = "FEE_MD") 
private String feeMd; 
@Column(name = "SND_DOC_NO") 
private String sndDocNo; 
@Column(name = "TR_BR") 
private String trBr; 
@Column(name = "SD_BR") 
private String sdBr; 
@Column(name = "TR_TIME") 
private String trTime; 
@Column(name = "USER_ID") 
private String userId; 
@Column(name = "MANAGER_ID") 
private String managerId; 
@Column(name = "IBJI_MD") 
private String ibjiMd; 
@Column(name = "YD_GUJA") 
private String ydGuja; 
@Column(name = "CD_SNG_NO") 
private String cdSngNo; 
@Column(name = "CD_SIL_SEQ") 
private BigDecimal cdSilSeq; 
@Column(name = "FTP_SNG_NO") 
private String ftpSngNo; 
@Column(name = "FTP_SIL_SEQ") 
private BigDecimal ftpSilSeq; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "BF_LREPAY_IL") 
private Date bfLrepayIl; 
@Column(name = "BF_NREPAY_IL") 
private Date bfNrepayIl; 
@Column(name = "BF_LISU_IL") 
private Date bfLisuIl; 
@Column(name = "BF_LIIB_IL") 
private Date bfLiibIl; 
@Column(name = "BF_NISU_IL") 
private Date bfNisuIl; 
@Column(name = "BF_NROLL_IL") 
private Date bfNrollIl; 
@Column(name = "BF_PYC_IL") 
private Date bfPycIl; 
@Column(name = "BF_IYC_IL") 
private Date bfIycIl; 
@Column(name = "BF_REPAY_SEQ") 
private BigDecimal bfRepaySeq; 
@Column(name = "BF_INT_SEQ") 
private BigDecimal bfIntSeq; 
@Column(name = "BF_MSB_SEQ") 
private BigDecimal bfMsbSeq; 
@Column(name = "BF_LST_RT") 
private BigDecimal bfLstRt; 
@Column(name = "BF_MISU_AMT") 
private BigDecimal bfMisuAmt; 
@Column(name = "SH_JAGUM_GB") 
private String shJagumGb; 
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
