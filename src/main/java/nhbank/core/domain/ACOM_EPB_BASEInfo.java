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
@Table(name = "acomEpbBase")
@Data
public class ACOM_EPB_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String mngBr;
    private String mngYy;
    private String busiCd;
    private String sts;
    private String expCd;
    private String ccy;
    private BigDecimal assignAmt;
    private BigDecimal addAmt;
    private BigDecimal assignCamt;
    private BigDecimal addCamt;
    private BigDecimal plusAmt;
    private BigDecimal minusAmt;
    private BigDecimal totalAmt;
    private BigDecimal drAmt;
    private BigDecimal crAmt;
    private BigDecimal lstHisNo;
    private Date acIl;
    private Date ibIl;
    private Date lstIl;
    private Date lstIbIl;
    private BigDecimal bjAmt;
    private BigDecimal allocateAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
