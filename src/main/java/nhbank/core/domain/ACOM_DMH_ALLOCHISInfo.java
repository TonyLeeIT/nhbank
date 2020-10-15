package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_DMH_ALLOCHIS") 
@Data 
public class ACOM_DMH_ALLOCHISInfo implements Serializable { 
@Id 
@GeneratedValue 
private int ALLOC_AMT; 
private String OP_NO; 
private Date REG_DT; 
private Date GIS_IL; 
private int HIS_NO; 
private String MNG_NO; 
private String UPD_EMP_NO; 
private String CIX_NO; 
private int ALLOC_RATIO; 
private Date IB_IL; 
private String SD_BR; 
private String DAMBO_NO; 
private String STS; 
private Date AC_IL; 
private String TR_TIME; 
private int SEQ_NO; 
private Date UPD_DT; 
private String TR_BR; 
private String SNG_NO; 
private String UPD_TM; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
