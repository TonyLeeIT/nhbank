package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFIF_FEH_HISInfo_ID.class)
@Table(name = "AFIF_FEH_HIS")
@Data
public class AFIF_FEH_HISInfo implements Serializable {
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
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "SD_HIS_NO")
    private BigDecimal sdHisNo;
    @Column(name = "NEAR_BUY_CCY")
    private String nearBuyCcy;
    @Column(name = "NEAR_BUY_FAMT")
    private BigDecimal nearBuyFamt;
    @Column(name = "NEAR_BUY_BAMT")
    private BigDecimal nearBuyBamt;
    @Column(name = "NEAR_BUY_JAN")
    private BigDecimal nearBuyJan;
    @Column(name = "NEAR_BUY_BJAN")
    private BigDecimal nearBuyBjan;
    @Column(name = "NEAR_SELL_CCY")
    private String nearSellCcy;
    @Column(name = "NEAR_SELL_FAMT")
    private BigDecimal nearSellFamt;
    @Column(name = "NEAR_SELL_BAMT")
    private BigDecimal nearSellBamt;
    @Column(name = "NEAR_SELL_JAN")
    private BigDecimal nearSellJan;
    @Column(name = "NEAR_SELL_BJAN")
    private BigDecimal nearSellBjan;
    @Column(name = "NEAR_SND_DOC_NO")
    private String nearSndDocNo;
    @Column(name = "FAR_BUY_CCY")
    private String farBuyCcy;
    @Column(name = "FAR_BUY_FAMT")
    private BigDecimal farBuyFamt;
    @Column(name = "FAR_BUY_BAMT")
    private BigDecimal farBuyBamt;
    @Column(name = "FAR_BUY_JAN")
    private BigDecimal farBuyJan;
    @Column(name = "FAR_BUY_BJAN")
    private BigDecimal farBuyBjan;
    @Column(name = "FAR_SELL_CCY")
    private String farSellCcy;
    @Column(name = "FAR_SELL_FAMT")
    private BigDecimal farSellFamt;
    @Column(name = "FAR_SELL_BAMT")
    private BigDecimal farSellBamt;
    @Column(name = "FAR_SELL_JAN")
    private BigDecimal farSellJan;
    @Column(name = "FAR_SELL_BJAN")
    private BigDecimal farSellBjan;
    @Column(name = "FAR_SND_DOC_NO")
    private String farSndDocNo;
    @Column(name = "TR_BR")
    private String trBr;
    @Column(name = "SD_BR")
    private String sdBr;
    @Column(name = "TR_TIME")
    private String trTime;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "MANAGER_ID")
    private String managerId;
    @Column(name = "IBJI_MD")
    private String ibjiMd;
    @Column(name = "CD_SNG_NO")
    private String cdSngNo;
    @Column(name = "CD_SIL_SEQ")
    private BigDecimal cdSilSeq;
    @Column(name = "FTP_SNG_NO")
    private String ftpSngNo;
    @Column(name = "FTP_SIL_SEQ")
    private BigDecimal ftpSilSeq;
    @Column(name = "JUN_NO")
    private String junNo;
    @Column(name = "YUK_NO")
    private String yukNo;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "FRONT_SND_GB")
    private String frontSndGb;
    @Column(name = "PRE_STS")
    private String preSts;
    @Column(name = "BE_HD_SNGNO")
    private String beHdSngno;
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
