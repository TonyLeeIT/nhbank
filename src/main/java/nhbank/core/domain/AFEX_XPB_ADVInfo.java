package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_XPB_ADV") 
@Data 
public class AFEX_XPB_ADVInfo implements Serializable { 
@Id 
@GeneratedValue 
private int NCU_HD_AMT; 
private String TRSF_APPL_NM; 
private String UPD_EMP_NO; 
private int MISU_BAMT; 
private Date BE_LCA_IL; 
private String STS; 
private String CA_GB; 
private int NCU_LESS_CA_AMT; 
private Date UPD_DT; 
private int LESS_CO_AMT; 
private Date SD_TR_IL; 
private String IJ_GB; 
private String REG_EMP_NO; 
private String MT103_DOC_ID; 
private Date GIS_IL; 
private int HD_AMT; 
private String JUN_NO1; 
private int NCU_LESS_GT_AMT; 
private String JUN_NO2; 
private int HIS_NO; 
private int NCU_MISU_AMT; 
private String JUN_NO3; 
private int AMT; 
private String NCU_CCY; 
private String SONIK_GB; 
private int MISU_AMT; 
private String TRSF_REFNO; 
private int NCU_LESS_CO_AMT; 
private String BUIB_GB; 
private String TRSF_ACCT; 
private int LESS_CA_AMT; 
private String PAY_DO_YN; 
private int SONIK_AMT; 
private String JUB_GB; 
private String TRSF_BENE_NM; 
private String PL_JI_GB; 
private Date AC_IL; 
private String ADV_GB; 
private Date MAN_IL; 
private String REF_NO; 
private int NCU_OVER_AMT; 
private String TRSF_ABANO; 
private int JUN_AMT; 
private Date REG_DT; 
private String YUK_NO; 
private String FEE_RCV_BY; 
private Date LST_IB_IL; 
private Date CA_MAN_IL; 
private String DEPO_BKCD; 
private int NCU_JUN_AMT; 
private String CCY; 
private int LESS_GT_AMT; 
private String DELAY_GB; 
private String UPD_TM; 
private int NCU_AMT; 
private int OVER_AMT; 
private String REG_TM; 
} 
