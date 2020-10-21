package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.*; 
import java.io.Serializable; 
import java.math.BigDecimal; 
import java.util.Date; 
@Entity 
@IdClass(ADST_LNB_SCHInfo_ID.class) 
@Table(name = "ADST_LNB_SCH") 
@Data 
public class ADST_LNB_SCHInfo implements Serializable { 
@Id 
@Column(name = "REF_NO") 
private String refNo; 
@Id 
@Column(name = "SCH_GB") 
private String schGb; 
@Id 
@Column(name = "ADJ_SEQ") 
private BigDecimal adjSeq; 
@Id 
@Column(name = "SCH_SEQ") 
private BigDecimal schSeq; 
@Column(name = "STS") 
private String sts; 
@Column(name = "PROCESS_GB") 
private String processGb; 
@Column(name = "MAKE_IL") 
private Date makeIl; 
@Column(name = "PLAN_IL") 
private Date planIl; 
@Column(name = "CCY") 
private String ccy; 
@Column(name = "PLAN_AMT") 
private BigDecimal planAmt; 
@Column(name = "FST_PAY_IL") 
private Date fstPayIl; 
@Column(name = "PAY_AMT") 
private BigDecimal payAmt; 
@Column(name = "USD_CVT_AMT") 
private BigDecimal usdCvtAmt; 
@Column(name = "BBS_CVT_AMT") 
private BigDecimal bbsCvtAmt; 
@Column(name = "DS_AMT") 
private BigDecimal dsAmt; 
@Column(name = "INDEX_RT") 
private BigDecimal indexRt; 
@Column(name = "SPREAD_GB") 
private String spreadGb; 
@Column(name = "SPREAD_RT") 
private BigDecimal spreadRt; 
@Column(name = "TOTAL_RT") 
private BigDecimal totalRt; 
@Column(name = "FROM_IL") 
private Date fromIl; 
@Column(name = "TO_IL") 
private Date toIl; 
@Column(name = "DS_TERM") 
private BigDecimal dsTerm; 
@Column(name = "MISU_INT_AMT") 
private BigDecimal misuIntAmt; 
@Column(name = "JS_AMT") 
private BigDecimal jsAmt; 
@Column(name = "JS_RCV_AMT") 
private BigDecimal jsRcvAmt; 
@Column(name = "JS_DS_AMT") 
private BigDecimal jsDsAmt; 
@Column(name = "JS_FR_IL") 
private Date jsFrIl; 
@Column(name = "JS_TO_IL") 
private Date jsToIl; 
@Column(name = "JS_DS_TERM") 
private BigDecimal jsDsTerm; 
@Column(name = "JS_LISU_IL") 
private Date jsLisuIl; 
@Column(name = "PT_AMT") 
private BigDecimal ptAmt; 
@Column(name = "PT_RCV_AMT") 
private BigDecimal ptRcvAmt; 
@Column(name = "PT_DS_AMT") 
private BigDecimal ptDsAmt; 
@Column(name = "PT_FR_IL") 
private Date ptFrIl; 
@Column(name = "PT_TO_IL") 
private Date ptToIl; 
@Column(name = "PT_DS_TERM") 
private BigDecimal ptDsTerm; 
@Column(name = "PT_LISU_IL") 
private Date ptLisuIl; 
@Column(name = "PT_RT") 
private BigDecimal ptRt; 
@Column(name = "YC_AMT") 
private BigDecimal ycAmt; 
@Column(name = "YC_RCV_AMT") 
private BigDecimal ycRcvAmt; 
@Column(name = "YC_DS_AMT") 
private BigDecimal ycDsAmt; 
@Column(name = "YC_FR_IL") 
private Date ycFrIl; 
@Column(name = "YC_TO_IL") 
private Date ycToIl; 
@Column(name = "YC_DS_TERM") 
private BigDecimal ycDsTerm; 
@Column(name = "YC_LISU_IL") 
private Date ycLisuIl; 
@Column(name = "YC_RT") 
private BigDecimal ycRt; 
@Column(name = "MAKE_HIS_NO") 
private BigDecimal makeHisNo; 
@Column(name = "LST_SUB_NO") 
private BigDecimal lstSubNo; 
@Column(name = "LST_AC_IL") 
private Date lstAcIl; 
@Column(name = "LST_IB_IL") 
private Date lstIbIl; 
@Column(name = "FIX_GB") 
private String fixGb; 
@Column(name = "FIX_AMT") 
private BigDecimal fixAmt; 
@Column(name = "PV_RT") 
private BigDecimal pvRt; 
@Column(name = "PV_AMT") 
private BigDecimal pvAmt; 
@Column(name = "SEQ_NO") 
private BigDecimal seqNo; 
@Column(name = "RATE_FIX_IL") 
private Date rateFixIl; 
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
