package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_ADH_HIS") 
@Data 
public class AFEX_ADH_HISInfo implements Serializable { 
@Id 
@GeneratedValue 
private int EDI_SEQ; 
private int YD_SEQ; 
private String TR_CD; 
private String IBGM_MD; 
private String BUSEO_NO; 
private String MNG_NO; 
private String UPD_EMP_NO; 
private int BASE_SEQ; 
private String STS; 
private Date AC_IL; 
private Date UPD_DT; 
private int OPEN_AMT; 
private String BR_NO; 
private String EDI_FNM; 
private String IB_TIME; 
private String RE_ISSUE; 
private int BR_CHARGE; 
private int CHARGE_AMT; 
private Date CAN_IL; 
private String REG_EMP_NO; 
private String OP_NO; 
private Date REG_DT; 
private String OPEN_CCY; 
private int AMEND_SEQ; 
private Date GIS_IL; 
private int SD_HIS_NO; 
private Date ADV_MAKE_IL; 
private int HIS_NO; 
private int AMD_CNT; 
private Date EDI_IL; 
private String YD_GUJA; 
private String CIX_NO; 
private Date IB_IL; 
private String CHARGE_GB; 
private String SD_REF_NO; 
private String TR_BR; 
private String TR_GB; 
private String ADV_NO; 
private String UPD_TM; 
private String REG_TM; 
} 
