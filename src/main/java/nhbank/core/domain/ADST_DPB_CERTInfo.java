package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(ADST_DPB_CERTInfo_ID.class)
@Table(name = "ADST_DPB_CERT")
@Data
public class ADST_DPB_CERTInfo implements Serializable {
    @Id
    @Column(name = "ACCT_NO")
    private String acctNo;
    @Id
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "TX_TRX_NO")
    private BigDecimal txTrxNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "PRT_KIND")
    private String prtKind;
    @Column(name = "DR_OPNO")
    private String drOpno;
    @Column(name = "DR_TIME")
    private String drTime;
    @Column(name = "REMARK")
    private String remark;
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
