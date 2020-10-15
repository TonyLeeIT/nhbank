package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_EPB_HIS")
@Data
public class ACOM_EPB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String LINK_REF_NO;
    private String PAY_REF_NO;
    private String TR_CD;
    private int ASSIGN_AMT;
    private int SD_HIS;
    private String MNG_NO;
    private String UPD_EMP_NO;
    private String CD_SNG_NO;
    private int TR_TAX;
    private String SD_BR;
    private int CD_SIL_SEQ;
    private String STS;
    private String DN_GB;
    private Date AC_IL;
    private int TR_BAMT;
    private Date UPD_DT;
    private String LINK_TYPE;
    private String REF_NO;
    private int TR_FAMT;
    private String IB_TIME;
    private String REMARK;
    private Date CAN_IL;
    private String REG_EMP_NO;
    private String OP_NO;
    private Date REG_DT;
    private String SD_BUSI_CD;
    private Date GIS_IL;
    private String CPTY_NM;
    private String AUTO_YN;
    private int SD_HIS_NO;
    private int HIS_NO;
    private int AF_JAN;
    private Date IB_IL;
    private String SD_REF_NO;
    private String TR_BR;
    private int TAX_RATE;
    private String TR_GB;
    private String UPD_TM;
    private String TAX_CODE;
    private String TR_CCY;
    private String REG_TM;
} 
