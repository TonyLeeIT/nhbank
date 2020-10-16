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
@Table(name = "afexXphCa")
@Data
public class AFEX_XPH_CAInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date rcvIl;
    private BigDecimal seqNo;
    private String sts;
    private String refNo;
    private String caCcy;
    private BigDecimal caAmt;
    private BigDecimal lessCaAmt;
    private BigDecimal lessCoAmt;
    private BigDecimal lessGtAmt;
    private BigDecimal overAmt;
    private Date caIl;
    private String depoBkcd;
    private Date sdBalIl;
    private String ccGb;
    private Date ccIl;
    private String ccRtCd;
    private String trGb;
    private String mtTrMd;
    private String swiftKey;
    private String rcvGb;
    private String opNo;
    private String depoCd;
    private String cdGb;
    private String divGb;
    private String divRef;
    private String ncuCaCcy;
    private BigDecimal ncuCaAmt;
    private BigDecimal ncuLessCaAmt;
    private BigDecimal ncuLessCoAmt;
    private BigDecimal ncuLessGtAmt;
    private BigDecimal ncuOverAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
