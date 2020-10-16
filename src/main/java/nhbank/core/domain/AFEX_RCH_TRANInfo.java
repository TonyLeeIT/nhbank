package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_RCH_TRAN")
@Data
public class AFEX_RCH_TRANInfo implements Serializable {
    @Id
    @GeneratedValue
    private String cd;
    private String ccy;
    private String mtGb;
    private Date trIl;
    private BigDecimal trSeq;
    private Date valIl;
    private String drcrGb;
    private BigDecimal drcrAmt;
    private String ourRef;
    private String theirRef;
    private Date ibIl;
    private String ibTime;
    private String docId;
    private String otherRef;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
