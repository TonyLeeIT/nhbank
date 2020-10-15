package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_LNB_HIS")
@Data
public class ADST_LNB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String TR_CD;
    private int BF_MSB_SEQ;
    private String UPD_EMP_NO;
    private String USER_ID;
    private String CD_SNG_NO;
    private String SND_DOC_NO;
    private Date BF_LISU_IL;
    private String STS;
    private Date BF_IYC_IL;
    private int TR_BAMT;
    private Date UPD_DT;
    private int BF_INT_SEQ;
    private int TR_FAMT;
    private int BF_REPAY_SEQ;
    private Date CAN_IL;
    private int FTP_SIL_SEQ;
    private String REG_EMP_NO;
    private Date BF_NREPAY_IL;
    private Date GIS_IL;
    private int SD_HIS_NO;
    private String SH_JAGUM_GB;
    private int HIS_NO;
    private String YD_GUJA;
    private int AF_JAN;
    private Date IB_IL;
    private String MANAGER_ID;
    private Date BF_PYC_IL;
    private String TR_TIME;
    private String TR_CCY;
    private String SD_BR;
    private int BF_MISU_AMT;
    private int CD_SIL_SEQ;
    private Date AC_IL;
    private String REF_NO;
    private String FTP_SNG_NO;
    private Date BF_NROLL_IL;
    private Date REG_DT;
    private String IBJI_MD;
    private Date LST_IB_IL;
    private Date BF_LREPAY_IL;
    private String CIX_NO;
    private Date BF_NISU_IL;
    private String FEE_MD;
    private Date BF_LIIB_IL;
    private String TR_BR;
    private String TR_GB;
    private String UPD_TM;
    private int BF_LST_RT;
    private String REG_TM;
} 
