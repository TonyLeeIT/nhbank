package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_BFH_HISInfo_ID.class)
@Table(name = "AFEX_BFH_HIS")
@Data
public class AFEX_BFH_HISInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "TR_GB")
    private String trGb;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "BEFORE_AMT")
    private BigDecimal beforeAmt;
    @Column(name = "AFTER_AMT")
    private BigDecimal afterAmt;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "SD_HIS_NO")
    private BigDecimal sdHisNo;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "MNG_BR")
    private String mngBr;
    @Column(name = "BF_RECV_REF_NO")
    private String bfRecvRefNo;
    @Column(name = "BF_CH_AMT")
    private BigDecimal bfChAmt;
    @Column(name = "BF_RECV_BKCD")
    private String bfRecvBkcd;
    @Column(name = "BF_RECV_DEPO")
    private String bfRecvDepo;
    @Column(name = "BF_BASE_STS")
    private String bfBaseSts;
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
