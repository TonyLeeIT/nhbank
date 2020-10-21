package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@IdClass(ACOM_EPB_RPTInfo_ID.class)
@Table(name = "ACOM_EPB_RPT")
@Data
public class ACOM_EPB_RPTInfo implements Serializable {
    @Column(name = "REF_NO")
    private String refNo;
    @Column(name = "ACR_NO")
    private String acrNo;
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "MNG_BR")
    private String mngBr;
    @Column(name = "TR_CCY")
    private String trCcy;
    @Column(name = "BG_DR_AMT")
    private BigDecimal bgDrAmt;
    @Column(name = "BG_CR_AMT")
    private BigDecimal bgCrAmt;
    @Column(name = "PL_DR_AMT")
    private BigDecimal plDrAmt;
    @Column(name = "PL_CR_AMT")
    private BigDecimal plCrAmt;
    @Column(name = "BUSI_CD")
    private String busiCd;
    @Column(name = "BUSI_GRP_CD")
    private String busiGrpCd;
    @Column(name = "PL_CD")
    private String plCd;
    @Column(name = "MNG_YR")
    private String mngYr;
    @Column(name = "ACR_FM_DT")
    private Date acrFmDt;
    @Column(name = "ACR_TO_DT")
    private Date acrToDt;
    @Column(name = "ACR_AMT")
    private BigDecimal acrAmt;
    @Column(name = "TR_BAMT")
    private BigDecimal trBamt;
    @Column(name = "BIZ_SEQ")
    private BigDecimal bizSeq;
    @Column(name = "BIZ_SUB_SEQ")
    private BigDecimal bizSubSeq;
    @Column(name = "TR_DT")
    private Date trDt;
    @Column(name = "TR_GB")
    private String trGb;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "ACR_STS")
    private String acrSts;
    @Column(name = "DN_GB")
    private String dnGb;
    @Column(name = "REMARK")
    private String remark;
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
