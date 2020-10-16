package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "adstDpbInrt")
@Data
public class ADST_DPB_INRTInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private String sts;
    private int hisNo;
    private Date fromIl;
    private Date toIl;
    private int famt;
    private int intRt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
