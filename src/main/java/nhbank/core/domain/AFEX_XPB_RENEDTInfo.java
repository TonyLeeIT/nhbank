package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_XPB_RENEDTInfo_ID.class) 
@Table(name = "AFEX_XPB_RENEDT") 
@Data 
public class AFEX_XPB_RENEDTInfo implements Serializable { 
@Id 
@Column(name = "MNG_IL") 
private Date mngIl; 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Column(name = "STS") 
private String sts; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "AMT") 
private BigDecimal amt; 
@Column(name = "BAMT") 
private BigDecimal bamt; 
@Column(name = "PRE_CA_IL") 
private Date preCaIl; 
@Column(name = "RENE_IL") 
private Date reneIl; 
@Column(name = "RENE_JUM") 
private String reneJum; 
@Column(name = "NCU_CCY") 
private String ncuCcy; 
@Column(name = "NCU_AMT") 
private BigDecimal ncuAmt; 
@Column(name = "CA_IL") 
private Date caIl; 
@Column(name = "CA_AMT") 
private BigDecimal caAmt; 
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
