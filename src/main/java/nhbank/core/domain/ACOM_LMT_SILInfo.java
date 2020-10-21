package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_LMT_SILInfo_ID.class) 
@Table(name = "ACOM_LMT_SIL") 
@Data 
public class ACOM_LMT_SILInfo implements Serializable { 
@Id 
@Column(name = "SNG_NO") 
private String sngNo; 
@Id 
@Column(name = "ACT_CD") 
private String actCd; 
@Id 
@Column(name = "SIL_CCY") 
private String silCcy; 
@Column(name = "FST_IL") 
private Date fstIl; 
@Column(name = "LST_IL") 
private Date lstIl; 
@Column(name = "LST_IBIL") 
private Date lstIbil; 
@Column(name = "SIL_AMT") 
private BigDecimal silAmt; 
@Column(name = "DJG_AMT") 
private BigDecimal djgAmt; 
@Column(name = "GUR_BAMT") 
private BigDecimal gurBamt; 
@Column(name = "GUR_FAMT") 
private BigDecimal gurFamt; 
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
