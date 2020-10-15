package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_CIX_LOCAL") 
@Data 
public class ACOM_CIX_LOCALInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date REG_DT; 
private String ITEM_NM; 
private Date UPD_DT; 
private String UPD_EMP_NO; 
private String REG_DV_CD; 
private String CIX_NO; 
private String UPD_TM; 
private String ITEM_CTT; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
