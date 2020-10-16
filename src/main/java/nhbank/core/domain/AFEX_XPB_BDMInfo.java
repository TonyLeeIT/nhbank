package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexXpbBdm")
@Data
public class AFEX_XPB_BDMInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private Date lstIbIl;
    private String ccy;
    private int amt;
    private String budoCd;
    private int shSeq;
    private int shSumAmt;
    private String bmGb;
    private int miSeq;
    private int miTrBamt;
    private int miShBamt;
    private String ncuCcy;
    private int ncuAmt;
    private int ncuShSumAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
