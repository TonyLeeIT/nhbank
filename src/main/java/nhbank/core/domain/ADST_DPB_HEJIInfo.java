package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "adstDpbHeji")
@Data
public class ADST_DPB_HEJIInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private Date ibIl;
    private int trxNo;
    private String trCd;
    private String bfCixNo;
    private int depCnt;
    private String sts;
    private String mechGb;
    private String opNo;
    private String ibTime;
    private Date clsIl;
    private Date gisIl;
    private Date canIl;
    private int taxRt;
    private int dptRt;
    private int clsBamt;
    private int clsAamt;
    private int bfIntBamt;
    private int bfIntAamt;
    private int afIntBamt;
    private int afIntAamt;
    private int tax1Amt;
    private int tax2Amt;
    private int tax3Amt;
    private int tax4Amt;
    private int rtnIntBamt;
    private int rtnIntAamt;
    private int rtnTax1Amt;
    private int rtnTax2Amt;
    private int rtnTax3Amt;
    private int rtnTax4Amt;
    private int totPayBamt;
    private int totPayAamt;
    private int hisNo;
    private int clsFee;
    private int pnltAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
