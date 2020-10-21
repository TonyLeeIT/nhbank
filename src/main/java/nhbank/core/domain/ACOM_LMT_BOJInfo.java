package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_LMT_BOJInfo_ID.class)
@Table(name = "ACOM_LMT_BOJ")
@Data
public class ACOM_LMT_BOJInfo implements Serializable {
    @Id
    @Column(name = "SNG_NO")
    private String sngNo;
    @Id
    @Column(name = "SEQ")
    private BigDecimal seq;
    @Column(name = "STS")
    private String sts;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "TR_GWAM")
    private String trGwam;
    @Column(name = "TR_GEOR")
    private String trGeor;
    @Column(name = "CCY")
    private String ccy;
    @Column(name = "AMT")
    private BigDecimal amt;
    @Column(name = "IBJI_GB")
    private String ibjiGb;
    @Column(name = "CCY_GB")
    private String ccyGb;
    @Column(name = "BOJ_GB")
    private String bojGb;
    @Column(name = "IB_TIME")
    private String ibTime;
    @Column(name = "TR_BR")
    private String trBr;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "MNG_NO")
    private String mngNo;
    @Column(name = "IBJI_MD")
    private String ibjiMd;
    @Column(name = "GEOJU_GB")
    private String geojuGb;
    @Column(name = "YD_GUJA")
    private String ydGuja;
    @Column(name = "DAMBO_NO")
    private String damboNo;
    @Column(name = "CD_SNG_NO")
    private String cdSngNo;
    @Column(name = "CD_SIL_SEQ")
    private BigDecimal cdSilSeq;
    @Column(name = "REL_REF_NO")
    private String relRefNo;
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
    @Column(name = "APPL_HRT")
    private BigDecimal applHrt;
    @Column(name = "PAY_CCY")
    private String payCcy;
    @Column(name = "PAY_AMT")
    private BigDecimal payAmt;
    @Column(name = "CAN_HIS_NO")
    private BigDecimal canHisNo;
    @Column(name = "REL_HIS_NO")
    private BigDecimal relHisNo;
    @Column(name = "CPTY_SEQ")
    private BigDecimal cptySeq;
    @Column(name = "LINK_REF_NO")
    private String linkRefNo;
    @Column(name = "REMARK")
    private String remark;
} 
