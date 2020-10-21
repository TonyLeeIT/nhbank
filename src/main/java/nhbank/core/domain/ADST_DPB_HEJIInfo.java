package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ADST_DPB_HEJIInfo_ID.class)
@Table(name = "ADST_DPB_HEJI")
@Data
public class ADST_DPB_HEJIInfo implements Serializable {
    @Id
    @Column(name = "ACCT_NO")
    private String acctNo;
    @Id
    @Column(name = "IB_IL")
    private Date ibIl;
    @Id
    @Column(name = "TRX_NO")
    private BigDecimal trxNo;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "BF_CIX_NO")
    private String bfCixNo;
    @Column(name = "DEP_CNT")
    private BigDecimal depCnt;
    @Column(name = "STS")
    private String sts;
    @Column(name = "MECH_GB")
    private String mechGb;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "IB_TIME")
    private String ibTime;
    @Column(name = "CLS_IL")
    private Date clsIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "TAX_RT")
    private BigDecimal taxRt;
    @Column(name = "DPT_RT")
    private BigDecimal dptRt;
    @Column(name = "CLS_BAMT")
    private BigDecimal clsBamt;
    @Column(name = "CLS_AAMT")
    private BigDecimal clsAamt;
    @Column(name = "BF_INT_BAMT")
    private BigDecimal bfIntBamt;
    @Column(name = "BF_INT_AAMT")
    private BigDecimal bfIntAamt;
    @Column(name = "AF_INT_BAMT")
    private BigDecimal afIntBamt;
    @Column(name = "AF_INT_AAMT")
    private BigDecimal afIntAamt;
    @Column(name = "TAX1_AMT")
    private BigDecimal tax1Amt;
    @Column(name = "TAX2_AMT")
    private BigDecimal tax2Amt;
    @Column(name = "TAX3_AMT")
    private BigDecimal tax3Amt;
    @Column(name = "TAX4_AMT")
    private BigDecimal tax4Amt;
    @Column(name = "RTN_INT_BAMT")
    private BigDecimal rtnIntBamt;
    @Column(name = "RTN_INT_AAMT")
    private BigDecimal rtnIntAamt;
    @Column(name = "RTN_TAX1_AMT")
    private BigDecimal rtnTax1Amt;
    @Column(name = "RTN_TAX2_AMT")
    private BigDecimal rtnTax2Amt;
    @Column(name = "RTN_TAX3_AMT")
    private BigDecimal rtnTax3Amt;
    @Column(name = "RTN_TAX4_AMT")
    private BigDecimal rtnTax4Amt;
    @Column(name = "TOT_PAY_BAMT")
    private BigDecimal totPayBamt;
    @Column(name = "TOT_PAY_AAMT")
    private BigDecimal totPayAamt;
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "CLS_FEE")
    private BigDecimal clsFee;
    @Column(name = "PNLT_AMT")
    private BigDecimal pnltAmt;
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
