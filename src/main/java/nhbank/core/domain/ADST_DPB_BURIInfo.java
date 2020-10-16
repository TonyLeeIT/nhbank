package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_DPB_BURI")
@Data
public class ADST_DPB_BURIInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private Date buriIl;
    private int buriJan;
    private int fstJan;
    private int maxJan;
    private Date termIl;
    private int lonSngAmt;
    private int lonOvrAmt;
    private String lonRtCd;
    private int lonRt;
    private int prcpOverDueIntRt;
    private int intOverDueIntRt;
    private int colLonInt;
    private int lonPrcpYcInt;
    private int lonIntYcInt;
    private String lonYdCd;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
