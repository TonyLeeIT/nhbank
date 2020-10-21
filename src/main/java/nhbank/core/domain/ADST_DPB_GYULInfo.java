package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ADST_DPB_GYULInfo_ID.class)
@Table(name = "ADST_DPB_GYUL")
@Data
public class ADST_DPB_GYULInfo implements Serializable {
    @Id
    @Column(name = "IB_IL")
    private Date ibIl;
    @Id
    @Column(name = "YEDE")
    private String yede;
    @Id
    @Column(name = "ACCT_NO")
    private String acctNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "JS_INT")
    private BigDecimal jsInt;
    @Column(name = "PRCP_YC_INT")
    private BigDecimal prcpYcInt;
    @Column(name = "INT_YC_INT")
    private BigDecimal intYcInt;
    @Column(name = "MM_AVG_AMT")
    private BigDecimal mmAvgAmt;
    @Column(name = "INT_TAX1")
    private BigDecimal intTax1;
    @Column(name = "INT_TAX2")
    private BigDecimal intTax2;
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "ERR_PGM")
    private String errPgm;
    @Column(name = "ERR_MSG")
    private String errMsg;
    @Column(name = "ERR_NO")
    private String errNo;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "LST_TIME")
    private String lstTime;
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
