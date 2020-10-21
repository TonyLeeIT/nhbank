package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_DMH_ALLOCHISInfo_ID.class) 
@Table(name = "ACOM_DMH_ALLOCHIS") 
@Data 
public class ACOM_DMH_ALLOCHISInfo implements Serializable { 
@Id 
@Column(name = "DAMBO_NO") 
private String damboNo; 
@Id 
@Column(name = "CIX_NO") 
private String cixNo; 
@Id 
@Column(name = "SNG_NO") 
private String sngNo; 
@Id 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Column(name = "STS") 
private String sts; 
@Column(name = "ALLOC_RATIO") 
private BigDecimal allocRatio; 
@Column(name = "ALLOC_AMT") 
private BigDecimal allocAmt; 
@Column(name = "IB_IL") 
private Date ibIl; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "TR_BR") 
private String trBr; 
@Column(name = "SD_BR") 
private String sdBr; 
@Column(name = "TR_TIME") 
private String trTime; 
@Column(name = "OP_NO") 
private String opNo; 
@Column(name = "MNG_NO") 
private String mngNo; 
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
