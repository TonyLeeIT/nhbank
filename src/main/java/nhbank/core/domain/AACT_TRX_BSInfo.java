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
@Table(name = "aactTrxBs")
@Data
public class AACT_TRX_BSInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private BigDecimal segSeq;
    private String refNo2;
    private String orgGb;
    private String ilgeGb;
    private String ydGb;
    private String pstGb;
    private String ibfGb;
    private String posGb;
    private Date actIl;
    private String actBr;
    private String bsCcy;
    private String fbsCd;
    private String bbsCd;
    private String mbsBspl;
    private String mbsCd;
    private String ibjiCd;
    private String slipGb;
    private String jukiGb;
    private BigDecimal famt;
    private BigDecimal bamt;
    private BigDecimal applHrt;
    private BigDecimal basicHrt;
    private BigDecimal bookHrt;
    private BigDecimal demiHrt;
    private BigDecimal gosiHrt;
    private BigDecimal ftpRt;
    private String cdSngNo;
    private String ydDsfg;
    private String ydRefno;
    private BigDecimal ydHisno;
    private String docId;
    private String remark;
    private String msgType;
    private String dpNo;
    private String depoCd;
    private Date valueIl;
    private String sngNo;
    private String abaNo;
    private String checkNo;
    private String theirRefno;
    private String ifrsDvCd;
    private String dtlsBalDvCd;
    private BigDecimal balAmt;
    private String idNo;
    private String cixNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
