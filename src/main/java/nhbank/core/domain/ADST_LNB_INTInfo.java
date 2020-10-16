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
@Table(name = "adstLnbInt")
@Data
public class ADST_LNB_INTInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private BigDecimal seqNo;
    private String sts;
    private BigDecimal adjSeq;
    private BigDecimal schSeq;
    private BigDecimal schSubNo;
    private Date intRcvIl;
    private String ccy;
    private BigDecimal intAmt;
    private BigDecimal intDsAmt;
    private BigDecimal usdCvtAmt;
    private BigDecimal bbsCvtAmt;
    private String trCd;
    private String intGb;
    private String trGb;
    private String misuGb;
    private String rollGb;
    private BigDecimal indexRt;
    private String spreadGb;
    private BigDecimal spreadRt;
    private BigDecimal intORt;
    private BigDecimal intSRt;
    private Date intFromIl;
    private Date intToIl;
    private BigDecimal intDays;
    private BigDecimal bizSeq;
    private BigDecimal bizSubseq;
    private Date bfJsLisuIl;
    private Date bfPtLisuIl;
    private Date bfYcLisuIl;
    private Date fstIbIl;
    private Date lstDealIl;
    private Date lstIbIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
