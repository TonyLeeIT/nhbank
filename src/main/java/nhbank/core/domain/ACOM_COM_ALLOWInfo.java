package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_COM_ALLOWInfo_ID.class) 
@Table(name = "ACOM_COM_ALLOW") 
@Data 
public class ACOM_COM_ALLOWInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Column(name = "TRX_REF_NO") 
private String trxRefNo; 
@Column(name = "MNG_BR") 
private String mngBr; 
@Column(name = "CIX_NO") 
private String cixNo; 
@Column(name = "GWAM_CD") 
private String gwamCd; 
@Column(name = "CURC") 
private String curc; 
@Column(name = "ASSET_AMT") 
private BigDecimal assetAmt; 
@Column(name = "EXHG_AMT") 
private BigDecimal exhgAmt; 
@Column(name = "ALLOW_AMT") 
private BigDecimal allowAmt; 
@Column(name = "COLLECT_AMT") 
private BigDecimal collectAmt; 
@Column(name = "COLLECT_CD") 
private String collectCd; 
@Column(name = "STS") 
private String sts; 
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
