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
@Table(name = "acomLmtSilhis")
@Data
public class ACOM_LMT_SILHISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String sngNo;
    private String actCd;
    private String silCcy;
    private BigDecimal hisNo;
    private String sts;
    private String trCd;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private String refNo;
    private String silGb;
    private String upmuCd;
    private String georCd;
    private BigDecimal silAmt;
    private String silPmgb;
    private BigDecimal silJan;
    private BigDecimal djgAmt;
    private String djgPmgb;
    private BigDecimal djgJan;
    private BigDecimal gurBamt;
    private String gurBpmgb;
    private BigDecimal gurBjan;
    private BigDecimal gurFamt;
    private String gurFpmgb;
    private BigDecimal gurFjan;
    private String trBr;
    private String sdBr;
    private String trTime;
    private String opNo;
    private String mngNo;
    private BigDecimal trscSeqNo;
    private BigDecimal trxFamt;
    private BigDecimal trxBamt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
