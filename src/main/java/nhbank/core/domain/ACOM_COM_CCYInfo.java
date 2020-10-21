package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_COM_CCYInfo_ID.class) 
@Table(name = "ACOM_COM_CCY") 
@Data 
public class ACOM_COM_CCYInfo implements Serializable { 
@Id 
@Column(name = "CD") 
private String cd; 
@Column(name = "BOK_CD") 
private String bokCd; 
@Column(name = "NM") 
private String nm; 
@Column(name = "UNIT") 
private BigDecimal unit; 
@Column(name = "DIGIT") 
private BigDecimal digit; 
@Column(name = "CTRY_CD") 
private String ctryCd; 
@Column(name = "GOSI_GB") 
private String gosiGb; 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Column(name = "YEAR_GB") 
private BigDecimal yearGb; 
@Column(name = "MAKE_IL") 
private Date makeIl; 
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
