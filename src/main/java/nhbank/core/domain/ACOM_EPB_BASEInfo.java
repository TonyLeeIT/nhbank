package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_EPB_BASEInfo_ID.class) 
@Table(name = "ACOM_EPB_BASE") 
@Data 
public class ACOM_EPB_BASEInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Column(name = "MNG_BR") 
private String mngBr; 
@Column(name = "MNG_YY") 
private String mngYy; 
@Column(name = "BUSI_CD") 
private String busiCd; 
@Column(name = "STS") 
private String sts; 
@Column(name = "EXP_CD") 
private String expCd; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "ASSIGN_AMT") 
private BigDecimal assignAmt; 
@Column(name = "ADD_AMT") 
private BigDecimal addAmt; 
@Column(name = "ASSIGN_CAMT") 
private BigDecimal assignCamt; 
@Column(name = "ADD_CAMT") 
private BigDecimal addCamt; 
@Column(name = "PLUS_AMT") 
private BigDecimal plusAmt; 
@Column(name = "MINUS_AMT") 
private BigDecimal minusAmt; 
@Column(name = "TOTAL_AMT") 
private BigDecimal totalAmt; 
@Column(name = "DR_AMT") 
private BigDecimal drAmt; 
@Column(name = "CR_AMT") 
private BigDecimal crAmt; 
@Column(name = "LST_HIS_NO") 
private BigDecimal lstHisNo; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "IB_IL") 
private Date ibIl; 
@Column(name = "LST_IL") 
private Date lstIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "BJ_AMT") 
private BigDecimal bjAmt; 
@Column(name = "ALLOCATE_AMT") 
private BigDecimal allocateAmt; 
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
