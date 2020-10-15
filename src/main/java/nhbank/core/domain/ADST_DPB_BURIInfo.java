package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_BURI") 
@Data 
public class ADST_DPB_BURIInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date REG_DT; 
private int PRCP_OVER_DUE_INT_RT; 
private int LON_INT_YC_INT; 
private Date TERM_IL; 
private int LON_PRCP_YC_INT; 
private String UPD_EMP_NO; 
private String ACCT_NO; 
private int LON_SNG_AMT; 
private int INT_OVER_DUE_INT_RT; 
private String LON_RT_CD; 
private int MAX_JAN; 
private Date BURI_IL; 
private int LON_OVR_AMT; 
private Date UPD_DT; 
private String LON_YD_CD; 
private int LON_RT; 
private int COL_LON_INT; 
private String UPD_TM; 
private int FST_JAN; 
private int BURI_JAN; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
