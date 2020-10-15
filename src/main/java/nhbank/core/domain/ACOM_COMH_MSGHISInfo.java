package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_COMH_MSGHIS")
@Data
public class ACOM_COMH_MSGHISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String DOC_ID;
    private String OP_NO;
    private Date REG_DT;
    private String UPD_EMP_NO;
    private String COND_STS;
    private String MAKE_TIME;
    private String MAKE_TTY;
    private int SEQ_NO;
    private Date UPD_DT;
    private String STM_TAIL;
    private String STM_RMK;
    private Date MAKE_IL;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
