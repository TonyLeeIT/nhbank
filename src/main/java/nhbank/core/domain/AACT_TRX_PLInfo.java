package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AACT_TRX_PL")
@Data
public class AACT_TRX_PLInfo implements Serializable {
    @Id
    @GeneratedValue
    private int O_FEE_FAMT;
    private String GEOR_CD;
    private String GAM_GB;
    private int O_FEE_BAMT;
    private String UPD_EMP_NO;
    private String YD_GB;
    private String O_DS_CCY;
    private String S_DS_CCY;
    private String PL_CD;
    private int S_APPL_HRT;
    private int P_APPL_HRT;
    private String IBJI_CD;
    private String PST_GB;
    private Date UPD_DT;
    private String P_CCY;
    private Date O_TO_IL;
    private int O_ILSU;
    private String REG_EMP_NO;
    private String DOC_ID;
    private int HIS_NO;
    private int S_FEE_BAMT;
    private int S_BASIC_HRT;
    private int S_FEE_FAMT;
    private int P_FTP_RT;
    private int O_APPL_HRT;
    private String JUKI_GB;
    private int P_GOSI_HRT;
    private int P_BASIC_HRT;
    private String SLIP_GB;
    private String FEE_CD;
    private int S_DEMI_HRT;
    private String IFRS_DV_CD;
    private String ID_NO;
    private String REF_NO2;
    private String ORG_GB;
    private String POS_GB;
    private String UPMU_CD;
    private int S_BOOK_HRT;
    private int SEG_SEQ;
    private int P_BOOK_HRT;
    private int S_ILSU;
    private Date ACT_IL;
    private int O_INT_RT;
    private String REF_NO;
    private String IBF_GB;
    private int YD_HISNO;
    private int O_DS_AMT;
    private int S_DS_AMT;
    private String REMARK;
    private Date REG_DT;
    private int S_FTP_RT;
    private Date O_FROM_IL;
    private String PL_CCY;
    private int S_INT_RT;
    private int P_BAMT;
    private int O_FTP_RT;
    private String CIX_NO;
    private int P_FAMT;
    private String YD_REFNO;
    private Date S_FROM_IL;
    private int S_GOSI_HRT;
    private String THEIR_REFNO;
    private String ILGE_GB;
    private int P_DEMI_HRT;
    private String UPD_TM;
    private Date S_TO_IL;
    private String ACT_BR;
    private String REG_TM;
} 
