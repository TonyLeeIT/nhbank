package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_COM_CCY")
@Data
public class ACOM_COM_CCYInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date REG_DT;
    private String CD;
    private String GOSI_GB;
    private int UNIT;
    private String UPD_EMP_NO;
    private int DIGIT;
    private String CTRY_CD;
    private int SEQ_NO;
    private Date UPD_DT;
    private Date MAKE_IL;
    private String UPD_TM;
    private String BOK_CD;
    private int YEAR_GB;
    private String NM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
