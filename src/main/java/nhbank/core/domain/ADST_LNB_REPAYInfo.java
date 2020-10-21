package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ADST_LNB_REPAYInfo_ID.class) 
@Table(name = "ADST_LNB_REPAY") 
@Data 
public class ADST_LNB_REPAYInfo implements Serializable { 
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
@Column(name = "ADJ_SEQ") 
private BigDecimal adjSeq; 
@Column(name = "SCH_SEQ") 
private BigDecimal schSeq; 
@Column(name = "SCH_SUB_NO") 
private BigDecimal schSubNo; 
@Column(name = "REPAY_IL") 
private Date repayIl; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "REPAY_AMT") 
private BigDecimal repayAmt; 
@Column(name = "USD_CVT_AMT") 
private BigDecimal usdCvtAmt; 
@Column(name = "BBS_CVT_AMT") 
private BigDecimal bbsCvtAmt; 
@Column(name = "REPAY_STYLE") 
private String repayStyle; 
@Column(name = "INT_GB") 
private String intGb; 
@Column(name = "YC_GB") 
private String ycGb; 
@Column(name = "FST_DEAL_IL") 
private Date fstDealIl; 
@Column(name = "LST_DEAL_IL") 
private Date lstDealIl; 
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
