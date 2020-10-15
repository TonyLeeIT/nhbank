package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_ATB_APPLY")
@Data
public class ACOM_ATB_APPLYInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date REG_DT;
    private int TOT_CNT;
    private String UPD_EMP_NO;
    private String APPLY_NO;
    private String CIX_NO;
    private String FILE_URL;
    private Date TRX_DT;
    private String STS;
    private int SUS_CNT;
    private Date UPD_DT;
    private String FILE_NM;
    private String BR_NO;
    private int FAIL_CNT;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
