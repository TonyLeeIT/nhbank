package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_IPB_DJH") 
@Data 
public class AFEX_IPB_DJHInfo implements Serializable { 
@Id 
@GeneratedValue 
private String HOI_GB; 
private Date REG_DT; 
private Date GIS_IL; 
private int IJA_BAMT; 
private int IJA_FRT; 
private int HIS_NO; 
private String UPD_EMP_NO; 
private Date LST_IB_IL; 
private int SSEQ; 
private int IJA_DS_TERM; 
private String STS; 
private Date AC_IL; 
private Date UPD_DT; 
private String REF_NO; 
private String CCY; 
private int BAMT; 
private Date IJA_TO_IL; 
private Date IJA_FR_IL; 
private String UPD_TM; 
private int SEQ; 
private Date BE_LST_HOI_IL; 
private int DS_AMT; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
