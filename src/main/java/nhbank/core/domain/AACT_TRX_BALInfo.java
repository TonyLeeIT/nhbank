package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AACT_TRX_BALInfo_ID.class)
@Table(name = "AACT_TRX_BAL")
@Data
public class AACT_TRX_BALInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "BAL_DV_CD")
    private String balDvCd;
    @Id
    @Column(name = "DTLS_BAL_DV_CD")
    private String dtlsBalDvCd;
    @Id
    @Column(name = "IFRS_DV_CD")
    private String ifrsDvCd;
    @Id
    @Column(name = "ATIT_CD")
    private String atitCd;
    @Id
    @Column(name = "CCY")
    private String ccy;
    @Id
    @Column(name = "APCL_STR_DT")
    private Date apclStrDt;
    @Id
    @Column(name = "APCL_END_DT")
    private Date apclEndDt;
    @Column(name = "BR_NO")
    private String brNo;
    @Column(name = "BAL_AMT")
    private BigDecimal balAmt;
    @Column(name = "SUBJ_CD")
    private String subjCd;
    @Column(name = "OP_NO")
    private String opNo;
    @Column(name = "ID_NO")
    private String idNo;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "STS")
    private String sts;
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
