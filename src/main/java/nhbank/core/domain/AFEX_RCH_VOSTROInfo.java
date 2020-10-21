package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_RCH_VOSTROInfo_ID.class) 
@Table(name = "AFEX_RCH_VOSTRO") 
@Data 
public class AFEX_RCH_VOSTROInfo implements Serializable { 
@Id 
@Column(name = "IB_IL") 
private Date ibIl; 
@Id 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Id 
@Column(name = "CD_AMT") 
private BigDecimal cdAmt; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "OP_NO") 
private String opNo; 
@Column(name = "VAL_IL") 
private Date valIl; 
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
