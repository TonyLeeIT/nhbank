package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_BFH_HIS") 
@Data 
public class AFEX_BFH_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String TR_CD; 
private String UPD_EMP_NO; 
private int BEFORE_AMT; 
private int AFTER_AMT; 
private String STS; 
private Date AC_IL; 
private Date UPD_DT; 
private String REF_NO; 
private String BF_RECV_REF_NO; 
private Date CAN_IL; 
private String REG_EMP_NO; 
private String OP_NO; 
private Date REG_DT; 
private Date GIS_IL; 
private int SD_HIS_NO; 
private int HIS_NO; 
private String BF_RECV_BKCD; 
private String CIX_NO; 
private Date IB_IL; 
private String BF_RECV_DEPO; 
private String BF_BASE_STS; 
private int BF_CH_AMT; 
private String TR_GB; 
private String MNG_BR; 
private String UPD_TM; 
private String REG_TM; 
} 
