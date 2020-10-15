package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFIF_MMH_HIS") 
@Data 
public class AFIF_MMH_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private String TR_CD; 
private String UPD_EMP_NO; 
private String USER_ID; 
private String CD_SNG_NO; 
private String PRE_STS; 
private String SD_BR; 
private int CD_SIL_SEQ; 
private String SND_DOC_NO; 
private String STS; 
private Date AC_IL; 
private int TR_BAMT; 
private Date UPD_DT; 
private String REF_NO; 
private int TR_FAMT; 
private String FTP_SNG_NO; 
private Date CAN_IL; 
private int FTP_SIL_SEQ; 
private String REG_EMP_NO; 
private Date REG_DT; 
private Date GIS_IL; 
private String IBJI_MD; 
private int SD_HIS_NO; 
private int HIS_NO; 
private Date LST_IB_IL; 
private int AF_JAN; 
private Date IB_IL; 
private String MANAGER_ID; 
private String TR_TIME; 
private String TR_BR; 
private String TR_GB; 
private String UPD_TM; 
private String TR_CCY; 
private String FRONT_SND_GB; 
private String REG_TM; 
} 
