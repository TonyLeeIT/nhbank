package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

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
    private int contractAmt;
    private int lonJan;
    private String repayGb;
    private int repayTerm;
    private int repayGap;
    private String repayGapGb;
    private int graceDays;
    private int repayCnt;
    private int drawdownSeq;
    private String rateCcy;
    private String fixFltGb;
    private int indexRt;
    private String spreadGb;
    private int spreadRt;
    private int rollGap;
    private String rollGapGb;
    private int lateChgRt;
    private int pastDueRt;
    private String advArrGb;
    private String singleBothType;
    private String accrType;
    private String bsnsDayRule;
    private int intGap;
    private String intGapGb;
    private String intAdjYn;
    private String yield;
    private String hdSngNo;
    private String commitfeeYn;
    private int feeRt;
    private String payDepoCcy;
    private String payDepoBic;
    private String rcvDepoCcy;
    private String rcvDepoBic;
    private String evidNo;
    private String evidCcy;
    private int evidAmt;
    private int usdCvtAmt;
    private int bbsCvtAmt;
    private int lossAmt;
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
    private int blockAmt;
    private String substsCd;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
