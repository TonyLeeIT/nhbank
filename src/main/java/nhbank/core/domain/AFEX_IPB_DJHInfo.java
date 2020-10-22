package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_IPB_DJHInfo_ID.class)
@Table(name = "AFEX_IPB_DJH")
@Data
public class AFEX_IPB_DJHInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "SEQ")
    private BigDecimal seq;
    @Id
    @Column(name = "SSEQ")
    private BigDecimal sseq;
    @Column(name = "STS")
    private String sts;
    @Column(name = "AC_IL")
    private Date acIl;
    @Column(name = "GIS_IL")
    private Date gisIl;
    @Column(name = "LST_IB_IL")
    private Date lstIbIl;
    @Column(name = "CCY")
    private String ccy;
    @Column(name = "BAMT")
    private BigDecimal bamt;
    @Column(name = "IJA_BAMT")
    private BigDecimal ijaBamt;
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "HOI_GB")
    private String hoiGb;
    @Column(name = "DS_AMT")
    private BigDecimal dsAmt;
    @Column(name = "IJA_FRT")
    private BigDecimal ijaFrt;
    @Column(name = "IJA_DS_TERM")
    private BigDecimal ijaDsTerm;
    @Column(name = "IJA_FR_IL")
    private Date ijaFrIl;
    @Column(name = "IJA_TO_IL")
    private Date ijaToIl;
    @Column(name = "BE_LST_HOI_IL")
    private Date beLstHoiIl;
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
