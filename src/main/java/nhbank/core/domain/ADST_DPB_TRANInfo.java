package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ADST_DPB_TRANInfo_ID.class)
@Table(name = "ADST_DPB_TRAN")
@Data
public class ADST_DPB_TRANInfo implements Serializable {
    @Id
    @Column(name = "ACCT_NO")
    private String acctNo;
    @Id
    @Column(name = "IB_IL")
    private Date ibIl;
    @Id
    @Column(name = "TRX_NO")
    private BigDecimal trxNo;
    @Column(name = "MNG_BR")
    private String mngBr;
    @Column(name = "PRINT_GB")
    private String printGb;
    @Column(name = "NO_PBOOK_GB")
    private String noPbookGb;
    @Column(name = "NO_PRINT_GB")
    private String noPrintGb;
    @Column(name = "STS")
    private String sts;
    @Column(name = "YD_GB")
    private String ydGb;
    @Column(name = "SLIP_GB")
    private String slipGb;
    @Column(name = "MUINJA_GB")
    private String muinjaGb;
    @Column(name = "IBGM_SLIP_GB")
    private String ibgmSlipGb;
    @Column(name = "INT_SLIP_GB")
    private String intSlipGb;
    @Column(name = "TAX_SLIP_GB")
    private String taxSlipGb;
    @Column(name = "JIGB_YD_GB")
    private String jigbYdGb;
    @Column(name = "CHK_YD_GB")
    private String chkYdGb;
    @Column(name = "CASH_TR_GB")
    private String cashTrGb;
    @Column(name = "FX_TR_GB")
    private String fxTrGb;
    @Column(name = "IBJI_GB")
    private String ibjiGb;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "SUB_TR_CD")
    private String subTrCd;
    @Column(name = "MECH_GB")
    private String mechGb;
    @Column(name = "FUND_GB")
    private String fundGb;
    @Column(name = "TR_CCY")
    private String trCcy;
    @Column(name = "TR_AMT")
    private BigDecimal trAmt;
    @Column(name = "TR_AAMT")
    private BigDecimal trAamt;
    @Column(name = "AF_JAN")
    private BigDecimal afJan;
    @Column(name = "CHK_GB")
    private String chkGb;
    @Column(name = "CHK_NO")
    private String chkNo;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "TR_BR")
    private String trBr;
    @Column(name = "TSEQ_NO")
    private String tseqNo;
    @Column(name = "TR_BK")
    private String trBk;
    @Column(name = "TR_TIME")
    private String trTime;
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "REQ_CUST_ID")
    private String reqCustId;
    @Column(name = "YD_REF_NO")
    private String ydRefNo;
    @Column(name = "YD_THEIR_REF_NO")
    private String ydTheirRefNo;
    @Column(name = "YD_HIS_NO")
    private BigDecimal ydHisNo;
    @Column(name = "SD_BK")
    private String sdBk;
    @Column(name = "TOT_FEE")
    private BigDecimal totFee;
    @Column(name = "TAX1_AMT")
    private BigDecimal tax1Amt;
    @Column(name = "TAX2_AMT")
    private BigDecimal tax2Amt;
    @Column(name = "TAX3_AMT")
    private BigDecimal tax3Amt;
    @Column(name = "TAX4_AMT")
    private BigDecimal tax4Amt;
    @Column(name = "INT_PAY_CNT")
    private BigDecimal intPayCnt;
    @Column(name = "BF_INT_CAL_IL")
    private Date bfIntCalIl;
    @Column(name = "BF_INT_RCV_IL")
    private Date bfIntRcvIl;
    @Column(name = "DPT_RT")
    private BigDecimal dptRt;
    @Column(name = "APPL_HRT")
    private BigDecimal applHrt;
    @Column(name = "PJ_HRT")
    private BigDecimal pjHrt;
    @Column(name = "BOOK_HRT")
    private BigDecimal bookHrt;
    @Column(name = "BASIC_HRT")
    private BigDecimal basicHrt;
    @Column(name = "GOSI_HRT")
    private BigDecimal gosiHrt;
    @Column(name = "DEMI_HRT")
    private BigDecimal demiHrt;
    @Column(name = "EX_RT_SNG_NO")
    private BigDecimal exRtSngNo;
    @Column(name = "DPT_RT_SNG_NO")
    private BigDecimal dptRtSngNo;
    @Column(name = "CASH_FEE")
    private BigDecimal cashFee;
    @Column(name = "FED_DOC_ID")
    private String fedDocId;
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "LST_TIME")
    private String lstTime;
    @Column(name = "SELF_MNG_IL")
    private Date selfMngIl;
    @Column(name = "CHECK1_AMT")
    private BigDecimal check1Amt;
    @Column(name = "CHECK2_AMT")
    private BigDecimal check2Amt;
    @Column(name = "CHECK3_AMT")
    private BigDecimal check3Amt;
    @Column(name = "CHECK1_AAMT")
    private BigDecimal check1Aamt;
    @Column(name = "CHECK2_AAMT")
    private BigDecimal check2Aamt;
    @Column(name = "CHECK3_AAMT")
    private BigDecimal check3Aamt;
    @Column(name = "CHNL_REF_NO")
    private String chnlRefNo;
    @Column(name = "CHNL_HIS_NO")
    private BigDecimal chnlHisNo;
    @Column(name = "ETC_FEE1")
    private BigDecimal etcFee1;
    @Column(name = "OLD_TRX_NO")
    private String oldTrxNo;
    @Column(name = "FROM_DT")
    private Date fromDt;
    @Column(name = "TO_DT")
    private Date toDt;
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
