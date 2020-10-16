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
@Table(name = "adstLnbHis")
@Data
public class ADST_LNB_HISInfo implements Serializable {
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
    private String sndDocNo;
    private String trBr;
    private String sdBr;
    private String trTime;
    private String userId;
    private String managerId;
    private String ibjiMd;
    private String ydGuja;
    private String cdSngNo;
    private BigDecimal cdSilSeq;
    private String ftpSngNo;
    private BigDecimal ftpSilSeq;
    private Date lstIbIl;
    private Date bfLrepayIl;
    private Date bfNrepayIl;
    private Date bfLisuIl;
    private Date bfLiibIl;
    private Date bfNisuIl;
    private Date bfNrollIl;
    private Date bfPycIl;
    private Date bfIycIl;
    private BigDecimal bfRepaySeq;
    private BigDecimal bfIntSeq;
    private BigDecimal bfMsbSeq;
    private BigDecimal bfLstRt;
    private BigDecimal bfMisuAmt;
    private String shJagumGb;
    private String regEmpNo;
    private Date regDt;
    private String regTm;
    private String updEmpNo;
    private Date updDt;
    private String updTm;
} 
