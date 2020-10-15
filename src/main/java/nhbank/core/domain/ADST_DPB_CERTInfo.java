package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_DPB_CERT")
@Data
public class ADST_DPB_CERTInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date REG_DT;
    private String DR_OPNO;
    private String UPD_EMP_NO;
    private String DR_TIME;
    private String ACCT_NO;
    private Date IB_IL;
    private int TX_TRX_NO;
    private String STS;
    private String PRT_KIND;
    private Date UPD_DT;
    private String UPD_TM;
    private String REMARK;
    private String REG_EMP_NO;
    private String REG_TM;
} 
