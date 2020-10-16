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
@Table(name = "afexXphTra")
@Data
public class AFEX_XPH_TRAInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private String traGb;
    private BigDecimal hisNo;
    private BigDecimal seqNo;
    private String sts;
    private Date acIl;
    private Date gisIl;
    private String ccy;
    private BigDecimal amt;
    private String inOutGb;
    private String mtGubun;
    private String tlxNo;
    private String fileName;
    private String thruBank;
    private String ncuCcy;
    private BigDecimal ncuAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
