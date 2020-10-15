package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_RCH_BASE")
@Data
public class AFEX_RCH_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String RECON_YN;
    private String DEPO_57A;
    private String UPD_EMP_NO;
    private String CTRY_CD;
    private String AF_CD;
    private String STS;
    private Date UPD_DT;
    private String BKNM;
    private String DBS_CD;
    private String DEPO_TYPE;
    private String REG_EMP_NO;
    private String OP_NO;
    private Date REG_DT;
    private String CD;
    private String VOSTRO_YN;
    private int MK950_SEQ;
    private String DEPO_ETC3;
    private String DEPO_ETC2;
    private String DEPO_56A;
    private String DEPO_ETC1;
    private Date CHNG_IL;
    private Date DEPO_IL;
    private String CBS_CD;
    private String BKCD;
    private String ATTEN_NO;
    private String CCY;
    private Date MAKE_IL;
    private String MNG_BR;
    private String UPD_TM;
    private String MNGR_NO;
    private String REG_TM;
} 
