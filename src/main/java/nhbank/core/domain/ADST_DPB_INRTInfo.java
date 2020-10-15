package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_DPB_INRT")
@Data
public class ADST_DPB_INRTInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date REG_DT;
    private Date TO_IL;
    private int FAMT;
    private int HIS_NO;
    private Date FROM_IL;
    private String UPD_EMP_NO;
    private String ACCT_NO;
    private String STS;
    private Date UPD_DT;
    private int INT_RT;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
