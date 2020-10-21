package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_RCH_TRANInfo_ID.class) 
@Table(name = "AFEX_RCH_TRAN") 
@Data 
public class AFEX_RCH_TRANInfo implements Serializable { 
@Id 
@Column(name = "CD") 
private String cd; 
@Id 
@Column(name = "CCY") 
private String ccy; 
@Id 
@Column(name = "MT_GB") 
private String mtGb; 
@Id 
@Column(name = "TR_IL") 
private Date trIl; 
@Id 
@Column(name = "TR_SEQ") 
private BigDecimal trSeq; 
@Column(name = "VAL_IL") 
private Date valIl; 
@Column(name = "DRCR_GB") 
private String drcrGb; 
@Column(name = "DRCR_AMT") 
private BigDecimal drcrAmt; 
@Column(name = "OUR_REF") 
private String ourRef; 
@Column(name = "THEIR_REF") 
private String theirRef; 
@Column(name = "IB_IL") 
private Date ibIl; 
@Column(name = "IB_TIME") 
private String ibTime; 
@Column(name = "DOC_ID") 
private String docId; 
@Column(name = "OTHER_REF") 
private String otherRef; 
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
