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
@Table(name = "afifFehHis")
@Data
public class AFIF_FEH_HISInfo implements Serializable {
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
    private String nearBuyCcy;
    private BigDecimal nearBuyFamt;
    private BigDecimal nearBuyBamt;
    private BigDecimal nearBuyJan;
    private BigDecimal nearBuyBjan;
    private String nearSellCcy;
    private BigDecimal nearSellFamt;
    private BigDecimal nearSellBamt;
    private BigDecimal nearSellJan;
    private BigDecimal nearSellBjan;
    private String nearSndDocNo;
    private String farBuyCcy;
    private BigDecimal farBuyFamt;
    private BigDecimal farBuyBamt;
    private BigDecimal farBuyJan;
    private BigDecimal farBuyBjan;
    private String farSellCcy;
    private BigDecimal farSellFamt;
    private BigDecimal farSellBamt;
    private BigDecimal farSellJan;
    private BigDecimal farSellBjan;
    private String farSndDocNo;
    private String trBr;
    private String sdBr;
    private String trTime;
    private String userId;
    private String managerId;
    private String ibjiMd;
    private String cdSngNo;
    private BigDecimal cdSilSeq;
    private String ftpSngNo;
    private BigDecimal ftpSilSeq;
    private String junNo;
    private String yukNo;
    private Date lstIbIl;
    private String frontSndGb;
    private String preSts;
    private String beHdSngno;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
