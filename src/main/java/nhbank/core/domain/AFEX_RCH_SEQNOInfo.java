package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_RCH_SEQNOInfo_ID.class) 
@Table(name = "AFEX_RCH_SEQNO") 
@Data 
public class AFEX_RCH_SEQNOInfo implements Serializable { 
@Id 
@Column(name = "TR_IL") 
private Date trIl; 
@Id 
@Column(name = "SA_GB") 
private String saGb; 
@Id 
@Column(name = "CD") 
private String cd; 
@Id 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "SEQNO") 
private BigDecimal seqno; 
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
