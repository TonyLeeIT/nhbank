package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "afexRtbHss")
@Data
public class AFEX_RTB_HSSInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String trCd;
    private Date acIl;
    private Date lstIbIl;
    private String hssGb;
    private String hssApGb;
    private String sdBrNo;
    private String sdDepoCd;
    private String chargeType;
    private int hssFee;
    private Date icheIl;
    private String ccy;
    private int famt;
    private int bamt;
    private int trscSeqNo;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
