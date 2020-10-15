package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "ACOM_EPB_RPT") 
@Data 
public class ACOM_EPB_RPTInfo implements Serializable { 
@Id 
@GeneratedValue 
private String TR_CD; 
private String UPD_EMP_NO; 
private int PL_CR_AMT; 
private String BUSI_GRP_CD; 
private String PL_CD; 
private Date ACR_FM_DT; 
private int BIZ_SUB_SEQ; 
private String DN_GB; 
private int TR_BAMT; 
private Date UPD_DT; 
private String REF_NO; 
private String REMARK; 
private int BG_CR_AMT; 
private String REG_EMP_NO; 
private String MNG_YR; 
private int ACR_AMT; 
private Date REG_DT; 
private int HIS_NO; 
private Date ACR_TO_DT; 
private String BUSI_CD; 
private int BG_DR_AMT; 
private String ACR_NO; 
private Date TR_DT; 
private String TR_GB; 
private String ACR_STS; 
private String MNG_BR; 
private String UPD_TM; 
private String TR_CCY; 
private int BIZ_SEQ; 
private int PL_DR_AMT; 
private String REG_TM; 
} 
