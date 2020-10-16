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
@Table(name = "acomFabHis")
@Data
public class ACOM_FAB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private String sts;
    private String trGb;
    private String trCd;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private BigDecimal sdHisNo;
    private String trCcy;
    private BigDecimal trFamt;
    private BigDecimal trBamt;
    private BigDecimal salAmt;
    private BigDecimal evenAmt;
    private BigDecimal depriAmt;
    private BigDecimal sellAmt;
    private BigDecimal plAmt;
    private BigDecimal afJan;
    private BigDecimal afDepriJan;
    private BigDecimal depriJan;
    private BigDecimal thisDepriJan;
    private BigDecimal lastDepriJan;
    private BigDecimal capitalJan;
    private BigDecimal dispJan;
    private Date depriIl;
    private Date bfrDepriIl;
    private String ilgeYn;
    private String remark;
    private String bgRefNo;
    private String trBr;
    private String sdBr;
    private String ibTime;
    private String opNo;
    private String mngNo;
    private String cdSngNo;
    private BigDecimal cdSilSeq;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
