package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "aftrFfhCommTrscPtcl")
@Data
public class AFTR_FFH_COMM_TRSC_PTCLInfo implements Serializable {
    @Id
    @GeneratedValue
    private String trscBrNo;
    private Date trscDt;
    private int commTrscSeqNo;
    private int commTrscDtlsSeqNo;
    private Date sysRegDt;
    private Date sysUpdDt;
    private String commTrscStCd;
    private String commCd;
    private Date commStrDt;
    private String commFctyCd;
    private String commSubFctyCd;
    private String afProcRnwYn;
    private String commBizDvCd;
    private String custNo;
    private String acnmNo;
    private String acctNo;
    private int acctSeqNo;
    private String apvNo;
    private String acnmNoDvCd;
    private Date actgDt;
    private String actgBrNo;
    private String prdCd;
    private String fundNo;
    private String fundTrscTypCd;
    private String rcvPaymDvCd;
    private String procEmpNo;
    private String fstTrmsSysCd;
    private String globId;
    private String chnlTypCd;
    private String svcGrpCd;
    private String recvSvcCd;
    private String trscScrnNo;
    private String pgmId;
    private String datDelCycCd;
    private String canPossYn;
    private String trscBrfcCd;
    private String trscTmnlNo;
    private String plAtitCd;
    private String bsAtitCd;
    private String commPrimMethCd;
    private String commPrimRsnCd;
    private String commLevyDvCd;
    private int sapvCommApcSeqNo;
    private int sapvCommApcDtlsNo;
    private String trscAmtCurCd;
    private int tgtAmt;
    private int tgtNcnt;
    private String commCurCd;
    private int normComm;
    private int apclComm;
    private int fexCommVlu;
    private int primComm;
    private int custPintDctdAmt;
    private int custMlgeDctdAmt;
    private int commCrrcNcnt;
    private int commCrrcAmt;
    private int normCommRt;
    private int apclCommRt;
    private int apclExhgRt;
    private int rduCommRt;
    private int cashAmt;
    private int sbstAmt;
    private int othbrAmt;
    private String othbrBilCd;
    private String fexRefnNo;
    private String gearAcctBnkCd;
    private String gearAcctNo;
    private int gearAcctSeqNo;
    private int dtlsClasNo;
    private Date trmStrDt;
    private Date trmEndDt;
    private Date nlvydPtclRegDt;
    private int nlvydPtclRegNo;
    private String commBizKey;
    private Date canOgnTrscDt;
    private int canOgnTrscSeqNo;
    private int ognTrscDtlsSeqNo;
    private String ognTrscBrNo;
    private String commCustNm;
    private String commRmrk;
    private Date lstTrscDt;
    private String commExmMgntYnStrnCd;
    private String rsevDat;
    private int trtComm;
    private int rduTcnt;
    private Date rduStrDt;
    private int rduPossTotlTcnt;
    private Date rduEndDt;
    private String agntAcnmNo;
    private String agntNm;
    private String unonCd;
    private String ourCustYn;
    private String ibUid;
    private int trmMltp;
    private int apclIrrt;
    private int usdAmt;
    private int wdrwAmt;
    private String pfmcBrNo;
    private String vrtlAcctNo;
    private String commVolnPrimRsnCtt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
