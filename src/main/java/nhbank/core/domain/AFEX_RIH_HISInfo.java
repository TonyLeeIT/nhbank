package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_RIH_HIS")
@Data
public class AFEX_RIH_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private int YD_SEQ;
    private String TR_CD;
    private String MNG_NO;
    private String UPD_EMP_NO;
    private String CD_SNG_NO;
    private String SD_BR;
    private int CD_SIL_SEQ;
    private String STS;
    private Date AC_IL;
    private int TR_BAMT;
    private Date UPD_DT;
    private String REF_NO;
    private int TR_FAMT;
    private String IB_TIME;
    private Date CAN_IL;
    private String REG_EMP_NO;
    private String OP_NO;
    private Date REG_DT;
    private Date GIS_IL;
    private String IBJI_MD;
    private int SD_HIS_NO;
    private int HIS_NO;
    private String YD_GUJA;
    private int BOK_SEQ;
    private String CIX_NO;
    private int AF_JAN;
    private Date IB_IL;
    private String FEE_MD;
    private String TR_BR;
    private String TR_GB;
    private String UPD_TM;
    private String TR_CCY;
    private String REG_TM;
} 
