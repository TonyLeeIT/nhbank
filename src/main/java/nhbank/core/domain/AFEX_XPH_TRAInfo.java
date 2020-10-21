package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_XPH_TRAInfo_ID.class) 
@Table(name = "AFEX_XPH_TRA") 
@Data 
public class AFEX_XPH_TRAInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "TRA_GB") 
private String traGb; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Id 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Column(name = "STS") 
private String sts; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "AMT") 
private BigDecimal amt; 
@Column(name = "IN_OUT_GB") 
private String inOutGb; 
@Column(name = "MT_GUBUN") 
private String mtGubun; 
@Column(name = "TLX_NO") 
private String tlxNo; 
@Column(name = "FILE_NAME") 
private String fileName; 
@Column(name = "THRU_BANK") 
private String thruBank; 
@Column(name = "NCU_CCY") 
private String ncuCcy; 
@Column(name = "NCU_AMT") 
private BigDecimal ncuAmt; 
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
