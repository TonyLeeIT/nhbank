package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_RTB_BASEInfo_ID.class)
@Table(name = "AFEX_RTB_BASE")
@Data
public class AFEX_RTB_BASEInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Column(name = "CIX_NO")
    private String cixNo;
    @Column(name = "CIX_NM")
    private String cixNm;
    @Column(name = "BUY_CCY")
    private String buyCcy;
    @Column(name = "BUY_FAMT")
    private BigDecimal buyFamt;
    @Column(name = "SEL_CCY")
    private String selCcy;
    @Column(name = "SEL_FAMT")
    private BigDecimal selFamt;
    @Column(name = "EX_HRT")
    private BigDecimal exHrt;
    @Column(name = "RATE_AMT_GB")
    private String rateAmtGb;
    @Column(name = "FRT_GB")
    private String frtGb;
    @Column(name = "FRT_RT")
    private BigDecimal frtRt;
    @Column(name = "FRT_AMT")
    private BigDecimal frtAmt;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "ID_NO")
    private String idNo;
    @Column(name = "NATION_CD")
    private String nationCd;
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
    @Column(name = "SAYU_CD")
    private String sayuCd;
} 
