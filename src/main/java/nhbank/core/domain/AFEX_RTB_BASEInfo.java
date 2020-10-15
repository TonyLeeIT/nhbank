package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RTB_BASE") 
@Data 
public class AFEX_RTB_BASEInfo implements Serializable { 
@Id 
@GeneratedValue 
private String ID_NO; 
private Date REG_DT; 
private int BUY_FAMT; 
private int FRT_RT; 
private String UPD_EMP_NO; 
private String SAYU_CD; 
private Date LST_IB_IL; 
private String SEL_CCY; 
private String CIX_NO; 
private String FRT_GB; 
private String CIX_NM; 
private Date AC_IL; 
private Date UPD_DT; 
private String REF_NO; 
private String NATION_CD; 
private String BUY_CCY; 
private int SEL_FAMT; 
private int EX_HRT; 
private int FRT_AMT; 
private String UPD_TM; 
private String RATE_AMT_GB; 
private String REMARK; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
