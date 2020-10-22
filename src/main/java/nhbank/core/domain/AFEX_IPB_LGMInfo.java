package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_IPB_LGMInfo_ID.class)
@Table(name = "AFEX_IPB_LGM")
@Data
public class AFEX_IPB_LGMInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "SEQ")
    private BigDecimal seq;
    @Id
    @Column(name = "SSEQ")
    private BigDecimal sseq;
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
    @Column(name = "P_SSEQ")
    private BigDecimal pSseq;
    @Column(name = "JAN")
    private BigDecimal jan;
    @Column(name = "BOJ_BJAN2")
    private BigDecimal bojBjan2;
    @Column(name = "BOJ_JAN2")
    private BigDecimal bojJan2;
    @Column(name = "BL_GB")
    private String blGb;
    @Column(name = "BOJ_JUK_YUL")
    private BigDecimal bojJukYul;
    @Column(name = "YMAN_IL")
    private Date ymanIl;
    @Column(name = "S_YJ_IL")
    private Date sYjIl;
    @Column(name = "S_DS_AMT")
    private BigDecimal sDsAmt;
    @Column(name = "S_JUK_GB")
    private String sJukGb;
    @Column(name = "BL_JUB_IL")
    private Date blJubIl;
    @Column(name = "TR_GB")
    private String trGb;
    @Column(name = "TC_LISU_IL")
    private Date tcLisuIl;
    @Column(name = "BL_NO")
    private String blNo;
    @Column(name = "BLD_SEQ")
    private BigDecimal bldSeq;
    @Column(name = "INS_HIS_NO")
    private BigDecimal insHisNo;
    @Column(name = "BL_BAL_IL")
    private Date blBalIl;
    @Column(name = "LG_HOI_GB")
    private String lgHoiGb;
    @Column(name = "CS_GB")
    private String csGb;
    @Column(name = "TERM")
    private BigDecimal term;
    @Column(name = "TERM_GB")
    private String termGb;
    @Column(name = "JILG_BAMT")
    private BigDecimal jilgBamt;
    @Column(name = "JILG_FAMT")
    private BigDecimal jilgFamt;
    @Column(name = "LGCOM_FR_IL")
    private Date lgcomFrIl;
    @Column(name = "LGCOM_TO_IL")
    private Date lgcomToIl;
    @Column(name = "LGCOM_FRT")
    private BigDecimal lgcomFrt;
    @Column(name = "LGCOM_DS_AMT")
    private BigDecimal lgcomDsAmt;
    @Column(name = "MFCS_RT_CD")
    private String mfcsRtCd;
    @Column(name = "BOJFEE_GB")
    private String bojfeeGb;
    @Column(name = "BOJ_JUK_GB")
    private String bojJukGb;
    @Column(name = "SHIP_NM")
    private String shipNm;
    @Column(name = "SHIP_CO")
    private String shipCo;
    @Column(name = "SHIP_CO_ADDR1")
    private String shipCoAddr1;
    @Column(name = "SHIP_CO_ADDR2")
    private String shipCoAddr2;
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
