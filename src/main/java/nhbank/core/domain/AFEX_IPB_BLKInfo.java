package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_IPB_BLK")
@Data
public class AFEX_IPB_BLKInfo implements Serializable {
    @Id
    @GeneratedValue
    private int DJB_SEQ;
    private int NCU_GT_AMT;
    private String SET_BKCD;
    private String UPD_EMP_NO;
    private int JILC_BAMT;
    private int JILC_FAMT;
    private int JILG_BAMT;
    private String STS;
    private Date AC_IL;
    private Date UPD_DT;
    private String REF_NO;
    private int JILG_FAMT;
    private String AMT_GB;
    private String REG_EMP_NO;
    private Date REG_DT;
    private Date GIS_IL;
    private int GT_AMT;
    private int HIS_NO;
    private int AMT;
    private Date LST_IB_IL;
    private int SSEQ;
    private int SNG_SSEQ;
    private String JUN_GB;
    private String SET_GB;
    private String NCU_CCY;
    private int NCU_JILC_FAMT;
    private String CCY;
    private String JAGM_GB;
    private String FJN_NO;
    private String UPD_TM;
    private int NCU_AMT;
    private int NCU_JILG_FAMT;
    private int SEQ;
    private String REG_TM;
} 
