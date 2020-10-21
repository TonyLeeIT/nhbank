package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_DMH_ALLOCInfo_ID.class) 
@Table(name = "ACOM_DMH_ALLOC") 
@Data 
public class ACOM_DMH_ALLOCInfo implements Serializable { 
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
@Column(name = "STS") 
private String sts; 
@Column(name = "ALLOC_RATIO") 
private BigDecimal allocRatio; 
@Column(name = "ALLOC_AMT") 
private BigDecimal allocAmt; 
@Column(name = "MNG_BR") 
private String mngBr; 
@Column(name = "LST_HIS_NO") 
private BigDecimal lstHisNo; 
@Column(name = "LST_AC_IL") 
private Date lstAcIl; 
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
