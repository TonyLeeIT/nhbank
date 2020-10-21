package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_RCH_BALInfo_ID.class)
@Table(name = "AFEX_RCH_BAL")
@Data
public class AFEX_RCH_BALInfo implements Serializable {
    @Id
    @Column(name = "CD")
    private String cd;
    @Id
    @Column(name = "CCY")
    private String ccy;
    @Id
    @Column(name = "TR_IL")
    private Date trIl;
    @Column(name = "SHW_OPBS")
    private BigDecimal shwOpbs;
    @Column(name = "SHW_CLBS")
    private BigDecimal shwClbs;
    @Column(name = "SHW_CONFIRM_YN")
    private String shwConfirmYn;
    @Column(name = "ACT_OPBS")
    private BigDecimal actOpbs;
    @Column(name = "ACT_CLBS")
    private BigDecimal actClbs;
    @Column(name = "ACT_CONFIRM_YN")
    private String actConfirmYn;
    @Column(name = "OPER_ID")
    private String operId;
    @Column(name = "LAST_IL")
    private Date lastIl;
    @Column(name = "STS")
    private String sts;
    @Column(name = "DOC_ID")
    private String docId;
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
