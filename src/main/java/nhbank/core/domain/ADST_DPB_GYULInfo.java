package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_GYUL") 
@Data 
public class ADST_DPB_GYULInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date REG_DT; 
private int INT_TAX1; 
private int INT_TAX2; 
private String YEDE; 
private int HIS_NO; 
private String LST_TIME; 
private String UPD_EMP_NO; 
private Date LST_IB_IL; 
private String ACCT_NO; 
private String ERR_MSG; 
private Date IB_IL; 
private String STS; 
private int INT_YC_INT; 
private String ERR_NO; 
private Date UPD_DT; 
private String ERR_PGM; 
private int PRCP_YC_INT; 
private int MM_AVG_AMT; 
private String UPD_TM; 
private int JS_INT; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
