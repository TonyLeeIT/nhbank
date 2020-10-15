package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_COM_FEERT")
@Data
public class ACOM_COM_FEERTInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date REG_DT;
    private int MAX_FEE;
    private String UPD_EMP_NO;
    private int FRT;
    private String LCD;
    private String CD_NM;
    private String MCD;
    private Date APPLY_IL;
    private String PL_CD;
    private int MIN_FEE;
    private String SCD;
    private Date UPD_DT;
    private Date MAKE_IL;
    private String MNG_BR;
    private int ETC_FRT;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
