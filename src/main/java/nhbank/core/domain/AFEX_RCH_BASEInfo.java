package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_RCH_BASEInfo_ID.class)
@Table(name = "AFEX_RCH_BASE")
@Data
public class AFEX_RCH_BASEInfo implements Serializable {
    @Id
    @Column(name = "CD")
    private String cd;
    @Id
    @Column(name = "BKCD")
    private String bkcd;
    @Column(name = "CCY")
    private String ccy;
    @Column(name = "ATTEN_NO")
    private String attenNo;
    @Column(name = "BKNM")
    private String bknm;
    @Column(name = "DEPO_TYPE")
    private String depoType;
    @Column(name = "DEPO_IL")
    private Date depoIl;
    @Column(name = "DEPO_56A")
    private String depo56a;
    @Column(name = "DEPO_57A")
    private String depo57a;
    @Column(name = "CTRY_CD")
    private String ctryCd;
    @Column(name = "DEPO_ETC1")
    private String depoEtc1;
    @Column(name = "DEPO_ETC2")
    private String depoEtc2;
    @Column(name = "DEPO_ETC3")
    private String depoEtc3;
    @Column(name = "RECON_YN")
    private String reconYn;
    @Column(name = "MAKE_IL")
    private Date makeIl;
    @Column(name = "CHNG_IL")
    private Date chngIl;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "MNGR_NO")
    private String mngrNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "AF_CD")
    private String afCd;
    @Column(name = "MNG_BR")
    private String mngBr;
    @Column(name = "CBS_CD")
    private String cbsCd;
    @Column(name = "DBS_CD")
    private String dbsCd;
    @Column(name = "VOSTRO_YN")
    private String vostroYn;
    @Column(name = "MK950_SEQ")
    private BigDecimal mk950Seq;
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
