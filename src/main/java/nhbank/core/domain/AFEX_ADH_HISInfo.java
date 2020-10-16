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
@Table(name = "afexAdhHis")
@Data
public class AFEX_ADH_HISInfo implements Serializable {
    @Id
    @GeneratedValue
    private String advNo;
    private BigDecimal hisNo;
    private BigDecimal baseSeq;
    private BigDecimal amendSeq;
    private BigDecimal ediSeq;
    private String sts;
    private String trGb;
    private String trCd;
    private String trBr;
    private String brNo;
    private BigDecimal amdCnt;
    private String cixNo;
    private String buseoNo;
    private String ibgmMd;
    private Date ibIl;
    private Date acIl;
    private Date gisIl;
    private Date canIl;
    private String ediFnm;
    private Date ediIl;
    private String openCcy;
    private BigDecimal openAmt;
    private BigDecimal brCharge;
    private BigDecimal chargeAmt;
    private String chargeGb;
    private String mngNo;
    private String opNo;
    private String ibTime;
    private String reIssue;
    private BigDecimal ydSeq;
    private String ydGuja;
    private String sdRefNo;
    private BigDecimal sdHisNo;
    private Date advMakeIl;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
