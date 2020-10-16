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
@Table(name = "adstLnbAgr")
@Data
public class ADST_LNB_AGRInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String ikisSts;
    private String bkGb;
    private String cixNo;
    private String buseoNo;
    private String comId;
    private String comNm;
    private Date contractIl;
    private Date valueIl;
    private Date totExpIl;
    private String lonCcy;
    private BigDecimal contractAmt;
    private BigDecimal lonJan;
    private String repayGb;
    private BigDecimal repayTerm;
    private BigDecimal repayGap;
    private String repayGapGb;
    private BigDecimal graceDays;
    private BigDecimal repayCnt;
    private BigDecimal drawdownSeq;
    private String rateCcy;
    private String fixFltGb;
    private BigDecimal indexRt;
    private String spreadGb;
    private BigDecimal spreadRt;
    private BigDecimal rollGap;
    private String rollGapGb;
    private BigDecimal lateChgRt;
    private BigDecimal pastDueRt;
    private String advArrGb;
    private String singleBothType;
    private String accrType;
    private String bsnsDayRule;
    private BigDecimal intGap;
    private String intGapGb;
    private String intAdjYn;
    private String yield;
    private String hdSngNo;
    private String commitfeeYn;
    private BigDecimal feeRt;
    private String payDepoCcy;
    private String payDepoBic;
    private String rcvDepoCcy;
    private String rcvDepoBic;
    private String evidNo;
    private String evidCcy;
    private BigDecimal evidAmt;
    private BigDecimal usdCvtAmt;
    private BigDecimal bbsCvtAmt;
    private BigDecimal lossAmt;
    private String restructuringYn;
    private String loanClass;
    private Date fstIbIl;
    private Date lstDealIl;
    private Date lstIbIl;
    private String opNo;
    private String ownerNo;
    private String rmpbNo;
    private String ibfGb;
    private String blNo;
    private Date lgOpenIl;
    private BigDecimal blockAmt;
    private String substsCd;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
