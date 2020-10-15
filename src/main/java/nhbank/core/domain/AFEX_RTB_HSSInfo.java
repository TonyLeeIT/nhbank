package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_RTB_HSS")
@Data
public class AFEX_RTB_HSSInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date REG_DT;
    private int FAMT;
    private String TR_CD;
    private int TRSC_SEQ_NO;
    private String HSS_GB;
    private String HSS_AP_GB;
    private String UPD_EMP_NO;
    private Date LST_IB_IL;
    private String SD_BR_NO;
    private String SD_DEPO_CD;
    private int HSS_FEE;
    private Date AC_IL;
    private Date UPD_DT;
    private String REF_NO;
    private String CCY;
    private int BAMT;
    private Date ICHE_IL;
    private String CHARGE_TYPE;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
