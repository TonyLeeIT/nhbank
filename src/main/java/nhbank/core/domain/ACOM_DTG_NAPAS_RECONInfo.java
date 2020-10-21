package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_DTG_NAPAS_RECONInfo_ID.class)
@Table(name = "ACOM_DTG_NAPAS_RECON")
@Data
public class ACOM_DTG_NAPAS_RECONInfo implements Serializable {
    @Id
    @Column(name = "BK_CD")
    private String bkCd;
    @Id
    @Column(name = "TRN_DATE")
    private String trnDate;
    @Id
    @Column(name = "RECON_TYPE")
    private String reconType;
    @Id
    @Column(name = "DE032_ACQ_CD")
    private String de032AcqCd;
    @Id
    @Column(name = "DE041_CRD_ACPT_TRM")
    private String de041CrdAcptTrm;
    @Id
    @Column(name = "DE011_TRACE_NO")
    private String de011TraceNo;
    @Column(name = "DE002_PAN")
    private String de002Pan;
    @Column(name = "DE003_PROC_CD")
    private String de003ProcCd;
    @Column(name = "DE004_TRN_AMT")
    private BigDecimal de004TrnAmt;
    @Column(name = "DE005_STL_AMT")
    private BigDecimal de005StlAmt;
    @Column(name = "DE006_BIL_AMT")
    private BigDecimal de006BilAmt;
    @Column(name = "DE009_STL_CONV_RT")
    private BigDecimal de009StlConvRt;
    @Column(name = "DE010_BIL_CONV_RT")
    private BigDecimal de010BilConvRt;
    @Column(name = "DE012_LOC_TRN_TIME")
    private String de012LocTrnTime;
    @Column(name = "DE013_LOC_TRN_DATE")
    private String de013LocTrnDate;
    @Column(name = "DE015_STL_DATE")
    private String de015StlDate;
    @Column(name = "DE018_MER_CAT_CD")
    private String de018MerCatCd;
    @Column(name = "DE022_POS_MODE")
    private String de022PosMode;
    @Column(name = "DE025_POS_COND_CD")
    private String de025PosCondCd;
    @Column(name = "DE037_REL_REF_NO")
    private String de037RelRefNo;
    @Column(name = "DE038_AUTH_ID_RES")
    private String de038AuthIdRes;
    @Column(name = "DE042_CRD_ACPT_ID")
    private String de042CrdAcptId;
    @Column(name = "DE049_TRN_CCY")
    private String de049TrnCcy;
    @Column(name = "DE050_STL_CCY")
    private String de050StlCcy;
    @Column(name = "DE051_BIL_CCY")
    private String de051BilCcy;
    @Column(name = "DE060_CNL_TP")
    private String de060CnlTp;
    @Column(name = "DE062_NAP_SVC_CD")
    private String de062NapSvcCd;
    @Column(name = "DE063_TRN_REF_NO")
    private String de063TrnRefNo;
    @Column(name = "DE100_BEN_CD")
    private String de100BenCd;
    @Column(name = "DE102_SND_ACC_INF")
    private String de102SndAccInf;
    @Column(name = "DE103_RCV_ACC_INF")
    private String de103RcvAccInf;
    @Column(name = "PROCESS")
    private String process;
    @Column(name = "MTI")
    private String mti;
    @Column(name = "RTA")
    private BigDecimal rta;
    @Column(name = "RCA")
    private BigDecimal rca;
    @Column(name = "ISS")
    private String iss;
    @Column(name = "SVFISSNP")
    private BigDecimal svfissnp;
    @Column(name = "IRFISSACQ")
    private BigDecimal irfissacq;
    @Column(name = "IRFISSBNB")
    private BigDecimal irfissbnb;
    @Column(name = "SVFACQNP")
    private BigDecimal svfacqnp;
    @Column(name = "IRFACQISS")
    private BigDecimal irfacqiss;
    @Column(name = "IRFACQBNB")
    private BigDecimal irfacqbnb;
    @Column(name = "SVFBNBNP")
    private BigDecimal svfbnbnp;
    @Column(name = "IRFBNBISS")
    private BigDecimal irfbnbiss;
    @Column(name = "IRFBNBACQ")
    private BigDecimal irfbnbacq;
    @Column(name = "RRC")
    private String rrc;
    @Column(name = "RSV1")
    private String rsv1;
    @Column(name = "RSV2")
    private String rsv2;
    @Column(name = "RSV3")
    private String rsv3;
    @Column(name = "TRN_STS")
    private String trnSts;
    @Column(name = "NEW_STS")
    private String newSts;
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "REG_EMP_NO")
    private String regEmpNo;
    @Column(name = "REG_DT")
    private Date regDt;
    @Column(name = "REG_TM")
    private String regTm;
    @Column(name = "UPD_EMP_NO")
    private String updEmpNo;
    @Column(name = "UPD_DT")
    private Date updDt;
    @Column(name = "UPD_TM")
    private String updTm;
    @Column(name = "STL_DATE")
    private String stlDate;
} 
