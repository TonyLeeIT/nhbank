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
@Table(name = "acomEpbHis")
@Data
public class ACOM_EPB_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String refNo;
    private BigDecimal hisNo;
    private String sts;
    private String trGb;
    private String trCd;
    private String dnGb;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private BigDecimal sdHisNo;
    private String trCcy;
    private BigDecimal trFamt;
    private BigDecimal trBamt;
    private BigDecimal afJan;
    private String trBr;
    private String sdBr;
    private String autoYn;
    private String cptyNm;
    private String remark;
    private String sdBusiCd;
    private String sdRefNo;
    private BigDecimal sdHis;
    private String ibTime;
    private String opNo;
    private String mngNo;
    private String cdSngNo;
    private BigDecimal cdSilSeq;
    private BigDecimal trTax;
    private BigDecimal assignAmt;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
    private String linkRefNo;
    private String linkType;
    private String payRefNo;
    private String taxCode;
    private BigDecimal taxRate;
} 
