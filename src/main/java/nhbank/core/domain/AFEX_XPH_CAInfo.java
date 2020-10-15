package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPH_CA")
@Data
public class AFEX_XPH_CAInfo implements Serializable {
    @Id
    @GeneratedValue
    private int NCU_LESS_CO_AMT;
    private String DIV_REF;
    private String MT_TR_MD;
    private String UPD_EMP_NO;
    private String CC_GB;
    private int LESS_CA_AMT;
    private String CA_CCY;
    private String STS;
    private int CA_AMT;
    private String RCV_GB;
    private int NCU_LESS_CA_AMT;
    private int SEQ_NO;
    private Date UPD_DT;
    private String REF_NO;
    private int LESS_CO_AMT;
    private int NCU_OVER_AMT;
    private Date RCV_IL;
    private String DIV_GB;
    private String REG_EMP_NO;
    private String OP_NO;
    private Date REG_DT;
    private Date SD_BAL_IL;
    private int NCU_LESS_GT_AMT;
    private String NCU_CA_CCY;
    private String CC_RT_CD;
    private String CD_GB;
    private Date CA_IL;
    private String SWIFT_KEY;
    private String DEPO_BKCD;
    private Date CC_IL;
    private String DEPO_CD;
    private int NCU_CA_AMT;
    private int LESS_GT_AMT;
    private String TR_GB;
    private String UPD_TM;
    private int OVER_AMT;
    private String REG_TM;
} 
