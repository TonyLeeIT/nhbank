package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPH_SHIP_RESEND")
@Data
public class AFEX_XPH_SHIP_RESENDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal bhSeq;
    private BigDecimal seq;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
