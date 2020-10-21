package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_FAB_HISInfo_ID.class) 
@Table(name = "ACOM_FAB_HIS") 
@Data 
public class ACOM_FAB_HISInfo implements Serializable { 
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
@Column(name = "SAL_AMT") 
private BigDecimal salAmt; 
@Column(name = "EVEN_AMT") 
private BigDecimal evenAmt; 
@Column(name = "DEPRI_AMT") 
private BigDecimal depriAmt; 
@Column(name = "SELL_AMT") 
private BigDecimal sellAmt; 
@Column(name = "PL_AMT") 
private BigDecimal plAmt; 
@Column(name = "AF_JAN") 
private BigDecimal afJan; 
@Column(name = "AF_DEPRI_JAN") 
private BigDecimal afDepriJan; 
@Column(name = "DEPRI_JAN") 
private BigDecimal depriJan; 
@Column(name = "THIS_DEPRI_JAN") 
private BigDecimal thisDepriJan; 
@Column(name = "LAST_DEPRI_JAN") 
private BigDecimal lastDepriJan; 
@Column(name = "CAPITAL_JAN") 
private BigDecimal capitalJan; 
@Column(name = "DISP_JAN") 
private BigDecimal dispJan; 
@Column(name = "DEPRI_IL") 
private Date depriIl; 
@Column(name = "BFR_DEPRI_IL") 
private Date bfrDepriIl; 
@Column(name = "ILGE_YN") 
private String ilgeYn; 
@Column(name = "REMARK") 
private String remark; 
@Column(name = "BG_REF_NO") 
private String bgRefNo; 
@Column(name = "TR_BR") 
private String trBr; 
@Column(name = "SD_BR") 
private String sdBr; 
@Column(name = "IB_TIME") 
private String ibTime; 
@Column(name = "OP_NO") 
private String opNo; 
@Column(name = "MNG_NO") 
private String mngNo; 
@Column(name = "CD_SNG_NO") 
private String cdSngNo; 
@Column(name = "CD_SIL_SEQ") 
private BigDecimal cdSilSeq; 
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
