package nhbank.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@IdClass(AFEX_IPB_DJBInfo_ID.class)
@Table(name = "AFEX_IPB_DJB")
@Data
public class AFEX_IPB_DJBInfo implements Serializable {
    @Id
    @Column(name = "REF_NO")
    private String refNo;
    @Id
    @Column(name = "SEQ")
    private BigDecimal seq;
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
    @Column(name = "HIS_NO")
    private BigDecimal hisNo;
    @Column(name = "DJB_GB")
    private String djbGb;
    @Column(name = "JAN")
    private BigDecimal jan;
    @Column(name = "LISU_IL")
    private Date lisuIl;
    @Column(name = "DJH_GUN")
    private BigDecimal djhGun;
    @Column(name = "EXP_GUN")
    private BigDecimal expGun;
    @Column(name = "SH_GUN")
    private BigDecimal shGun;
    @Column(name = "KR_SEQ")
    private BigDecimal krSeq;
    @Column(name = "BLK_SSEQ")
    private BigDecimal blkSseq;
    @Column(name = "LST_HOI_IL")
    private Date lstHoiIl;
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
