package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_LNB_FEE")
@Data
public class ADST_LNB_FEEInfo implements Serializable {
    @Id
    @GeneratedValue
    private int BIZ_NO;
    private int FEE_DS_BAMT;
    private String UPD_EMP_NO;
    private int SCH_SUB_NO;
    private Date FEE_FR_IL;
    private String STS;
    private int SEQ_NO;
    private int FEE_O_RT;
    private Date UPD_DT;
    private String REF_NO;
    private Date FEE_TO_IL;
    private String RATE_AMT_GB;
    private int FEE_DS_AMT;
    private String REG_EMP_NO;
    private Date LST_AC_IL;
    private Date REG_DT;
    private int FEE_AMT;
    private int SCH_SEQ;
    private int HIS_NO;
    private int FEE_S_RT;
    private int FEE_DAYS;
    private Date LST_IB_IL;
    private Date FST_IB_IL;
    private String FEE_GB;
    private String CCY;
    private int ADJ_SEQ;
    private Date FEE_RCV_IL;
    private String UPD_TM;
    private String REG_TM;
} 
