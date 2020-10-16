package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_RCH_PEND")
@Data
public class AFEX_RCH_PENDInfo implements Serializable {
    @Id
    @GeneratedValue
    private String cd;
    private String ccy;
    private String saGb;
    private Date trIl;
    private int trSeq;
    private Date valIl;
    private String ourRef;
    private String drcrGb;
    private int drcrAmt;
    private String theirRef;
    private String upmuCd;
    private String inidCd;
    private int origAmt;
    private int bunhalSeq;
    private Date ibIl;
    private String ibTime;
    private String operId;
    private String cancelYn;
    private String origRef;
    private String confirmYn;
    private String nrefCnt;
    private String docId;
    private String otherRef;
    private int refHisNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
