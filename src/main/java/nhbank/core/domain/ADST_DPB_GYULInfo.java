package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "adstDpbGyul")
@Data
public class ADST_DPB_GYULInfo implements Serializable {
    @Id
    @GeneratedValue
    private Date ibIl;
    private String yede;
    private String acctNo;
    private String sts;
    private int jsInt;
    private int prcpYcInt;
    private int intYcInt;
    private int mmAvgAmt;
    private int intTax1;
    private int intTax2;
    private int hisNo;
    private String errPgm;
    private String errMsg;
    private String errNo;
    private Date lstIbIl;
    private String lstTime;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
