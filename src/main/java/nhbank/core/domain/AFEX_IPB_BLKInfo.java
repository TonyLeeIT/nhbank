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
@Table(name = "afexIpbBlk")
@Data
public class AFEX_IPB_BLKInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal seq;
    private BigDecimal sseq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private BigDecimal amt;
    private BigDecimal hisNo;
    private String jagmGb;
    private BigDecimal jilcBamt;
    private BigDecimal jilcFamt;
    private BigDecimal jilgBamt;
    private BigDecimal jilgFamt;
    private BigDecimal sngSseq;
    private BigDecimal djbSeq;
    private String setBkcd;
    private String junGb;
    private String fjnNo;
    private String setGb;
    private BigDecimal gtAmt;
    private String amtGb;
    private String ncuCcy;
    private BigDecimal ncuAmt;
    private BigDecimal ncuJilcFamt;
    private BigDecimal ncuJilgFamt;
    private BigDecimal ncuGtAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
