package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_RTB_HIS")
@Data
public class AFEX_RTB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String TR_CD;
    private String UPD_EMP_NO;
    private String USER_ID;
    private String SEL_CCY;
    private String PRE_STS;
    private String STS;
    private Date AC_IL;
    private Date UPD_DT;
    private String REF_NO;
    private String BUY_CCY;
    private int SEL_FAMT;
    private Date CAN_IL;
    private String REG_EMP_NO;
    private Date REG_DT;
    private int BUY_FAMT;
    private Date GIS_IL;
    private int SD_HIS_NO;
    private int HIS_NO;
    private Date LST_IB_IL;
    private Date IB_IL;
    private String TR_TIME;
    private String TR_BR;
    private String TR_GB;
    private int EX_HRT;
    private String UPD_TM;
    private String REG_TM;
} 
