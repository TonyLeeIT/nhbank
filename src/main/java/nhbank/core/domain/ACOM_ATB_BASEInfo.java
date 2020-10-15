package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_ATB_BASE") 
@Data 
public class ACOM_ATB_BASEInfo implements Serializable { 
@Id 
@GeneratedValue 
private String TR_TYPE; 
private String LST_IB_TIME; 
private String TRSF_TP; 
private String PURPOSE_CD; 
private int PROC_TIMES; 
private String FR_CIX_NO; 
private String RTGS_TP; 
private String UPD_EMP_NO; 
private String APPL_RMRK; 
private String FR_ACCT_NO; 
private String FEE_FREE_YN; 
private String RCV_ADDR; 
private String STS; 
private Date UPD_DT; 
private String REF_NO; 
private Date OPN_DT; 
private String CHANNEL_TYPE; 
private String TRSF_DT_RULE; 
private String TYPE; 
private String RETRY_YN; 
private String REG_EMP_NO; 
private int LIMIT_AMT; 
private Date REG_DT; 
private String REL_APPLY_NO; 
private int TR_AMT; 
private String MULTI_KEY; 
private int FEE_AMT; 
private int DUE_TIMES; 
private String DUE_TYPE; 
private String OUR_REF; 
private String TO_CUST_NM; 
private String RMTE_ACCT_DP_KIND_CD; 
private String CIX_NO; 
private String TO_REF_NO; 
private String RCV_RMRK; 
private Date EXP_DT; 
private String MGNT_BR_NO; 
private String PAYER_INF; 
private String CCY; 
private int DEP_TIMES; 
private Date LST_IB_DT; 
private int TOT_TIMES; 
private String TO_BANK_CD; 
private String UPD_TM; 
private int DUE_DAY; 
private String REG_TM; 
} 
