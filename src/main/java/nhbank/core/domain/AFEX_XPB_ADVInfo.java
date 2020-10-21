package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFEX_XPB_ADVInfo_ID.class) 
@Table(name = "AFEX_XPB_ADV") 
@Data 
public class AFEX_XPB_ADVInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "HIS_NO") 
private BigDecimal hisNo; 
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
@Column(name = "ADV_GB") 
private String advGb; 
@Column(name = "CA_GB") 
private String caGb; 
@Column(name = "DELAY_GB") 
private String delayGb; 
@Column(name = "SD_TR_IL") 
private Date sdTrIl; 
@Column(name = "JUB_GB") 
private String jubGb; 
@Column(name = "HD_AMT") 
private BigDecimal hdAmt; 
@Column(name = "JUN_NO1") 
private String junNo1; 
@Column(name = "OVER_AMT") 
private BigDecimal overAmt; 
@Column(name = "JUN_NO2") 
private String junNo2; 
@Column(name = "LESS_CA_AMT") 
private BigDecimal lessCaAmt; 
@Column(name = "LESS_CO_AMT") 
private BigDecimal lessCoAmt; 
@Column(name = "LESS_GT_AMT") 
private BigDecimal lessGtAmt; 
@Column(name = "YUK_NO") 
private String yukNo; 
@Column(name = "PL_JI_GB") 
private String plJiGb; 
@Column(name = "DEPO_BKCD") 
private String depoBkcd; 
@Column(name = "BUIB_GB") 
private String buibGb; 
@Column(name = "JUN_AMT") 
private BigDecimal junAmt; 
@Column(name = "IJ_GB") 
private String ijGb; 
@Column(name = "MAN_IL") 
private Date manIl; 
@Column(name = "CA_MAN_IL") 
private Date caManIl; 
@Column(name = "MISU_AMT") 
private BigDecimal misuAmt; 
@Column(name = "MISU_BAMT") 
private BigDecimal misuBamt; 
@Column(name = "SONIK_GB") 
private String sonikGb; 
@Column(name = "SONIK_AMT") 
private BigDecimal sonikAmt; 
@Column(name = "BE_LCA_IL") 
private Date beLcaIl; 
@Column(name = "NCU_CCY") 
private String ncuCcy; 
@Column(name = "NCU_AMT") 
private BigDecimal ncuAmt; 
@Column(name = "NCU_HD_AMT") 
private BigDecimal ncuHdAmt; 
@Column(name = "NCU_OVER_AMT") 
private BigDecimal ncuOverAmt; 
@Column(name = "NCU_LESS_CA_AMT") 
private BigDecimal ncuLessCaAmt; 
@Column(name = "NCU_LESS_CO_AMT") 
private BigDecimal ncuLessCoAmt; 
@Column(name = "NCU_LESS_GT_AMT") 
private BigDecimal ncuLessGtAmt; 
@Column(name = "NCU_JUN_AMT") 
private BigDecimal ncuJunAmt; 
@Column(name = "NCU_MISU_AMT") 
private BigDecimal ncuMisuAmt; 
@Column(name = "JUN_NO3") 
private String junNo3; 
@Column(name = "PAY_DO_YN") 
private String payDoYn; 
@Column(name = "TRSF_ABANO") 
private String trsfAbano; 
@Column(name = "TRSF_ACCT") 
private String trsfAcct; 
@Column(name = "TRSF_REFNO") 
private String trsfRefno; 
@Column(name = "TRSF_BENE_NM") 
private String trsfBeneNm; 
@Column(name = "TRSF_APPL_NM") 
private String trsfApplNm; 
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
@Column(name = "MT103_DOC_ID") 
private String mt103DocId; 
@Column(name = "FEE_RCV_BY") 
private String feeRcvBy; 
} 
