package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ADST_DPB_BURIInfo_ID.class)
@Table(name = "ADST_DPB_BURI")
@Data
public class ADST_DPB_BURIInfo implements Serializable {
    @Id
    @Column(name = "ACCT_NO")
    private String acctNo;
    @Id
    @Column(name = "BURI_IL")
    private Date buriIl;
    @Column(name = "BURI_JAN")
    private BigDecimal buriJan;
    @Column(name = "FST_JAN")
    private BigDecimal fstJan;
    @Column(name = "MAX_JAN")
    private BigDecimal maxJan;
    @Column(name = "TERM_IL")
    private Date termIl;
    @Column(name = "LON_SNG_AMT")
    private BigDecimal lonSngAmt;
    @Column(name = "LON_OVR_AMT")
    private BigDecimal lonOvrAmt;
    @Column(name = "LON_RT_CD")
    private String lonRtCd;
    @Column(name = "LON_RT")
    private BigDecimal lonRt;
    @Column(name = "PRCP_OVER_DUE_INT_RT")
    private BigDecimal prcpOverDueIntRt;
    @Column(name = "INT_OVER_DUE_INT_RT")
    private BigDecimal intOverDueIntRt;
    @Column(name = "COL_LON_INT")
    private BigDecimal colLonInt;
    @Column(name = "LON_PRCP_YC_INT")
    private BigDecimal lonPrcpYcInt;
    @Column(name = "LON_INT_YC_INT")
    private BigDecimal lonIntYcInt;
    @Column(name = "LON_YD_CD")
    private String lonYdCd;
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
