package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_EPB_BASE") 
@Data 
public class ACOM_EPB_BASEInfo implements Serializable { 
@Id 
@GeneratedValue 
private int ASSIGN_CAMT; 
private int PLUS_AMT; 
private int ADD_AMT; 
private int MINUS_AMT; 
private int ASSIGN_AMT; 
private String UPD_EMP_NO; 
private int DR_AMT; 
private int TOTAL_AMT; 
private String STS; 
private Date AC_IL; 
private Date UPD_DT; 
private String REF_NO; 
private int LST_HIS_NO; 
private int CR_AMT; 
private Date LST_IL; 
private String EXP_CD; 
private String REG_EMP_NO; 
private Date REG_DT; 
private Date LST_IB_IL; 
private String MNG_YY; 
private String BUSI_CD; 
private Date IB_IL; 
private int BJ_AMT; 
private int ADD_CAMT; 
private String CCY; 
private int ALLOCATE_AMT; 
private String MNG_BR; 
private String UPD_TM; 
private String REG_TM; 
} 
