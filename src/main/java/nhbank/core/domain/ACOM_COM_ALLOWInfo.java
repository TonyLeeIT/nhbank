package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_COM_ALLOW")
@Data
public class ACOM_COM_ALLOWInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date REG_DT;
    private String TRX_REF_NO;
    private int ASSET_AMT;
    private String UPD_EMP_NO;
    private String COLLECT_CD;
    private int ALLOW_AMT;
    private String CIX_NO;
    private String GWAM_CD;
    private int COLLECT_AMT;
    private String STS;
    private Date UPD_DT;
    private String REF_NO;
    private String MNG_BR;
    private String CURC;
    private int EXHG_AMT;
    private String UPD_TM;
    private String REG_EMP_NO;
    private String REG_TM;
} 
