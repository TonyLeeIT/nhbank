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
@Table(name = "afexRchRecon")
@Data
public class AFEX_RCH_RECONInfo implements Serializable {
    @Id
    @GeneratedValue
    private String cd;
    private String ccy;
    private String saGb;
    private Date trIl;
    private BigDecimal trSeq;
    private Date reconIl;
    private BigDecimal reconSeq;
    private String reconGb;
    private Date valIl;
    private String ourRef;
    private String drcrGb;
    private BigDecimal drcrAmt;
    private String theirRef;
    private String upmuCd;
    private String inidCd;
    private BigDecimal origAmt;
    private BigDecimal bunhalSeq;
    private Date ibIl;
    private String ibTime;
    private String operId;
    private String cancelYn;
    private String origRef;
    private String confirmYn;
    private String nrefCnt;
    private String amendCnt;
    private String docId;
    private String otherRef;
    private BigDecimal refHisNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
