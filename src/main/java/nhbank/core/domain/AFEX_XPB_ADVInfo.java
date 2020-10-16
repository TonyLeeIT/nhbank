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
@Table(name = "afexXpbAdv")
@Data
public class AFEX_XPB_ADVInfo implements Serializable {
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
    private String advGb;
    private String caGb;
    private String delayGb;
    private Date sdTrIl;
    private String jubGb;
    private BigDecimal hdAmt;
    private String junNo1;
    private BigDecimal overAmt;
    private String junNo2;
    private BigDecimal lessCaAmt;
    private BigDecimal lessCoAmt;
    private BigDecimal lessGtAmt;
    private String yukNo;
    private String plJiGb;
    private String depoBkcd;
    private String buibGb;
    private BigDecimal junAmt;
    private String ijGb;
    private Date manIl;
    private Date caManIl;
    private BigDecimal misuAmt;
    private BigDecimal misuBamt;
    private String sonikGb;
    private BigDecimal sonikAmt;
    private Date beLcaIl;
    private String ncuCcy;
    private BigDecimal ncuAmt;
    private BigDecimal ncuHdAmt;
    private BigDecimal ncuOverAmt;
    private BigDecimal ncuLessCaAmt;
    private BigDecimal ncuLessCoAmt;
    private BigDecimal ncuLessGtAmt;
    private BigDecimal ncuJunAmt;
    private BigDecimal ncuMisuAmt;
    private String junNo3;
    private String payDoYn;
    private String trsfAbano;
    private String trsfAcct;
    private String trsfRefno;
    private String trsfBeneNm;
    private String trsfApplNm;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private String mt103DocId;
    private String feeRcvBy;
} 
