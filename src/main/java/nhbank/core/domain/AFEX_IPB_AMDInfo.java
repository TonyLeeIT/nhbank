package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_IPB_AMD")
@Data
public class AFEX_IPB_AMDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String UPD_EMP_NO;
    private int TC_DSAMT;
    private Date BE_TC_LISU_IL;
    private String STS;
    private Date AC_IL;
    private Date UPD_DT;
    private String REF_NO;
    private String REG_EMP_NO;
    private String AMD_CD;
    private Date BE_EXP_IL;
    private Date REG_DT;
    private Date AF_EXP_IL;
    private Date GIS_IL;
    private String BE_LESS;
    private String BE_CCY;
    private int HIS_NO;
    private String AF_MORE;
    private Date LST_IB_IL;
    private String BE_MORE;
    private String AF_CCY;
    private int BOJ_JUK_YUL;
    private int BE_AMT;
    private String RE_RE_GB;
    private String AF_LESS;
    private String CCY;
    private int ID_AMT;
    private String UPD_TM;
    private int SEQ;
    private int AF_AMT;
    private String REG_TM;
} 
