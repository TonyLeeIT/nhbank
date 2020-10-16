package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "adstLnbFee")
@Data
public class ADST_LNB_FEEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private int hisNo;
    private int seqNo;
    private String sts;
    private String feeGb;
    private String ccy;
    private int feeAmt;
    private String rateAmtGb;
    private int feeDsAmt;
    private int feeDsBamt;
    private int feeORt;
    private int feeSRt;
    private Date feeFrIl;
    private Date feeToIl;
    private int feeDays;
    private int adjSeq;
    private int schSeq;
    private int schSubNo;
    private int bizNo;
    private Date feeRcvIl;
    private Date fstIbIl;
    private Date lstAcIl;
    private Date lstIbIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
