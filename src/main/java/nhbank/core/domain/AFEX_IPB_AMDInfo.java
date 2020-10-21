package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_IPB_AMDInfo_ID.class)
@Table(name = "AFEX_IPB_AMD")
@Data
public class AFEX_IPB_AMDInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "SEQ")
    private BigDecimal seq;
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
    @Column(name = "ID_AMT")
    private BigDecimal idAmt;
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "AMD_CD")
    private String amdCd;
    @Column(name = "BE_CCY")
    private String beCcy;
    @Column(name = "AF_CCY")
    private String afCcy;
    @Column(name = "BE_AMT")
    private BigDecimal beAmt;
    @Column(name = "AF_AMT")
    private BigDecimal afAmt;
    @Column(name = "BE_EXP_IL")
    private Date beExpIl;
    @Column(name = "AF_EXP_IL")
    private Date afExpIl;
    @Column(name = "BOJ_JUK_YUL")
    private BigDecimal bojJukYul;
    @Column(name = "TC_DSAMT")
    private BigDecimal tcDsamt;
    @Column(name = "RE_RE_GB")
    private String reReGb;
    @Column(name = "BE_MORE")
    private String beMore;
    @Column(name = "BE_LESS")
    private String beLess;
    @Column(name = "AF_MORE")
    private String afMore;
    @Column(name = "AF_LESS")
    private String afLess;
    @Column(name = "BE_TC_LISU_IL")
    private Date beTcLisuIl;
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
