package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPH_TRA") 
@Data 
public class AFEX_XPH_TRAInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date REG_DT; 
private Date GIS_IL; 
private int HIS_NO; 
private String MT_GUBUN; 
private int AMT; 
private String UPD_EMP_NO; 
private String THRU_BANK; 
private String FILE_NAME; 
private String TRA_GB; 
private String NCU_CCY; 
private String TLX_NO; 
private String STS; 
private Date AC_IL; 
private int SEQ_NO; 
private String IN_OUT_GB; 
private Date UPD_DT; 
private String REF_NO; 
private String CCY; 
private String UPD_TM; 
private int NCU_AMT; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
