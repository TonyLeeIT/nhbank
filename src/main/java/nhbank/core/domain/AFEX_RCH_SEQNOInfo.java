package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_RCH_SEQNO")
@Data
public class AFEX_RCH_SEQNOInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date REG_DT;
    private String CD;
    private Date TR_IL;
    private int SEQNO;
    private Date UPD_DT;
    private String CCY;
    private String UPD_EMP_NO;
    private String SA_GB;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
