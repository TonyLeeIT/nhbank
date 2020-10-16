package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_XPH_RENEGO")
@Data
public class AFEX_XPH_RENEGOInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String sts;
    private Date trIl;
    private String reneGb;
    private String negoCcy;
    private int negoAmt;
    private Date negoIl;
    private String reimBkcd;
    private String reimBknm;
    private String collBkcd;
    private String collBknm;
    private Date exprIl;
    private String exprCcy;
    private int exprAmt;
    private int hijaAmt;
    private int dcAmt;
    private int cable;
    private int collAmt;
    private String ccGb;
    private Date ccIl;
    private String ccRtCd;
    private String m202Nm;
    private String m999Nm;
    private String ncuNegoCcy;
    private int ncuNegoAmt;
    private String yukNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
