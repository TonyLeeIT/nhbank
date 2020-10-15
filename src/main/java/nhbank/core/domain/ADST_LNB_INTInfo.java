package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_LNB_INT") 
@Data 
public class ADST_LNB_INTInfo implements Serializable { 
@Id 
@GeneratedValue 
private String TR_CD; 
private String UPD_EMP_NO; 
private int INT_S_RT; 
private int INT_DAYS; 
private int SCH_SUB_NO; 
private int INT_DS_AMT; 
private int BBS_CVT_AMT; 
private String INT_GB; 
private int BIZ_SUBSEQ; 
private Date INT_FROM_IL; 
private Date LST_DEAL_IL; 
private String STS; 
private int SEQ_NO; 
private Date UPD_DT; 
private String REF_NO; 
private String SPREAD_GB; 
private int USD_CVT_AMT; 
private String REG_EMP_NO; 
private Date REG_DT; 
private int SCH_SEQ; 
private int HIS_NO; 
private Date LST_IB_IL; 
private Date INT_RCV_IL; 
private int INT_O_RT; 
private Date BF_JS_LISU_IL; 
private int SPREAD_RT; 
private Date FST_IB_IL; 
private int INT_AMT; 
private int INDEX_RT; 
private Date BF_PT_LISU_IL; 
private Date BF_YC_LISU_IL; 
private String MISU_GB; 
private String CCY; 
private int ADJ_SEQ; 
private String TR_GB; 
private Date INT_TO_IL; 
private String UPD_TM; 
private String ROLL_GB; 
private int BIZ_SEQ; 
private String REG_TM; 
} 
