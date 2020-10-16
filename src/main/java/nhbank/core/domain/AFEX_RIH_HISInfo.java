package nhbank.core.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "AFEX_RIH_HIS")
@Data
public class AFEX_RIH_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private String sts;
    private String trGb;
    private String trCd;
    private String cixNo;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private BigDecimal sdHisNo;
    private String trCcy;
    private BigDecimal trFamt;
    private BigDecimal trBamt;
    private BigDecimal afJan;
    private String feeMd;
    private String trBr;
    private String sdBr;
    private String ibTime;
    private String opNo;
    private String mngNo;
    private String ibjiMd;
    private BigDecimal ydSeq;
    private String ydGuja;
    private BigDecimal bokSeq;
    private String cdSngNo;
    private BigDecimal cdSilSeq;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
