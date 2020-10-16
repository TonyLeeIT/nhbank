package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "acomDtgNapasHis")
@Data
public class ACOM_DTG_NAPAS_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String trnDate;
    private String de032AcqCd;
    private String de041CrdAcptTrm;
    private String de011TraceNo;
    private int hisNo;
    private String inoutGb;
    private String bkCd;
    private String mti;
    private String de002Pan;
    private String de003ProcCd;
    private int de004TrnAmt;
    private int de005StlAmt;
    private int de006BilAmt;
    private String de007TrnDt;
    private int de009StlConvRt;
    private int de010BilConvRt;
    private String de012LocTrnTime;
    private String de013LocTrnDate;
    private String de014ExpDate;
    private String de015StlDate;
    private String de019AcqCtryCd;
    private String de018MerCatCd;
    private String de022PosMode;
    private String de023CrdSeqNo;
    private String de025PosCondCd;
    private String de026PinCapCd;
    private String de035Trk2Dat;
    private String de036Trk3Dat;
    private String de037RelRefNo;
    private String de038AuthIdRes;
    private String de039ResCd;
    private String de042CrdAcptId;
    private String de043CrdAcptLoc;
    private String de045Trk1Dat;
    private String de048AddSndNm;
    private String de048AddSndAddr;
    private String de049TrnCcy;
    private String de050StlCcy;
    private String de051BilCcy;
    private String de052Pin;
    private String de054AddAmt;
    private String de055EmvDat;
    private String de060CnlTp;
    private String de062NapSvcCd;
    private String de063TrnRefNo;
    private String de070NetMgtCd;
    private String de090OrgTrnKey;
    private String de100BenCd;
    private String de102SndAccInf;
    private String de103RcvAccInf;
    private String de104TrnCont;
    private String de105NewPin;
    private String de120BenInf;
    private String de128MacDat;
    private String errCd;
    private String refNo;
    private Date rcvIl;
    private int seqNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
