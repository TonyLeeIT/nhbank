package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "aactTrxBal")
@Data
public class AACT_TRX_BALInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String balDvCd;
    private String dtlsBalDvCd;
    private String ifrsDvCd;
    private String atitCd;
    private String ccy;
    private Date apclStrDt;
    private Date apclEndDt;
    private String brNo;
    private int balAmt;
    private String subjCd;
    private String opNo;
    private String idNo;
    private String cixNo;
    private String sts;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
