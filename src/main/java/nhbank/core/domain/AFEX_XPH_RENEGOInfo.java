package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_XPH_RENEGOInfo_ID.class)
@Table(name = "AFEX_XPH_RENEGO")
@Data
public class AFEX_XPH_RENEGOInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "TR_IL")
    private Date trIl;
    @Column(name = "RENE_GB")
    private String reneGb;
    @Column(name = "NEGO_CCY")
    private String negoCcy;
    @Column(name = "NEGO_AMT")
    private BigDecimal negoAmt;
    @Column(name = "NEGO_IL")
    private Date negoIl;
    @Column(name = "REIM_BKCD")
    private String reimBkcd;
    @Column(name = "REIM_BKNM")
    private String reimBknm;
    @Column(name = "COLL_BKCD")
    private String collBkcd;
    @Column(name = "COLL_BKNM")
    private String collBknm;
    @Column(name = "EXPR_IL")
    private Date exprIl;
    @Column(name = "EXPR_CCY")
    private String exprCcy;
    @Column(name = "EXPR_AMT")
    private BigDecimal exprAmt;
    @Column(name = "HIJA_AMT")
    private BigDecimal hijaAmt;
    @Column(name = "DC_AMT")
    private BigDecimal dcAmt;
    @Column(name = "CABLE")
    private BigDecimal cable;
    @Column(name = "COLL_AMT")
    private BigDecimal collAmt;
    @Column(name = "CC_GB")
    private String ccGb;
    @Column(name = "CC_IL")
    private Date ccIl;
    @Column(name = "CC_RT_CD")
    private String ccRtCd;
    @Column(name = "M202_NM")
    private String m202Nm;
    @Column(name = "M999_NM")
    private String m999Nm;
    @Column(name = "NCU_NEGO_CCY")
    private String ncuNegoCcy;
    @Column(name = "NCU_NEGO_AMT")
    private BigDecimal ncuNegoAmt;
    @Column(name = "YUK_NO")
    private String yukNo;
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
