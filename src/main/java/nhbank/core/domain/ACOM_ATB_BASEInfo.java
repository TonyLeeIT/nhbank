package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ACOM_ATB_BASEInfo_ID.class) 
@Table(name = "ACOM_ATB_BASE") 
@Data 
public class ACOM_ATB_BASEInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Column(name = "REL_APPLY_NO") 
private String relApplyNo; 
@Column(name = "STS") 
private String sts; 
@Column(name = "MGNT_BR_NO") 
private String mgntBrNo; 
@Column(name = "FR_ACCT_NO") 
private String frAcctNo; 
@Column(name = "TO_REF_NO") 
private String toRefNo; 
@Column(name = "TR_TYPE") 
private String trType; 
@Column(name = "FR_CIX_NO") 
private String frCixNo; 
@Column(name = "CIX_NO") 
private String cixNo; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "LIMIT_AMT") 
private BigDecimal limitAmt; 
@Column(name = "TR_AMT") 
private BigDecimal trAmt; 
@Column(name = "DUE_TYPE") 
private String dueType; 
@Column(name = "DUE_DAY") 
private BigDecimal dueDay; 
@Column(name = "DUE_TIMES") 
private BigDecimal dueTimes; 
@Column(name = "TOT_TIMES") 
private BigDecimal totTimes; 
@Column(name = "PROC_TIMES") 
private BigDecimal procTimes; 
@Column(name = "OPN_DT") 
private Date opnDt; 
@Column(name = "EXP_DT") 
private Date expDt; 
@Column(name = "RETRY_YN") 
private String retryYn; 
@Column(name = "PURPOSE_CD") 
private String purposeCd; 
@Column(name = "RCV_RMRK") 
private String rcvRmrk; 
@Column(name = "RCV_ADDR") 
private String rcvAddr; 
@Column(name = "DEP_TIMES") 
private BigDecimal depTimes; 
@Column(name = "TYPE") 
private String type; 
@Column(name = "CHANNEL_TYPE") 
private String channelType; 
@Column(name = "PAYER_INF") 
private String payerInf; 
@Column(name = "TRSF_TP") 
private String trsfTp; 
@Column(name = "TRSF_DT_RULE") 
private String trsfDtRule; 
@Column(name = "FEE_FREE_YN") 
private String feeFreeYn; 
@Column(name = "TO_BANK_CD") 
private String toBankCd; 
@Column(name = "TO_CUST_NM") 
private String toCustNm; 
@Column(name = "FEE_AMT") 
private BigDecimal feeAmt; 
@Column(name = "APPL_RMRK") 
private String applRmrk; 
@Column(name = "RMTE_ACCT_DP_KIND_CD") 
private String rmteAcctDpKindCd; 
@Column(name = "RTGS_TP") 
private String rtgsTp; 
@Column(name = "OUR_REF") 
private String ourRef; 
@Column(name = "MULTI_KEY") 
private String multiKey; 
@Column(name = "LST_IB_DT") 
private Date lstIbDt; 
@Column(name = "LST_IB_TIME") 
private String lstIbTime; 
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
