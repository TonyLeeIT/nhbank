package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "afexIpbDjb")
@Data
public class AFEX_IPB_DJBInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal seq;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private BigDecimal bamt;
    private BigDecimal hisNo;
    private String djbGb;
    private BigDecimal jan;
    private Date lisuIl;
    private BigDecimal djhGun;
    private BigDecimal expGun;
    private BigDecimal shGun;
    private BigDecimal krSeq;
    private BigDecimal blkSseq;
    private Date lstHoiIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
