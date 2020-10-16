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
@Table(name = "acomLmtSil")
@Data
public class ACOM_LMT_SILInfo implements Serializable {
    @Id
    @GeneratedValue
    private String sngNo;
    private String actCd;
    private String silCcy;
    private Date fstIl;
    private Date lstIl;
    private Date lstIbil;
    private BigDecimal silAmt;
    private BigDecimal djgAmt;
    private BigDecimal gurBamt;
    private BigDecimal gurFamt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
