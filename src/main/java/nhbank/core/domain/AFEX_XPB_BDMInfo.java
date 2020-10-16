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
@Table(name = "afexXpbBdm")
@Data
public class AFEX_XPB_BDMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private BigDecimal amt;
    private String budoCd;
    private BigDecimal shSeq;
    private BigDecimal shSumAmt;
    private String bmGb;
    private BigDecimal miSeq;
    private BigDecimal miTrBamt;
    private BigDecimal miShBamt;
    private String ncuCcy;
    private BigDecimal ncuAmt;
    private BigDecimal ncuShSumAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
