package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPH_RENEGO") 
@Data 
public class AFEX_XPH_RENEGOInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date TR_IL; 
private String UPD_EMP_NO; 
private String CC_GB; 
private int DC_AMT; 
private String NEGO_CCY; 
private String REIM_BKCD; 
private String STS; 
private int CABLE; 
private int COLL_AMT; 
private String COLL_BKCD; 
private Date UPD_DT; 
private int EXPR_AMT; 
private String REF_NO; 
private int NEGO_AMT; 
private String REG_EMP_NO; 
private Date REG_DT; 
private String YUK_NO; 
private String NCU_NEGO_CCY; 
private int HIJA_AMT; 
private String EXPR_CCY; 
private String CC_RT_CD; 
private Date EXPR_IL; 
private String M999_NM; 
private Date NEGO_IL; 
private String REIM_BKNM; 
private String COLL_BKNM; 
private Date CC_IL; 
private String RENE_GB; 
private String M202_NM; 
private String UPD_TM; 
private int NCU_NEGO_AMT; 
private String REG_TM; 
} 
