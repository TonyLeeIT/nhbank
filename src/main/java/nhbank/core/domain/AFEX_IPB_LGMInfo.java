package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_IPB_LGM")
@Data
public class AFEX_IPB_LGMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String UPD_EMP_NO;
    private String SHIP_NM;
    private String S_JUK_GB;
    private Date BL_BAL_IL;
    private String BL_NO;
    private int JILG_BAMT;
    private String STS;
    private Date UPD_DT;
    private int JILG_FAMT;
    private String REG_EMP_NO;
    private String MFCS_RT_CD;
    private Date BL_JUB_IL;
    private Date GIS_IL;
    private int LGCOM_DS_AMT;
    private Date LGCOM_TO_IL;
    private int HIS_NO;
    private int AMT;
    private int SSEQ;
    private int BOJ_BJAN2;
    private String BL_GB;
    private String SHIP_CO_ADDR1;
    private String SHIP_CO_ADDR2;
    private int SEQ;
    private String BOJFEE_GB;
    private int BOJ_JAN2;
    private Date TC_LISU_IL;
    private Date YMAN_IL;
    private int TERM;
    private int BLD_SEQ;
    private String BOJ_JUK_GB;
    private String LG_HOI_GB;
    private Date AC_IL;
    private String REF_NO;
    private int S_DS_AMT;
    private String CS_GB;
    private Date REG_DT;
    private String SHIP_CO;
    private Date LST_IB_IL;
    private Date S_YJ_IL;
    private int BOJ_JUK_YUL;
    private int LGCOM_FRT;
    private int JAN;
    private String CCY;
    private String TR_GB;
    private int INS_HIS_NO;
    private Date LGCOM_FR_IL;
    private String UPD_TM;
    private int P_SSEQ;
    private String TERM_GB;
    private String REG_TM;
} 
