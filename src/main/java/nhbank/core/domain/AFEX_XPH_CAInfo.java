package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPH_CA")
@Data
public class AFEX_XPH_CAInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date rcvIl;
    private int seqNo;
    private String sts;
    private String refNo;
    private String caCcy;
    private int caAmt;
    private int lessCaAmt;
    private int lessCoAmt;
    private int lessGtAmt;
    private int overAmt;
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
    private int ncuCaAmt;
    private int ncuLessCaAmt;
    private int ncuLessCoAmt;
    private int ncuLessGtAmt;
    private int ncuOverAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
