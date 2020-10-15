package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPB_AMD")
@Data
public class AFEX_XPB_AMDInfo implements Serializable {
    @Id
    @GeneratedValue
    private int BE_INT_AMT;
    private int BE_USANCE_TERM;
    private String BE_WHAN_RCV_GB;
    private String MNG_NO;
    private String UPD_EMP_NO;
    private int AF_USANCE_TERM;
    private int AF_HIJA_TERM;
    private Date BE_MO_JUB_IL;
    private Date AF_MAN_GIJ_IL;
    private String STS;
    private Date AC_IL;
    private int BE_WHAN_FRT;
    private Date AF_YMAN_IL;
    private Date AF_MO_JUB_IL;
    private int SEQ_NO;
    private int AF_WHAN_FRT;
    private Date UPD_DT;
    private String REF_NO;
    private int BE_HIJA_TERM;
    private Date LST_IL;
    private String BE_NEGO_GB;
    private Date CAN_IL;
    private String REG_EMP_NO;
    private String AF_RENE_REQ_GB;
    private String OP_NO;
    private Date REG_DT;
    private Date BE_MAN_GIJ_IL;
    private Date GIS_IL;
    private String AF_TENOR_GB;
    private int HIS_NO;
    private Date BE_LST_ISU_IL;
    private int AF_INT_AMT;
    private String BE_TENOR_GB;
    private String BE_RENE_REQ_GB;
    private String AF_HJ_IL_CD;
    private Date LST_IB_IL;
    private String BE_HJ_IL_CD;
    private Date AF_LST_ISU_IL;
    private Date BE_YMAN_IL;
    private String UPD_TM;
    private String AF_WHAN_RCV_GB;
    private String AF_NEGO_GB;
    private String REG_TM;
} 
