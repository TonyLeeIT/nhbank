package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFIF_MMH_BASE")
@Data
public class AFIF_MMH_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String comId;
    private String comNm;
    private String counterpartyId;
    private String counterpartyNm;
    private Date dealIl;
    private String valueYn;
    private Date valueIl;
    private String expYn;
    private Date expIl;
    private String borrowLonGb;
    private String ccy;
    private int principalAmt;
    private String rateCcy;
    private String fixFltGb;
    private int taxAmt;
    private String rateFreq;
    private int indexRt;
    private String rateGb;
    private int spreadRt;
    private int totalRt;
    private Date intFromIl;
    private Date intToIl;
    private int intDays;
    private String intCcy;
    private int intAmt;
    private String advArrGb;
    private String singleBothType;
    private String accrType;
    private String bsnsDayRule;
    private String holidayLocation;
    private Date intPayRcvIl;
    private String confirmYn;
    private Date confirmIl;
    private String poYn;
    private Date poIl;
    private int poSeq;
    private int poAmt;
    private String ourRcvDepoCcy;
    private String ourRcvDepoCd;
    private String ourRcvDepoNm;
    private String ourPayDepoCcy;
    private String ourPayDepoCd;
    private String ourPayDepoNm;
    private String thrRcvDepoCcy;
    private String thrRcvDepoBic;
    private String thrRcvDepoNm;
    private String brokerId;
    private String brokerFeeCcy;
    private int brokerFeeAmt;
    private String onoffGb;
    private String inoutGb;
    private String borrowGb;
    private String borrowKind;
    private String nationLonGb;
    private String loanUseGb;
    private int usdCvtAmt;
    private int baseCvtAmt;
    private String rolloverYn;
    private String rolloverType;
    private String rolloverRefNo;
    private String bankCd;
    private String changeBrSts;
    private Date fstIbIl;
    private Date lstDealIl;
    private Date lstIbIl;
    private String dealerId;
    private String userId;
    private String kondorId;
    private String remark;
    private String contractId;
    private String relateRefNo;
    private String interofficeBrNo;
    private String bondRefNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private String upfrontFeeCcy;
    private int upfrontFeeAmt;
    private String intFreq;
    private String holiDayRule;
    private String couponAdjYn;
    private String intAtMatYn;
} 
