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
@Table(name = "adstLnbRepay")
@Data
public class ADST_LNB_REPAYInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private BigDecimal seqNo;
    private String sts;
    private BigDecimal adjSeq;
    private BigDecimal schSeq;
    private BigDecimal schSubNo;
    private Date repayIl;
    private String ccy;
    private BigDecimal repayAmt;
    private BigDecimal usdCvtAmt;
    private BigDecimal bbsCvtAmt;
    private String repayStyle;
    private String intGb;
    private String ycGb;
    private Date fstDealIl;
    private Date lstDealIl;
    private Date lstIbIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
