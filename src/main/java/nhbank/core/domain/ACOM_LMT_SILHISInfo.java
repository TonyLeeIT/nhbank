package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_LMT_SILHIS") 
@Data 
public class ACOM_LMT_SILHISInfo implements Serializable { 
@Id 
@GeneratedValue 
private int TRX_FAMT; 
private int GUR_FJAN; 
private String TR_CD; 
private String UPMU_CD; 
private String GEOR_CD; 
private String MNG_NO; 
private String UPD_EMP_NO; 
private String ACT_CD; 
private int SIL_AMT; 
private int GUR_BAMT; 
private String SIL_GB; 
private int TRX_BAMT; 
private String SD_BR; 
private String STS; 
private Date AC_IL; 
private Date UPD_DT; 
private String REF_NO; 
private String GUR_FPMGB; 
private String SNG_NO; 
private int GUR_BJAN; 
private String GUR_BPMGB; 
private String REG_EMP_NO; 
private String OP_NO; 
private Date REG_DT; 
private String SIL_CCY; 
private Date GIS_IL; 
private int HIS_NO; 
private int TRSC_SEQ_NO; 
private int DJG_AMT; 
private Date IB_IL; 
private String DJG_PMGB; 
private int GUR_FAMT; 
private String TR_TIME; 
private String TR_BR; 
private String SIL_PMGB; 
private int DJG_JAN; 
private int SIL_JAN; 
private String UPD_TM; 
private String REG_TM; 
} 
