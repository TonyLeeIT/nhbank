package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_COM_FPBODY") 
@Data 
public class ACOM_COM_FPBODYInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date REG_DT; 
private String PRT_KIND; 
private Date UPD_DT; 
private int HIS_NO; 
private int LINE_SEQ; 
private String LINE_TXT; 
private String REF_NO; 
private String UPD_EMP_NO; 
private String UPD_TM; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
