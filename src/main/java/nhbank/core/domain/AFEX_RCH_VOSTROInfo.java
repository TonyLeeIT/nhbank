package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_RCH_VOSTRO")
@Data
public class AFEX_RCH_VOSTROInfo implements Serializable {
    @Id
    @GeneratedValue
    private String OP_NO;
    private Date REG_DT;
    private int HIS_NO;
    private String UPD_EMP_NO;
    private Date IB_IL;
    private Date AC_IL;
    private int SEQ_NO;
    private int CD_AMT;
    private Date UPD_DT;
    private Date VAL_IL;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
