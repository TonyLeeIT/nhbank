package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ADST_LNB_AGRInfo_ID.class)
@Table(name = "ADST_LNB_AGR")
@Data
public class ADST_LNB_AGRInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Column(name = "IKIS_STS")
    private String ikisSts;
    @Column(name = "BK_GB")
    private String bkGb;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "BUSEO_NO")
    private String buseoNo;
    @Column(name = "COM_ID")
    private String comId;
    @Column(name = "COM_NM")
    private String comNm;
    @Column(name = "CONTRACT_IL")
    private Date contractIl;
    @Column(name = "VALUE_IL")
    private Date valueIl;
    @Column(name = "TOT_EXP_IL")
    private Date totExpIl;
    @Column(name = "LON_CCY")
    private String lonCcy;
    @Column(name = "CONTRACT_AMT")
    private BigDecimal contractAmt;
    @Column(name = "LON_JAN")
    private BigDecimal lonJan;
    @Column(name = "REPAY_GB")
    private String repayGb;
    @Column(name = "REPAY_TERM")
    private BigDecimal repayTerm;
    @Column(name = "REPAY_GAP")
    private BigDecimal repayGap;
    @Column(name = "REPAY_GAP_GB")
    private String repayGapGb;
    @Column(name = "GRACE_DAYS")
    private BigDecimal graceDays;
    @Column(name = "REPAY_CNT")
    private BigDecimal repayCnt;
    @Column(name = "DRAWDOWN_SEQ")
    private BigDecimal drawdownSeq;
    @Column(name = "RATE_CCY")
    private String rateCcy;
    @Column(name = "FIX_FLT_GB")
    private String fixFltGb;
    @Column(name = "INDEX_RT")
    private BigDecimal indexRt;
    @Column(name = "SPREAD_GB")
    private String spreadGb;
    @Column(name = "SPREAD_RT")
    private BigDecimal spreadRt;
    @Column(name = "ROLL_GAP")
    private BigDecimal rollGap;
    @Column(name = "ROLL_GAP_GB")
    private String rollGapGb;
    @Column(name = "LATE_CHG_RT")
    private BigDecimal lateChgRt;
    @Column(name = "PAST_DUE_RT")
    private BigDecimal pastDueRt;
    @Column(name = "ADV_ARR_GB")
    private String advArrGb;
    @Column(name = "SINGLE_BOTH_TYPE")
    private String singleBothType;
    @Column(name = "ACCR_TYPE")
    private String accrType;
    @Column(name = "BSNS_DAY_RULE")
    private String bsnsDayRule;
    @Column(name = "INT_GAP")
    private BigDecimal intGap;
    @Column(name = "INT_GAP_GB")
    private String intGapGb;
    @Column(name = "INT_ADJ_YN")
    private String intAdjYn;
    @Column(name = "YIELD")
    private String yield;
    @Column(name = "HD_SNG_NO")
    private String hdSngNo;
    @Column(name = "COMMITFEE_YN")
    private String commitfeeYn;
    @Column(name = "FEE_RT")
    private BigDecimal feeRt;
    @Column(name = "PAY_DEPO_CCY")
    private String payDepoCcy;
    @Column(name = "PAY_DEPO_BIC")
    private String payDepoBic;
    @Column(name = "RCV_DEPO_CCY")
    private String rcvDepoCcy;
    @Column(name = "RCV_DEPO_BIC")
    private String rcvDepoBic;
    @Column(name = "EVID_NO")
    private String evidNo;
    @Column(name = "EVID_CCY")
    private String evidCcy;
    @Column(name = "EVID_AMT")
    private BigDecimal evidAmt;
    @Column(name = "USD_CVT_AMT")
    private BigDecimal usdCvtAmt;
    @Column(name = "BBS_CVT_AMT")
    private BigDecimal bbsCvtAmt;
    @Column(name = "LOSS_AMT")
    private BigDecimal lossAmt;
    @Column(name = "RESTRUCTURING_YN")
    private String restructuringYn;
    @Column(name = "LOAN_CLASS")
    private String loanClass;
    @Column(name = "FST_IB_IL")
    private Date fstIbIl;
    @Column(name = "LST_DEAL_IL")
    private Date lstDealIl;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "OWNER_NO")
    private String ownerNo;
    @Column(name = "RMPB_NO")
    private String rmpbNo;
    @Column(name = "IBF_GB")
    private String ibfGb;
    @Column(name = "BL_NO")
    private String blNo;
    @Column(name = "LG_OPEN_IL")
    private Date lgOpenIl;
    @Column(name = "BLOCK_AMT")
    private BigDecimal blockAmt;
    @Column(name = "SUBSTS_CD")
    private String substsCd;
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
