package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexRchVostro")
@Data
public class AFEX_RCH_VOSTROInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date ibIl;
    private int seqNo;
    private int hisNo;
    private int cdAmt;
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
