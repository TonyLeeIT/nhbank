package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_LNB_REPAY") 
@Data 
public class ADST_LNB_REPAYInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date REG_DT; 
private Date REPAY_IL; 
private int SCH_SEQ; 
private Date FST_DEAL_IL; 
private int HIS_NO; 
private String UPD_EMP_NO; 
private Date LST_IB_IL; 
private int SCH_SUB_NO; 
private int BBS_CVT_AMT; 
private String INT_GB; 
private int REPAY_AMT; 
private Date LST_DEAL_IL; 
private String STS; 
private int SEQ_NO; 
private Date UPD_DT; 
private String YC_GB; 
private String REF_NO; 
private String CCY; 
private int ADJ_SEQ; 
private int USD_CVT_AMT; 
private String REPAY_STYLE; 
private String UPD_TM; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
