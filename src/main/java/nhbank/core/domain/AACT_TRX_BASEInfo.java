package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AACT_TRX_BASEInfo_ID.class)
@Table(name = "AACT_TRX_BASE")
@Data
public class AACT_TRX_BASEInfo implements Serializable {
    @Id
    @Column(name = "TRX_IL")
    private Date trxIl;
    @Id
    @Column(name = "TRX_BR")
    private String trxBr;
    @Column(name = "TRX_SEQ")
    private BigDecimal trxSeq;
    @Column(name = "REF_NO")
    private String refNo;
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "IBF_GB")
    private String ibfGb;
    @Column(name = "ID_NO")
    private String idNo;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "BUSEO_NO")
    private String buseoNo;
    @Column(name = "UPMU_CD")
    private String upmuCd;
    @Column(name = "GEOR_CD")
    private String georCd;
    @Column(name = "DPYD_GB")
    private String dpydGb;
    @Column(name = "STS")
    private String sts;
    @Column(name = "CAN_HISNO")
    private BigDecimal canHisno;
    @Column(name = "ACT_MACH")
    private String actMach;
    @Column(name = "ACT_DTYP")
    private String actDtyp;
    @Column(name = "ACT_DSEQ")
    private String actDseq;
    @Column(name = "ACT_TELL")
    private String actTell;
    @Column(name = "ACT_SJUM")
    private String actSjum;
    @Column(name = "ACT_CJUM")
    private String actCjum;
    @Column(name = "ACT_MODE")
    private String actMode;
    @Column(name = "CCY_CNT")
    private BigDecimal ccyCnt;
    @Column(name = "ACT_BSPL_GB")
    private String actBsplGb;
    @Column(name = "ACT_CD")
    private String actCd;
    @Column(name = "ACT_CCY")
    private String actCcy;
    @Column(name = "ACT_AMT")
    private BigDecimal actAmt;
    @Column(name = "USD_AMT")
    private BigDecimal usdAmt;
    @Column(name = "FDC_AMT")
    private BigDecimal fdcAmt;
    @Column(name = "FDC_HDAMT")
    private BigDecimal fdcHdamt;
    @Column(name = "APPL_HRT")
    private BigDecimal applHrt;
    @Column(name = "BASIC_HRT")
    private BigDecimal basicHrt;
    @Column(name = "BOOK_HRT")
    private BigDecimal bookHrt;
    @Column(name = "DEMI_HRT")
    private BigDecimal demiHrt;
    @Column(name = "GOSI_HRT")
    private BigDecimal gosiHrt;
    @Column(name = "IBJI_MD")
    private String ibjiMd;
    @Column(name = "JAKI_AMT")
    private BigDecimal jakiAmt;
    @Column(name = "ETC1_AMT")
    private BigDecimal etc1Amt;
    @Column(name = "ETC2_AMT")
    private BigDecimal etc2Amt;
    @Column(name = "ETC3_AMT")
    private BigDecimal etc3Amt;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "IB_TIME")
    private String ibTime;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "ILGE_GB")
    private String ilgeGb;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "MGR_NO")
    private String mgrNo;
    @Column(name = "RM_NO")
    private String rmNo;
    @Column(name = "BS_CNT")
    private BigDecimal bsCnt;
    @Column(name = "PL_CNT")
    private BigDecimal plCnt;
    @Column(name = "CDSNG_NO")
    private String cdsngNo;
    @Column(name = "VIP_GB")
    private String vipGb;
    @Column(name = "THEIR_REFNO")
    private String theirRefno;
    @Column(name = "PL_ADD_YN")
    private String plAddYn;
    @Column(name = "VOUCHER_NO")
    private BigDecimal voucherNo;
    @Column(name = "POS_KIND")
    private String posKind;
    @Column(name = "GLOB_ID")
    private String globId;
    @Column(name = "IFRS_DV_CD")
    private String ifrsDvCd;
    @Column(name = "ACT_EVNT_CD_CTT")
    private String actEvntCdCtt;
    @Column(name = "ACT_APLY_DV_CD")
    private String actAplyDvCd;
    @Column(name = "ACT_OVRD_APLY_CD")
    private String actOvrdAplyCd;
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
