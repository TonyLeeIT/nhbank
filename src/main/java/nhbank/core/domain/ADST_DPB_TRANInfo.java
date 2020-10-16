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
    private int trxNo;
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
    private int trAmt;
    private int trAamt;
    private int afJan;
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
    private int ydHisNo;
    private String sdBk;
    private int totFee;
    private int tax1Amt;
    private int tax2Amt;
    private int tax3Amt;
    private int tax4Amt;
    private int intPayCnt;
    private Date bfIntCalIl;
    private Date bfIntRcvIl;
    private int dptRt;
    private int applHrt;
    private int pjHrt;
    private int bookHrt;
    private int basicHrt;
    private int gosiHrt;
    private int demiHrt;
    private int exRtSngNo;
    private int dptRtSngNo;
    private int cashFee;
    private String fedDocId;
    private int hisNo;
    private Date lstIbIl;
    private String lstTime;
    private Date selfMngIl;
    private int check1Amt;
    private int check2Amt;
    private int check3Amt;
    private int check1Aamt;
    private int check2Aamt;
    private int check3Aamt;
    private String chnlRefNo;
    private int chnlHisNo;
    private int etcFee1;
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
