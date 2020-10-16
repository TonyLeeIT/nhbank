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
@Table(name = "adstLnbSch")
@Data
public class ADST_LNB_SCHInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String schGb;
    private BigDecimal adjSeq;
    private BigDecimal schSeq;
    private String sts;
    private String processGb;
    private Date makeIl;
    private Date planIl;
    private String ccy;
    private BigDecimal planAmt;
    private Date fstPayIl;
    private BigDecimal payAmt;
    private BigDecimal usdCvtAmt;
    private BigDecimal bbsCvtAmt;
    private BigDecimal dsAmt;
    private BigDecimal indexRt;
    private String spreadGb;
    private BigDecimal spreadRt;
    private BigDecimal totalRt;
    private Date fromIl;
    private Date toIl;
    private BigDecimal dsTerm;
    private BigDecimal misuIntAmt;
    private BigDecimal jsAmt;
    private BigDecimal jsRcvAmt;
    private BigDecimal jsDsAmt;
    private Date jsFrIl;
    private Date jsToIl;
    private BigDecimal jsDsTerm;
    private Date jsLisuIl;
    private BigDecimal ptAmt;
    private BigDecimal ptRcvAmt;
    private BigDecimal ptDsAmt;
    private Date ptFrIl;
    private Date ptToIl;
    private BigDecimal ptDsTerm;
    private Date ptLisuIl;
    private BigDecimal ptRt;
    private BigDecimal ycAmt;
    private BigDecimal ycRcvAmt;
    private BigDecimal ycDsAmt;
    private Date ycFrIl;
    private Date ycToIl;
    private BigDecimal ycDsTerm;
    private Date ycLisuIl;
    private BigDecimal ycRt;
    private BigDecimal makeHisNo;
    private BigDecimal lstSubNo;
    private Date lstAcIl;
    private Date lstIbIl;
    private String fixGb;
    private BigDecimal fixAmt;
    private BigDecimal pvRt;
    private BigDecimal pvAmt;
    private BigDecimal seqNo;
    private Date rateFixIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
