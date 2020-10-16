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
@Table(name = "acomDtgNapasRecon")
@Data
public class ACOM_DTG_NAPAS_RECONInfo implements Serializable {
    @Id
    @GeneratedValue
    private String bkCd;
    private String trnDate;
    private String reconType;
    private String de032AcqCd;
    private String de041CrdAcptTrm;
    private String de011TraceNo;
    private String de002Pan;
    private String de003ProcCd;
    private BigDecimal de004TrnAmt;
    private BigDecimal de005StlAmt;
    private BigDecimal de006BilAmt;
    private BigDecimal de009StlConvRt;
    private BigDecimal de010BilConvRt;
    private String de012LocTrnTime;
    private String de013LocTrnDate;
    private String de015StlDate;
    private String de018MerCatCd;
    private String de022PosMode;
    private String de025PosCondCd;
    private String de037RelRefNo;
    private String de038AuthIdRes;
    private String de042CrdAcptId;
    private String de049TrnCcy;
    private String de050StlCcy;
    private String de051BilCcy;
    private String de060CnlTp;
    private String de062NapSvcCd;
    private String de063TrnRefNo;
    private String de100BenCd;
    private String de102SndAccInf;
    private String de103RcvAccInf;
    private String process;
    private String mti;
    private BigDecimal rta;
    private BigDecimal rca;
    private String iss;
    private BigDecimal svfissnp;
    private BigDecimal irfissacq;
    private BigDecimal irfissbnb;
    private BigDecimal svfacqnp;
    private BigDecimal irfacqiss;
    private BigDecimal irfacqbnb;
    private BigDecimal svfbnbnp;
    private BigDecimal irfbnbiss;
    private BigDecimal irfbnbacq;
    private String rrc;
    private String rsv1;
    private String rsv2;
    private String rsv3;
    private String trnSts;
    private String newSts;
    private String remark;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private String stlDate;
} 
