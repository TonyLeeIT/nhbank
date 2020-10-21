package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ADST_LNB_FEEInfo_ID.class) 
@Table(name = "ADST_LNB_FEE") 
@Data 
public class ADST_LNB_FEEInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Id 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Column(name = "STS") 
private String sts; 
@Column(name = "FEE_GB") 
private String feeGb; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "FEE_AMT") 
private BigDecimal feeAmt; 
@Column(name = "RATE_AMT_GB") 
private String rateAmtGb; 
@Column(name = "FEE_DS_AMT") 
private BigDecimal feeDsAmt; 
@Column(name = "FEE_DS_BAMT") 
private BigDecimal feeDsBamt; 
@Column(name = "FEE_O_RT") 
private BigDecimal feeORt; 
@Column(name = "FEE_S_RT") 
private BigDecimal feeSRt; 
@Column(name = "FEE_FR_IL") 
private Date feeFrIl; 
@Column(name = "FEE_TO_IL") 
private Date feeToIl; 
@Column(name = "FEE_DAYS") 
private BigDecimal feeDays; 
@Column(name = "ADJ_SEQ") 
private BigDecimal adjSeq; 
@Column(name = "SCH_SEQ") 
private BigDecimal schSeq; 
@Column(name = "SCH_SUB_NO") 
private BigDecimal schSubNo; 
@Column(name = "BIZ_NO") 
private BigDecimal bizNo; 
@Column(name = "FEE_RCV_IL") 
private Date feeRcvIl; 
@Column(name = "FST_IB_IL") 
private Date fstIbIl; 
@Column(name = "LST_AC_IL") 
private Date lstAcIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
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
