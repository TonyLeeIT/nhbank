package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "adstLnbInt")
@Data
public class ADST_LNB_INTInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private int seqNo;
    private String sts;
    private int adjSeq;
    private int schSeq;
    private int schSubNo;
    private Date intRcvIl;
    private String ccy;
    private int intAmt;
    private int intDsAmt;
    private int usdCvtAmt;
    private int bbsCvtAmt;
    private String trCd;
    private String intGb;
    private String trGb;
    private String misuGb;
    private String rollGb;
    private int indexRt;
    private String spreadGb;
    private int spreadRt;
    private int intORt;
    private int intSRt;
    private Date intFromIl;
    private Date intToIl;
    private int intDays;
    private int bizSeq;
    private int bizSubseq;
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
