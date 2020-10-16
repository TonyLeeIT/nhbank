package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexXpbRenedt")
@Data
public class AFEX_XPB_RENEDTInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date mngIl;
    private String refNo;
    private String sts;
    private String ccy;
    private int amt;
    private int bamt;
    private Date preCaIl;
    private Date reneIl;
    private String reneJum;
    private String ncuCcy;
    private int ncuAmt;
    private Date caIl;
    private int caAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
