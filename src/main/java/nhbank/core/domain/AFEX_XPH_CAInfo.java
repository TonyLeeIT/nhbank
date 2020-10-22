package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_XPH_CAInfo_ID.class)
@Table(name = "AFEX_XPH_CA")
@Data
public class AFEX_XPH_CAInfo implements Serializable {
    @Id
    @Column(name = "RCV_IL")
    private Date rcvIl;
    @Id
    @Column(name = "SEQ_NO")
    private BigDecimal seqNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "REF_NO")
    private String refNo;
    @Column(name = "CA_CCY")
    private String caCcy;
    @Column(name = "CA_AMT")
    private BigDecimal caAmt;
    @Column(name = "LESS_CA_AMT")
    private BigDecimal lessCaAmt;
    @Column(name = "LESS_CO_AMT")
    private BigDecimal lessCoAmt;
    @Column(name = "LESS_GT_AMT")
    private BigDecimal lessGtAmt;
    @Column(name = "OVER_AMT")
    private BigDecimal overAmt;
    @Column(name = "CA_IL")
    private Date caIl;
    @Column(name = "DEPO_BKCD")
    private String depoBkcd;
    @Column(name = "SD_BAL_IL")
    private Date sdBalIl;
    @Column(name = "CC_GB")
    private String ccGb;
    @Column(name = "CC_IL")
    private Date ccIl;
    @Column(name = "CC_RT_CD")
    private String ccRtCd;
    @Column(name = "TR_GB")
    private String trGb;
    @Column(name = "MT_TR_MD")
    private String mtTrMd;
    @Column(name = "SWIFT_KEY")
    private String swiftKey;
    @Column(name = "RCV_GB")
    private String rcvGb;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "DEPO_CD")
    private String depoCd;
    @Column(name = "CD_GB")
    private String cdGb;
    @Column(name = "DIV_GB")
    private String divGb;
    @Column(name = "DIV_REF")
    private String divRef;
    @Column(name = "NCU_CA_CCY")
    private String ncuCaCcy;
    @Column(name = "NCU_CA_AMT")
    private BigDecimal ncuCaAmt;
    @Column(name = "NCU_LESS_CA_AMT")
    private BigDecimal ncuLessCaAmt;
    @Column(name = "NCU_LESS_CO_AMT")
    private BigDecimal ncuLessCoAmt;
    @Column(name = "NCU_LESS_GT_AMT")
    private BigDecimal ncuLessGtAmt;
    @Column(name = "NCU_OVER_AMT")
    private BigDecimal ncuOverAmt;
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
