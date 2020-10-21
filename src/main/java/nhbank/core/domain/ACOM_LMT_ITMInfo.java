package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_LMT_ITMInfo_ID.class) 
@Table(name = "ACOM_LMT_ITM") 
@Data 
public class ACOM_LMT_ITMInfo implements Serializable { 
@Id 
@Column(name = "SNG_NO") 
private String sngNo; 
@Id 
@Column(name = "SEQ") 
private BigDecimal seq; 
@Column(name = "TR_GB") 
private String trGb; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "ITM_CD") 
private String itmCd; 
@Column(name = "BE_AITM01") 
private String beAitm01; 
@Column(name = "BE_AITM02") 
private String beAitm02; 
@Column(name = "BE_AITM03") 
private String beAitm03; 
@Column(name = "BE_AITM04") 
private String beAitm04; 
@Column(name = "BE_AITM05") 
private String beAitm05; 
@Column(name = "BE_AITM06") 
private String beAitm06; 
@Column(name = "BE_AITM07") 
private String beAitm07; 
@Column(name = "BE_AITM08") 
private String beAitm08; 
@Column(name = "BE_AITM09") 
private String beAitm09; 
@Column(name = "BE_AITM10") 
private String beAitm10; 
@Column(name = "AF_AITM01") 
private String afAitm01; 
@Column(name = "AF_AITM02") 
private String afAitm02; 
@Column(name = "AF_AITM03") 
private String afAitm03; 
@Column(name = "AF_AITM04") 
private String afAitm04; 
@Column(name = "AF_AITM05") 
private String afAitm05; 
@Column(name = "AF_AITM06") 
private String afAitm06; 
@Column(name = "AF_AITM07") 
private String afAitm07; 
@Column(name = "AF_AITM08") 
private String afAitm08; 
@Column(name = "AF_AITM09") 
private String afAitm09; 
@Column(name = "AF_AITM10") 
private String afAitm10; 
@Column(name = "BE_NITM") 
private BigDecimal beNitm; 
@Column(name = "AF_NITM") 
private BigDecimal afNitm; 
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
