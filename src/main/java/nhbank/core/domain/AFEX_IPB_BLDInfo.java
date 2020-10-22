package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_IPB_BLDInfo_ID.class)
@Table(name = "AFEX_IPB_BLD")
@Data
public class AFEX_IPB_BLDInfo implements Serializable {
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
    @Column(name = "JUB_GB")
    private String jubGb;
    @Column(name = "CHU_GB")
    private String chuGb;
    @Column(name = "MI_JAN")
    private BigDecimal miJan;
    @Column(name = "LGB_BJAN")
    private BigDecimal lgbBjan;
    @Column(name = "LGB_FJAN")
    private BigDecimal lgbFjan;
    @Column(name = "COR_GB")
    private String corGb;
    @Column(name = "BL_GB")
    private String blGb;
    @Column(name = "NEGO_BKNM")
    private String negoBknm;
    @Column(name = "SET_BKCD")
    private String setBkcd;
    @Column(name = "HAJA_GB")
    private String hajaGb;
    @Column(name = "BL_NO")
    private String blNo;
    @Column(name = "NEGO_IL")
    private Date negoIl;
    @Column(name = "BL_YJUB_IL")
    private Date blYjubIl;
    @Column(name = "BLK_SSEQ")
    private BigDecimal blkSseq;
    @Column(name = "MAN_GB")
    private String manGb;
    @Column(name = "TC_LISU_IL")
    private Date tcLisuIl;
    @Column(name = "CCC_IJA_GB")
    private String cccIjaGb;
    @Column(name = "BUDO_GB")
    private String budoGb;
    @Column(name = "YUK_NO")
    private String yukNo;
    @Column(name = "DEPO_SEQ")
    private BigDecimal depoSeq;
    @Column(name = "INS_GAM_GB")
    private String insGamGb;
    @Column(name = "INS_IL")
    private Date insIl;
    @Column(name = "INS_AMT")
    private BigDecimal insAmt;
    @Column(name = "INS_JAN")
    private BigDecimal insJan;
    @Column(name = "SHIP_IL")
    private Date shipIl;
    @Column(name = "THEIR_REF")
    private String theirRef;
    @Column(name = "PO_GB")
    private String poGb;
    @Column(name = "APPL_IN")
    private String applIn;
    @Column(name = "RCV_IN")
    private String rcvIn;
    @Column(name = "RCV_ACCT_NO")
    private String rcvAcctNo;
    @Column(name = "TRANS_GB")
    private String transGb;
    @Column(name = "NCU_CCY")
    private String ncuCcy;
    @Column(name = "NCU_AMT")
    private BigDecimal ncuAmt;
    @Column(name = "NCU_MI_JAN")
    private BigDecimal ncuMiJan;
    @Column(name = "NCU_LGB_FJAN")
    private BigDecimal ncuLgbFjan;
    @Column(name = "NCU_INS_AMT")
    private BigDecimal ncuInsAmt;
    @Column(name = "NCU_INS_JAN")
    private BigDecimal ncuInsJan;
    @Column(name = "IJA_AMT")
    private BigDecimal ijaAmt;
    @Column(name = "YJ_INS_IL")
    private String yjInsIl;
    @Column(name = "YJ_MAN_IL")
    private String yjManIl;
    @Column(name = "REMARK1")
    private String remark1;
    @Column(name = "REMARK2")
    private String remark2;
    @Column(name = "REMARK3")
    private String remark3;
    @Column(name = "REMARK4")
    private String remark4;
    @Column(name = "REMARK5")
    private String remark5;
    @Column(name = "REMARK6")
    private String remark6;
    @Column(name = "REMARK7")
    private String remark7;
    @Column(name = "REMARK8")
    private String remark8;
    @Column(name = "REMARK9")
    private String remark9;
    @Column(name = "REMARK10")
    private String remark10;
    @Column(name = "REMARK11")
    private String remark11;
    @Column(name = "REMARK12")
    private String remark12;
    @Column(name = "REMARK13")
    private String remark13;
    @Column(name = "REMARK14")
    private String remark14;
    @Column(name = "REMARK15")
    private String remark15;
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
