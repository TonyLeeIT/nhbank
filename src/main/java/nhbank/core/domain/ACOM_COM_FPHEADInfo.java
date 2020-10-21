package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_COM_FPHEADInfo_ID.class) 
@Table(name = "ACOM_COM_FPHEAD") 
@Data 
public class ACOM_COM_FPHEADInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Id 
@Column(name = "PRT_KIND") 
private String prtKind; 
@Column(name = "UPMU_CD") 
private String upmuCd; 
@Column(name = "TR_CD") 
private String trCd; 
@Column(name = "TX_DATE") 
private Date txDate; 
@Column(name = "CIX_NO") 
private String cixNo; 
@Column(name = "TITLE_TXT") 
private String titleTxt; 
@Column(name = "HEAD_TXT") 
private String headTxt; 
@Column(name = "TELL_NO") 
private String tellNo; 
@Column(name = "TELL_NM") 
private String tellNm; 
@Column(name = "OP_NO") 
private String opNo; 
@Column(name = "OP_NM") 
private String opNm; 
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
