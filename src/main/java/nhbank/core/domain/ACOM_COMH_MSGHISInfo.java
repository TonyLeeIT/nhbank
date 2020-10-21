package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_COMH_MSGHISInfo_ID.class) 
@Table(name = "ACOM_COMH_MSGHIS") 
@Data 
public class ACOM_COMH_MSGHISInfo implements Serializable { 
@Id 
@Column(name = "DOC_ID") 
private String docId; 
@Id 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Column(name = "COND_STS") 
private String condSts; 
@Column(name = "STM_RMK") 
private String stmRmk; 
@Column(name = "STM_TAIL") 
private String stmTail; 
@Column(name = "MAKE_IL") 
private Date makeIl; 
@Column(name = "MAKE_TIME") 
private String makeTime; 
@Column(name = "MAKE_TTY") 
private String makeTty; 
@Column(name = "OP_NO") 
private String opNo; 
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
