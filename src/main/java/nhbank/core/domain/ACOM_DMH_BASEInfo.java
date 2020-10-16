package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "acomDmhBase")
@Data
public class ACOM_DMH_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String cixNo;
    private String damboNo;
    private String sts;
    private String systemGb;
    private BigDecimal seqNo;
    private String damboCd;
    private String damboType;
    private Date damboExpDate;
    private String ccy;
    private BigDecimal famt;
    private BigDecimal obankFixAmt;
    private BigDecimal firstFixAmt;
    private String damboAddr;
    private String damboCity;
    private BigDecimal appLandValue;
    private String offerGb;
    private String grtIdNo;
    private BigDecimal grtPortion;
    private String acctNo;
    private String issueNm;
    private String damboCntGb;
    private String damboGurYn;
    private String appraiserType;
    private String appAppraiser;
    private BigDecimal fstAppValue;
    private Date fstAppDate;
    private Date reAppDate;
    private BigDecimal reAppValue;
    private String judicialScrivener;
    private String fixSts;
    private String certType;
    private String certSts;
    private String certNo;
    private String insurCode;
    private String insurPolicyNo;
    private String insurCompany;
    private Date insurExpDate;
    private BigDecimal insurAmt;
    private String insurRemark;
    private String toMortgage;
    private String collOwnerName;
    private String insurObjAddr;
    private BigDecimal allocRatio;
    private BigDecimal allocAmt;
    private String mngBr;
    private BigDecimal lstHisNo;
    private Date acIl;
    private Date lstAcIl;
    private String opNo;
    private String depositCd;
    private String stCoGb;
    private String stCoName;
    private Date filingDate;
    private String filingNum;
    private Date expireDate;
    private BigDecimal priority;
    private Date stsExpDate;
    private BigDecimal appGap;
    private BigDecimal famtInt;
    private BigDecimal firstFixAmtInt;
    private BigDecimal fstAppValueInt;
    private Date fstAppDateInt;
    private BigDecimal famtExt;
    private BigDecimal firstFixAmtExt;
    private BigDecimal fstAppValueExt;
    private Date fstAppDateExt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
