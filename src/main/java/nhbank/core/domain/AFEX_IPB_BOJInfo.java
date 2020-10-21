package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_IPB_BOJInfo_ID.class)
@Table(name = "AFEX_IPB_BOJ")
@Data
public class AFEX_IPB_BOJInfo implements Serializable {
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
    @Column(name = "AMT")
    private BigDecimal amt;
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "IBJI_GB")
    private String ibjiGb;
    @Column(name = "BOJ_GB")
    private String bojGb;
    @Column(name = "BE_LGCOM_DS_AMT")
    private BigDecimal beLgcomDsAmt;
    @Column(name = "LGM_SEQ")
    private BigDecimal lgmSeq;
    @Column(name = "LGM_SSEQ")
    private BigDecimal lgmSseq;
    @Column(name = "BLD_SEQ")
    private BigDecimal bldSeq;
    @Column(name = "NCU_CCY")
    private String ncuCcy;
    @Column(name = "NCU_AMT")
    private BigDecimal ncuAmt;
    @Column(name = "NCU_BE_LGCOM_DS_AMT")
    private BigDecimal ncuBeLgcomDsAmt;
    @Column(name = "CHD_AMT")
    private BigDecimal chdAmt;
    @Column(name = "JUNHWAN_GB")
    private String junhwanGb;
    @Column(name = "BE_JUNHWAN_WAMT")
    private BigDecimal beJunhwanWamt;
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
