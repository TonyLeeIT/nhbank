package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(AFIF_MTH_BASEInfo_ID.class) 
@Table(name = "AFIF_MTH_BASE") 
@Data 
public class AFIF_MTH_BASEInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Column(name = "DEAL_IL") 
private Date dealIl; 
@Column(name = "DEAL_TYPE") 
private String dealType; 
@Column(name = "VALUE_YN") 
private String valueYn; 
@Column(name = "VALUE_IL") 
private Date valueIl; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "AMT") 
private BigDecimal amt; 
@Column(name = "FROM_DEPO_CD") 
private String fromDepoCd; 
@Column(name = "FROM_DEPO_NM") 
private String fromDepoNm; 
@Column(name = "TO_CCY") 
private String toCcy; 
@Column(name = "TO_DEPO_CD") 
private String toDepoCd; 
@Column(name = "TO_DEPO_NM") 
private String toDepoNm; 
@Column(name = "PO_YN") 
private String poYn; 
@Column(name = "PO_IL") 
private Date poIl; 
@Column(name = "PO_SEQ") 
private BigDecimal poSeq; 
@Column(name = "TAG21") 
private String tag21; 
@Column(name = "TAG53_B") 
private String tag53B; 
@Column(name = "TAG56_A_BIC") 
private String tag56ABic; 
@Column(name = "TAG56_A_NM") 
private String tag56ANm; 
@Column(name = "TAG56_D_BIC_NAME1") 
private String tag56DBicName1; 
@Column(name = "TAG56_D_BIC_NAME2") 
private String tag56DBicName2; 
@Column(name = "TAG56_D_BIC_NAME3") 
private String tag56DBicName3; 
@Column(name = "TAG56_D_BIC_NAME4") 
private String tag56DBicName4; 
@Column(name = "TAG57_BIC") 
private String tag57Bic; 
@Column(name = "TAG57_NM") 
private String tag57Nm; 
@Column(name = "TAG58_BIC") 
private String tag58Bic; 
@Column(name = "TAG58_NM") 
private String tag58Nm; 
@Column(name = "TAG72_INFO1") 
private String tag72Info1; 
@Column(name = "TAG72_INFO2") 
private String tag72Info2; 
@Column(name = "TAG72_INFO3") 
private String tag72Info3; 
@Column(name = "FST_IB_IL") 
private Date fstIbIl; 
@Column(name = "LST_DEAL_IL") 
private Date lstDealIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "USER_ID") 
private String userId; 
@Column(name = "FRONT_ID") 
private String frontId; 
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
