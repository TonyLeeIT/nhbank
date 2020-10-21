package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ADST_LNB_INTInfo_ID.class)
@Table(name = "ADST_LNB_INT")
@Data
public class ADST_LNB_INTInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Id
    @Column(name = "SEQ_NO")
    private BigDecimal seqNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "ADJ_SEQ")
    private BigDecimal adjSeq;
    @Column(name = "SCH_SEQ")
    private BigDecimal schSeq;
    @Column(name = "SCH_SUB_NO")
    private BigDecimal schSubNo;
    @Column(name = "INT_RCV_IL")
    private Date intRcvIl;
    @Column(name = "CCY")
    private String ccy;
    @Column(name = "INT_AMT")
    private BigDecimal intAmt;
    @Column(name = "INT_DS_AMT")
    private BigDecimal intDsAmt;
    @Column(name = "USD_CVT_AMT")
    private BigDecimal usdCvtAmt;
    @Column(name = "BBS_CVT_AMT")
    private BigDecimal bbsCvtAmt;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "INT_GB")
    private String intGb;
    @Column(name = "TR_GB")
    private String trGb;
    @Column(name = "MISU_GB")
    private String misuGb;
    @Column(name = "ROLL_GB")
    private String rollGb;
    @Column(name = "INDEX_RT")
    private BigDecimal indexRt;
    @Column(name = "SPREAD_GB")
    private String spreadGb;
    @Column(name = "SPREAD_RT")
    private BigDecimal spreadRt;
    @Column(name = "INT_O_RT")
    private BigDecimal intORt;
    @Column(name = "INT_S_RT")
    private BigDecimal intSRt;
    @Column(name = "INT_FROM_IL")
    private Date intFromIl;
    @Column(name = "INT_TO_IL")
    private Date intToIl;
    @Column(name = "INT_DAYS")
    private BigDecimal intDays;
    @Column(name = "BIZ_SEQ")
    private BigDecimal bizSeq;
    @Column(name = "BIZ_SUBSEQ")
    private BigDecimal bizSubseq;
    @Column(name = "BF_JS_LISU_IL")
    private Date bfJsLisuIl;
    @Column(name = "BF_PT_LISU_IL")
    private Date bfPtLisuIl;
    @Column(name = "BF_YC_LISU_IL")
    private Date bfYcLisuIl;
    @Column(name = "FST_IB_IL")
    private Date fstIbIl;
    @Column(name = "LST_DEAL_IL")
    private Date lstDealIl;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
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
} 
