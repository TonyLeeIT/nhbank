package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ACOM_DMH_HISInfo_ID.class)
@Table(name = "ACOM_DMH_HIS")
@Data
public class ACOM_DMH_HISInfo implements Serializable {
    @Id
    @Column(name = "CIX_NO")
    private String cixNo;
    @Id
    @Column(name = "DAMBO_NO")
    private String damboNo;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Id
    @Column(name = "STS")
    private String sts;
    @Column(name = "TR_GB")
    private String trGb;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "MNG_BR")
    private String mngBr;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "DAMBO_CD")
    private String damboCd;
    @Column(name = "DAMBO_TYPE")
    private String damboType;
    @Column(name = "DAMBO_EXP_DATE")
    private Date damboExpDate;
    @Column(name = "CCY")
    private String ccy;
    @Column(name = "FAMT")
    private BigDecimal famt;
    @Column(name = "OBANK_FIX_AMT")
    private BigDecimal obankFixAmt;
    @Column(name = "FIRST_FIX_AMT")
    private BigDecimal firstFixAmt;
    @Column(name = "DAMBO_ADDR")
    private String damboAddr;
    @Column(name = "DAMBO_CITY")
    private String damboCity;
    @Column(name = "APP_LAND_VALUE")
    private BigDecimal appLandValue;
    @Column(name = "OFFER_GB")
    private String offerGb;
    @Column(name = "GRT_ID_NO")
    private String grtIdNo;
    @Column(name = "GRT_PORTION")
    private BigDecimal grtPortion;
    @Column(name = "ACCT_NO")
    private String acctNo;
    @Column(name = "ISSUE_NM")
    private String issueNm;
    @Column(name = "DAMBO_CNT_GB")
    private String damboCntGb;
    @Column(name = "DAMBO_GUR_YN")
    private String damboGurYn;
    @Column(name = "APPRAISER_TYPE")
    private String appraiserType;
    @Column(name = "APP_APPRAISER")
    private String appAppraiser;
    @Column(name = "FST_APP_VALUE")
    private BigDecimal fstAppValue;
    @Column(name = "FST_APP_DATE")
    private Date fstAppDate;
    @Column(name = "RE_APP_DATE")
    private Date reAppDate;
    @Column(name = "RE_APP_VALUE")
    private BigDecimal reAppValue;
    @Column(name = "JUDICIAL_SCRIVENER")
    private String judicialScrivener;
    @Column(name = "FIX_STS")
    private String fixSts;
    @Column(name = "CERT_TYPE")
    private String certType;
    @Column(name = "CERT_STS")
    private String certSts;
    @Column(name = "CERT_NO")
    private String certNo;
    @Column(name = "INSUR_CODE")
    private String insurCode;
    @Column(name = "INSUR_POLICY_NO")
    private String insurPolicyNo;
    @Column(name = "INSUR_COMPANY")
    private String insurCompany;
    @Column(name = "INSUR_EXP_DATE")
    private Date insurExpDate;
    @Column(name = "INSUR_AMT")
    private BigDecimal insurAmt;
    @Column(name = "INSUR_REMARK")
    private String insurRemark;
    @Column(name = "TO_MORTGAGE")
    private String toMortgage;
    @Column(name = "COLL_OWNER_NAME")
    private String collOwnerName;
    @Column(name = "INSUR_OBJ_ADDR")
    private String insurObjAddr;
    @Column(name = "ALLOC_RATIO")
    private BigDecimal allocRatio;
    @Column(name = "ALLOC_AMT")
    private BigDecimal allocAmt;
    @Column(name = "DEPOSIT_CD")
    private String depositCd;
    @Column(name = "ST_CO_GB")
    private String stCoGb;
    @Column(name = "ST_CO_NAME")
    private String stCoName;
    @Column(name = "FILING_DATE")
    private Date filingDate;
    @Column(name = "FILING_NUM")
    private String filingNum;
    @Column(name = "EXPIRE_DATE")
    private Date expireDate;
    @Column(name = "PRIORITY")
    private BigDecimal priority;
    @Column(name = "STS_EXP_DATE")
    private Date stsExpDate;
    @Column(name = "APP_GAP")
    private BigDecimal appGap;
    @Column(name = "FAMT_INT")
    private BigDecimal famtInt;
    @Column(name = "FIRST_FIX_AMT_INT")
    private BigDecimal firstFixAmtInt;
    @Column(name = "FST_APP_VALUE_INT")
    private BigDecimal fstAppValueInt;
    @Column(name = "FST_APP_DATE_INT")
    private Date fstAppDateInt;
    @Column(name = "FAMT_EXT")
    private BigDecimal famtExt;
    @Column(name = "FIRST_FIX_AMT_EXT")
    private BigDecimal firstFixAmtExt;
    @Column(name = "FST_APP_VALUE_EXT")
    private BigDecimal fstAppValueExt;
    @Column(name = "FST_APP_DATE_EXT")
    private Date fstAppDateExt;
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
