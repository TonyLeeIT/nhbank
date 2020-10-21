package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_LMT_SILHISInfo_ID.class)
@Table(name = "ACOM_LMT_SILHIS")
@Data
public class ACOM_LMT_SILHISInfo implements Serializable {
    @Id
    @Column(name = "SNG_NO")
    private String sngNo;
    @Id
    @Column(name = "ACT_CD")
    private String actCd;
    @Id
    @Column(name = "SIL_CCY")
    private String silCcy;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "REF_NO")
    private String refNo;
    @Column(name = "SIL_GB")
    private String silGb;
    @Column(name = "UPMU_CD")
    private String upmuCd;
    @Column(name = "GEOR_CD")
    private String georCd;
    @Column(name = "SIL_AMT")
    private BigDecimal silAmt;
    @Column(name = "SIL_PMGB")
    private String silPmgb;
    @Column(name = "SIL_JAN")
    private BigDecimal silJan;
    @Column(name = "DJG_AMT")
    private BigDecimal djgAmt;
    @Column(name = "DJG_PMGB")
    private String djgPmgb;
    @Column(name = "DJG_JAN")
    private BigDecimal djgJan;
    @Column(name = "GUR_BAMT")
    private BigDecimal gurBamt;
    @Column(name = "GUR_BPMGB")
    private String gurBpmgb;
    @Column(name = "GUR_BJAN")
    private BigDecimal gurBjan;
    @Column(name = "GUR_FAMT")
    private BigDecimal gurFamt;
    @Column(name = "GUR_FPMGB")
    private String gurFpmgb;
    @Column(name = "GUR_FJAN")
    private BigDecimal gurFjan;
    @Column(name = "TR_BR")
    private String trBr;
    @Column(name = "SD_BR")
    private String sdBr;
    @Column(name = "TR_TIME")
    private String trTime;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "MNG_NO")
    private String mngNo;
    @Column(name = "TRSC_SEQ_NO")
    private BigDecimal trscSeqNo;
    @Column(name = "TRX_FAMT")
    private BigDecimal trxFamt;
    @Column(name = "TRX_BAMT")
    private BigDecimal trxBamt;
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
