package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_LMT_BASEACT")
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
    private int sngAplseq;
    private String sngAuth;
    private Date lstIbil;
    private String sngBrno;
    private int bojMjAmt;
    private String rateGb;
    private String rateJugi;
    private int spread;
    private int yoncheRate;
    private int graceDay;
    private String dayCntBasis;
    private String busiDayRule;
    private int penalRate;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
