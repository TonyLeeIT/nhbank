package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexRchBal")
@Data
public class AFEX_RCH_BALInfo implements Serializable {
    @Id
    @GeneratedValue
    private String cd;
    private String ccy;
    private Date trIl;
    private int shwOpbs;
    private int shwClbs;
    private String shwConfirmYn;
    private int actOpbs;
    private int actClbs;
    private String actConfirmYn;
    private String operId;
    private Date lastIl;
    private String sts;
    private String docId;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
