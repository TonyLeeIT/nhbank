package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_IPH_ATAGInfo_ID.class) 
@Table(name = "AFEX_IPH_ATAG") 
@Data 
public class AFEX_IPH_ATAGInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "AMD_SEQ") 
private String amdSeq; 
@Id 
@Column(name = "TAG_CD") 
private String tagCd; 
@Id 
@Column(name = "SEQ") 
private BigDecimal seq; 
@Column(name = "TEXT01") 
private String text01; 
@Column(name = "TEXT02") 
private String text02; 
@Column(name = "TEXT03") 
private String text03; 
@Column(name = "TEXT04") 
private String text04; 
@Column(name = "TEXT05") 
private String text05; 
@Column(name = "TEXT06") 
private String text06; 
@Column(name = "TEXT07") 
private String text07; 
@Column(name = "TEXT08") 
private String text08; 
@Column(name = "TEXT09") 
private String text09; 
@Column(name = "TEXT10") 
private String text10; 
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
