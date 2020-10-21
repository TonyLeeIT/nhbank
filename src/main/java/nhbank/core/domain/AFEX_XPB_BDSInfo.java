package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_XPB_BDSInfo_ID.class) 
@Table(name = "AFEX_XPB_BDS") 
@Data 
public class AFEX_XPB_BDSInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Id 
@Column(name = "BUDO_SEQ") 
private BigDecimal budoSeq; 
@Column(name = "STS") 
private String sts; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "AMT") 
private BigDecimal amt; 
@Column(name = "HDC_AMT") 
private BigDecimal hdcAmt; 
@Column(name = "BAMT") 
private BigDecimal bamt; 
@Column(name = "BDC_AMT") 
private BigDecimal bdcAmt; 
@Column(name = "BD_IJA") 
private BigDecimal bdIja; 
@Column(name = "HC_HIJA") 
private BigDecimal hcHija; 
@Column(name = "H_JI_GB") 
private String hJiGb; 
@Column(name = "CA_SUM_AMT") 
private BigDecimal caSumAmt; 
@Column(name = "SONIK_GB") 
private String sonikGb; 
@Column(name = "SONIK_AMT") 
private BigDecimal sonikAmt; 
@Column(name = "NCU_CCY") 
private String ncuCcy; 
@Column(name = "NCU_AMT") 
private BigDecimal ncuAmt; 
@Column(name = "NCU_HDC_AMT") 
private BigDecimal ncuHdcAmt; 
@Column(name = "NCU_CA_SUM_AMT") 
private BigDecimal ncuCaSumAmt; 
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
