package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_XPB_ITMInfo_ID.class) 
@Table(name = "AFEX_XPB_ITM") 
@Data 
public class AFEX_XPB_ITMInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "DR_GB") 
private String drGb; 
@Column(name = "ITM_CD") 
private String itmCd; 
@Column(name = "BE_ITM") 
private String beItm; 
@Column(name = "AF_ITM") 
private String afItm; 
@Column(name = "BE_ITM1") 
private BigDecimal beItm1; 
@Column(name = "AF_ITM1") 
private BigDecimal afItm1; 
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
