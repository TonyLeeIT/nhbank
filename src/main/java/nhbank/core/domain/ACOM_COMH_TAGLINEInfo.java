package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_COMH_TAGLINEInfo_ID.class) 
@Table(name = "ACOM_COMH_TAGLINE") 
@Data 
public class ACOM_COMH_TAGLINEInfo implements Serializable { 
@Id 
@Column(name = "DOC_ID") 
private String docId; 
@Id 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Column(name = "LINE_TYPE") 
private String lineType; 
@Column(name = "TAG_NO") 
private String tagNo; 
@Column(name = "SUB_NO") 
private BigDecimal subNo; 
@Column(name = "LINE_DATA") 
private String lineData; 
@Column(name = "TAG_GB") 
private String tagGb; 
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
