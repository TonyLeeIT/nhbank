package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_DPB_HIS")
@Data
public class ADST_DPB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String TR_CD;
    private String PROCESS_CD;
    private String MNG_NO;
    private String UPD_EMP_NO;
    private String ACCT_NO;
    private String MECH_GB;
    private String SD_BR;
    private String STS;
    private Date AC_IL;
    private Date UPD_DT;
    private Date CAN_IL;
    private String REG_EMP_NO;
    private String OP_NO;
    private Date REG_DT;
    private int TR_AMT;
    private Date GIS_IL;
    private int SD_HIS_NO;
    private int CHNL_HIS_NO;
    private int HIS_NO;
    private String CHNL_REF_NO;
    private String CIX_NO;
    private int AF_JAN;
    private Date IB_IL;
    private String TR_TIME;
    private String TR_BR;
    private String TR_GB;
    private String MNG_BR;
    private String UPD_TM;
    private String REG_TM;
} 
