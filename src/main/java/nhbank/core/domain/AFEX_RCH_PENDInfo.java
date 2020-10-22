package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_RCH_PENDInfo_ID.class)
@Table(name = "AFEX_RCH_PEND")
@Data
public class AFEX_RCH_PENDInfo implements Serializable {
    @Id
    @Column(name = "CD")
    private String cd;
    @Id
    @Column(name = "CCY")
    private String ccy;
    @Id
    @Column(name = "SA_GB")
    private String saGb;
    @Id
    @Column(name = "TR_IL")
    private Date trIl;
    @Id
    @Column(name = "TR_SEQ")
    private BigDecimal trSeq;
    @Id
    @Column(name = "VAL_IL")
    private Date valIl;
    @Column(name = "OUR_REF")
    private String ourRef;
    @Column(name = "DRCR_GB")
    private String drcrGb;
    @Column(name = "DRCR_AMT")
    private BigDecimal drcrAmt;
    @Column(name = "THEIR_REF")
    private String theirRef;
    @Column(name = "UPMU_CD")
    private String upmuCd;
    @Column(name = "INID_CD")
    private String inidCd;
    @Column(name = "ORIG_AMT")
    private BigDecimal origAmt;
    @Column(name = "BUNHAL_SEQ")
    private BigDecimal bunhalSeq;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "IB_TIME")
    private String ibTime;
    @Column(name = "OPER_ID")
    private String operId;
    @Column(name = "CANCEL_YN")
    private String cancelYn;
    @Column(name = "ORIG_REF")
    private String origRef;
    @Column(name = "CONFIRM_YN")
    private String confirmYn;
    @Column(name = "NREF_CNT")
    private String nrefCnt;
    @Column(name = "DOC_ID")
    private String docId;
    @Column(name = "OTHER_REF")
    private String otherRef;
    @Column(name = "REF_HIS_NO")
    private BigDecimal refHisNo;
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
