package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_COM_FPHEAD")
@Data
public class ACOM_COM_FPHEADInfo implements Serializable {
    @Id
    @GeneratedValue
    private String OP_NO;
    private Date REG_DT;
    private String OP_NM;
    private String TR_CD;
    private int HIS_NO;
    private String UPMU_CD;
    private String UPD_EMP_NO;
    private String HEAD_TXT;
    private String CIX_NO;
    private String TELL_NM;
    private String PRT_KIND;
    private String TELL_NO;
    private Date UPD_DT;
    private String REF_NO;
    private String TITLE_TXT;
    private Date TX_DATE;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
