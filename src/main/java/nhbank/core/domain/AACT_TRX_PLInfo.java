package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AACT_TRX_PLInfo_ID.class)
@Table(name = "AACT_TRX_PL")
@Data
public class AACT_TRX_PLInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Id
    @Column(name = "SEG_SEQ")
    private BigDecimal segSeq;
    @Column(name = "REF_NO2")
    private String refNo2;
    @Column(name = "ORG_GB")
    private String orgGb;
    @Column(name = "ILGE_GB")
    private String ilgeGb;
    @Column(name = "YD_GB")
    private String ydGb;
    @Column(name = "PST_GB")
    private String pstGb;
    @Column(name = "IBF_GB")
    private String ibfGb;
    @Column(name = "POS_GB")
    private String posGb;
    @Column(name = "ACT_IL")
    private Date actIl;
    @Column(name = "ACT_BR")
    private String actBr;
    @Column(name = "PL_CCY")
    private String plCcy;
    @Column(name = "PL_CD")
    private String plCd;
    @Column(name = "IBJI_CD")
    private String ibjiCd;
    @Column(name = "SLIP_GB")
    private String slipGb;
    @Column(name = "JUKI_GB")
    private String jukiGb;
    @Column(name = "UPMU_CD")
    private String upmuCd;
    @Column(name = "GEOR_CD")
    private String georCd;
    @Column(name = "FEE_CD")
    private String feeCd;
    @Column(name = "GAM_GB")
    private String gamGb;
    @Column(name = "O_DS_CCY")
    private String oDsCcy;
    @Column(name = "O_DS_AMT")
    private BigDecimal oDsAmt;
    @Column(name = "O_INT_RT")
    private BigDecimal oIntRt;
    @Column(name = "O_FROM_IL")
    private Date oFromIl;
    @Column(name = "O_TO_IL")
    private Date oToIl;
    @Column(name = "O_ILSU")
    private BigDecimal oIlsu;
    @Column(name = "O_FEE_FAMT")
    private BigDecimal oFeeFamt;
    @Column(name = "O_FEE_BAMT")
    private BigDecimal oFeeBamt;
    @Column(name = "O_APPL_HRT")
    private BigDecimal oApplHrt;
    @Column(name = "O_FTP_RT")
    private BigDecimal oFtpRt;
    @Column(name = "S_DS_CCY")
    private String sDsCcy;
    @Column(name = "S_DS_AMT")
    private BigDecimal sDsAmt;
    @Column(name = "S_INT_RT")
    private BigDecimal sIntRt;
    @Column(name = "S_FROM_IL")
    private Date sFromIl;
    @Column(name = "S_TO_IL")
    private Date sToIl;
    @Column(name = "S_ILSU")
    private BigDecimal sIlsu;
    @Column(name = "S_FEE_FAMT")
    private BigDecimal sFeeFamt;
    @Column(name = "S_FEE_BAMT")
    private BigDecimal sFeeBamt;
    @Column(name = "S_APPL_HRT")
    private BigDecimal sApplHrt;
    @Column(name = "S_BASIC_HRT")
    private BigDecimal sBasicHrt;
    @Column(name = "S_BOOK_HRT")
    private BigDecimal sBookHrt;
    @Column(name = "S_DEMI_HRT")
    private BigDecimal sDemiHrt;
    @Column(name = "S_GOSI_HRT")
    private BigDecimal sGosiHrt;
    @Column(name = "S_FTP_RT")
    private BigDecimal sFtpRt;
    @Column(name = "P_CCY")
    private String pCcy;
    @Column(name = "P_FAMT")
    private BigDecimal pFamt;
    @Column(name = "P_BAMT")
    private BigDecimal pBamt;
    @Column(name = "P_APPL_HRT")
    private BigDecimal pApplHrt;
    @Column(name = "P_BASIC_HRT")
    private BigDecimal pBasicHrt;
    @Column(name = "P_BOOK_HRT")
    private BigDecimal pBookHrt;
    @Column(name = "P_DEMI_HRT")
    private BigDecimal pDemiHrt;
    @Column(name = "P_GOSI_HRT")
    private BigDecimal pGosiHrt;
    @Column(name = "P_FTP_RT")
    private BigDecimal pFtpRt;
    @Column(name = "YD_REFNO")
    private String ydRefno;
    @Column(name = "YD_HISNO")
    private BigDecimal ydHisno;
    @Column(name = "DOC_ID")
    private String docId;
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "THEIR_REFNO")
    private String theirRefno;
    @Column(name = "IFRS_DV_CD")
    private String ifrsDvCd;
    @Column(name = "ID_NO")
    private String idNo;
    @Column(name = "CIX_NO")
    private String cixNo;
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
