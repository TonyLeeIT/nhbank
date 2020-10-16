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
@Table(name = "acomLmtBaseact")
@Data
public class ACOM_LMT_BASEACTInfo implements Serializable {
    @Id
    @GeneratedValue
    private String sngNo;
    private String actCd;
    private String mngBr;
    private String cixNo;
    private Date fstIl;
    private Date lstIl;
    private Date canIl;
    private String sngSts;
    private String sngInfo;
    private BigDecimal actAmt;
    private String actRtgb;
    private BigDecimal actRate;
    private BigDecimal actSprd;
    private String actRtjo;
    private BigDecimal silCnt;
    private BigDecimal silJanamt;
    private BigDecimal silAccum;
    private BigDecimal silWoijan;
    private BigDecimal silDjgjan;
    private Date silLstil;
    private BigDecimal bojBcnt;
    private BigDecimal bojBjan;
    private BigDecimal bojFcnt;
    private BigDecimal bojFjan;
    private BigDecimal woiYongdo;
    private String woiSunhu;
    private BigDecimal woiInttrm;
    private BigDecimal woiGaetrm;
    private String woiSutgb;
    private BigDecimal sngAplseq;
    private String sngAuth;
    private Date lstIbil;
    private String sngBrno;
    private BigDecimal bojMjAmt;
    private String rateGb;
    private String rateJugi;
    private BigDecimal spread;
    private BigDecimal yoncheRate;
    private BigDecimal graceDay;
    private String dayCntBasis;
    private String busiDayRule;
    private BigDecimal penalRate;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
