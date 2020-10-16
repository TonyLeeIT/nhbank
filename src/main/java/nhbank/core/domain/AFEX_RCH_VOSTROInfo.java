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
@Table(name = "afexRchVostro")
@Data
public class AFEX_RCH_VOSTROInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date ibIl;
    private BigDecimal seqNo;
    private BigDecimal hisNo;
    private BigDecimal cdAmt;
    private Date acIl;
    private String opNo;
    private Date valIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
