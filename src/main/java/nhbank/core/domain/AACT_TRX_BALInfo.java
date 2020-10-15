package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AACT_TRX_BAL") 
@Data 
public class AACT_TRX_BALInfo implements Serializable { 
@Id 
@GeneratedValue 
private String SUBJ_CD; 
private String OP_NO; 
private String ID_NO; 
private Date REG_DT; 
private String UPD_EMP_NO; 
private String CIX_NO; 
private String DTLS_BAL_DV_CD; 
private String BAL_DV_CD; 
private String STS; 
private Date UPD_DT; 
private String REF_NO; 
private int BAL_AMT; 
private String CCY; 
private String BR_NO; 
private String ATIT_CD; 
private Date APCL_STR_DT; 
private Date APCL_END_DT; 
private String UPD_TM; 
private String IFRS_DV_CD; 
private String REG_EMP_NO; 
private String REG_TM; 
} 
