package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_EPB_ITM")
@Data
public class ACOM_EPB_ITMInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date REG_DT;
    private Date GIS_IL;
    private int HIS_NO;
    private String DR_GB;
    private String UPD_EMP_NO;
    private Date LST_IB_IL;
    private String ITM_CD;
    private int AF_ITM1;
    private Date AC_IL;
    private Date UPD_DT;
    private String REF_NO;
    private String AF_ITM;
    private String UPD_TM;
    private int BE_ITM1;
    private String BE_ITM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
