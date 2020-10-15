package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_DMH_ALLOC")
@Data
public class ACOM_DMH_ALLOCInfo implements Serializable {
    @Id
    @GeneratedValue
    private int ALLOC_AMT;
    private Date LST_AC_IL;
    private Date REG_DT;
    private String UPD_EMP_NO;
    private String CIX_NO;
    private int ALLOC_RATIO;
    private String DAMBO_NO;
    private String STS;
    private int SEQ_NO;
    private Date UPD_DT;
    private int LST_HIS_NO;
    private String SNG_NO;
    private String MNG_BR;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
