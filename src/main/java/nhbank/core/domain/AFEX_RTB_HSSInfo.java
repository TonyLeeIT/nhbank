package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_RTB_HSSInfo_ID.class) 
@Table(name = "AFEX_RTB_HSS") 
@Data 
public class AFEX_RTB_HSSInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Column(name = "TR_CD") 
private String trCd; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "HSS_GB") 
private String hssGb; 
@Column(name = "HSS_AP_GB") 
private String hssApGb; 
@Column(name = "SD_BR_NO") 
private String sdBrNo; 
@Column(name = "SD_DEPO_CD") 
private String sdDepoCd; 
@Column(name = "CHARGE_TYPE") 
private String chargeType; 
@Column(name = "HSS_FEE") 
private BigDecimal hssFee; 
@Column(name = "ICHE_IL") 
private Date icheIl; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "FAMT") 
private BigDecimal famt; 
@Column(name = "BAMT") 
private BigDecimal bamt; 
@Column(name = "TRSC_SEQ_NO") 
private BigDecimal trscSeqNo; 
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
