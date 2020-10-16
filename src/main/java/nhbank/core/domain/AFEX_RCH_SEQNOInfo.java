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
@Table(name = "afexRchSeqno")
@Data
public class AFEX_RCH_SEQNOInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date trIl;
    private String saGb;
    private String cd;
    private String ccy;
    private BigDecimal seqno;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
