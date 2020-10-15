package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPB_LGM") 
@Data 
public class AFEX_XPB_LGMInfo implements Serializable { 
@Id 
@GeneratedValue 
private int OP_NO; 
private Date REG_DT; 
private Date GIS_IL; 
private int HIS_NO; 
private String UPD_EMP_NO; 
private Date LST_IB_IL; 
private String HAJA_CD; 
private String STS; 
private Date AC_IL; 
private String TR_TIME; 
private Date UPD_DT; 
private String REF_NO; 
private String TR_BR; 
private String HAJA_MNG_INFO; 
private String HAJA_SAYU; 
private String UPD_TM; 
private String MJ_GB; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
