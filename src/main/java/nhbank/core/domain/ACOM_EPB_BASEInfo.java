package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "ACOM_EPB_BASE")
@Data
public class ACOM_EPB_BASEInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String mngBr;
    private String mngYy;
    private String busiCd;
    private String sts;
    private String expCd;
    private String ccy;
    private int assignAmt;
    private int addAmt;
    private int assignCamt;
    private int addCamt;
    private int plusAmt;
    private int minusAmt;
    private int totalAmt;
    private int drAmt;
    private int crAmt;
    private int lstHisNo;
    private Date acIl;
    private Date ibIl;
    private Date lstIl;
    private Date lstIbIl;
    private int bjAmt;
    private int allocateAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
