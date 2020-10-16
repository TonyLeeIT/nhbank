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
@Table(name = "acomLmtBasehd")
@Data
public class ACOM_LMT_BASEHDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String sngNo;
    private String mngBr;
    private String cixNo;
    private Date fstIl;
    private Date lstIl;
    private Date canIl;
    private String sngSts;
    private String sngInfo;
    private String sisSngno;
    private String pogwlGb;
    private String revolGb;
    private String gihanGb;
    private BigDecimal expMm;
    private Date expIl;
    private Date sngIl;
    private String sngCcy;
    private BigDecimal sngAmt;
    private BigDecimal sngAbtrt;
    private BigDecimal sngAbtamt;
    private BigDecimal totSilCnt;
    private BigDecimal totSilJanamt;
    private BigDecimal totSilAccum;
    private BigDecimal totSilDjgjan;
    private Date totSilLstil;
    private BigDecimal totBojBcnt;
    private BigDecimal totBojBjan;
    private BigDecimal totBojFcnt;
    private BigDecimal totBojFjan;
    private BigDecimal woiYongdo;
    private String woiSunhu;
    private BigDecimal woiInttrm;
    private BigDecimal woiGaetrm;
    private String woiSutgb;
    private String sngCond;
    private String isSngno;
    private String isCixno;
    private String isBrno;
    private Date isIl;
    private String ikSngno;
    private String ikCixno;
    private String ikBrno;
    private Date ikIl;
    private BigDecimal sngAplseq;
    private String sngAuth;
    private Date lstIbil;
    private String sngBrno;
    private String sngClerk;
    private String sngAstmgr;
    private String sngLonmgr;
    private String sngChajang;
    private String sngJumjang;
    private BigDecimal bojMjAmt;
    private String rateGb;
    private String rateJugi;
    private BigDecimal spread;
    private BigDecimal yoncheRate;
    private BigDecimal graceDay;
    private String dayCntBasis;
    private String busiDayRule;
    private BigDecimal penalRate;
    private String agreeNo;
    private String condSts;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
