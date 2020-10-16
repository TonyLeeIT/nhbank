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
@Table(name = "adstDpbHeji")
@Data
public class ADST_DPB_HEJIInfo implements Serializable {
    @Id
    @GeneratedValue
    private String acctNo;
    private Date ibIl;
    private BigDecimal trxNo;
    private String trCd;
    private String bfCixNo;
    private BigDecimal depCnt;
    private String sts;
    private String mechGb;
    private String opNo;
    private String ibTime;
    private Date clsIl;
    private Date gisIl;
    private Date canIl;
    private BigDecimal taxRt;
    private BigDecimal dptRt;
    private BigDecimal clsBamt;
    private BigDecimal clsAamt;
    private BigDecimal bfIntBamt;
    private BigDecimal bfIntAamt;
    private BigDecimal afIntBamt;
    private BigDecimal afIntAamt;
    private BigDecimal tax1Amt;
    private BigDecimal tax2Amt;
    private BigDecimal tax3Amt;
    private BigDecimal tax4Amt;
    private BigDecimal rtnIntBamt;
    private BigDecimal rtnIntAamt;
    private BigDecimal rtnTax1Amt;
    private BigDecimal rtnTax2Amt;
    private BigDecimal rtnTax3Amt;
    private BigDecimal rtnTax4Amt;
    private BigDecimal totPayBamt;
    private BigDecimal totPayAamt;
    private BigDecimal hisNo;
    private BigDecimal clsFee;
    private BigDecimal pnltAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
