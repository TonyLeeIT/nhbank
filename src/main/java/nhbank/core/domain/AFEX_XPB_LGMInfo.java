package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_XPB_LGMInfo_ID.class)
@Table(name = "AFEX_XPB_LGM")
@Data
public class AFEX_XPB_LGMInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "STS")
    private String sts;
    @Column(name = "TR_BR")
    private String trBr;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "HAJA_CD")
    private String hajaCd;
    @Column(name = "HAJA_MNG_INFO")
    private String hajaMngInfo;
    @Column(name = "MJ_GB")
    private String mjGb;
    @Column(name = "TR_TIME")
    private String trTime;
    @Column(name = "OP_NO")
    private BigDecimal opNo;
    @Column(name = "HAJA_SAYU")
    private String hajaSayu;
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
