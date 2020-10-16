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
@Table(name = "afexRtbHss")
@Data
public class AFEX_RTB_HSSInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String trCd;
    private Date acIl;
    private Date lstIbIl;
    private String hssGb;
    private String hssApGb;
    private String sdBrNo;
    private String sdDepoCd;
    private String chargeType;
    private BigDecimal hssFee;
    private Date icheIl;
    private String ccy;
    private BigDecimal famt;
    private BigDecimal bamt;
    private BigDecimal trscSeqNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
