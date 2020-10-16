package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ADST_DPB_TRAN")
@Data
public class ADST_DPB_TRANInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private Date ibIl;
    private BigDecimal trxNo;
    private String mngBr;
    private String printGb;
    private String noPbookGb;
    private String noPrintGb;
    private String sts;
    private String ydGb;
    private String slipGb;
    private String muinjaGb;
    private String ibgmSlipGb;
    private String intSlipGb;
    private String taxSlipGb;
    private String jigbYdGb;
    private String chkYdGb;
    private String cashTrGb;
    private String fxTrGb;
    private String ibjiGb;
    private String trCd;
    private String subTrCd;
    private String mechGb;
    private String fundGb;
    private String trCcy;
    private BigDecimal trAmt;
    private BigDecimal trAamt;
    private BigDecimal afJan;
    private String chkGb;
    private String chkNo;
    private Date acIl;
    private Date gisIl;
    private String opNo;
    private String trBr;
    private String tseqNo;
    private String trBk;
    private String trTime;
    private String remark;
    private String reqCustId;
    private String ydRefNo;
    private String ydTheirRefNo;
    private BigDecimal ydHisNo;
    private String sdBk;
    private BigDecimal totFee;
    private BigDecimal tax1Amt;
    private BigDecimal tax2Amt;
    private BigDecimal tax3Amt;
    private BigDecimal tax4Amt;
    private BigDecimal intPayCnt;
    private Date bfIntCalIl;
    private Date bfIntRcvIl;
    private BigDecimal dptRt;
    private BigDecimal applHrt;
    private BigDecimal pjHrt;
    private BigDecimal bookHrt;
    private BigDecimal basicHrt;
    private BigDecimal gosiHrt;
    private BigDecimal demiHrt;
    private BigDecimal exRtSngNo;
    private BigDecimal dptRtSngNo;
    private BigDecimal cashFee;
    private String fedDocId;
    private BigDecimal hisNo;
    private Date lstIbIl;
    private String lstTime;
    private Date selfMngIl;
    private BigDecimal check1Amt;
    private BigDecimal check2Amt;
    private BigDecimal check3Amt;
    private BigDecimal check1Aamt;
    private BigDecimal check2Aamt;
    private BigDecimal check3Aamt;
    private String chnlRefNo;
    private BigDecimal chnlHisNo;
    private BigDecimal etcFee1;
    private String oldTrxNo;
    private Date fromDt;
    private Date toDt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
