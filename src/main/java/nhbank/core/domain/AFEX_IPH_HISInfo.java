package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_IPH_HIS") 
@Data 
public class AFEX_IPH_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String DOC_ID4; 
private String DOC_ID3; 
private String DOC_ID2; 
private String TR_CD; 
private String MNG_NO; 
private String UPD_EMP_NO; 
private String STS; 
private int SEQ_NO; 
private Date UPD_DT; 
private String REF_NO; 
private String IB_TIME; 
private String DOC_ID1; 
private int AMD_SEQ; 
private Date CAN_IL; 
private String REG_EMP_NO; 
private String OP_NO; 
private Date REG_DT; 
private int SD_HIS_NO; 
private int HIS_NO; 
private String GWAM_CD; 
private Date IB_IL; 
private String TR_BR; 
private String TR_GB; 
private String UPD_TM; 
private String REG_TM; 
} 
