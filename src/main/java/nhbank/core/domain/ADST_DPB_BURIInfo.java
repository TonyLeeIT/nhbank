package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "adstDpbBuri")
@Data
public class ADST_DPB_BURIInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private Date buriIl;
    private BigDecimal buriJan;
    private BigDecimal fstJan;
    private BigDecimal maxJan;
    private Date termIl;
    private BigDecimal lonSngAmt;
    private BigDecimal lonOvrAmt;
    private String lonRtCd;
    private BigDecimal lonRt;
    private BigDecimal prcpOverDueIntRt;
    private BigDecimal intOverDueIntRt;
    private BigDecimal colLonInt;
    private BigDecimal lonPrcpYcInt;
    private BigDecimal lonIntYcInt;
    private String lonYdCd;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
