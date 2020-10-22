package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_XPB_BDMInfo_ID.class)
@Table(name = "AFEX_XPB_BDM")
@Data
public class AFEX_XPB_BDMInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "CCY")
    private String ccy;
    @Column(name = "AMT")
    private BigDecimal amt;
    @Column(name = "BUDO_CD")
    private String budoCd;
    @Column(name = "SH_SEQ")
    private BigDecimal shSeq;
    @Column(name = "SH_SUM_AMT")
    private BigDecimal shSumAmt;
    @Column(name = "BM_GB")
    private String bmGb;
    @Column(name = "MI_SEQ")
    private BigDecimal miSeq;
    @Column(name = "MI_TR_BAMT")
    private BigDecimal miTrBamt;
    @Column(name = "MI_SH_BAMT")
    private BigDecimal miShBamt;
    @Column(name = "NCU_CCY")
    private String ncuCcy;
    @Column(name = "NCU_AMT")
    private BigDecimal ncuAmt;
    @Column(name = "NCU_SH_SUM_AMT")
    private BigDecimal ncuShSumAmt;
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
