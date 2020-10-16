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
@Table(name = "afexXpbBds")
@Data
public class AFEX_XPB_BDSInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private BigDecimal budoSeq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private BigDecimal amt;
    private BigDecimal hdcAmt;
    private BigDecimal bamt;
    private BigDecimal bdcAmt;
    private BigDecimal bdIja;
    private BigDecimal hcHija;
    private String hJiGb;
    private BigDecimal caSumAmt;
    private String sonikGb;
    private BigDecimal sonikAmt;
    private String ncuCcy;
    private BigDecimal ncuAmt;
    private BigDecimal ncuHdcAmt;
    private BigDecimal ncuCaSumAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
