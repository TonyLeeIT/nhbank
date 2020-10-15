package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_RCH_BAL") 
@Data 
public class AFEX_RCH_BALInfo implements Serializable { 
@Id 
@GeneratedValue 
private String DOC_ID; 
private Date REG_DT; 
private String CD; 
private Date TR_IL; 
private String ACT_CONFIRM_YN; 
private int SHW_CLBS; 
private String UPD_EMP_NO; 
private String OPER_ID; 
private String SHW_CONFIRM_YN; 
private Date LAST_IL; 
private String STS; 
private Date UPD_DT; 
private String CCY; 
private int SHW_OPBS; 
private int ACT_CLBS; 
private int ACT_OPBS; 
private String UPD_TM; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
