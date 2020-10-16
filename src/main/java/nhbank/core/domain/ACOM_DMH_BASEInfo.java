package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_DMH_BASE")
@Data
public class ACOM_DMH_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String cixNo;
    private String damboNo;
    private String sts;
    private String systemGb;
    private int seqNo;
    private String damboCd;
    private String damboType;
    private Date damboExpDate;
    private String ccy;
    private int famt;
    private int obankFixAmt;
    private int firstFixAmt;
    private String damboAddr;
    private String damboCity;
    private int appLandValue;
    private String offerGb;
    private String grtIdNo;
    private int grtPortion;
    private String acctNo;
    private String issueNm;
    private String damboCntGb;
    private String damboGurYn;
    private String appraiserType;
    private String appAppraiser;
    private int fstAppValue;
    private Date fstAppDate;
    private Date reAppDate;
    private int reAppValue;
    private String judicialScrivener;
    private String fixSts;
    private String certType;
    private String certSts;
    private String certNo;
    private String insurCode;
    private String insurPolicyNo;
    private String insurCompany;
    private Date insurExpDate;
    private int insurAmt;
    private String insurRemark;
    private String toMortgage;
    private String collOwnerName;
    private String insurObjAddr;
    private int allocRatio;
    private int allocAmt;
    private String mngBr;
    private int lstHisNo;
    private Date acIl;
    private Date lstAcIl;
    private String opNo;
    private String depositCd;
    private String stCoGb;
    private String stCoName;
    private Date filingDate;
    private String filingNum;
    private Date expireDate;
    private int priority;
    private Date stsExpDate;
    private int appGap;
    private int famtInt;
    private int firstFixAmtInt;
    private int fstAppValueInt;
    private Date fstAppDateInt;
    private int famtExt;
    private int firstFixAmtExt;
    private int fstAppValueExt;
    private Date fstAppDateExt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
