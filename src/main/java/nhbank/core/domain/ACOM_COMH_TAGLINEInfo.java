package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COMH_TAGLINE") 
@Data 
public class ACOM_COMH_TAGLINEInfo implements Serializable { 
@Id 
@GeneratedValue 
private String DOC_ID; 
private Date REG_DT; 
private String LINE_TYPE; 
private String UPD_EMP_NO; 
private String TAG_NO; 
private String TAG_GB; 
private int SUB_NO; 
private String LINE_DATA; 
private int SEQ_NO; 
private Date UPD_DT; 
private String UPD_TM; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
