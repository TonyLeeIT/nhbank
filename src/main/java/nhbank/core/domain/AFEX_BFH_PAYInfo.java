package nhbank.core.domain; 
import lombok.Data; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import java.io.Serializable; 
import java.sql.Date; 
@Entity 
@Table(name = "AFEX_BFH_PAY") 
@Data 
public class AFEX_BFH_PAYInfo implements Serializable { 
@Id 
@GeneratedValue 
private Date CONFIRM_IL; 
private String JG_BKNM; 
private String UPD_EMP_NO; 
private String COND_STS; 
private String FEE_CCY; 
private int TRAN_AMT; 
private String TAG72_INFO1; 
private String TAG72_INFO2; 
private String TAG72_INFO3; 
private String TAG72_INFO4; 
private String TAG72_INFO5; 
private Date UPD_DT; 
private String TAG72_INFO6; 
private Date LST_IL; 
private String JG_BK_ADDR1; 
private String JG_BK_ADDR2; 
private String NODDCT_YN; 
private String JG_BK_ADDR3; 
private String REG_EMP_NO; 
private Date GIS_IL; 
private String JG_BKCD; 
private String PAY_DOCID; 
private int HIS_NO; 
private String MSG_TYPE; 
private String JG_BK_ACCT; 
private String PAY_GB; 
private String FEE_GB; 
private String BENE_BKNM; 
private String BENE_ADDR1; 
private String SEND_REF_NO; 
private Date REFUND_IL; 
private String PROC_TYPE; 
private String BENE_ADDR3; 
private String BENE_ADDR2; 
private Date VALUE_IL; 
private String SETL_BKCD; 
private Date AC_IL; 
private String REF_NO; 
private String BENE_BKCD; 
private Date REG_DT; 
private String TRAN_CCY; 
private int REFUND_AMT; 
private String SETL_DEPO; 
private String SETL_ADDR2; 
private String RECV_REF_NO; 
private String SETL_ADDR3; 
private int FEE_AMT; 
private String SETL_ADDR1; 
private String REMARK1; 
private Date LST_IB_IL; 
private String REMARK3; 
private String SETL_BKNM; 
private String BENE_ACCT; 
private String REMARK2; 
private String REMARK5; 
private String REMARK4; 
private String VCB_DOWN_YN; 
private String REMARK6; 
private Date MAKE_IL; 
private String UPD_TM; 
private int PAY_CNT; 
private String REG_TM; 
} 
