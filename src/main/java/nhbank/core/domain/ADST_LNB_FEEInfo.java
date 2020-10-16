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
@Table(name = "adstLnbFee")
@Data
public class ADST_LNB_FEEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private BigDecimal seqNo;
    private String sts;
    private String feeGb;
    private String ccy;
    private BigDecimal feeAmt;
    private String rateAmtGb;
    private BigDecimal feeDsAmt;
    private BigDecimal feeDsBamt;
    private BigDecimal feeORt;
    private BigDecimal feeSRt;
    private Date feeFrIl;
    private Date feeToIl;
    private BigDecimal feeDays;
    private BigDecimal adjSeq;
    private BigDecimal schSeq;
    private BigDecimal schSubNo;
    private BigDecimal bizNo;
    private Date feeRcvIl;
    private Date fstIbIl;
    private Date lstAcIl;
    private Date lstIbIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
