package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomLmtBasehis")
@Data
public class ACOM_LMT_BASEHISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String sngNo;
    private String actCd;
    private int hisNo;
    private String hisGb;
    private String trCd;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private String mngBr;
    private String cixNo;
    private String sngSts;
    private String sngInfo;
    private String sisSngno;
    private String pogwlGb;
    private String revolGb;
    private String gihanGb;
    private int expMm;
    private Date expIl;
    private Date sngIl;
    private String sngCcy;
    private int sngAmt;
    private int sngAbtrt;
    private int sngAbtamt;
    private int actAmt;
    private String actRtgb;
    private int actRate;
    private int actSprd;
    private String actRtjo;
    private int silCnt;
    private int silJanamt;
    private int silAccum;
    private int silWoijan;
    private int silDjgjan;
    private Date silLstil;
    private int bojBcnt;
    private int bojBjan;
    private int bojFcnt;
    private int bojFjan;
    private int woiYongdo;
    private String woiSunhu;
    private int woiInttrm;
    private int woiGaetrm;
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
    private int sngAplseq;
    private String sngAuth;
    private Date lstIbil;
    private String sngBrno;
    private String sngClerk;
    private String sngAstmgr;
    private String sngLonmgr;
    private String sngChajang;
    private String sngJumjang;
    private int bojMjAmt;
    private String rateGb;
    private String rateJugi;
    private int spread;
    private int yoncheRate;
    private int graceDay;
    private String dayCntBasis;
    private String busiDayRule;
    private int penalRate;
    private String trBr;
    private String sdBr;
    private String trTime;
    private String opNo;
    private String mngNo;
    private String agreeNo;
    private String condSts;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
