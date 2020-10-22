package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_ADH_HISInfo_ID.class)
@Table(name = "AFEX_ADH_HIS")
@Data
public class AFEX_ADH_HISInfo implements Serializable {
    @Id
    @Column(name = "ADV_NO")
    private String advNo;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "BASE_SEQ")
    private BigDecimal baseSeq;
    @Column(name = "AMEND_SEQ")
    private BigDecimal amendSeq;
    @Column(name = "EDI_SEQ")
    private BigDecimal ediSeq;
    @Column(name = "STS")
    private String sts;
    @Column(name = "TR_GB")
    private String trGb;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "TR_BR")
    private String trBr;
    @Column(name = "BR_NO")
    private String brNo;
    @Column(name = "AMD_CNT")
    private BigDecimal amdCnt;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "BUSEO_NO")
    private String buseoNo;
    @Column(name = "IBGM_MD")
    private String ibgmMd;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "EDI_FNM")
    private String ediFnm;
    @Column(name = "EDI_IL")
    private Date ediIl;
    @Column(name = "OPEN_CCY")
    private String openCcy;
    @Column(name = "OPEN_AMT")
    private BigDecimal openAmt;
    @Column(name = "BR_CHARGE")
    private BigDecimal brCharge;
    @Column(name = "CHARGE_AMT")
    private BigDecimal chargeAmt;
    @Column(name = "CHARGE_GB")
    private String chargeGb;
    @Column(name = "MNG_NO")
    private String mngNo;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "IB_TIME")
    private String ibTime;
    @Column(name = "RE_ISSUE")
    private String reIssue;
    @Column(name = "YD_SEQ")
    private BigDecimal ydSeq;
    @Column(name = "YD_GUJA")
    private String ydGuja;
    @Column(name = "SD_REF_NO")
    private String sdRefNo;
    @Column(name = "SD_HIS_NO")
    private BigDecimal sdHisNo;
    @Column(name = "ADV_MAKE_IL")
    private Date advMakeIl;
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
