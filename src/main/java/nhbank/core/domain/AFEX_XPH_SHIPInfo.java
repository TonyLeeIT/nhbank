package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPH_SHIP")
@Data
public class AFEX_XPH_SHIPInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date REG_DT;
    private Date UPD_DT;
    private String REF_NO;
    private String UPD_EMP_NO;
    private String UPD_TM;
    private int SEQ;
    private String REG_EMP_NO;
    private String REG_TM;
} 
