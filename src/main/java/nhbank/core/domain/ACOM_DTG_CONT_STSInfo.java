package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_DTG_CONT_STSInfo_ID.class) 
@Table(name = "ACOM_DTG_CONT_STS") 
@Data 
public class ACOM_DTG_CONT_STSInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Id 
@Column(name = "BR_NO") 
private String brNo; 
@Column(name = "TRX_DT") 
private Date trxDt; 
@Column(name = "BF_CONT_STS") 
private String bfContSts; 
@Column(name = "AF_CONT_STS") 
private String afContSts; 
@Column(name = "ACCT_NO") 
private String acctNo; 
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
