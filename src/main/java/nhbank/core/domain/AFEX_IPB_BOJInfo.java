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
@Table(name = "afexIpbBoj")
@Data
public class AFEX_IPB_BOJInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal seq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private BigDecimal amt;
    private BigDecimal hisNo;
    private String ibjiGb;
    private String bojGb;
    private BigDecimal beLgcomDsAmt;
    private BigDecimal lgmSeq;
    private BigDecimal lgmSseq;
    private BigDecimal bldSeq;
    private String ncuCcy;
    private BigDecimal ncuAmt;
    private BigDecimal ncuBeLgcomDsAmt;
    private BigDecimal chdAmt;
    private String junhwanGb;
    private BigDecimal beJunhwanWamt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
