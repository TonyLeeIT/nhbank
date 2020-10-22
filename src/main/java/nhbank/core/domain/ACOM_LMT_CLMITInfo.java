package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_LMT_CLMITInfo_ID.class)
@Table(name = "ACOM_LMT_CLMIT")
@Data
public class ACOM_LMT_CLMITInfo implements Serializable {
    @Id
    @Column(name = "LA_INSP_RCNO")
    private String laInspRcno;
    @Id
    @Column(name = "CHG_SQNO")
    private BigDecimal chgSqno;
    @Column(name = "LA_INSP_RC_SQNO")
    private BigDecimal laInspRcSqno;
    @Column(name = "LA_INSP_RC_C")
    private String laInspRcC;
    @Column(name = "FX_ACNO")
    private String fxAcno;
    @Column(name = "REP_CUSNO")
    private BigDecimal repCusno;
    @Column(name = "CUSNO")
    private BigDecimal cusno;
    @Column(name = "BRC")
    private String brc;
    @Column(name = "EST_CURC")
    private String estCurc;
    @Column(name = "LA_PMI_AM")
    private BigDecimal laPmiAm;
    @Column(name = "LMT_DUE_DT")
    private Date lmtDueDt;
    @Column(name = "LA_PRD_MTCN")
    private BigDecimal laPrdMtcn;
    @Column(name = "PNP_LA_MGG_KDC")
    private String pnpLaMggKdc;
    @Column(name = "BND_PSV_C")
    private String bndPsvC;
    @Column(name = "LA_ITR_DSC")
    private String laItrDsc;
    @Column(name = "ACUS_APL_ITR")
    private BigDecimal acusAplItr;
    @Column(name = "WRS_C")
    private String wrsC;
    @Column(name = "RGMN_ENO")
    private String rgmnEno;
    @Column(name = "IVTMN_ENO")
    private String ivtmnEno;
    @Column(name = "SCID")
    private String scid;
    @Column(name = "TR_XCRT")
    private BigDecimal trXcrt;
    @Column(name = "XCRT_SC")
    private BigDecimal xcrtSc;
    @Column(name = "DBT_ACP_C")
    private String dbtAcpC;
    @Column(name = "BF_LA_INSP_RCNO")
    private String bfLaInspRcno;
    @Column(name = "CHBF_CUSNO")
    private BigDecimal chbfCusno;
    @Column(name = "TR_DT")
    private Date trDt;
    @Column(name = "FX_TR_SQNO")
    private BigDecimal fxTrSqno;
    @Column(name = "RMK_CNTN")
    private String rmkCntn;
    @Column(name = "FX_STSC")
    private String fxStsc;
    @Column(name = "LSCHG_DTM")
    private Date lschgDtm;
    @Column(name = "LS_CMENO")
    private String lsCmeno;
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
