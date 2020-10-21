package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_IPB_BLKInfo_ID.class) 
@Table(name = "AFEX_IPB_BLK") 
@Data 
public class AFEX_IPB_BLKInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "SEQ") 
private BigDecimal seq; 
@Id 
@Column(name = "SSEQ") 
private BigDecimal sseq; 
@Column(name = "STS") 
private String sts; 
@Column(name = "AC_IL") 
private Date acIl; 
@Column(name = "GIS_IL") 
private Date gisIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "AMT") 
private BigDecimal amt; 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
@Column(name = "JAGM_GB") 
private String jagmGb; 
@Column(name = "JILC_BAMT") 
private BigDecimal jilcBamt; 
@Column(name = "JILC_FAMT") 
private BigDecimal jilcFamt; 
@Column(name = "JILG_BAMT") 
private BigDecimal jilgBamt; 
@Column(name = "JILG_FAMT") 
private BigDecimal jilgFamt; 
@Column(name = "SNG_SSEQ") 
private BigDecimal sngSseq; 
@Column(name = "DJB_SEQ") 
private BigDecimal djbSeq; 
@Column(name = "SET_BKCD") 
private String setBkcd; 
@Column(name = "JUN_GB") 
private String junGb; 
@Column(name = "FJN_NO") 
private String fjnNo; 
@Column(name = "SET_GB") 
private String setGb; 
@Column(name = "GT_AMT") 
private BigDecimal gtAmt; 
@Column(name = "AMT_GB") 
private String amtGb; 
@Column(name = "NCU_CCY") 
private String ncuCcy; 
@Column(name = "NCU_AMT") 
private BigDecimal ncuAmt; 
@Column(name = "NCU_JILC_FAMT") 
private BigDecimal ncuJilcFamt; 
@Column(name = "NCU_JILG_FAMT") 
private BigDecimal ncuJilgFamt; 
@Column(name = "NCU_GT_AMT") 
private BigDecimal ncuGtAmt; 
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
