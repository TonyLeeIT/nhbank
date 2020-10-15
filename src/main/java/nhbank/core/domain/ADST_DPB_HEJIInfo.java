package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ADST_DPB_HEJI") 
@Data 
public class ADST_DPB_HEJIInfo implements Serializable { 
@Id 
@GeneratedValue 
private int DEP_CNT; 
private int DPT_RT; 
private int TRX_NO; 
private int TOT_PAY_AAMT; 
private String TR_CD; 
private int AF_INT_AAMT; 
private int RTN_TAX4_AMT; 
private String UPD_EMP_NO; 
private int RTN_INT_AAMT; 
private String ACCT_NO; 
private int TAX3_AMT; 
private String MECH_GB; 
private int BF_INT_BAMT; 
private int TAX1_AMT; 
private Date CLS_IL; 
private String STS; 
private Date UPD_DT; 
private int RTN_TAX1_AMT; 
private String IB_TIME; 
private int TAX2_AMT; 
private int CLS_FEE; 
private Date CAN_IL; 
private int CLS_AAMT; 
private String REG_EMP_NO; 
private String BF_CIX_NO; 
private String OP_NO; 
private Date REG_DT; 
private Date GIS_IL; 
private int TAX_RT; 
private int TOT_PAY_BAMT; 
private int RTN_TAX2_AMT; 
private int HIS_NO; 
private int AF_INT_BAMT; 
private int RTN_INT_BAMT; 
private Date IB_IL; 
private int BF_INT_AAMT; 
private int PNLT_AMT; 
private int RTN_TAX3_AMT; 
private int TAX4_AMT; 
private String UPD_TM; 
private int CLS_BAMT; 
private String REG_TM; 
} 
