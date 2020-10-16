package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "acomDtgContSts")
@Data
public class ACOM_DTG_CONT_STSInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal seqNo;
    private String brNo;
    private Date trxDt;
    private String bfContSts;
    private String afContSts;
    private String acctNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
