package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_ADH_BASE")
@Data
public class AFEX_ADH_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date makeIl;
    private int seqNo;
    private String advNo;
    private String sendGb;
    private String msgGb;
    private String lcNo;
    private Date openIl;
    private String openBkcd;
    private String openBknm1;
    private String openBknm2;
    private String openBknm3;
    private String ctryCd;
    private String ctryNm;
    private String beneCd;
    private String beneNm1;
    private String beneNm2;
    private String beneNm3;
    private String openCcy;
    private int openAmt;
    private int balAmt;
    private Date expIl;
    private Date shipIl;
    private String sightGb;
    private String hsCd;
    private String hsNm;
    private String authGb;
    private String applNm1;
    private String applNm2;
    private String applNm3;
    private String trailer;
    private String msgType;
    private String norUrg;
    private String swiftMrn;
    private String tranInput;
    private int totSeq;
    private String mngNo;
    private String opNo;
    private Date lstIl;
    private String mt700Fnm;
    private int mt701Cnt;
    private String mt701Fnm1;
    private String mt701Fnm2;
    private String mt701Fnm3;
    private String mt701Fnm4;
    private int amdCnt;
    private String gyobuGb;
    private Date gyobuIl;
    private String ediGb;
    private String relay;
    private String lstTime;
    private String localCd;
    private String faxGb;
    private String txKey;
    private String faxNo;
    private String firstGb;
    private int brCharge;
    private int chargeAmt;
    private String chargeGb;
    private String ediId;
    private String condSts;
    private String brNo;
    private String brNm;
    private String mt730Send;
    private String ediChuri;
    private String ediSend;
    private String ediSuin;
    private String bokSend;
    private String priceCond;
    private String usanceDay;
    private String hsReal;
    private String tongPrint;
    private String cixNo;
    private String buseoNo;
    private String ibgmMd;
    private String chargeMd;
    private Date chargeIl;
    private int prtCnt;
    private String reIssue;
    private String confirmGb;
    private Date tranIl;
    private Date firstIl;
    private String mt730DocId;
    private String mt710Send;
    private String mt710DocId;
    private String chargeCcy;
    private String drawBkcd;
    private String drawBknm1;
    private String drawBknm2;
    private String drawBknm3;
    private String reimBkcd;
    private String reimBknm1;
    private String reimBknm2;
    private String reimBknm3;
    private String thruBkcd;
    private String thruBknm1;
    private String thruBknm2;
    private String thruBknm3;
    private String ourCustGb;
    private String advThruGb;
    private String beneNm4;
    private String applNm4;
    private int tolMore;
    private int tolLess;
    private String skbdnYn;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private Date cnfrFrIl;
    private Date cnfrToIl;
    private int cnfrRt;
    private Date lstExpIl;
    private String cnfmBic;
    private String cnfmNm1;
    private String cnfmNm2;
    private String cnfmNm3;
} 
