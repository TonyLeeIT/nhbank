package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_RTB_HISInfo_ID.class)
@Table(name = "AFEX_RTB_HIS")
@Data
public class AFEX_RTB_HISInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "TR_GB")
    private String trGb;
    @Column(name = "TR_CD")
    private String trCd;
    @Column(name = "IB_IL")
    private Date ibIl;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "CAN_IL")
    private Date canIl;
    @Column(name = "SD_HIS_NO")
    private BigDecimal sdHisNo;
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
    @Column(name = "TR_BR")
    private String trBr;
    @Column(name = "TR_TIME")
    private String trTime;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "PRE_STS")
    private String preSts;
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
