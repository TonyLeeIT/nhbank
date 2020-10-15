package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPB_BDM") 
@Data 
public class AFEX_XPB_BDMInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date REG_DT; 
private Date GIS_IL; 
private int HIS_NO; 
private int AMT; 
private String BUDO_CD; 
private String UPD_EMP_NO; 
private Date LST_IB_IL; 
private String BM_GB; 
private int MI_SEQ; 
private int MI_SH_BAMT; 
private String NCU_CCY; 
private int SH_SEQ; 
private int SH_SUM_AMT; 
private String STS; 
private Date AC_IL; 
private Date UPD_DT; 
private String REF_NO; 
private String CCY; 
private int MI_TR_BAMT; 
private int NCU_SH_SUM_AMT; 
private String UPD_TM; 
private int NCU_AMT; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
