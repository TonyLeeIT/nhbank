package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RCH_TRAN") 
@Data 
public class AFEX_RCH_TRANInfo implements Serializable { 
@Id 
@GeneratedValue 
private String DOC_ID; 
private Date REG_DT; 
private String CD; 
private Date TR_IL; 
private String OUR_REF; 
private String UPD_EMP_NO; 
private String OTHER_REF; 
private Date IB_IL; 
private int DRCR_AMT; 
private Date UPD_DT; 
private String DRCR_GB; 
private String THEIR_REF; 
private String MT_GB; 
private String CCY; 
private int TR_SEQ; 
private Date VAL_IL; 
private String IB_TIME; 
private String UPD_TM; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
